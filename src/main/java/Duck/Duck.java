/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duck;

import Duck.Behavior.FlyBehavior;
import Duck.Behavior.QuackBehavior;
import Duck.Behavior.WalkBehavior;

/**
 *
 * @author Ahmed Mokhter
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    WalkBehavior walkBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, WalkBehavior walkBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.walkBehavior = walkBehavior;
    }
    
    public abstract void display();
    public abstract void fly();
     public abstract void walk();
     public abstract void quack();
    
  
}
