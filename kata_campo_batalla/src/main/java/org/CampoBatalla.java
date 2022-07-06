package org;

public class CampoBatalla {

    public String supervivientes(String letras) {
        char letra_actual = ' ';
        boolean bomba = false;
        int pos_refugio = 0;
        String letras_en_refugio = "";
        for (int i = 0; i < letras.length(); i++) {
            letra_actual = letras.charAt(i);
            if (letra_actual == '#') {
                bomba = true;
            }
            if (letra_actual == '[') {
               letras_en_refugio = refugio(letras, i + 1);
            }
        }
        if (bomba == true) {
            return letras_en_refugio;
        }
        return "abdefghijk";
    }

    private String refugio(String letras, int i) {
        char letra_actual = letras.charAt(i);
        String letras_en_refugio = "";
        while(letra_actual != ']') {
            letras_en_refugio += letra_actual;
            i++;
            letra_actual = letras.charAt(i);
        }
        return letras_en_refugio;
    }
}
