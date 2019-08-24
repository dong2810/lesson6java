package com.k003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        nhap n = new them();
        n.themsach();
    }
}
class nhap {
    int masach;
    String tensach;
    String nxb;
    String author;
    String chuyenNganh;
    int pageNumber;

    public void nhapsach() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        masach = scan.nextInt();
        scan.nextLine();
        System.out.print("Nhap ten sach: ");

        tensach = scan.nextLine();

        System.out.print("Nha xuat ban: ");

        nxb = scan.nextLine();

        System.out.print("Tac gia: ");

        author = scan.nextLine();

        System.out.print("Chuyen nganh: ");

        chuyenNganh = scan.nextLine();

        System.out.print("So trang: ");

        pageNumber = scan.nextInt();
        scan.nextLine();
    }

    public void xuat() {
        System.out.println("Mã sách : "+masach + "\n" +"Tên sách: "+ tensach + "\n" +"Tác giả: "+ author + "\n" +"Nhà xuất bản: " +nxb
                + "\n" +"Chuyên ngành: "+chuyenNganh+"\n"+"Số trang: "+ pageNumber);
    }

    public void themsach() {
    }
}

class them extends nhap {

    public void themsach() {

        System.out.println("1.Công nghệ thông tin");
        System.out.println("2.Khoa học - Đời sống");
        System.out.println("3.Văn hóa - Nghệ thuật");
        System.out.println("Bạn chọn?");
        Scanner scan = new Scanner(System.in);
        int chon = scan.nextInt();
        switch (chon) {
            case 1:
                System.out.println("Sách Công nghệ thông tin");
                nhapsach();
                System.out.println("\n=============================\n");
                xuat();
                break;
            case 2:
                System.out.println("Sách Khoa học - Đời sống");
                nhapsach();
                System.out.println("\n=============================\n");
                xuat();
                break;
            case 3:
                System.out.println("Sách Văn hóa - Nghệ thuật");
                nhapsach();
                System.out.println("\n=============================\n");
                xuat();
                break;
        }
    }
}

