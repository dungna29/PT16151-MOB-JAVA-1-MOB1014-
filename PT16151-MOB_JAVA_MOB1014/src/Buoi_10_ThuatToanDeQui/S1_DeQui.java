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
public class S1_DeQui {

    static int temp = 0;
    static int a = 0;

    static void inRaTen(String temp1) {
        a++;
        if (a < 10) {
            System.out.println("Chào bạn " + temp1 + a);
            inRaTen(temp1);
        }
    }

    static void dequi() {
        temp++;
        if (temp < 10) {
            System.out.println("POLY JAVA " + temp);
            dequi();
        }
    }

    static int tinhgiaithua(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * tinhgiaithua(n - 1));
        }
    }
    //In String POLY JAVA 1 ra 10 lần   

    public static void main(String[] args) {
        // dequi();
        //System.out.println("Giai thừa bằng = " + tinhgiaithua(5));
        inRaTen("Khiêm");
    }
}
