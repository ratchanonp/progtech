/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ratchanon
 */
public class ExC {

    public interface Y {

        public void methodY();
    }

    public interface Z {

        public void methodZ();
    }

    public class A implements Y {

        public void one() {
            System.out.println("A");
        }

        public void two() {
            one();
            System.out.println("AA");
        }

        public void methodY() {
            System.out.println("In Y");
        }
    }

    public class B extends A implements Z {

        public void one(int x) {
            System.out.println(x + " in B");
        }

        public void two() {
            System.out.println("BB");
        }

        public void methodZ() {
            System.out.println("In Z");
        }
    }

    public class C extends A {

        public void one() {
            System.out.println("C");
        }
    }
}
