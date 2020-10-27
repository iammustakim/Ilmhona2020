package Musta.kim;

public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        sumOfSquares(a,b);
        int sum = sumOfSquares(a,b);

        System.out.print(sum);
    }

    public static int  sumOfSquares(int x, int y){
        int i = 0;
        int sum = 0;
        for(i = 2; i <= 6; i++)
            sum += i;
        return sum;



    }
}