/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stratgy;

import Duck.Behavior.Fly;
import Duck.Behavior.FlyBehavior;
import Duck.Behavior.NoFly;
import Duck.Behavior.NoQuack;
import Duck.Behavior.NoWalk;
import Duck.Behavior.Quack;
import Duck.Behavior.QuackBehavior;
import Duck.Behavior.Walk;
import Duck.Behavior.WalkBehavior;
import Duck.CityDuck;
import Duck.Duck;
import Duck.DummyDuck;
import Duck.PilastikDuck;

/**
 *
 * @author Ahmed Mokhter
 */
public class Stratgy {

    public static void main(String[] args) {
        Fly fly=new Fly();
        Walk walk=new Walk();
        Quack quack=new Quack();
        
        NoFly noFly=new NoFly();
        NoWalk noWalk=new NoWalk();
        NoQuack noQuack=new NoQuack();
        
        
        CityDuck cityDuck=new CityDuck(fly,quack,walk);
        DummyDuck dummyDuck=new DummyDuck(noFly,quack,noWalk);
        PilastikDuck pilastikDuck=new PilastikDuck(fly,walk,noQuack);
        
        cityDuck.fly();
        
        
    }
}
