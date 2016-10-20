/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabh
 */
public class Worker2 {
    
    Random random=new Random();
    
    // our locker objects to lock the thread
    
    Object lock1=new Object();
    Object lock2=new Object();
    
            
    List<Integer> list1=new ArrayList<Integer>();
    List<Integer> list2=new ArrayList<Integer>();
   
    public void stageOne(){
        
        synchronized (lock1){
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        list1.add(random.nextInt());
        }
    }
    
    
    public void stageTwo(){
        synchronized (lock2){
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        list2.add(random.nextInt());
        }
    }
    public void process(){
        for(int i=0;i<1000;i++){
            stageOne();
            stageTwo();
        }
    }
    
    
    public void main2(){
        System.out.println("Starting....");
        
        long start=System.currentTimeMillis();
        
        
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        thread1.start();
        thread2.start();
//calling the same thread throws illigalTHread state Exception. even when the thread is finished running it is illigal to call again       
// thread1.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        long end=System.currentTimeMillis();
        
        System.out.println("Time Taken:"+(end-start));
        System.out.println("List1 SIze:"+list1.size()+"\nList2 Size:"+list2.size());
    }
}
