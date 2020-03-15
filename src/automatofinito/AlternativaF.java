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
public class AlternativaF {
   
    // E1 = {a, b}, E2 = {a, b, c, ... ,z} e E3 = {0, 1, 2, ... , 9}
    // L6 = { w e E1* | w possui ocorrência par de a's seguida por ocorrência impar de b's}
    public static boolean testarSentenca(String s) {
        return teste(s);
    }

    private static boolean teste(String s) {
        int i, na, nb;
        for (i = na = nb = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                na++;
                if (nb > 0) {
                    return false;
                }
            } else if (s.charAt(i) == 'b') {
                nb++;
            }
        }
        return na % 2 == 0 && nb % 2 != 0;
    } 
}
