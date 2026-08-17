// Java program to illustrate Saddle point

class Test {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 17, 8, 9 } };
        boolean flag=false;
        int n = 3;
         for (int i = 0; i < n; i++) {
            int min_row = mat[i][0], col_ind = 0;
            for (int j = 1; j < n; j++) {
                if (min_row > mat[i][j]) {
                    min_row = mat[i][j];
                    col_ind = j;
                }
            }
            int k;
            for (k = 0; k < n; k++)

                // Note that col_ind is fixed
                if (min_row < mat[k][col_ind])
                    break;
        if (k == n) {
                System.out.println("Value of Saddle Point " + min_row);
                flag=true;
            }
        if (flag == false)
            System.out.println("No Saddle Point ");
    }
}
}