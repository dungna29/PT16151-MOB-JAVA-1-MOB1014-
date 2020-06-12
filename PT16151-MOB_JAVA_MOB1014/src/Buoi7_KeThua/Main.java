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
public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.outputPerson();

        SinhVienA sinhVienA = new SinhVienA();
        sinhVienA.outputPerson();

        SinhVienA sinhVienA1 = new SinhVienA("Ph00532", 5.5, "Dũng", 19, "01345545");
        System.out.println(sinhVienA1.getTen());
        System.out.println(sinhVienA1.getTuoi());

        SinhVienA sinhVienA2 = new SinhVienA();
        sinhVienA2.setTen("Long");
        sinhVienA2.setTuoi(30);
        System.out.println(sinhVienA2.getTen());
        System.out.println(sinhVienA2.getTuoi());

    }
}
