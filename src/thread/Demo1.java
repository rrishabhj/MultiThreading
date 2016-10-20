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
class Runner extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Runner runner1=new Runner();
        runner1.start();
        
        Runner runner2=new Runner();
        runner2.start();
    
    }
    
}
