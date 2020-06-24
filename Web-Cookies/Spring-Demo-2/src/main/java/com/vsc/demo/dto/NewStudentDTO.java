package com.vsc.demo.dto;

import javax.validation.constraints.NotBlank;

public class NewStudentDTO {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private Integer age;

    @NotBlank
    private String className;

    public NewStudentDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
