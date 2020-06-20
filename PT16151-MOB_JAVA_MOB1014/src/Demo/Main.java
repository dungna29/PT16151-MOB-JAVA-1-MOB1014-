/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author LegendNguyen
 */
public class Main {

    static UtilitiesQL util = new UtilitiesQL();

    public static void main(String[] args) {
        Serivce serivce = new Serivce();
        System.out.println(serivce.tinhTong2So(1, 1));
        System.out.println("Mời bạn nhâp vào: ");
        String tenSV = util.NhapVao();
        System.out.println(tenSV);
        int tuoi = Integer.parseInt(util.NhapVao());
        System.out.println(tuoi);
    }

}
