/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q04_latebindingpolymorphism;

/**
 *
 * @author Shivani tangellapally
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person(); 
      Person s = new Student(); 

      p.work(); 
      s.work(); 
   }

}
