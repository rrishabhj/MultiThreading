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
public class Demo3 {
    public static void main(String[] args) {
        Thread obj=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("hello"+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Demo3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        
        obj.start();
        
    }
    
}
