import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        double a=0;
        double i;
        for(i=1;i<=n;i++){
            a+=1/i;
        }
        System.out.printf("%.2f",a);
}
}