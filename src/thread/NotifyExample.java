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
public class NotifyExample {
    
    public static void main(String[] args) {
        Customer m=new Customer();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
         
                m.withdraw(15000);
                
            }
        });
        t1.start();
        
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
         
                m.deposit(10000);
            }
        });
        
        t2.start();
    }
    
}
