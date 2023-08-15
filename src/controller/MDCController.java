package controller;

public class MDCController {
    public MDCController() {
        super();
    }

    public int CalcMDC(int x, int y) {
        if (x > y) {
            return CalcMDC(x-y, y);
        } else if (x == y) {
            return x;
        } else {
            return CalcMDC(y, x);
        }
    }
}
