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
//Sử dụng từ khóa extends để kế thừa lớp cha
public class SinhVienA extends Person{
    private String MaSV;//Thuộc tính riêng của lớp SV
    private double GPA;//Thuộc tính tiếng riêng của lớp SV

    public SinhVienA() {
    }
    
    //Từ khóa super

    public SinhVienA(String MaSV, double GPA, String Ten, int Tuoi, String Sdt) {
        super(Ten, Tuoi, Sdt);
        this.MaSV = MaSV;
        this.GPA = GPA;
    }
    

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    //Alt + Insert chọn Override Method
    @Override
    void outputPerson() {
        //super.outputPerson(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Đây là hàm của lớp Sinh Viên là lớp con");
    }
   
    
    
    
    
}
