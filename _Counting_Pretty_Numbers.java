import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
       for(int i=0;i<n;i++){
           int a=s.nextInt();
           int b=s.nextInt();
           int d=0;
           for(int j=a;j<=b;j++){
               int c=j%10;
               
               if(c==2||c==3||c==9){
                   d+=1;
                   
               }
               
           }
           System.out.println(d);
       }
}
}