package com.codegym;

import java.util.Scanner;

public class Main {

    public static void displayMenu() {
        int select;
        do {
            System.out.println("Menu");
            System.out.println("1.In hình chữ nhật");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn :))");
            Scanner sc = new Scanner(System.in);
            select = sc.nextInt();

            switch (select) {
                case 1:
                    drawRect();
                    break;
                case 2:
                    triangleBot();
                    break;
                case 3:
                    triangleTop();
                    break;
                case 4:
                    isoscelesTriangle();
                    break;
                case 0:
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Không hợp lệ !!");
            }
        } while (select != 0);
    }

    private static void drawRect() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangleBot() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangleTop() {
        for (int i = 1; i < 7; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void isoscelesTriangle() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++) {
                if(i == 0 && (j == 0 || j == 1 || j == 3 || j == 4)){
                    System.out.print(" ");
                } else if (i == 1 && (j == 0 || j == 4)){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
