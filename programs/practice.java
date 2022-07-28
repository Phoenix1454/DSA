import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Odd(a);
    }

    static void Odd(int a){
        int num = a;
        int count = 0;
        for(int i = 0; i<=num; i++){
            if(i%2 != 0){
                count = count + i;
            }
        }
        System.out.println(count);
    }
    
}
