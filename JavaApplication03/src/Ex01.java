
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("Nhap vao tuoi cua ban:");
        int age = sc.nextInt();
        System.out.println(name+"-"+age);
    }
}
