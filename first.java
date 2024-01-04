import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //for loop
//        for(int i=0;i<=100;i+=2)
//            System.out.println(i);

        //while loop
//        int k=1;
//        while(k<=5) {
//            System.out.println(k);
//            k += 1;
//
//        }
     //do while loop
//     int k=5;
//     do{
//         System.out.println(k);
//         k--;
//     }while(k>=1);



        //take input from user
//        Scanner sc=new Scanner(system.in);
//        System.out.println("enter your number= ");
//        int num=sc.nextint();
//        if(num%2==0)
//            System.out.println("even number");
//        else
//            System.out.println("odd number");



        //conditional

//        boolean IsAdult=true;
//        if(!IsAdult)
//            System.out.println("not adult");
//        else
//            System.out.println("yes adult");



//        int num1=10;
//        int num2=20;
//        int num3=30;
//        if(num1>num2 && num1>num3){
//            System.out.println("num1 is largest");
//        }
//        else if(num2>num1&&num2>num3){
//            System.out.println("num2 is largest");
//        }
//        else{
//            System.out.println("num3 is largest");
//        }




        //switch case
//        int day=3;
//        switch(day) {
//            case 1:
//                System.out.println("m onday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//            default:
//                System.out.println("anything");
//        }


        //break and continue
//        int i=0;
//        while(true){
//            System.out.println(i);
//            i+=1;
//            if(i>=5){
//                break;
//            }
//        }


       int i=0;
       while(true){
           if(i==3){
               i+=1;
               continue;
           }
           System.out.println(i);
           i+=1;
           if(i>=5){
               break;
           }
       }




    }
}
