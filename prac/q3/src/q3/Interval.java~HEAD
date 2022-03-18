/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author ratchanon
 */
public class Interval {

    private int start;
    private int stop;

    public Interval(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    public String comparesTo(Interval that) {
        if (this.stop < that.start) {
            return "A precedes B";
        } else if (that.stop < this.start) {
            return "B is preceded by A";
        } // Check met
        else if (that.start == this.stop) {
            return "A meets B";
        } else if (this.start == that.stop) {
            return "B is met by A";
        } // Check overlap
        else if (that.start > this.start && that.start < this.stop && that.stop > this.stop) {
            return "A overlaps B";
        } else if (this.start > that.start && this.start < that.stop && this.stop > that.stop) {
            return "B is overlapped by A";
        } // Check start
        else if (this.start == that.start && this.stop < that.stop) {
            return "A starts B";
        } else if (this.start == that.start && that.stop < this.stop) {
            return "A is started by B";
        } // Check finished
        else if (this.stop == that.stop && this.start > that.start) {
            return "A finishes B";
        } else if (this.stop == that.stop && that.start > this.start) {
            return "A is finished by B";
        } // Check contain
        else if (this.start < that.start && this.stop > that.stop) {
            return "A contains B";
        } else if (that.start < this.start && that.stop > this.stop) {
            return "B is during B";
        }
        return null;
    }

    public boolean equals(Interval that) {
        return this.start == that.start && this.stop == that.stop;
    }

    @Override
    public String toString() {
        return "[" + this.start + ", " + this.stop + 

"];
    }
}
