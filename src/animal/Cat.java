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
public class Cat extends Animal {
    
    public Cat() {
    }

    public Cat(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
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
                +"Alive: "+isAlive;
        return text;
    }
    
    @Override
    public void printSound() {
        System.out.println("Miao");
    }

}
