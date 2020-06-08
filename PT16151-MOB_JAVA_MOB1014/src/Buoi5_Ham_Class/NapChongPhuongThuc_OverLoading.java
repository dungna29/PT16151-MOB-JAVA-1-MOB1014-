/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_Ham_Class;

/**
 *
 * @author LegendNguyen
 */
public class NapChongPhuongThuc_OverLoading {
    
    public static void main(String[] args) {
        inRaManHinh();
        inRaManHinh("Dung");
        inRaManHinh("Dung",2020);
        inRaManHinh("Dung",2020,5.6);
    }
    
    static void inRaManHinh(){
        System.out.println("Chào bạn qua môn JAVA1");
    }
    static void inRaManHinh(String name){
        System.out.println("Chào bạn qua môn JAVA1 " + name);
    }
    static void inRaManHinh(String name,int nam){
        System.out.println("Chào bạn qua môn JAVA1 " + name + nam);
    }     
    static void inRaManHinh(String name,int nam,double gpa){
        System.out.println("Chào bạn qua môn JAVA1 " + name + nam + gpa);
    }
}
