/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_FINAL_ASS;

import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Service {

    ArrayList<Student> arrLstStudent = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Student student;
    String input = "";
    int dem = 1;

    public Service() {
        Student sv1 = new Student("Ph00532", 8.9, "Nguyễn", "Anh", "Dũng", "HN", 1989);
        Student sv2 = new Student("Ph00533", 10, "Nguyễn", "Anh", "Tú", "HN", 2000);
        Student sv3 = new Student("Ph00534", 5, "Nguyễn", "Anh", "Long", "HN", 2001);
        arrLstStudent.add(sv1);
        arrLstStudent.add(sv2);
        arrLstStudent.add(sv3);
    }

    void themSinhVien() {
        System.out.println("Mời bạn chọn số lượng sinh viên bạn muốn thêm: ");
        input = sc.nextLine();
        for (int i = 0; i < Integer.parseInt(input); i++) {
            student = new Student();
            System.out.println("Mời bạn nhập sinh viên thứ : " + "[" + dem + "]");
            System.out.print("Mời bạn nhập Họ : ");
            student.setHo(sc.nextLine());
            System.out.print("Mời bạn nhập Đệm : ");
            student.setDem(sc.nextLine());
            System.out.print("Mời bạn nhập Tên : ");
            student.setTen(sc.nextLine());
            System.out.print("Mời bạn nhập Quê Quán : ");
            student.setQuequan(sc.nextLine());
            System.out.print("Mời bạn nhập Năm Sinh : ");
            student.setNamsinh(Integer.parseInt(sc.nextLine()));
            System.out.print("Mời bạn nhập Mã SV : ");
            student.setMsv(sc.nextLine());
            System.out.print("Mời bạn nhập Điểm GPA : ");
            student.setGpa(Double.parseDouble(sc.nextLine()));
            arrLstStudent.add(student);
            dem++;
        }
    }

    void xuatDsSinhVien() {
        if (checkArrSV()) {
            return;
        }
        for (Student x : arrLstStudent) {
            x.outputPerson();
        }
    }

    void suaSinhVien() {
        System.out.println("Mời bạn nhập mã sinh viên cần sửa: ");
        input = sc.nextLine();
        int vitriSinhVienTrongArrayList = getIndexSV(input);
        if (vitriSinhVienTrongArrayList == -1) {
            System.out.println("Sinh viên không có trong danh sách");
        } else {
            student = new Student();
            System.out.println("Mời bạn sửa thông tin của sinh viên ");
            System.out.print("Mời bạn nhập Họ : ");
            student.setHo(sc.nextLine());
            System.out.print("Mời bạn nhập Đệm : ");
            student.setDem(sc.nextLine());
            System.out.print("Mời bạn nhập Tên : ");
            student.setTen(sc.nextLine());
            System.out.print("Mời bạn nhập Quê Quán : ");
            student.setQuequan(sc.nextLine());
            System.out.print("Mời bạn nhập Năm Sinh : ");
            student.setNamsinh(Integer.parseInt(sc.nextLine()));           
            System.out.print("Mời bạn nhập Điểm GPA : ");
            student.setGpa(Double.parseDouble(sc.nextLine()));
            String temp = arrLstStudent.get(vitriSinhVienTrongArrayList).getMsv();
            student.setMsv(temp);
            arrLstStudent.set(vitriSinhVienTrongArrayList, student);
        }
    }

    void xoaSinhVien() {
        System.out.println("Mời bạn nhập mã sinh viên cần xóa: ");
        input = sc.nextLine();
        int vitriSinhVienTrongArrayList = getIndexSV(input);
        if (vitriSinhVienTrongArrayList == -1) {
            System.out.println("Sinh viên không có trong danh sách");
        } else {
            arrLstStudent.remove(vitriSinhVienTrongArrayList);
        }
    }

    void timKiemSinhVien() {
        System.out.println("Mời bạn nhập mã sinh viên cần tìm: ");
        input = sc.nextLine();
        int vitriSinhVienTrongArrayList = getIndexSV(input);
        if (vitriSinhVienTrongArrayList == -1) {
            System.out.println("Sinh viên không có trong danh sách");
        } else {
            arrLstStudent.get(vitriSinhVienTrongArrayList).outputPerson();
        }
    }
    
    void sortSinhVien(){
        Collections.sort(arrLstStudent);
    }

    int getIndexSV(String msv) {
        for (int i = 0; i < 10; i++) {
            if (arrLstStudent.get(i).getMsv().equalsIgnoreCase(msv)) {
                return i;//Trả ra vị trí nếu tìm thấy sinh viên đó trong mảng
            }
        }
        return -1;
    }

    

   //Hàm này dùng để kiểm tra danh sach có rỗng hay không
    boolean checkArrSV() {
        return arrLstStudent.isEmpty();
    }

}
