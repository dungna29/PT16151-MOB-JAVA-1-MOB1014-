/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

/**
 *
 * @author LegendNguyen
 */
public class DongVat {

    private String MaDV;
    private String TenDV;
    private int TuoiDV;
    private String GioiTinh;
    private String ChungLoai;
    private String ThucAn;

    public DongVat() {
    }
    

    public DongVat(String MaDV, String TenDV, int TuoiDV, String GioiTinh, String ChungLoai, String ThucAn) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.TuoiDV = TuoiDV;
        this.GioiTinh = GioiTinh;
        this.ChungLoai = ChungLoai;
        this.ThucAn = ThucAn;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public int getTuoiDV() {
        return TuoiDV;
    }

    public void setTuoiDV(int TuoiDV) {
        this.TuoiDV = TuoiDV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getChungLoai() {
        return ChungLoai;
    }

    public void setChungLoai(String ChungLoai) {
        this.ChungLoai = ChungLoai;
    }

    public String getThucAn() {
        return ThucAn;
    }

    public void setThucAn(String ThucAn) {
        this.ThucAn = ThucAn;
    }
    

   
    void inRaDongVat() {
        System.out.printf("Tên Động Vật :  %s Mã ĐV: %s Tuổi ĐV: %d Giới Tính: %s Chủng Loại: %s Thức Ăn: %s \n",
                getTenDV(),getMaDV(),getTuoiDV(),getGioiTinh(),getChungLoai(),getThucAn());
        System.out.println("------------------------------------------");

    }
}
