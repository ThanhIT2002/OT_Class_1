/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
        System.out.print("Nhập vào nhân viên :");
        
    ArrayList<NhanVien> li = new ArrayList<>();
    n=sc.nextInt();
    sc.nextLine();
    for(int i =0;i<n;i++){
        System.out.println("---------------------------");
       NhanVien nv = new NhanVien();
       nv.input();
       li.add(nv);
    }
    for(NhanVien temp:li){
        temp.output();
        System.out.println("");
    }
    String nhanvien;
     System.out.println("---------------------------");
        System.out.print("Nhập vào tên nhân viên bạn cần tìm kiếm : ");
        nhanvien= sc.nextLine();
        for(NhanVien tp:li){
            if(tp.getHoten().equalsIgnoreCase(nhanvien)){
                tp.output();
                 System.out.println("");
            }
        }
 }
}
