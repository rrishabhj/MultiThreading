/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;
class Level2 implements Runnable 
{ 
    int x = 0, y = 0; 
    int addX() {x++; return x;} 
    int addY() {y++; return y;} 
    public void run() { 
    for(int i = 0; i < 10; i++) 
        System.out.println(Thread.currentThread().getName()+" "+addX() + " " + addY()); 
} 
    public static void main(String args[]) 
    { 
        Level2 run1 = new Level2(); 
        Level2 run2 = new Level2(); 
        Thread t1 = new Thread(run1); 
        Thread t2 = new Thread(run2); 
        t1.start(); 
        t2.start(); 
    } 
}
