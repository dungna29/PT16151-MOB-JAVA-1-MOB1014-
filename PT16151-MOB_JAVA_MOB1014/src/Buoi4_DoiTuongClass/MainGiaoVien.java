/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_DoiTuongClass;

/**
 *
 * @author LegendNguyen
 */
public class MainGiaoVien {
    public static void main(String[] args) {
        // new GiaoVien() là gọi đến contructor không có tham số truyền vào
        GiaoVien gv = new GiaoVien();
        gv.inRaManHinh();
        
        //
        GiaoVien gv2 = new GiaoVien("Dungna", "Dũng", "05888888");
        gv2.inRaManHinh();
    }
}
