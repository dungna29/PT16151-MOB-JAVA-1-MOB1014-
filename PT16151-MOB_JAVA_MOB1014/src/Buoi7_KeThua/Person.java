/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_KeThua;

/**
 *
 * @author LegendNguyen
 */
//Person được coi là 1 lớp cha sẽ chứa các thuộc tính chung của lớp con
public class Person {

    private String Ten;
    private int Tuoi;
    private String Sdt;

    public Person() {
    }

    public Person(String Ten, int Tuoi, String Sdt) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.Sdt = Sdt;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    void outputPerson() {
        System.out.println("Đây làm hàm của lớp cha Person");
    }

}
