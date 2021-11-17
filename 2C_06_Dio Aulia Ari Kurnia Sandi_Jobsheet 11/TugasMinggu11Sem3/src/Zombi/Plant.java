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
public class Plant {

    public void doDestroy(Destroyable d) {
        if (d instanceof WalkingZombie) {
            ((WalkingZombie) d).destroyed();
        } else if (d instanceof JumpingZombie) {
            ((JumpingZombie) d).destroyed();
        } else if (d instanceof Barier) {
            ((Barier) d).destroyed();
        }
    }
}
