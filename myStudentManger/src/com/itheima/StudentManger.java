package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1、添加学生");
            System.out.println("2、删除学生");
            System.out.println("3、修改学生");
            System.out.println("4、查看所有学生");
            System.out.println("5、退出");
            System.out.println("请输入你的选择");

            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();

            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
//                    break;
                    System.exit(0);
            }
        }
    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (Student stu : array) {
            if (stu.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已被使用，请重新输入：");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String adderss = sc.nextLine();
        Student stu = new Student(sid, name, age, adderss);
        array.add(stu);
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除学生的学号：");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student stu = array.get(i);
            if (stu.getSid().equals(sid)) {
//                array.remove(i);
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在");
        } else {
            array.remove(index);
            System.out.println("删除成功");
        }
    }

    public static void findStudent(ArrayList<Student> array) {
        if (array.isEmpty()) {
            System.out.println("无信息，需要先添加");
            return;
        }

        System.out.println("学号\t姓名\t年龄\t居住地");
        for (Student stu : array) {
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "岁\t" + stu.getAddress());
        }
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改学生的学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生新名字：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地：");
        String adderss = sc.nextLine();

        Student stu = new Student(sid, name, age, adderss);
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.set(i, stu);
                break;
            }
        }
        System.out.println("修改成功");
    }

}
