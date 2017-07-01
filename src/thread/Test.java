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
public class Test {
    
    public static void main(String[] args) {
        System.out.println(Test.multiply(10.3, 10.1));
        Person obj=new Person("rishabh");
        System.out.println(obj.greet("ANkit"));
    }
    
    public static Double multiply(Double a,Double b){
        return a*b;
    }
    
}
class Person {
    String name;

    public Person(String personName) {
        name = personName;
    }

    public String greet(String yourName) {
        return String.format("Hi %s, my name is %s", name, yourName);
    }
}