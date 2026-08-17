import java.util.Scanner;
import java.util.StringTokenizer;
class Capital {
    String sent;
    int freq;

    Capital() {
        sent = "";
        freq = 0;
    }

    void input() 
    {
        String wr="";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sent = in.nextLine();
        StringTokenizer st = new StringTokenizer(sent);
        int cont = st.countTokens();
        for(int i=1; i<=cont;i++)
        {
            wr=st.nextToken();
            if(isCap(wr))
                freq+=1;
            else
                continue;

        }
    }
        boolean isCap(String wd)
        {
            if(Character.isUpperCase(wd.charAt(0)))
            return true;
            else
            return false;
        }
        void display()
        {
            System.out.println("first charater in upper case "+ freq);
        } 
    public static void main(String[] args)
    {
        Capital ob = new Capital();
        ob.input();
        ob.display();
        
    }
}