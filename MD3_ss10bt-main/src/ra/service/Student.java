package ra.service;

import java.util.Scanner;

public class Student implements StudentService {
    private int studentId;
    private String studentName;
    private String address;
    private String phone;
    private boolean sex;
    private double mark;

    public Student() {
    }

    public Student(int studentId, String studentName, String address, String phone, boolean sex, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
        this.sex = sex;
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp Id học sinh :");
        studentId = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhâp Tên học sinh :");
        studentName = scanner.nextLine();

        System.out.println("Nhâp Địa chỉ học sinh :");
        address = scanner.nextLine();

        System.out.println("Nhâp số điện thoại học sinh :");
        phone = scanner.nextLine();

        System.out.println("Nhâp giới tính học sinh :");
        sex = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Nhâp Điểm học sinh :");
        mark = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void display() {
        System.out.println("Id :" + studentId + "| Tên:" + studentName + "| Địa chỉ " + address +
                " | số điện thoại :" + phone + " | giới tính :" + (sex ? "nam" : "nữ")
                + "| Điểm :" + mark);
    }
}
