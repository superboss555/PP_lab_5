//package Lab.Thread;
//
//import Lab.Class.SharedObject;
//import Lab.Class.Synchronizer;
//
//
//public class WriterRunnable implements Runnable {
//
//    private SharedObject object;
//    private Synchronizer synchronizer;
//
//    public WriterRunnable(SharedObject object, Synchronizer synchronizer){
//        this.object = object;
//        this.synchronizer = synchronizer;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++){
//            synchronizer.signalWrite();
//            int value = (int) (Math.random() * 100) + 1;
//            object.writeData(value, i);
//            System.out.println("Write: " + value + " to position " + i);
//            synchronizer.awaitRead();
//        }
//    }
//}
