package aug12;

public class ReverseArray {
    public static void main(String[] args) {
        int[] givenArray = {112,12,32,32};
        reverseArray(givenArray);

        for (int element: givenArray) {
            System.out.print(element + " ");
        }
    }

    public static void reverseArray(int[] arr){

        //  --->    10  20  30  40  50    <-----
        //          0   1   2   3   4

        int start = 0;           // 0
        int end = arr.length-1;  // 4
        // DRY
        int temp;

        //     0 < 4
        while (start < end ) {
            // temp = 4
            temp = arr[end];
            // end    = 0
            arr[end] = arr[start];
            arr[start] = temp;
            start ++;
            end --;
        }
    }
}
