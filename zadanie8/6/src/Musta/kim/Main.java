package Musta.kim;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        sumarray(array);
        int sum = sumarray(array);

        System.out.print(sum);
    }

    public static int  sumarray(int[] array){
        int i = 0;
        int sum = 0;
        for(i = 0; i < array.length; i++)
            sum += array[i];
        return sum;



    }
}
