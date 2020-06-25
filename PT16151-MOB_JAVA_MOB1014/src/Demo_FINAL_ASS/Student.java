/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_FINAL_ASS;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Student extends Person implements Comparable<Student>{

    private String msv;
    private double gpa;

    public Student() {
    }

    public Student(String msv, double gpa, String ho, String dem, String ten, String quequan, int namsinh) {
        super(ho, dem, ten, quequan, namsinh);
        this.msv = msv;
        this.gpa = gpa;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    void outputPerson() {
        String fullname = getHo() + " " + getDem()+ " " + getTen();
        System.out.printf("Họ và Tên SV: %s Năm Sinh: %d Quê Quán: %s Mã Sinh Viên: %s Điểm GPA: %f \n", fullname,getNamsinh(),getQuequan(),getMsv(),getGpa());
    }

    @Override
    public int compareTo(Student o) {
       return this.getTen().compareTo(o.getTen());
    }

}
