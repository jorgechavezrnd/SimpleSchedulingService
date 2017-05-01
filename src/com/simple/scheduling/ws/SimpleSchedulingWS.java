/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.scheduling.ws;

import com.simple.scheduling.model.Student;
import com.simple.scheduling.model.Class;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class SimpleSchedulingWS {
    
    private final SimpleSchedulingResource resource = new SimpleSchedulingResource();
    
    public String insertStudent(@WebParam(name = "studentId") Integer studentId,
                                @WebParam(name = "lastName") String lastName,
                                @WebParam(name = "firstName") String firstName) {
        
        return resource.insertStudent(studentId, lastName, firstName);
    
    }
    
    public String insertClass(@WebParam(name = "code") String code,
                              @WebParam(name = "title") String title,
                              @WebParam(name = "description") String description) {
        
        return resource.insertClass(code, title, description);
        
    }
    
    public Student updateStudent(@WebParam(name = "studentId") Integer studentId) {
        
        return resource.updateStudent(studentId);
        
    }
    
    public Class updateClass(@WebParam(name = "code") String code) {
        
        return resource.updateClass(code);
        
    }
    
    public String deleteStudent(@WebParam(name = "studentId") Integer studentId) {
        
        return resource.deleteStudent(studentId);
        
    }
    
    public String deleteClass(@WebParam(name = "code") String code) {
        
        return resource.deleteClass(code);
        
    }
    
    public String addClassToStudentAndStudentToClass(@WebParam(name = "studentId")Integer studentId, 
                                                     @WebParam(name = "code")String code) {
        
        return resource.addClassToStudentAndStudentToClass(studentId, code);
        
    }
    
    public String viewClassListOfStudent(@WebParam(name = "studentId")Integer studentId) {
        
        return resource.viewClassListOfStudent(studentId);
        
    }
    
    public String viewStudentListOfClass(@WebParam(name = "code")String code) {
        
        return resource.viewStudentListOfClass(code);
        
    }
    
}
