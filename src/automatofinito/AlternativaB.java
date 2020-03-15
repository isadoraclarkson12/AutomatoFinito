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
public class AlternativaB {
        // E1 = {a, b}, E2 = {a, b, c, ... ,z} e E3 = {0, 1, 2, ... , 9}
    // L2 = { w e E1* | w possui aaa como subcadeia}
    public static boolean testarSentenca(String s) {
        return teste(s, 0, 0);
    }

    private static boolean teste(String s, int i, int n) {
        if (n == 3) {
            return true;
        }
        if (i == s.length() && n < 3) {
            return false;
        }
        if (s.charAt(i) == 'a') {
            return teste(s, i + 1, n + 1);
        } else {
            return teste(s, i + 1, 0);
        }
    }
}
