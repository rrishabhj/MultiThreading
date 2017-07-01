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
public class DeadlockExample {
    
    public static void main(String[] args) {
        
    final    String lock1="rishabh";
        final String lock2="jindal";
        
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
         
                synchronized(lock1){
                    
                   
                        System.out.println("Thread 1:locked on Lock 1");
               try {          
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DeadlockExample.class.getName()).log(Level.SEVERE, null, ex);
                    }
          
               synchronized(lock2){
                    
                        System.out.println("Thread 1:locked on Lock 2");
                    
                }
                    
                }
                
                
                
            
            }
        });
        
        
        
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
         
                
                synchronized(lock2){
                    
                        System.out.println("Thread 2:locked on Lock 2");
                    try {
                        
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DeadlockExample.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  synchronized(lock1){
                    
                        System.out.println("Thread 2:locked on Lock 1");
                     
                    
                }  
                    
                }
                
                }
        });
        
        thread1.start();
        thread2.start();
    }
    
}
