import java.util.Scanner;
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int score=sc.nextInt();
        sc.nextLine();
        String department=sc.nextLine();
        System.out.println("My name is:"+name);
        System.out.println("My score is:"+score);
        System.out.println("My department is:"+department);
    }
}
