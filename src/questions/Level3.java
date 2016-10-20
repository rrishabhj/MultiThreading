/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

public class Level3 implements Runnable 
{ 
    private int x; 
    private int y; 

    public static void main(String [] args) 
    { 
        Level3 that = new Level3(); 
        (new Thread(that)).start( ); /* Line 8 */
        (new Thread(that)).start( ); /* Line 9 */
    } 
    
    //the synchronized block is locked to the class it can be seen as locked with this that is the instance of the class
    // when we want to lock with a particular object we use synchronized block
    // Object lock=new Object()
    public synchronized void run( ) /* Line 11 */
    { 
        for (;;) /* Line 13 */
        { 
            x++; 
            y++; 
            System.out.println("x = " + x + "y = " + y); 
        } 
    } 
}
