/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3;

import javax.swing.JTextField;

/**
 *
 * @author Docente
 */
public class Operacion {

    private double valor1;
    private double valor2;

    private JTextField texto1;
    private JTextField texto2;

    public Operacion(JTextField val1, JTextField val2) {
        texto1 = val1;
        texto2 = val2;
    }

    public void convertir() {
        valor1 = getTextoDe(texto1);
        valor2 = getTextoDe(texto2);
    }

    public double sumar() {
        convertir();
        return valor1 + valor2;
    }

    public double restar() {
        convertir();
        return valor1 - valor2;
    }

    public double multiplicar() {
        convertir();
        return valor1 * valor2;
    }

    public double dividir() {
        convertir();
        return valor1 / valor2;
    }

    private double convertirTexto(String valor) {
        return Double.parseDouble(valor);
    }

    private double getTextoDe(JTextField cajita) {
        String textoVal1 = cajita.getText();
        return convertirTexto(textoVal1);
    }
}
