/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

public class Qs4 implements Runnable 
{ 
    private int x; 
    private int y; 

    public static void main(String [] args) 
    { 
        Q126 that = new Q126(); 
        (new Thread(that)).start( ); /* Line 8 */
        (new Thread(that)).start( ); /* Line 9 */
    } 
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