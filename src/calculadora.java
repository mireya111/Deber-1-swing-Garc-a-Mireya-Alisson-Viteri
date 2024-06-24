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
    private JButton bt_tangente;
    private JButton bt_coseno;
    private JButton multiplicacion;
    private JButton division;
    private JLabel titulo1;
    private JLabel respuesta;
    private JLabel aclaraciones;
    private JLabel lb_titulo;
    private JTextArea tA_resultado;
    private JButton bt_seno;

    public calculadora() {
        //Botón "Suma"
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                double resultado = numero01 + numero02;
                tA_resultado.setText(String.format("%.2f", resultado));
            }
        });
        //Botón "Multiplicacion"
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                double resultado = numero01 * numero02;
                tA_resultado.setText(String.format("%.2f", resultado));
            }
        });
        //Botón "Resta"
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                double resultado = numero01 - numero02;
                tA_resultado.setText(String.format("%.2f", resultado));

            }
        });
        //Botón "Division"
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                if (numero02==0 && numero01==0){
                    tA_resultado.setText("Resultado indefinido");
                    tA_resultado.setText("0/0 está indeterminado.");
                } else if (numero02==0) {
                    tA_resultado.setText("No se puede dividir entre cero");
                } else if (numero02>0 || numero02<0){
                    double resultado = numero01 / numero02;
                    tA_resultado.setText(String.format("%.2f", resultado));
                }
            }
        });
        //Botón "Potenciación"
        potenciacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero01 = Double.parseDouble(numero1.getText());
                double numero02 = Double.parseDouble(numero2.getText());
                double resultado= Math.pow(numero01,numero02);
                tA_resultado.setText(String.format("%.2f", resultado));
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
                    tA_resultado.setText("Raiz numero 01: " + String.format("%.2f", radicacion1) + " " + "Raiz numero 02: " + String.format("%.2f", radicacion2));
                    tA_resultado.setText("Se muestra la raiz cuadrada de cada numero digitado");
                } else if (numero02<0 || numero01<0){
                    tA_resultado.setText("No exite raiz cuadrada de un numero negativo");
                    tA_resultado.setText("El numero 1 o 2 es un numero negativo");
                }
            }
        });
        //Boton seno

        bt_seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double angulo = Double.parseDouble(numero1.getText());
                double angulo_radianes = Math.toRadians(angulo);
                double resultado = Math.sin(angulo_radianes);
                tA_resultado.setText(String.format("%.2f", resultado));
            }
        });
        bt_tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double angulo = Double.parseDouble(numero1.getText());
                double angulo_radianes = Math.toRadians(angulo);
                double resultado = Math.tan(angulo_radianes);
                tA_resultado.setText(String.format("%.2f", resultado));
            }
        });
        bt_coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double angulo = Double.parseDouble(numero1.getText());
                double angulo_radianes = Math.toRadians(angulo);
                double resultado = Math.cos(angulo_radianes);
                tA_resultado.setText(String.format("%.2f", resultado));
            }
        });
    }
}
