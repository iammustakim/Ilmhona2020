package Musta.kim;

public class Main {

    public static void main(String[] args) {
        int[] array = {2,5,9,6,1};
        maxInArray(array);
        int max = maxInArray(array);

        System.out.print(max);
    }

    public static int  maxInArray(int[] array){
        int i = 0;
        int max = 0;
        for (i = 0; i < array.length; i++ )
            if(max < array[i])
                max = array[i];
        return max;



    }
}
