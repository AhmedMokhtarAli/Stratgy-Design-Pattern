/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duck.Behavior;

/**
 *
 * @author Ahmed Mokhter
 */
public class NoFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("sorry..i can`t fly");
    }
    
}
