/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.exam.pkg2019;

public class WashableFilter extends Filter {

    private final int START_CAPACITY = 5000;
    private final int WASH_CAPACITY = 100;

    private int currentWashCapacity;
    private boolean selfClean;

    public WashableFilter(boolean selfClean) {
        currentCapacity = START_CAPACITY;
        currentWashCapacity = WASH_CAPACITY;
        this.selfClean = selfClean;
    }

    // Filter นี้ล้างได้แต่จะมีจำนวนครั้งที่สามารถล้างได้
    // โดยการล้า่งจะ reset capacity ใหม่
    // และลบ wash capacity ลง 1 ครั้ง
    public void washed() {
        currentCapacity = START_CAPACITY;
        currentWashCapacity--;
    }

    @Override
    public void filter(int airVolumnInLiter) {
        filter(airVolumnInLiter, 10);
    }

    // Filter Helper method
    // Filter นี้กรองได้เฉพาะฝุ่นที่มีขนาดใหญ่กว่า 2.5 micron
    // โดยฝุ่นที่เล็กกว่า 5 micro ประสิทธิภาพการกรองจะได้แค่ 50%
    // ฝุ่นที่ใหญ่กว่า 50% กรอกได้หมด
    public void filter(int airVolumnInLiter, float dustSize) {
        if (dustSize > 5.0f) {
            this.currentCapacity = Math.max(0, currentCapacity - airVolumnInLiter);
        } else if (dustSize > 2.5f) {
            this.currentCapacity = Math.max(0, currentCapacity - airVolumnInLiter / 2);
        }

        // ระบบทำความสะอาด filter อัตโนมัติเอง
        if (selfClean && currentCapacity <= 0) {
            washed();
        }
    }
}
