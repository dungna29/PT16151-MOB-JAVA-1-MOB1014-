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
public class GiaoVienA extends Person{
    
    private String MaGV;
    private double Hours;

    public GiaoVienA() {
    }

    public GiaoVienA(String MaGV, double Hours, String TenGV, int TuoiGV, String SdtGV) {
        super(TenGV, TuoiGV, SdtGV);
        this.MaGV = MaGV;
        this.Hours = Hours;
    }
    
    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public double getHours() {
        return Hours;
    }

    public void setHours(double Hours) {
        this.Hours = Hours;
    }

    @Override
    void outputPerson() {
        super.outputPerson(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
