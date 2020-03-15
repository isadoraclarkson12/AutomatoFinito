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
public class AlternativaE {
        // E1 = {a, b}, E2 = {a, b, c, ... ,z} e E3 = {0, 1, 2, ... , 9}
    // L5 = { w e E1* | w não possui ocorrência da cadeia baba }
    public static boolean testarSentenca(String s) {
        if (s.length() < 4) {
            return true;
        } else {
            return teste(s, 0, 0);
        }
    }

    private static boolean teste(String s, int i, int n) {
        if (n > 0) {
            return false;
        }
        if (s.length() - i < 4 && n == 0) {
            return true;
        }
        if (s.length() - i >= 4 && s.charAt(i) == 'b' && s.charAt(i + 1) == 'a'
                && s.charAt(i + 2) == 'b' && s.charAt(i + 3) == 'a') {
            return teste(s, i + 1, n + 1);
        } else {
            return teste(s, i + 1, n);
        }
    }
}
