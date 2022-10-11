import java.util.Scanner;

public class Main {

    public static void func1(int n){
        int temp = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (temp % 2 == 1) {
                System.out.print(temp + ", ");
                sum+=temp;
            } else i--;
            temp++;
        }
        System.out.println(" sum = " + sum);
        System.out.println();
        System.out.println();
    }

    public static void func2(){
        int i = 10;
        while (i < 50){
            if(i % 3 == 0){
                System.out.println(i);
                i+=3;
            } else {
              i++;
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void func3(int n){
        boolean temp = true;
        for(int i = 2; i < n; i++){
            if(n%i == 0) {
                temp = false;
                break;
            }
        }
        System.out.println(temp);
        System.out.println();
        System.out.println();
    }


    public static void func4(){
        int prev1 = 1;
        int prev2 = 0;
        int temp;
        int sum = 0;
        System.out.println(0);
        for(int i = 1; i < 20; i++){
            temp = prev1 + prev2;
            System.out.println(temp);
            prev2 = prev1;
            prev1 = temp;
            sum += temp;
        }
        System.out.println("sum = "+ sum/20.0);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func1(n);
        func2();
        int n2 = sc.nextInt();
        func3(n2);
        func4();
    }
}
