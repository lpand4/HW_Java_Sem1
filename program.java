package HW_Java_Sem1;
import java.util.Scanner;
//+Написать программу вычисления n-ого треугольного числа. url
public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int userNum = scan.nextInt();
        int result = triangularNumber(userNum);
        System.out.printf("Результат: %d", result);
    }
    public static int triangularNumber(int n) {
        int result = (n*(n+1))/2;       
        return result;        
    }    
}