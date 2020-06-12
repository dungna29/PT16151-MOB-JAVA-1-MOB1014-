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
public class SinhVien {

    private String MaSV;//Thuộc tính riêng
    private String TenSV;
    private int TuoiSV;
    private String SdtSV;
    private double GPA;//Thuộc tính tiếng riêng

    public SinhVien() {
    }

    public SinhVien(String MaSV1, String TenSV, int TuoiSV, String SdtSV, double GPA) {
        MaSV = MaSV1;
        this.TenSV = TenSV;
        this.TuoiSV = TuoiSV;
        this.SdtSV = SdtSV;
        this.GPA = GPA;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public int getTuoiSV() {
        return TuoiSV;
    }

    public void setTuoiSV(int TuoiSV) {
        this.TuoiSV = TuoiSV;
    }

    public String getSdtSV() {
        return SdtSV;
    }

    public void setSdtSV(String SdtSV) {
        this.SdtSV = SdtSV;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    void outputSinhVien(){
        
    }
    
    
}
