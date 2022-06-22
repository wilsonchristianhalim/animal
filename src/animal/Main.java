/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Wilson
 */
public class Main {
    
    public Main() {
        Cat cat = new Cat();
        cat.setName("Anggora");
        cat.setAge(5);
        cat.setFood("Daging");
        cat.setGender("Male");
        cat.setAlive(1);
        System.out.println(cat.printData());
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
