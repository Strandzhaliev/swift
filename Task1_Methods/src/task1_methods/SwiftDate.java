/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_methods;

/**
 *
 * @author Vladimir
 */
public class SwiftDate {
    int year;
    int mount;
    int day;

    public SwiftDate(int year, int mount, int day) {
        this.year = year;
        this.mount = mount;
        this.day = day;
    }
    
    boolean isLeaver() {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    
    int getCentiry() {
        return year / 100 +1;
    }
    
    int getDaysDifference(SwiftDate other) {
        return -1;
    }
    
    String getInfo() {
        return "";
    }
    
}
