/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Dio
 */
public class EncapDemo {

    private String name;
    private int age;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param newName the name to set
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int newAge) {
        if ((newAge>=18)&&(newAge<=30)) {
            age = newAge;
        } else {
            System.out.println("Maaf umur yang anda masukkan tidak memenuhi persyaratan");
        }
    }

}
