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
public class AlternativaC {
     // E1 = {a, b}, E2 = {a, b, c, ... ,z} e E3 = {0, 1, 2, ... , 9}
    // L3 = { w e E1* | w possui baba como prefixo e abab como sufixo }
    public static boolean testarSentenca(String s) {
        if (s.length() >= 4) {
            return testePrefixo(s) && testeSufixo(s);
        } else {
            return false;
        }
    }

    private static boolean testePrefixo(String s) {
        if (s.charAt(0) == 'b' && s.charAt(1) == 'a'
                && s.charAt(2) == 'b' && s.charAt(3) == 'a') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean testeSufixo(String s) {
        if (s.charAt(s.length() - 1) == 'b' && s.charAt(s.length() - 2) == 'a'
                && s.charAt(s.length() - 3) == 'b' && s.charAt(s.length() - 4) == 'a') {
            return true;
        } else {
            return false;
        }
    }
}
