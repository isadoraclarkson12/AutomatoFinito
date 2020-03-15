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
public class AlternativaJ {
    // E1 = {a, b}, E2 = {a, b, c, ... ,z} e E3 = {0, 1, 2, ... , 9}
    // L10 = { w e E3* U {+,-, e, ‘,’}| w é um número inteiro, um número decimal
    // ou um número representado em notação científica}
    // Por exemplo, os seguintes números pertencem a L7: 5, –0,4, 5e+3, +2,78e–5
    public static boolean testarSentenca(String s) {
        return testeInteiro(s, 0) || testeDecimal(s) || testeNotacaoCientifica(s);
    }

    private static boolean testeInteiro(String s, int i) {//(s.charAt(i) >='a'&&s.charAt(i)<='z')||(s.charAt(i) >='A'&&s.charAt(i)<='Z')
        if (s.length() == i) {
            return true;
        } else if ((s.charAt(i) == '+' || s.charAt(i) == '-') && i != 0) {
            return false;
        } else if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                && s.charAt(i) != '+' && s.charAt(i) != '-') {
            return false;
        } else {
            return testeInteiro(s, i + 1);
        }
    }

    private static boolean testeDecimal(String s /*, int i, int virgula*/) {
        String vet[] = s.split(",");
        if (vet.length > 2) {
            return false;
        } else {
            return testeInteiro(vet[0], 0) && vet.length > 1 && !vet[1].isEmpty()
                    && vet[1].charAt(0) != '+' && vet[1].charAt(0) != '-' && testeInteiro(vet[1], 0);
        }
    }

    // Exemplos de notação científica: 5e+3, +2,78e–5
    private static boolean testeNotacaoCientifica(String s) {
        String vet[] = s.split("e");
        return testeDecimal(vet[0]) && testeInteiro(vet[1], 0);
    }
}
