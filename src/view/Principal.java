package view;
import controller.MDCController;
import javax.swing.JOptionPane;

public class Principal {
    public static void main (String[] args) {
        MDCController mdcc = new MDCController();

        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor x:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor y:"));

        int res = mdcc.CalcMDC(x, y);

        JOptionPane.showMessageDialog(null, "O MDC dos números " + x + " e " + y + " é " + res); // 20 24 -> 4

    }
}
