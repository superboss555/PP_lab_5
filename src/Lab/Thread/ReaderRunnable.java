//package Lab.Thread;
//
//import Lab.Class.SharedObject;
//import Lab.Class.Synchronizer;
//
//public class ReaderRunnable implements Runnable {
//    private SharedObject object;
//    private Synchronizer synchronizer;
//
//    public ReaderRunnable(SharedObject object, Synchronizer synchronizer){
//        this.object = object;
//        this.synchronizer = synchronizer;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++){
//            synchronizer.awaitRead();
//            int value = object.readData(i);
//            System.out.println("Read: " + value + " from position " + i);
//            synchronizer.signalWrite();
//        }
//    }
//}
