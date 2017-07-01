/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabh
 */
class Processor implements Runnable {

    int id;
    public Processor(int id) {
    this.id=id;
    }
    
    public void run(){
    
        System.out.println("Started: "+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
          }
        System.out.println("COmpleted: "+ id);
    }
    
}
