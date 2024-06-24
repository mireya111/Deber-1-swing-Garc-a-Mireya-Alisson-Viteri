import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Main {
    public static void main(String[] args) {
        //Creación de un objeto (la ventana)
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculadora");
        //Recolleccion de todos los elementos que posee la ventana
        frame.setContentPane(new calculadora().panel);
        frame.setSize(750,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}