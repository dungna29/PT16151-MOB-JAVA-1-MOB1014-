/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_ArrayDoiTuong_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.midi.SoundbankResource;

/**
 *
 * @author LegendNguyen
 */
public class DemoChucNangTimKiemVaXoaSua {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<GiaoVien> arrlstGiaoVien = new ArrayList<>();

    public static void main(String[] args) {

        GiaoVien giaovien5 = new GiaoVien("longnt", "Long", "9", "longnt", "FPT", 9);
        GiaoVien giaovien3 = new GiaoVien("thudq", "Thu", "4", "dungna", "FPT", 4);
        GiaoVien giaovien4 = new GiaoVien("dungna", "Dũng", "3", "longnt", "FPT", 3);
        arrlstGiaoVien.add(giaovien5);
        arrlstGiaoVien.add(giaovien3);
        arrlstGiaoVien.add(giaovien4);
        timKiemLuoi();

    }

    static void timKiem() {
        while (true) {
            System.out.println("Mời bạn nhập vào Mã Giáo Viên: ");
            String temp = sc.nextLine();
            if (temp.equals("q")) {
                break;
            }
            for (var x : arrlstGiaoVien) {
                if (temp.equalsIgnoreCase(x.getMgv())) {
                    x.OutputGiaoVien();
                }
            }
        }

    }

    static void xoa() {
        while (true) {
            System.out.println("Mời bạn nhập vào Mã Giáo Viên: ");
            String temp = sc.nextLine();
            if (temp.equals("q")) {
                break;
            }

            for (int i = 0; i < arrlstGiaoVien.size(); i++) {
                if (temp.equalsIgnoreCase(arrlstGiaoVien.get(i).getMgv())) {
                    arrlstGiaoVien.remove(i);
                }
            }
            for (var x : arrlstGiaoVien) {

                x.OutputGiaoVien();

            }
        }
    }

    static void sua() {
        while (true) {
            System.out.println("Mời bạn nhập vào Mã Giáo Viên: ");
            String temp = sc.nextLine();
            if (temp.equals("q")) {
                break;
            }

            for (int i = 0; i < arrlstGiaoVien.size(); i++) {
                if (temp.equalsIgnoreCase(arrlstGiaoVien.get(i).getMgv())) {
                    System.out.println("Mời bạn nhập lại số điện thoại để sửa: ");
                    String temp1 = sc.nextLine();
                    arrlstGiaoVien.get(i).setSdt(temp1);
                }
            }
            for (var x : arrlstGiaoVien) {

                x.OutputGiaoVien();

            }
        }
    }

    static void timKiemLuoi() {

        System.out.println("Mời bạn nhập vào Mã Giáo Viên: ");        
        arrlstGiaoVien.get(Luoi(sc.nextLine())).OutputGiaoVien();

    }

    static void XoaLuoi() {
        while (true) {
            System.out.println("Mời bạn nhập vào Mã Giáo Viên muốn xóa: ");
            String temp = sc.nextLine();
            if (temp.equals("q")) {
                break;
            }
            System.out.println("Mời bạn nhập lại số điện thoại để sửa: ");
            String temp1 = sc.nextLine();
            arrlstGiaoVien.remove(Luoi(temp)).OutputGiaoVien();
        }

    }

    static void SuaLuoi() {
        while (true) {
            System.out.println("Mời bạn nhập vào Mã Giáo Viên muốn xóa: ");
            String temp = sc.nextLine();
            if (temp.equals("q")) {
                break;
            }
            arrlstGiaoVien.get(Luoi(temp)).setSdt(temp);
        }

    }

    static int Luoi(String Ma) {
        for (int i = 0; i < arrlstGiaoVien.size(); i++) {
            if (Ma.equalsIgnoreCase(arrlstGiaoVien.get(i).getMgv())) {
                return i;
            }
        }
        return -1;
    }
}
