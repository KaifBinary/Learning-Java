import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
       int value1= sc.nextInt();
       int value2= sc.nextInt();
       int work= sc.nextInt();
       switch (work){
           case 1: {
               System.out.println(value1+value2);
               break;
           }
           case 2: {
               System.out.println(value1-value2);
               break;
           }
           case 3: {
               System.out.println(value1*value2);
               break;
           }
           case 4: {
               System.out.println(value1/value2);
               break;
           }
           default:
               System.out.println("Kindly select an operation");
       }
    }
}