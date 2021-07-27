package view;

import controller.ClassController;
import controller.StudentController;
import model.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Classes> classesList = new ArrayList<Classes>();

    public static void main(String[] args) {
        ClassController dai1 = new ClassController();
        StudentController dai2 = new StudentController();

        dai1.setClasses(classesList);
        dai1.addNewClass(new Classes("C05","Java"));
        dai1.addNewClass(new Classes("C06","PHP"));
        showMenuStudent(dai1,dai2);
    }

    static void showMenu(ClassController c){
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Hiển thị lớp");
            System.out.println("2. Thêm danh sách lớp học");
            System.out.println("3. Sửa danh sách lớp học");
            System.out.println("4. Xoá danh sách lớp học");
            System.out.println("0. Thoát");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    showAllClass(c);
                    break;
                case 2:
                    break;
            }
        }
    }

    p
}
