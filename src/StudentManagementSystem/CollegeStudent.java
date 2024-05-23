/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagementSystem;

/**
 *
 * @author 
 */
public class CollegeStudent extends Student{
    private String major;
    
    public CollegeStudent(){
        super();
    }
    public CollegeStudent(int studentID, String name, int age, String grade, String major) {
        super(studentID, name, age, grade);
        this.major = major;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    @Override
    public void displayAll() {
        super.displayAll();
        System.out.println("Major: " + major);
    }
}
