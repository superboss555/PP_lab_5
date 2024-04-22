package Lab.Class;

import Lab.Interface.FirstInterface;

public class ObjectHandler {
    public static FirstInterface synchronizedInterface(FirstInterface firstInterface){
        return new SynchronizedCalculations(firstInterface);
    }
}
