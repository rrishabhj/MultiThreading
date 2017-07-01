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
public class TestSyncBlock {
        
    public synchronized void print(int num){
    
        for(int i=1;i<=5;i++){
            
            System.out.println(i*num);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestSyncBlock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
