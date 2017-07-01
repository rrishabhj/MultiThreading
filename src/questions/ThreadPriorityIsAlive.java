/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabh
 */
public class ThreadPriorityIsAlive extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+": "+Thread.currentThread().getPriority());
		try {
        		Thread.sleep(1000);
    		}
    		catch(InterruptedException ie) { }
       		System.out.println("r2 ");
  	}
	public static void main(String[] args)
	{
		ThreadPriorityIsAlive t1=new ThreadPriorityIsAlive();
		ThreadPriorityIsAlive t2=new ThreadPriorityIsAlive();
		
                t1.setPriority(9);
                t2.setPriority(1);
                t1.start(); 
		t2.start();
            try {
                t1.join();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadPriorityIsAlive.class.getName()).log(Level.SEVERE, null, ex);
            }
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}