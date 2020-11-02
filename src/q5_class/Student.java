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
public  class Student extends Person
    {
    String grade;
    final String class_status;
    

        public Student(String grade, String class_status, String name, String adress, String phone, String email) {
            super(name, adress, phone, email);
            this.grade = grade;
            this.class_status = class_status;
        }

        @Override
        public String toString() {
            return "Student{" + "grade=" + grade + ", class_status=" + class_status + '}';
        }
    
    }
    

