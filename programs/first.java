import java.util.*;

class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int rows = sc.nextInt();
        // System.out.println("Enter Number of columns");
        // int col = sc.nextInt();
        Pattern6(rows);
    }

    static void Pattern1(int rows, int col){
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int rows, int col){
        int n = rows;
        int m = col;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(i == 1 || j == 1 || i == n || j == m ){
                    System.out.print("*");
                }
                else{ 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Pattern3(int rows){
        int n = rows;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }

    static void Pattern4(int rows){
        int n = rows;
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }

    static void Pattern5(int rows){
        int n = rows;
        for(int i = 1; i<=n; i++){
            for( int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++){
                    System.out.print("*");     
            }
            System.out.println();
        }
    }

    static void Pattern6(int rows){
        int n = rows;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}