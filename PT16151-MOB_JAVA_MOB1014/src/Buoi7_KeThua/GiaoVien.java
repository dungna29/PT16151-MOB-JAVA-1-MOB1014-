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
public class GiaoVien {

    private String MaGV;
    private String TenGV;
    private int TuoiGV;
    private String SdtGV;
    private double Hours;

    public GiaoVien() {
    }

    public GiaoVien(String MaGV, String TenGV, int TuoiGV, String SdtGV, double Hours) {
        this.MaGV = MaGV;
        this.TenGV = TenGV;
        this.TuoiGV = TuoiGV;
        this.SdtGV = SdtGV;
        this.Hours = Hours;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String TenGV) {
        this.TenGV = TenGV;
    }

    public int getTuoiGV() {
        return TuoiGV;
    }

    public void setTuoiGV(int TuoiGV) {
        this.TuoiGV = TuoiGV;
    }

    public String getSdtGV() {
        return SdtGV;
    }

    public void setSdtGV(String SdtGV) {
        this.SdtGV = SdtGV;
    }

    public double getHours() {
        return Hours;
    }

    public void setHours(double Hours) {
        this.Hours = Hours;
    }
    void outputGiaoVien(){
        
    }
    
}
