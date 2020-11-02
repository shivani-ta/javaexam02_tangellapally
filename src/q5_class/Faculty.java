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
  public  class Faculty extends Employee
    {
    int office_hours;
    String subject;

        public Faculty(int office_hours, String subject, String office, String Date_hired, int salary, String name, String adress, String phone, String email) {
            super(office, Date_hired, salary, name, adress, phone, email);
            this.office_hours = office_hours;
            this.subject = subject;
            
        }

    @Override
    public String toString() {
        return "Faculty{" + "office_hours=" + office_hours + ", subject=" + subject + '}';
    }
    
    }
