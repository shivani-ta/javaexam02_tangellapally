/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q01_duplicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Shivani tangellapally
 */
public class DuplicateRemove {

    /**
     * @param lst
     */
    public static void removeDuplicate(ArrayList<Integer> lst) {
        for (int i = 0; i < lst.size(); i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(i) == lst.get(j)) {
                    lst.remove(j);
                    j--;
                }
            }
        }

        System.out.print("The distinct Integers are: ");
        System.out.println(lst.toString());
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> arr = new <Integer> ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 Integers: ");
        for (int i = 0; i < 10; i++) {
            arr.add(input.nextInt());
        }
        removeDuplicate((ArrayList<Integer>) arr);
    }
}
