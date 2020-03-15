/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatofinito;

import javax.swing.JOptionPane;

/**
 *
 * @author PURGISA
 */
public class AlternativaG {
    public static boolean testarSentenca(String ent){
        int tam = ent.length();
            int cA = 0;
            int cB = 0;
            int exA = 0;
            int exB = 0;

            for (int i = 0; i < tam; i++) {
                if (ent.charAt(0) == 'a') {
                    exA = 1;
                    if (ent.charAt(i) == 'a') {
                        cA++;
                    }
                } else if (ent.charAt(0) == 'b') {
                    exB = 1;
                    if (ent.charAt(i) == 'b') {
                        cB++;
                    }
                }
            }
            if (cA % 2 == 0 && exA == 1) {
                return true;
            } else if (cB % 2 != 0 && exB == 1) {
                return true;
            } else {
                return false;
            }
    }
}
