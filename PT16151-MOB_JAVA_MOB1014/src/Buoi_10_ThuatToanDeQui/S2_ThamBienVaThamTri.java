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
public class S2_ThamBienVaThamTri {

    int data = 50;

    void congThemGiaTri(int data) {
        data = data + 100;
    }

    void congThemGiaTri(S2_ThamBienVaThamTri ob) {
        ob.data = ob.data + 100;
    }
    public static void main(String[] args) {
         S2_ThamBienVaThamTri ob = new S2_ThamBienVaThamTri();
        System.out.println("Kiểu tham trị");
        System.out.println("Trước khi thay đổi giá trị " + ob.data);
        ob.congThemGiaTri(500);
        System.out.println("Sa khi thay đổi giá trị " + ob.data);
        System.out.println("Kiểu tham biến");
        System.out.println("Trước khi thay đổi giá trị " + ob.data);
        ob.congThemGiaTri(ob);
        System.out.println("Sa khi thay đổi giá trị " + ob.data);
    }
  

}
