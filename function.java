public class function {
    void greeting(){
        System.err.println("hi welcome");
        duplicate();
    }
    void duplicate(){
        System.out.println("i am dummy");
    }
    public static void main(String[] args) {
        function obj1=new function();
        obj1.greeting();
      
    }
   
}
