/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;

/**
 *
 * @author zeningluo
 */
public class Course {
    
    private Task[] Course;
    private String courseName;
    
    public static final int MaxTaskNum = 5;
    
    public Course(String courseName){
        Course = new Task[MaxTaskNum];
        
        for(int i=0;i<MaxTaskNum;i++){
            Course[i]= new Task();
        }        
        this.courseName = courseName;
    }

    public Course() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setCourseName(String name){
        courseName = name;
    }
    public String getCourseName(){
        return courseName;
    }
    
    public Task[] getAllTasks(){
        return Course;
    }
    // a is the index number from 0 - 4;    
    public Task getTask(int a) {
        return Course[a];
    }     
                
    // add task in order and return false if the coures is full. 
    public boolean addTask(Task task){
        for(int i =0; i<MaxTaskNum; i++){
            if(Course[i]!=null){
                Course[i] = task;
                return true;
            }
              
        }
        return false;
    }
}
