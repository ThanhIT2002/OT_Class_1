/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class NhanVien {
    private String Manv,Hoten,Que;
    private float Hesoluong;
    public NhanVien(){
    }
    public NhanVien(String Manv,String Hoten,String Que,float Hesoluong){
        this.Manv=Manv;
         this.Hoten=Hoten;
          this.Que=Que;
           this.Hesoluong=Hesoluong;
    }
    public void setManv(String Manv){
        this.Manv=Manv;
    }
    public String getManv(){
        return Manv;
    }
     public void setHoten(String Hoten){
        this.Hoten=Hoten;
    }
    public String getHoten(){
        return Hoten;
    }
     public void setQue(String Que){
        this.Que=Que;
    }
    public String getQue(){
        return Que;
    }
     public void setHesoluong(float Hesoluong){
        this.Hesoluong=Hesoluong;
    }
    public float getHesoluong(){
        return Hesoluong;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mã nhân viên: ");
        this.setManv(sc.nextLine());
        System.out.print("Nhập Họ và tên nhân viên: ");
        this.setHoten(sc.nextLine());
         System.out.print("Nhập Quê quán nhân viên: ");
        this.setQue(sc.nextLine());
        System.out.print("Nhập Hệ số lương nhân viên: ");
        this.setHesoluong(sc.nextFloat());
    }
    public void output(){
        System.out.printf("%-15s%-15s%-15s%-15f",this.getManv(),this.getHoten()
        ,this.getQue(),this.getHesoluong());
    }
    public static void main(String[] args){
        NhanVien nv = new NhanVien();
        nv.input();
        nv.output();
    }
}
