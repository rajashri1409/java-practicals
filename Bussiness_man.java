/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author RAJASHRI BHOSALE
 */
public class Bussiness_man  extends Person{
      String company_name;
      String income ;

    public Bussiness_man(String name, String age, String Bgroup,String company_name, String income ) {
        super(name, age, Bgroup);
        this.company_name = company_name;
        this.income = income;
    }

    @Override
    public String toString() {
        return super.toString() + "\n4) company_name=" + company_name + "\n5) income=" + income ;
    }
    
      
}
