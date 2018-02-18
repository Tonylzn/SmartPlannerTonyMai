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
public class Task {
    
    private String name;
    // mon 1, tue 2, .......
    private ArrayList<Integer> workingdays;
    private int priority;
    private double time;
    private int dueDay;
    
    // Static variables for sort;
    public static final int PRIORITY = 0;
    public static final int TIME = 1;
    
    //
    public static final int LOW = 0;
    public static final int MEDIUM = 1;
    public static final int HIGH = 2;
    // Constructors 
    //why do we need multiple constructors? 
    public Task() {
        this(null, null, 0, 0,0);
    }

    public Task(String name, ArrayList<Integer> workingdays, int priority, double time,int dueDay) {
        this.name=name;
        this.workingdays = workingdays;
        this.priority = priority;
        this.time = time;
        this.dueDay = dueDay;
        
        
    }
    public void setDueDay(int time){
        dueDay = time;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setWorkingdays(ArrayList<Integer> workingdays){
        this.workingdays=workingdays;
    }
    
    public void setPriority(int Priority){
        this.priority = priority;
    }
    
    public void setTime(int time){
        this.time= time;
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Integer> getWorkingdays(){
        return workingdays;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public double getTime(){
        return time;
    }
    public int getDueDay(){
        return dueDay;
    }
    
}
