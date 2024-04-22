package Lab;


import Lab.Class.Calculations;
import Lab.Class.ObjectHandler;
//import Lab.Class.SharedObject;
//import Lab.Class.Synchronizer;
import Lab.Interface.FirstInterface;
//import Lab.Thread.ReaderRunnable;
//import Lab.Thread.ReaderThread;
//import Lab.Thread.WriterRunnable;
//import Lab.Thread.WriterThread;

public class Main {

    public static void main(String[] args){

//        SharedObject sharedObject = new SharedObject();
//        WriterThread writerThread = new WriterThread(sharedObject);
//        ReaderThread readerThread = new ReaderThread(sharedObject);
//
//        writerThread.setPriority(Thread.MAX_PRIORITY);
//        readerThread.setPriority(Thread.MAX_PRIORITY);
//
//        writerThread.start();
//        readerThread.start();


//        Synchronizer synchronizer = new Synchronizer();
//        WriterRunnable writerRunnable = new WriterRunnable(sharedObject, synchronizer);
//        ReaderRunnable readerRunnable = new ReaderRunnable(sharedObject, synchronizer);
//
//        Thread writer = new Thread(writerRunnable);
//        Thread reader = new Thread(readerRunnable);
//
//        writer.start();
//        reader.start();

        FirstInterface firstInterface = new Calculations();
        FirstInterface synchronised = ObjectHandler.synchronizedInterface(firstInterface);

        int result1 = synchronised.summa(10, 5);
        System.out.println("summa = " + result1);

        int result2 = synchronised.difference(10, 5);
        System.out.println("dif = " + result2);
    }

}

