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
public abstract class Animal {
    String name;
    int age;
    String food;
    String gender;
    int alive;
    String suara;

    public Animal() {
        
    }
    
    public Animal(String name, int age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFood() {
        return food;
    }

    public String getGender() {
        return gender;
    }

    public int getAlive() {
        return alive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAlive(int alive) {
        this.alive = alive;
    }
    
    public abstract void printSound();
    
    public String printData(){
        return "";
    }

    public boolean isAlive() {
        if(alive == 1){
            return true;
        }
        else{
            return false;
        }
    }
    
}
