/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q04_inheritance;

/**
 *
 * @author Shivani tangellapally
 */
public class biryaniDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * @param args the command line arguments
         */

        nonvegBiryani ch = new nonvegBiryani("chicken", 4, 2);
        System.out.println("chickenBiryani=" + ch.getingredients());
        System.out.println(ch);
        nonvegBiryani f = new nonvegBiryani("fish", 3, 2);
        System.out.println("fishBiryani=" + f.getingredients());
        System.out.println(f);
        vegBiryani p = new vegBiryani("paneer", 3, 2);
        System.out.println("paneerBiryani=" + p.getingredients());
        System.out.println(p);

    }

}
