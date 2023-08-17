import java.util.Scanner;
public class Ben{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if (a%2!=0){
            System.out.println("weird");
        }
        else if (a>=2 && a<=5){
            System.out.println("not weird");
        }
        else if ( a>=6 && a<=20){
            System.out.println("weird");
        }
        else{
            System.out.println("not weird");
        }
        
    }
}