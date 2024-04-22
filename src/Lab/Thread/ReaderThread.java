//package Lab.Thread;
//
//
//import Lab.Class.SharedObject;
//
//
//
//public class ReaderThread extends  Thread {
//    private SharedObject object;
//
//    public ReaderThread(SharedObject sharedObject) {
//        this.object = sharedObject;
//    }
//
//    @Override
//    public void run(){
//        for (int i = 0; i < 10; i ++){
//            int value = (int) (Math.random()*100) + 1;
//            object.writeData(value, i);
//            System.out.println("Write: " + value + " to position " + i);
//        }
//    }
//}
