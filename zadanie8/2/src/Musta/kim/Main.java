package Musta.kim;

public class Main {

    public static void main(String[] args) {
        int x = 2;
        int y = 8;
        maxone(x,y);
        int max = maxone(x,y);

        System.out.print(max);
    }

    public static int  maxone(int x, int y){
        int max = 0;
        if (x > y)
            max = x;
        else if(x < y)
            max = y;

        return max;
    }
}
