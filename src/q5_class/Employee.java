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
public  class Employee extends Person
    {
    String office,Date_hired;
    int salary;

        public Employee(String office, String Date_hired, int salary, String name, String adress, String phone, String email) {
            super(name, adress, phone, email);
            this.office = office;
            this.Date_hired = Date_hired;
            this.salary = salary;
        }

    @Override
    public String toString() {
        return "Employee{" + "office=" + office + ", Date_hired=" + Date_hired + ", salary=" + salary + '}';
    }

       
    }