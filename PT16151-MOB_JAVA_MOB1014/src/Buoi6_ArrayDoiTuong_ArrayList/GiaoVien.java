/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6_ArrayDoiTuong_ArrayList;

import Buoi5_Ham_Class.*;

/**
 *
 * @author LegendNguyen
 */
public class GiaoVien implements Comparable<GiaoVien>{
    // Khi đóng private vào thuộc tính hoặc hàm thì chỉ được phép truy cập ở bên trong class

    //Phần 1: Các thuộc tính luôn phải khai báo trên đầu
    private String mgv;//Thuộc tính của giáo viên
    private String name;//Thuộc tính tên của giáo viên
    private String sdt;//Thuộc tính số điện thoại của giáo viên
    private String email;//Thuộc tính email của giáo viên
    private String truong;//Thuộc tính trường học của giáo viên
    private double diemGPA;//Thuộc tính điểm của giáo viên  

    //Phần 2: Khai báo các contructor hay là các hàm tạo
    //Phải 2 khai báo 2 hàm contructor là có tham số và không tham số
    //Contructor không có tham số truyền vào
    public GiaoVien() {
    }

    //Contructor có tham số truyền vào
    public GiaoVien(String magiaovien, String name, String sdt, String email, String truong, double diemGPA) {
        mgv = magiaovien;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
        this.truong = truong;
        this.diemGPA = diemGPA;
        //this để tham chiếu đến thuộc tính hoặc hàm của lớp hiện tại
    }

    //Phần 3: Khai báo Getter Setter 
    // Vì khi chúng ta private các thuốc tính thì cần phải sử dụng Getter và Setter
    //Get dùng để lấy giá trị của thuộc tính
    public String getMgv() {
        return mgv;
    }

    //Set dùng để gán giá trị cho thuộc tính
    public void setMgv(String mgv) {
        this.mgv = mgv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public double getDiemGPA() {
        return diemGPA;
    }

    public void setDiemGPA(double diemGPA) {
        this.diemGPA = diemGPA;
    }

    //Phần 4: Khai báo các hàm ở dưới đây
    // Không code nhập dữ liệu hoặc các hàm tìm kiếm , sửa , xóa ở trong class này
    void ValuateGiaoVien() {

    }

    void OutputGiaoVien() {
        System.out.printf("Tên GV :  %s Số Điện Thoại GV: %s", getName(),getSdt());
        System.out.println("------------------------------------------");

    }

    @Override
    public int compareTo(GiaoVien object) {
        // return this.name.compareTo(o.name);//Sắp xếp theo tên từ bé đến lớn
        //return -this.name.compareTo(o.name);
        if (this.diemGPA < object.diemGPA) {
            return -1;
        }else if(this.diemGPA > object.diemGPA){
            return 1;
        }else{
            return 0;
        }
    }

}
