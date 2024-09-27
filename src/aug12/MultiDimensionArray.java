package aug12;

public class MultiDimensionArray {
    public static void main(String[] args) {

        // maxtrix
        int[][] arr1 = new int[3][3];
        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[0][2] = 30;
        arr1[1][0] = 40;
        arr1[1][1] = 50;
        arr1[1][2] = 60;
        arr1[2][0] = 70;
        arr1[2][1] = 80;
        arr1[2][2] = 90;

        // nested loops
        for (int i = 0; i < arr1.length ; i++) {
            int sum=0;
            for (int j = 0; j < arr1[i].length ; j++) {
              //  System.out.println(arr1[i][j]);
                sum=sum+arr1[i][j];
            }
            System.out.println(sum);

        }

        /*
        10 20 30             20 10 30       30 30 60
        20 30 10     +       10 25 25   =   30 55 35
        20 30 10             50 10 25       70 40 35


         */

    }
}
