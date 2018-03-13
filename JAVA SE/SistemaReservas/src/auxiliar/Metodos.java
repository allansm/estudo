package auxiliar;

import javax.swing.JOptionPane;


public class Metodos {
    public static void write(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    public static String read(String msg){
        return JOptionPane.showInputDialog(msg);
    }
}
