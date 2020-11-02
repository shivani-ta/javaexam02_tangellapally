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
public enum Flavor {
    vanilla(3),
    chocolate(4),
    pista(5);
    private final double icecreamprice;

    private Flavor(double icecreamprice) {
        this.icecreamprice = icecreamprice;
    }

    /**
     *
     * @return
     */
    public double geticecreamprice() {
        return icecreamprice;
    }

}
