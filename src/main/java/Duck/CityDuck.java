/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duck;

import Duck.Behavior.Fly;
import Duck.Behavior.FlyBehavior;
import Duck.Behavior.Quack;
import Duck.Behavior.QuackBehavior;
import Duck.Behavior.Walk;
import Duck.Behavior.WalkBehavior;

/**
 *
 * @author Ahmed Mokhter
 */
public class CityDuck extends Duck {

        Fly fly;
        Walk walk;
        Quack quack;

    public CityDuck(Fly fly, Quack quack, Walk walk) {
        super(fly, quack, walk);
        this.fly=fly;
        this.quack=quack;
        this.walk=walk;
    }
        
    
    @Override
    public void display() {
        System.out.println("I am city duck");
    }

    @Override
    public void fly() {
        fly.fly();
    }

    @Override
    public void walk() {
        walk.walk();
    }

    @Override
    public void quack() {
        quack.quack();
    }
    
    
}
