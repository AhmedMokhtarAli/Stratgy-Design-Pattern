/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duck;

import Duck.Behavior.FlyBehavior;
import Duck.Behavior.NoFly;
import Duck.Behavior.NoWalk;
import Duck.Behavior.Quack;
import Duck.Behavior.QuackBehavior;
import Duck.Behavior.WalkBehavior;

/**
 *
 * @author Ahmed Mokhter
 */
public class DummyDuck extends Duck {

    NoFly noFly;
    Quack quack;
    NoWalk noWalk;

    public DummyDuck(NoFly noFly, Quack quack, NoWalk noWalk) {
        super(noFly, quack, noWalk);
        this.noFly = noFly;
        this.quack = quack;
        this.noWalk = noWalk;
    }
    
    @Override
    public void display() {
        System.out.println("I am dummy duck");
    }

    @Override
    public void fly() {
        noFly.fly();
    }

    @Override
    public void walk() {
        noWalk.walk();
    }

    @Override
    public void quack() {
        quack.quack();
    }
    
}
