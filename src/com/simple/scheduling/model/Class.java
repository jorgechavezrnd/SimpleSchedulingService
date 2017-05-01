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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "class")
public class Class {
    
    @XmlElement(name = "code")
    private String code;
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "studentIdList")
    private List<Integer> studentIdList;
    
    public Class() {
        code = "";
        title = "";
        description = "";
        studentIdList = new ArrayList<>();
    }

    public Class(String code, String title, String description) {
        this.code = code;
        this.title = title;
        this.description = description;
        studentIdList = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getStudentIdList() {
        return studentIdList;
    }

    public void setStudentIdList(List<Integer> studentIdList) {
        this.studentIdList = studentIdList;
    }
    
    public String addStudentId(Integer id) {
        if (!studentIdList.contains(id)) {
            studentIdList.add(id);
            return "Successful adding student";
        }
        
        return "Error adding student";
    }
    
}
