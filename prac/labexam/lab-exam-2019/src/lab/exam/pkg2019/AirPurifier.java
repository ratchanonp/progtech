/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.exam.pkg2019;

import java.util.ArrayList;

/**
 *
 * @author ratchanon
 */
public class AirPurifier {

    private ArrayList<Filter> filters;

    public AirPurifier() {
        filters = new ArrayList<Filter>();
    }

    public void insertFilter(Filter filter) {
        filters.add(filter);
    }

    public void replaceFilterAtIndex(int index, Filter filter) {
        try {
            if (filters.get(index) != null) {
                filters.set(index, filter);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!!!!!Error Cannot replaceFilterAtIndex!!!!!");
        }
    }

    public void printFilterDetails() {
        System.out.println("##### Filter Details #####");
        int i = 0;
        while (i < filters.size()) {
            System.out.print(i + ") ");
            System.out.println(filters.get(i));
            i++;
        }
        System.out.println("##########################");
        System.out.println();
    }

    public void filter(int airVolumeInLiter) {
        int i = 0;

        while (i < filters.size()) {
            int air = airVolumeInLiter;
            Filter f = filters.get(i);

            airVolumeInLiter = Math.max(0, airVolumeInLiter - f.getCurrentCapacity());

            f.filter(air);
            if (airVolumeInLiter == 0) {
                break;
            }
            i++;
        }

        if (airVolumeInLiter > 0) {
            System.out.println("!!!!!Please replace filter!!!!!");
        }
    }
}
