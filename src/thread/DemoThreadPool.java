/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabh
 */
public class DemoThreadPool {
    
    public static void main(String[] args) {
        
        ExecutorService executer=Executors.newFixedThreadPool(2);
        
        for(int i=0;i<5;i++){
            executer.submit(new Processor(i));
        }
        
        executer.shutdown();
        System.out.println("ALl Tasks Submitted.");
        try {
            executer.awaitTermination(1, TimeUnit.DAYS);
                    } catch (InterruptedException ex) {
            Logger.getLogger(DemoThreadPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("All Task Completed!");
    }
    
}
