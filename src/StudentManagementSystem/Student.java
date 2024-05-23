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
public abstract class Student implements Manageable{
    
    private int studentID;
    private String name;
    private int age;
    private String grade;
    
    public Student(){
    
    }
    
    public Student(int studentID, String name, int age, String grade) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    // Implementing methods from Manageable interface
    @Override
    public void add() {
        System.out.println("Student added: " + name);
    }
    
    @Override
    public void remove(int studentID) {
        System.out.println("Student with Studend ID \"" + studentID +"\" removed.");
    }
    
    @Override
    public void displayAll() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
