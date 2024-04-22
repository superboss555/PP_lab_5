package Lab.Class;

import Lab.Interface.FirstInterface;

public class Calculations implements FirstInterface {

    @Override
    public int summa(int a, int b) {
        return a+b;
    }

    @Override
    public int difference(int a, int b) {
        return a-b;
    }

}
