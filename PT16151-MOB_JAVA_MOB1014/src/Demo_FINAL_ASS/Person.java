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
public class Person {

    private String ho;
    private String dem;
    private String ten;
    private String quequan;
    private int namsinh;

    public Person() {
    }

    public Person(String ho, String dem, String ten, String quequan, int namsinh) {
        this.ho = ho;
        this.dem = dem;
        this.ten = ten;
        this.quequan = quequan;
        this.namsinh = namsinh;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getDem() {
        return dem;
    }

    public void setDem(String dem) {
        this.dem = dem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    
    void outputPerson(){
        
    }
    
}
