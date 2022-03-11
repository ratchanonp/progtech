/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

/**
 *
 * @author ratchanon
 */
public class Exam3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] student = {"Tim", "Tom", "Rin", "Tim", "Bin", "Tim", "Bin"};

        for (int i = 0; i < student.length; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (student[j].equals(student[i])) {
                    student[j] = "";
                    break;
                }
            }
        }

        for (String std : student) {
            if (!std.equals("")) {
                System.out.print(std + " ");
            }
        }
    }

}
