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
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p= new Person("shivani","4555-n collge dr","123456789","shiva@gmail.com");
        System.out.println(p.toString());
         Student s= new Student("A","graduate","shivani","4555-n collge dr","123456789","shiva@gmail.com");
        System.out.println(s.toString());
        Employee e= new Employee("office","11-01-2020",8000,"vani","1155-n collge dr","213456789","vani@gmail.com");
        System.out.println(e.toString());
        Faculty f =new Faculty(20,"java","office","1-08-2020",4000,"shiva","22-n collge dr","123996789","sh@gmail.com");
        System.out.println(f.toString());
        Staff St =new Staff("admin","office","5-6-2020",5000,"kamal","678-n collge dr","123456789","kamala@gmail.com");
        System.out.println(St.toString());
    }
    
    
}
  

