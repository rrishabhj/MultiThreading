    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabh
 */


/**
 * 
 * 
    t1.join()-- this method halts main thread untill this thread dies.
    
    synchronized
      count++
      it is three step process. now suppose the thread1 is cal count++ with count=100
      suddenly another thread is started which takes its input also as count =100
      so we lost a count
      this can be used to first complete this task of this thread first then move to another thread
      
 */
public class Demo31 {

    private int count=0;
    public static void main(String[] args) {
        
        Demo31 obj=new Demo31();
        obj.doWork();
    }
    
    public void doWork(){
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100000;i++){
                    increment();
                }
            }
        });
 
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100000;i++){
                    increment();
                }
            }
        });
        
        thread1.start();
        thread2.start();
        
        /**
         *  Here we started both our threads,so now we have three threads running main,thread1,thread2 
         */
        
        try {
            thread1.join();
            // after joing thread1 from main, the main thread halts untill the thread1 is finished, but our thread 2 is still running parallely
            // When one thread is executing a synchronized method for an object, all other threads that invoke synchronized methods for the same
            // object block (suspend execution) until the first thread is done with the object.
            
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Demo31.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        System.out.println("count:"+count);
    }
    
    public synchronized  void increment(){
        // when this statement runs after thread1.join() this function is first run halting every thread. Other thread can run oly after this
        // block of code is finished running.
        
        count++;
    }
}
