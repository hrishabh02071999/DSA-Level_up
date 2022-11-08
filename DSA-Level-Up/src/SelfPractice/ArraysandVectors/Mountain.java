package SelfPractice.ArraysandVectors;
// Given array of integers , return length of highest mountain
// A mountain has numbers strictly increasing till peak and then strictly decreasing.

// Approach 1:- Check if an element is peak or not then traverse forward and backward for length. O(n)
// worst case array is traversed 2n

public class Mountain {

    public static int highest_mountain(int[] a){
        int n = a.length;

        int largest = 0;

        for(int i=1;i<=n-2;){

            //check a[i] is peak or not
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                //do some work
                int cnt = 1;
                int j = i;
                //cnt backwards (left)
                while(j>=1 && a[j]>a[j-1]){
                    j--;
                    cnt++;
                }
                //cnt forwards (right)
                while(i<=n-2 && a[i]>a[i+1]){
                    i++;
                    cnt++;
                }
                largest = Math.max(largest,cnt);

            }
		else{
                i++;
            }
        }
        return largest;

    }
    public static void main(String[] args) {
    	int[] arr = {5,6,1,2,3,4,5,4,3,2,1,6,5,4};
    	System.out.println(highest_mountain(arr));
    }
}
