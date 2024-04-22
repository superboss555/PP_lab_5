package Lab.Class;

import Lab.Interface.FirstInterface;

public class SynchronizedCalculations implements FirstInterface {

    private  FirstInterface firstInterface;

    public SynchronizedCalculations (FirstInterface firstInterface){
        this.firstInterface = firstInterface;
    }
    @Override
    public int summa(int a, int b) {
        return firstInterface.summa(a, b);
    }

    @Override
    public int difference(int a, int b) {
        return difference(a, b);
    }
}
