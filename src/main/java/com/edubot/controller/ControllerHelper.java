package com.edubot.controller;

import com.edubot.facades.SecurityFacade;
import com.edubot.util.Const;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by deadcode on 14/08/2016.
 */
public abstract class ControllerHelper {

    private HttpHeaders responseHeaders;

    @Autowired
    private SecurityFacade securityFacade;

    public ControllerHelper(){

        responseHeaders = new HttpHeaders();
        responseHeaders.setAccessControlExposeHeaders(Const.AllowedHeaders);
        responseHeaders.setLocation(URI.create(Const.ClientUris.CLIENT_SIGN_UP));

    }
    
    public String getRequestBody(HttpServletRequest request) {

        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null)
                jb.append(line);
        } catch (Exception e) { /*report an error*/ }

        return jb.toString();
    }


    public JSONObject getRequestBodyJsonObject(String body){

        return new JSONObject(body);
    }

    public String getBodyParameter(String requestBody, String name){

        JSONObject jsonObject = new JSONObject(requestBody);

        return jsonObject.getString(name);
    }

    public HashMap<String, Object> getKeyValuePairs(JSONObject jsonObject){

        HashMap<String, Object> list = new HashMap<>();

        jsonObject.keySet().forEach(k->{

            list.put((String)k, jsonObject.getString((String)k));

        });

        return list;
    }

    public List<HashMap<String, Object>> getKeyValuePairsList(String body){

        JSONArray jsonArray = new JSONArray(body);

        List<HashMap<String, Object>> pairsList = new ArrayList<>();

        for(int i = 0; i < jsonArray.length(); i++){

            pairsList.add(getKeyValuePairs(jsonArray.getJSONObject(i)));

        }

        return pairsList;
    }

    public List<HashMap<String, Object>> extractKVPairsListFromBody(HttpServletRequest request){

        String body = getRequestBody(request);

        return getKeyValuePairsList(body);
    }

    public String getHashFromUrl(HttpServletRequest request){

        String arr[] = request.getRequestURI().split("/");
        String hash = null;

        if(arr.length > 0){

            hash = arr[arr.length-1];
        }

        return hash;
    }

    public void embedTokenInResponse(String token){

        getResponseHeaders().set("Authorization", token);
    }

    public HttpHeaders getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(HttpHeaders responseHeaders) {
        this.responseHeaders = responseHeaders;
    }
}

