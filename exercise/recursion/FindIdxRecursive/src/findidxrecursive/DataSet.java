/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package findidxrecursive;

/**
 *
 * @author ratchanon
 */
public class DataSet {

    private String[] s;

    public DataSet(String[] s) {
        this.s = s;
    }

    public int findIDX(String word) {
        return findIDX(word, 0);
    }

    public int findIDX(String word, int index) {
        if (index == s.length - 1) {
            return -1;
        }

        if (word.equals(s[index])) {
            return index;
        }

        return findIDX(word, index + 1);
    }
}
