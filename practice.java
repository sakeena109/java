import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int totalmarks=m1+m2+m3+m4+m5;
        int avg=totalmarks/5;
        {
            System.out.println(totalmarks);
            System.out.println(avg);
        }
        if(avg<35){
            System.out.println("you need additional class");
        }else{
            System.out.println("you are good");
        }
    }
    
}
