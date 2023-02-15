package HW_Java_Sem1;
import java.util.Scanner;
//+Написать программу вычисления n-ого треугольного числа. url
public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int userNum = scan.nextInt();
        int result = triangularNumber(userNum);
        System.out.printf("Результат: %d", result);
        System.out.println();
        recTriangularNumber(userNum,1);
    }
    
    public static int triangularNumber(int n) {
        int result = (n*(n+1))/2;       
        return result;        
    }
    
    public static int recTriangularNumber(int n,int k) {
        int result;
        String msg = "";
    
         if(k==n+1) return 1;
         for (int i = 1; i < k+1; i++) {
            if(i!=k) msg += i + " + ";
            else msg += i;
         }
            result = (k*(k+1))/2;
            msg += " = " + result;
            System.out.println(msg);

           return recTriangularNumber(n, k+1);
    
       }    
}
