/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12q1s6434480323;

/**
 *
 * @author ratchanon
 */
public class EvaluationTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sc[] = {45, 48};
        Secretary s = new Secretary("Sasipa", 20000, sc, 60);
        if (s.grade(s.evaluate()) == 'P') {
            System.out.println("Congratulations");
            System.out.println(s);
        } else {
            System.out.println("Sorry");
        }
        int subjScore[] = {45, 90, 89, 88, 75, 56, 46, 70, 90, 65};
        Subject sj = new Subject("Java", subjScore);
        System.out.println(sj + " Grade class is "
                + sj.grade(sj.evaluate()));
    }
}
