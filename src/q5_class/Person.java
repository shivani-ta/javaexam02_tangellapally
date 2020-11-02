/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5_class;

/**
 *
 * @author Shivani tangellapally
 */
public class Person {
   
    String name,adress,phone,email;

        public Person(String name, String adress, String phone, String email) {
            this.name = name;
            this.adress = adress;
            this.phone = phone;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Person{" + "name=" + name + ", adress=" + adress + ", phone=" + phone + ", email=" + email + '}';
        }
    
    }
    

