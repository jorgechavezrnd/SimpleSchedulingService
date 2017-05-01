/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.scheduling.ws;

import com.simple.scheduling.model.Student;
import com.simple.scheduling.model.Class;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jorge
 */
public class SimpleSchedulingResource {
    
    private final Map<Integer, Student> studentMap = new HashMap<>();
    private final Map<String, Class> classMap = new HashMap<>();
    
    public SimpleSchedulingResource() {
        
        // No se inicializa nada porque como son final, se inicializa en la declaracion
    
    }
    
    public String insertStudent(Integer studentId, String lastName, String firstName) {
        
        if (studentMap.containsKey(studentId)) {
            return "Error, student with id " + studentId + " already exists";
        }
        
        studentMap.put(studentId, new Student(studentId, lastName, firstName));
        return "Student with id " + studentId + " registered correctly";
    
    }
    
    public String insertClass(String code, String title, String description) {
        
        if (classMap.containsKey(code)) {
            return "Error, class with code " + code + " already exists";
        }
        
        classMap.put(code, new Class(code, title, description));
        return "Class with code " + code + " registered correctly";
    
    }
    
    public Student updateStudent(Integer studentId) {
        
        Student student = studentMap.get(studentId);
        
        if (student != null) {
            return student;
        }
        
        return new Student();
    
    }
    
    public Class updateClass(String code) {
        
        Class newClass = classMap.get(code);
        
        if (newClass != null) {
            return newClass;
        }
        
        return new Class();
    
    }
    
    public String deleteStudent(Integer studentId) {
        
        if (studentMap.containsKey(studentId)) {
            studentMap.remove(studentId);
            return "Student with id " + studentId + " was successfully deleted";
        }
        
        return "Error, student with id " + studentId + " does not exist";
    
    }
    
    public String deleteClass(String code) {
        
        if (classMap.containsKey(code)) {
            classMap.remove(code);
            return "Class with code " + code + " was successfully deleted";
        }
        
        return "Error, class with code " + code + " does not exist";
        
    }
    
    public String addClassToStudentAndStudentToClass(Integer studentId, String code) {
        
        if (studentMap.containsKey(studentId) && classMap.containsKey(code)) {
            studentMap.get(studentId).addClassCode(code);
            classMap.get(code).addStudentId(studentId);
            return "Class with code " + code + " was successfully added to student with id " + studentId;
        } else if (!studentMap.containsKey(studentId) && !classMap.containsKey(code)) {
            return "Error, student with id " + studentId + " and class with " + code + " does not exist";
        } else if (!studentMap.containsKey(studentId)) {
            return "Error, student with id " + studentId + " does not exist";
        } else {
            return "Error, class with code " + code + " does not exist";
        }
        
    }
    
    public String viewClassListOfStudent(Integer studentId) {
        
        if (studentMap.containsKey(studentId)) {
            return studentMap.get(studentId).getClassList().toString();
        }
        
        return "Error, student with id " + studentId + " does not exist";
        
    }
    
    public String viewStudentListOfClass(String code) {
        
        if (classMap.containsKey(code)) {
            return classMap.get(code).getStudentIdList().toString();
        }
        
        return "Error, class with code " + code + " does not exist";
        
    }
    
}
