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
public class Barier implements Destroyable {

    private int strenght;

    public Barier(int strenght) {
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    @Override
    public void destroyed() {
        this.strenght *= 0.9;
    }

    public String getBarierInfo() {
        return "Barier Strenght = " + this.strenght;
    }

}
