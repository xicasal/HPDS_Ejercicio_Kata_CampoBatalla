package org;

public class CampoBatalla {

    public String supervivientes(String letras) {
        char letra_actual = ' ';
        int contador_bombas = 0;
        String letras_en_refugio = "";
        String letras_supervivientes = "";
        for (int i = 0; i < letras.length(); i++) {
            letra_actual = letras.charAt(i);
            if (letra_actual == '#') {
                contador_bombas += 1;
            }else if (letra_actual == '[') {
               letras_en_refugio = refugio(letras, i + 1);
            } else if (letra_actual != ']'){
                letras_supervivientes += letra_actual;
            }
        }
        if (contador_bombas == 1) {
            return letras_en_refugio;
        } else if (contador_bombas == 2) {
            return "";
        }
        return letras_supervivientes;
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
