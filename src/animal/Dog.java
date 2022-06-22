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
import javax.swing.JOptionPane;
public class Dog extends Animal {

    public Dog() {
    }
    
    public Dog(String name, int age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.suara = "Whoof";
        this.alive = alive;
    }

    @Override
    public String printData() {
        String isAlive;
        if (alive == 1) {
            isAlive = "Hidup";
        }
        else{
            isAlive = "Mati";
        }
        String text = "name: "+name+"\n"
                +"Age: "+age+"\n"
                +"Food: "+food+"\n"
                +"Gender: "+gender+"\n"
                +"Suara: "+suara+"\n"
                +"Alive: "+isAlive;
        return text;
    }

    @Override
    public void printSound() {
        System.out.println("Whoof");
    }
     
}
