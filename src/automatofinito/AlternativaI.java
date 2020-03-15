/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatofinito;

/**
 *
 * @author PURGISA
 */
public class AlternativaI {
    public static boolean testarSentenca(String ent){
        char f = ent.charAt(0);
            int first = (int) f;

            if ((first >= 65 && first <= 90) || (first >= 97 && first <= 122)) {
                return true;
            } else {
                return false;
            }
    }
}
