public class function {
    void greeting(){
        System.err.println("hi welcome");
        
    }
    void duplicate(){
        System.out.println("i am dummy");
    }
    public static void main(String[] args) {
        function obj1=new function();
        function obj2=new function();
        obj1.greeting();
        obj2.duplicate();
    }
   
}
