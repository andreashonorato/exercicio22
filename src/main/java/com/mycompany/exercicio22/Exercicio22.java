
package com.mycompany.exercicio22;

import javax.swing.JOptionPane;

 class Exercicio22 {

    public static void main(String[] args) {
        
        double media = 0.0;
        double soma = 0.0;
        int i = 1;
        while(i < 1000){
            soma = soma + i; i++;
        }
        media = soma / 1000;
        JOptionPane.showMessageDialog(null, "media:" +media);
    }
 }

