/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05033;

/**
 *
 * @author ADMIN
 */
public class Time implements Comparable <Time>{
    private byte hour;
    private byte minute;
    private byte second;

    public Time(byte hour, byte minute, byte second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
//    public String stdTimeNum(byte value){
//        if(value > 9){
//            return Byte.toString(value);
//        }
//        return "0" + String.valueOf(value);
//    }
    @Override
//    public String toString() {
//        return stdTimeNum(hour) + " " + stdTimeNum(minute) + " " + stdTimeNum(second);
//    }
    public String toString() {
        return hour + " " + minute + " " + second;
    }
    
    @Override
    public int compareTo(Time other) {
        if(this.hour == other.hour){
            if(this.minute == other.minute){
                return this.second - other.second;
            }
            return this.minute - other.minute;
        }
        return this.hour - other.hour;
    }
    
}
