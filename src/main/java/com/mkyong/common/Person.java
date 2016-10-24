package com.mkyong.common;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by deadcode on 23/10/2016.
 */
public class Person extends Member implements Serializable {

    private long personId;
    private String alias;
    private Set<CourseTest> courseTests = new HashSet<>(0);

    public Person() {
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Set<CourseTest> getCourseTests() {
        return courseTests;
    }

    public void setCourseTests(Set<CourseTest> courseTests) {
        this.courseTests = courseTests;
    }
}
