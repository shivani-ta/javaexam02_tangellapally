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

    public  class Staff extends Employee
    {
    String title;

        public Staff(String title, String office, String Date_hired, int salary, String name, String adress, String phone, String email) {
            super(office, Date_hired, salary, name, adress, phone, email);
            this.title = title;
        }

        @Override
        public String toString() {
            return "staff{" + "title=" + title + '}';
        }
    
    }

