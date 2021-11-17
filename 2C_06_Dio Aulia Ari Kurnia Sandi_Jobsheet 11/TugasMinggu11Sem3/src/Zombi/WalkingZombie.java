/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zombi;

/**
 *
 * @author Dio
 */
public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health *= 1.1;
        } else if (level == 2) {
            health *= 1.3;
        } else if (level == 3) {
            health *= 1.4;
        }
    }

    @Override
    public void destroyed() {
        health -= (health * 0.2);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = " + super.getZombieInfo();
    }

}
