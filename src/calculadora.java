import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JTextField numero1;
    public JPanel panel;
    private JTextField numero2;
    private JButton suma;
    private JButton resta;
    private JButton raizCuadrada;
    private JButton potenciacion;
    private JButton seno;
    private JButton tangente;
    private JButton coseno;
    private JButton multiplicacion;
    private JButton division;
    private JLabel titulo1;
    private JLabel titulo2;
    private JLabel respuesta;
    private JLabel aclaraciones;

    public calculadora() {
        //Botón "Suma"
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                double resultado = numero01 + numero02;
                respuesta.setText(String.format("%.2f",resultado));
                aclaraciones.setText("Ninguna");
            }
        });
        //Botón "Multiplicacion"
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                double resultado = numero01 * numero02;
                respuesta.setText(String.format("%.2f",resultado));
                aclaraciones.setText("Ninguna");
            }
        });
        //Botón "Resta"
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                double resultado = numero01 - numero02;
                respuesta.setText(String.format("%.2f",resultado));
                aclaraciones.setText("El orden de la resta fue, numero 1 - numero 2");
            }
        });
        //Botón "Division"
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                if (numero02==0 && numero01==0){
                    respuesta.setText("Resultado indefinido");
                    aclaraciones.setText("0/0 está indeterminado.");
                } else if (numero02==0) {
                    respuesta.setText("No se puede dividir entre cero");
                    aclaraciones.setText("El numero 2 es igual a 0 por ello no es posible la division");
                } else if (numero02>0 || numero02<0){
                    double resultado = numero01 / numero02;
                    respuesta.setText(String.format("%.2f",resultado));
                    aclaraciones.setText("Dividendo = numero1 y Divisor = numero 2");
                }
            }
        });
        //Botón "Potenciación"
        potenciacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                double potenciacion = Math.pow(numero01,numero02);
                respuesta.setText(String.format("%.2f",potenciacion));
                aclaraciones.setText("Base = numero 1 y exponente = numero 2");
            }
        });
        //Botón "Raiz cuadrada"
        raizCuadrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                if (numero02>0 && numero01>0){
                    double radicacion1=Math.sqrt(numero01);
                    double radicacion2 = Math.sqrt(numero02);
                    respuesta.setText("Raiz numero 01: " + String.format("%.2f", radicacion1) + " " + "Raiz numero 02: " + String.format("%.2f", radicacion2));
                    aclaraciones.setText("Se muestra la raiz cuadrada de cada numero digitado");
                } else if (numero02<0 || numero01<0){
                    respuesta.setText("No exite raiz cuadrada de un numero negativo");
                    aclaraciones.setText("El numero 1 o 2 es un numero negativo");
                }
            }
        });
    }
}
