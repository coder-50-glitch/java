import java.util.Scanner;
class first_file{
    public static void main(String[] args) {
        int a=0, flag=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");  
        a=in.nextInt();  
        for (int i = 2; i < a; i++) {
            if(a%i==0)
            {
                flag=1;              
                break;  
            }                     
        }
        if(flag==0)
        System.out.println("prime no");
        else
           System.err.println("no prime");         
        
    }
}
