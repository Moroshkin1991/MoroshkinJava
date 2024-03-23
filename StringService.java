package JavaMoroshkin;
import java.util.Scanner;
public class StringService {
    public static void main(java.lang.String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первую строку:");
        java.lang.String a = scan.nextLine();
        System.out.print("Введите вторую строку:");
        java.lang.String b = scan.nextLine();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }

    }
}
