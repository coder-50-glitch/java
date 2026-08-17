import java.util.Scanner;
class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enetr string");
    String st =sc.nextLine()+" ";
    int p =0;
    int l=st.length();
    String wd="", f_st="";
    for(int i=0; i<l;i++)
    {
        if(st.charAt(i)==' ')
        {
        wd=st.substring(p,i);
        p=i+1;    
        f_st+=Character.toUpperCase(wd.charAt(0))+wd.substring(1)+" ";
    }
}
 System.out.println(f_st);
}
}
