class sum_digit{
        public static void main(String[] args) {
        int n=134,r=0, s=0;
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println(s);
        
        }
}