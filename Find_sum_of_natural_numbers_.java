import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,i;
        for(i=1;i<=n;i++){
            a+=i;
        }
        System.out.println(a);
}
}