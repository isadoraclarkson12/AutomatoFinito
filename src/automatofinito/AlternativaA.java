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
public class AlternativaA {

    public static boolean testarSentenca(String ent) {
        int tam = ent.length();

        if (ent.charAt(0) == 'a' && ent.charAt(tam - 1) == 'b') {
            return true;

        } else {
            return false;

        }
    }
}
