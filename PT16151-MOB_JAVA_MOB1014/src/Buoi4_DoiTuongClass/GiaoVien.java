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
public class GiaoVien {

    //Thuộc tính phải khai báo ở trên đầu
    String mgv;//Thuộc tính của sinh viên
    String name;//Thuộc tính tên của sinh viên
    String sdt;//Thuộc tính số điện thoại của sinh viên

    //Khai báo 2 Contructor - Hàm tạo luôn phải giống tên Class
    //Sử dụng phím Alt + Insert
    
    
    //Hàm Contructor 1
    //Contructor không có tham số truyền vào.
    public GiaoVien() {     
        mgv = "Longnt23";
        name = "Longnt23";
        sdt = "Longnt23";
    }
    
    //Contructor có tham số truyền vào
    public GiaoVien(String mgv, String name, String sdt) {
        this.mgv = mgv; //This là từ khóa dùng để tham chiếu đến thuộc tính và hàm của lớp hiện tại
        this.name = name;
        this.sdt = sdt;
    }
    

    
     void inRaManHinh() {
        System.out.println(mgv + " " +name + " " +sdt);
    }
     
     
}
