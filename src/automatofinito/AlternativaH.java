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
public class AlternativaH {
    public static boolean testarSentenca(String ent){
        int tam = ent.length();
            int soma = 0;
            for (int i = 0; i < tam; i++) {
                char v = ent.charAt(i);
                soma += Character.getNumericValue(v);
            }
            if (ent.charAt(0) == '0' && soma % 2 == 0) {

                return true;
            } else if (ent.charAt(0) == '1' && soma % 2 != 0) {

                return true;
            } else {
                return false;
            }
    }
}
