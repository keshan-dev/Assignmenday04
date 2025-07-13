import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1=input.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=input.nextInt();

        if (num1<num2) {
            int total=num1+num2;
            System.out.println("Total is "+total);
        } else{
            System.out.println(num1+"       "+num2);
        }
    
    }
}
