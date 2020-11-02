/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q07_enum;

/**
 *
 * @author Shivani tangellapally
 */
public class Icecream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Flavor v=Flavor.vanilla;
        System.out.println("vanilla "+v.geticecreamprice());
        Flavor c=Flavor.chocolate;
        System.out.println("chocolate "+c.geticecreamprice());
        Flavor p=Flavor.pista;
        System.out.println("pista "+p.geticecreamprice());
        
    }
    
}
