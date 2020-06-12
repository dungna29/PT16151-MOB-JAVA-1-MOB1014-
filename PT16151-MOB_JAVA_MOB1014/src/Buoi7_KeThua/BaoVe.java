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
public class BaoVe {
    private String MaBV;
    private String TenBV;
    private int TuoiBV;
    private String SdtBV;
    private int CaTruc;

    public BaoVe() {
    }

    public BaoVe(String MaBV, String TenBV, int TuoiBV, String SdtBV, int CaTruc) {
        this.MaBV = MaBV;
        this.TenBV = TenBV;
        this.TuoiBV = TuoiBV;
        this.SdtBV = SdtBV;
        this.CaTruc = CaTruc;
    }

    public String getMaBV() {
        return MaBV;
    }

    public void setMaBV(String MaBV) {
        this.MaBV = MaBV;
    }

    public String getTenBV() {
        return TenBV;
    }

    public void setTenBV(String TenBV) {
        this.TenBV = TenBV;
    }

    public int getTuoiBV() {
        return TuoiBV;
    }

    public void setTuoiBV(int TuoiBV) {
        this.TuoiBV = TuoiBV;
    }

    public String getSdtBV() {
        return SdtBV;
    }

    public void setSdtBV(String SdtBV) {
        this.SdtBV = SdtBV;
    }

    public int getCaTruc() {
        return CaTruc;
    }

    public void setCaTruc(int CaTruc) {
        this.CaTruc = CaTruc;
    }
    
    void outputBaoVe(){
        
    }
}
