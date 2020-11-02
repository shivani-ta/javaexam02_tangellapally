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
public class Biryani {

    private String rice;
    private int water;
    private int onionQuantity;

    public Biryani() {
        this.rice = rice;
        this.water = water;
        this.onionQuantity = onionQuantity;
    }

    public Biryani(int water, int onionQuantity) {
        this.water = water;
        this.onionQuantity = onionQuantity;
    }

    public String getRice() {
        return rice;
    }

    public int getWater() {
        return water;
    }

    public int getOnionQuantity() {
        return onionQuantity;
    }

    public String getingredients() {
        return " rice " + " waterquantity= " + water + " onions " + onionQuantity;
    }

    @Override
    public String toString() {
        return "rice=" + rice + ", water=" + water + ", onionQuantity=" + onionQuantity;
    }

}
