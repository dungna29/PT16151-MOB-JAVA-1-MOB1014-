/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_10_ThuatToanDeQui;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S4_StaticViDu2 {

    private static int tempStatic =0 ;//Được khởi tạo 1 lần duy nhất và có thể thay đổi giá trị
   // private int tempStatic = 0;

    void demsoSinhVien() {
        tempStatic++;
        this.inra();
    }

    void inra() {
        System.out.println("Sinh viên số:" + tempStatic);
    }

    public static void main(String[] args) {
        S4_StaticViDu2 st = new S4_StaticViDu2();
        st.demsoSinhVien();
        S4_StaticViDu2 st2 = new S4_StaticViDu2();
        st2.demsoSinhVien();
        S4_StaticViDu2 st3 = new S4_StaticViDu2();
        st3.demsoSinhVien();
    }

}
