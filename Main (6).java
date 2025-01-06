import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a temperature");
        try{
            int num=sc.nextInt();
            if(num<0){
                System.out.println("You should wear winter cloths");
                System.out.println("Don't forget your gloves");
                
            }
            else if(num>=0 && num<=10){
                System.out.println("You should wear warm cloths");
                System.out.println("Light jacket will be helpful");
                
            }
            else if(num>=11 && num<=20){
                System.out.println("You should wear light cloths");
                System.out.println("You can have sun glass");
            }
            else{
                System.out.println("You should wear summer cloths");
                System.out.println("Use sunscream");
                
            }
        }
        catch(InputMismatchException e){
            System.out.println("Inavlid");
        }
        finally{
            sc.close();
            
        }
    }
}