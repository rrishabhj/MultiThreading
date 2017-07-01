/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author rishabh
 */
public class SynchronizedBlock {
    
    public static void main(String[] args) {
        
        TestSyncBlock obj=new TestSyncBlock();
        
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.print(5);
                
                
            }
        });
        
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
         
               obj.print(100);
                
            }
        });
        
        t1.start();
        t2.start();
    }
    
}

