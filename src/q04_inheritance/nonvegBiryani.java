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
public class nonvegBiryani extends Biryani {

    private String ingredient;

    public nonvegBiryani(String ingredient, int water, int onionQuantity) {
        super(water, onionQuantity);
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    public String getingredients() {
        return super.getingredients() + " meat= " + ingredient;
    }

    @Override
    public String toString() {
        return "ingredient=" + ingredient;
    }

}
