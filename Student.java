/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author RAJASHRI BHOSALE
 */
public class Student extends Person {
     String branch ;
     String college_name;

    public Student(String name, String age, String Bgroup,String branch, String college_name ) {
        super(name, age, Bgroup);
        this.branch = branch;
        this.college_name = college_name;
    }

    @Override
    public String toString() {
        return super.toString() + "\n4) branch=" + branch + "\n5) college_name=" + college_name ;
    }
}
