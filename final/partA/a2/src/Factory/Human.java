/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

public class Human extends AnObject {

    private char gender;

    public Human(double w, char gender) {
        super(w);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }
}
