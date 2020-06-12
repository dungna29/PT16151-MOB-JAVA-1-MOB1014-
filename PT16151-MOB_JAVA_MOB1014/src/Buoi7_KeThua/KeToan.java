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
public class KeToan {

    private String MaKT;
    private String TenKT;
    private int TuoiKT;
    private String SdtKT;
    private double Luong;

    public KeToan() {
    }

    public KeToan(String MaKT, String TenKT, int TuoiKT, String SdtKT, double Luong) {
        this.MaKT = MaKT;
        this.TenKT = TenKT;
        this.TuoiKT = TuoiKT;
        this.SdtKT = SdtKT;
        this.Luong = Luong;
    }

    public String getMaKT() {
        return MaKT;
    }

    public void setMaKT(String MaKT) {
        this.MaKT = MaKT;
    }

    public String getTenKT() {
        return TenKT;
    }

    public void setTenKT(String TenKT) {
        this.TenKT = TenKT;
    }

    public int getTuoiKT() {
        return TuoiKT;
    }

    public void setTuoiKT(int TuoiKT) {
        this.TuoiKT = TuoiKT;
    }

    public String getSdtKT() {
        return SdtKT;
    }

    public void setSdtKT(String SdtKT) {
        this.SdtKT = SdtKT;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }
    void outputKeToan(){
        
    }
    

}
