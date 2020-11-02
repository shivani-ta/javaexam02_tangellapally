/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q07_enumexample2;

/**
 *
 * @author Shivani tangellapally
 */
public enum Calculations{
        PLUS,
    MINUS,
    TIMES,
    DIVIDE;

     double calculate(double A, double B) {
        switch (this) {
            case PLUS:
                return A + B;
            case MINUS:
                return A - B;
            case TIMES:
                return A * B;
            case DIVIDE:
                return A / B;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }

    
}
