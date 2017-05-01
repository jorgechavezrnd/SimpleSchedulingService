/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.scheduling.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD) //Para decir que este objeto se tiene que representar en XML
@XmlType(name = "student") //Lo correcto, es que los nombres de XmlType y XmlElement sigan CamelCase
public class Student {
    
    @XmlElement(name = "studentId")
    private Integer studentId;
    @XmlElement(name = "lastName")
    private String lastName;
    @XmlElement(name = "firstName")
    private String firstName;
    @XmlElement(name = "classList")
    private List<String> classCodeList;
    
    public Student() {
        studentId = 0;
        lastName = "";
        firstName = "";
        classCodeList = new ArrayList<>();
    }

    public Student(Integer studentId, String lastName, String firstName) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        classCodeList = new ArrayList<>();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<String> getClassList() {
        return classCodeList;
    }

    public void setClassList(List<String> classList) {
        this.classCodeList = classList;
    }
    
    public String addClassCode(String code) {
        
        if (!classCodeList.contains(code)) {
            classCodeList.add(code);
            return "Successful adding class";
        }
        
        return "Error adding class";
    }
    
}
