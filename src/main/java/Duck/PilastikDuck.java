/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duck;

import Duck.Behavior.Fly;
import Duck.Behavior.FlyBehavior;
import Duck.Behavior.NoQuack;
import Duck.Behavior.QuackBehavior;
import Duck.Behavior.Walk;
import Duck.Behavior.WalkBehavior;

/**
 *
 * @author Ahmed Mokhter
 */
public class PilastikDuck extends Duck {
    Fly fly;
    Walk walk;
    NoQuack noQuack;

    public PilastikDuck(Fly fly, Walk walk, NoQuack noQuack) {
        super(fly, noQuack, walk);
        this.fly = fly;
        this.walk = walk;
        this.noQuack = noQuack;
    }

    
    
   @Override
    public void display() {
        System.out.println("I am pilastikDuck duck");
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
        noQuack.quack();
    }
    
    
}
