//package Lab.Thread;
//
//import Lab.Class.SharedObject;
//import Lab.Interface.FirstInterface;
//
//
//public class WriterThread extends Thread  {
//
//    private FirstInterface obj;
//
//    public WriterThread(SharedObject sharedObject) {
//        this.obj = sharedObject;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            int value = obj.readData(i);
//            System.out.println("Read: " + value + " from position " + i);
//        }
//    }
//
//}
