package view;
import controller.MDCController;

public class Principal {
    public static void main (String[] args) {
        MDCController mdcc = new MDCController();

        int res = mdcc.CalcMDC(20, 24);

        System.out.println(res);
    }
}
