/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q03_loan;

/**
 *
 * @author Shivani tangellapally
 *
 */
public class Circle {

    int rad;

    Circle() {
        rad = 0;
    }

    /**
     *
     * @param rad
     */
    public Circle(int rad) {
        this.rad = rad;
    }

    /**
     *
     * @return to string
     */
    @Override
    public String toString() {
        return " This is Circle with " + "radius of  " + rad;

    }

}
