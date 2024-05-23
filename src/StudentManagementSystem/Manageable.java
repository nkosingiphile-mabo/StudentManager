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
public interface Manageable {
    void add();
    
    void remove(int studentID);
    
    void displayAll();
}
