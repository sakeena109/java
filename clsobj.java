public class clsobj {
   String name=" ";
   String company=" ";
   int price=0;
   int gb=0;

   public static void main(String[] args){
    //creating laptop
    clsobj lap1=new clsobj();
    
    //lap1
    lap1.name="victus";
    lap1.company="hp";
    lap1.price=65000;
    lap1.gb=16;
     

    //lap2
    clsobj lap2=new clsobj();

    lap2.name="vivobook";
    lap2.company="asus";
    lap2.price=45000;
    lap2.gb=8;


    System.out.println(lap1.name);


    //new laptop without any elements ans of price is 0
    clsobj lap3=new clsobj();
    
    lap3.price=82000;
    //after creating the elements ans is 82000
    System.out.println(lap3.price);

   }
}
