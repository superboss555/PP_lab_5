package Lab.Class;

public class Synchronizer {
    private boolean canWrite = true;

    public synchronized void signalRead(){
        canWrite = true;
        notify();
    }

    public synchronized void signalWrite(){
        canWrite = false;
        notify();
    }

    public synchronized void awaitRead(){
        while (canWrite){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public synchronized void awaitWrite(){
        while (!canWrite){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
