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
public class Customer {
    
    private int amount=10000;
    
    public synchronized void withdraw(int amount){
        
        System.out.println("Withdrawing....");
        if(this.amount<amount){
            System.out.println("Deposit mu money bitch!");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.amount-=amount;
        
        System.out.println("Succes withdraw");
    }
    
    public synchronized void deposit(int amount){
        System.out.println("Depositing...");
       this.amount+=amount;
       notify();
        System.out.println("deposit success");
    }
}
