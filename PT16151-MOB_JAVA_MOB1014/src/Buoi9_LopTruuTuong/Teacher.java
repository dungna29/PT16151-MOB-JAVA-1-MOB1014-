/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_LopTruuTuong;

/**
 *
 * @author LegendNguyen
 */
public class Teacher extends PersonAB{
    private String msgv;
    private double hours;

    public Teacher() {
    }

    public Teacher(String msgv, double hours, String ho, String dem, String ten, String quequan, int namsinh) {
        super(ho, dem, ten, quequan, namsinh);
        this.msgv = msgv;
        this.hours = hours;
    }

    public String getMsgv() {
        return msgv;
    }

    public void setMsgv(String msgv) {
        this.msgv = msgv;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    

    @Override
    void xoaPerSon(String temp, int a) {
       
    }

    @Override
    void themPerSon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void suaPerSon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void xuatPerSon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
