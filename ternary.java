import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int greater=(num1>num2)?num1:num2;
        System.out.println("the greater num is"  + greater);
    } 
}
