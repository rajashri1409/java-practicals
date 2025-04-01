/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author RAJASHRI BHOSALE
 */
public class Person {
           String name;
           String age ;
           String  Bgroup;

    public Person(String name, String age, String Bgroup) {
        this.name = name;
        this.age = age;
        this.Bgroup = Bgroup;
    }

    @Override
    public String toString() {
        return  "1) name=" + name + "\n2) age=" + age + "\n3) Bgroup=" + Bgroup ;
    }
           
}
