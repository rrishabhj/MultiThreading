/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabh
 */
class Process extends Thread{

    /**
     * when tow threads run together sometimes in some operating sys a thread
    makes its own copy of the variables called cached variable.When this happens
    a separate thread can't change the value of the other thread having their own copy of variables
    To prevent this from happening we use volatile keyword to prevent caching of var.
    
     */
    
    private volatile boolean shutdown=true;
    @Override
    public void run() {
        while(shutdown){
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Process.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          
    }
    
    public void shutdown(){
          shutdown=false;  
        } 
}
public class Demo21 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        Process thread=new Process();
        thread.start();
        
        
        System.out.println("Press enter to stop");
        input.nextLine();
        thread.shutdown();
    }
    
}
