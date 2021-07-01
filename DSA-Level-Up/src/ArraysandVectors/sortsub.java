// Given array, find subarray to be sorted so that entire array gets sorted.
// return start and end index of subarray. if not found return {-1,-1}

// Approach 1 :- sort the array and check which subarray is to be sorted. O(nLog(n))
// Approach 2:- find min and max element out of order . Iterate and find correct position for min and max.
// O(n)

package ArraysandVectors;


public class sortsub {

    public static boolean outOfOrder(int[] arr,int i){
        int x = arr[i];
        if(i==0){
            return x > arr[1];
        }
        if(i==arr.length-1){
            return x < arr[i-1];
        }
        return x > arr[i+1] || x < arr[i-1];

    }

    static class Pair<K,V>{

        K value1;
        V value2;

        public Pair(K value1, V value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
    }

    public static Pair<Integer,Integer> subarraySort(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int x = arr[i];

            if(outOfOrder(arr,i)){
                smallest = Math.min(smallest,x);
                largest = Math.max(largest,x);
            }
        }

        //next step find the right index where smallest and largest lie (subarray) for out solution
        if(smallest==Integer.MAX_VALUE){
            return new Pair<>(-1, -1);
        }

        int left = 0;
        while(smallest >= arr[left]){
            left++;
        }
        int right = arr.length - 1;
        while(largest <= arr[right]){
            right--;
        }

        return new Pair<>(left, right);

    }

    public static void main(String[] args) {
         int[] ar = {1, 2, 3, 4, 5, 8, 6, 7, 9, 10, 11};
         Pair<Integer,Integer> p = subarraySort(ar);
        System.out.println(p.value1+" and "+p.value2);
    }
}
