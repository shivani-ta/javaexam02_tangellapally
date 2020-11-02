/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q03_loan;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

/**
 *
 * @author shivani tangellapally
 */
public class Loan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> lst;
        lst = new ArrayList<Object>();
        Circle c = new Circle(8);
        lst.add(c);
        lst.add(new loan(200000000, 5));
        lst.add(new Date());

        lst.add("\nloan details");
        
        for(Object list:lst)
        {
            System.out.println(list.toString());
        }
        
        
        
       // System.out.println(lst.toString());
    }

    /**
     *
     */
    public static class loan {

        int due;
        int interest;

        /**
         *
         * @param due
         * @param interest
         */
        public loan(int due, int interest) {
            this.due = due;
            this.interest = interest;
        }

        /**
         *
         */
        public loan() {
        }

        /**
         *
         * @return to string
         */
        @Override
        public String toString() {
            return "\n loan " + "due= " + due + " \n interest =" + interest + "\n";
        }

    }
}
