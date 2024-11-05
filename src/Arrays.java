public class Arrays {
    public static void main(String[] args) {
        //Scaler assignment for intro to arrays
        // Q1 given an array of size N. Count the no of elements  which have atleast
        //one element greater than itself.
        int[] arr = {3, 8, 3, -2, 2, 4};
        int count = 0;
        int number;

        for (int i = 0; i < arr.length; i++) {
            number = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (number < arr[j]) {
                    count++;
                    break;
                }

            }
        }
        System.out.println(count);

        //Q1 - optimised
        // count frequency of max in the array & return the total number of elements - frequency of max.

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                count1++;
            }
        }
        System.out.println(arr.length - count1);

        //Q2-given an array of n number and a number, find a pair of elements in array which
        //adds upto the number and not having same index.

        int n = 6;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    count2++;
                }
            }
        }
        System.out.println(count2);

        // reverse an array without using any extra space(SC: O(1)

        int temp=0;

        for(int i=0;i< arr.length/2;i++){
            temp=arr[n-i-1];
            arr[n-i-1]=arr[i];
            arr[i]=temp;
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        // or another approach using while loop
        int[] arr1 = {3, 8, 3, -2, 2, 4};
        int i=0;
        int j= arr1.length-1;

        while(i<j){ // check again
            temp=arr1[arr1.length-1-i];
            arr1[arr1.length-1-i]=arr1[i];
            arr1[i]=temp;
            i++;
            j--;
        }
        System.out.println(" ");

        for (int value : arr1) {
            System.out.print(value+" ");
        }

        //Q2 - reverse an array with in the range provided.

//        int temp1=0;
//        int start=2;
//        int end=4;
//
//        for(int k=start;k<=end;k++){
//           temp = arr[end - k - 1];
//           arr[end - k - 1] = arr[k];
//           arr[k] = temp;
//
//        }
//        for (int l=0;l< arr.length;l++){
//            System.out.print(arr[l]+" ");
//        }

        // or another approach using while loop

        int t=0;
        int s= arr1.length-1;
        int m=s;

        while(t<s){
            if(t>=2 )
            temp=arr1[m-t];
            arr1[m-t]=arr1[t];
            arr1[t]=temp;
            t++;
            s--;
        }

        for (int k=0;k<arr.length;k++){
            System.out.print(" "+arr1[k]+" ");
        }
    }
}
