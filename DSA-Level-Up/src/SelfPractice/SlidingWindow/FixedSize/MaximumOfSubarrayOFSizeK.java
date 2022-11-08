package SelfPractice.SlidingWindow.FixedSize;

import java.util.*;

public class MaximumOfSubarrayOFSizeK {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int l=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter elements");
        for( int i=0;i<l;i++) {
            int temp=sc.nextInt();
            arr.add(temp);
        }
        System.out.println("Enter size of subarray");
        int t=sc.nextInt();
        System.out.println(maxElement(l,arr,t));
    }

    private static ArrayList<Integer> maxElement(int l, ArrayList<Integer> arr, int t) {
        int i=0;
        int j=0;
        Deque<Integer> ls = new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        while(j<l) {
            while(ls.size()>0 && ls.getFirst()< arr.get(j)){
                ls.removeFirst();
            }
            ls.addLast(arr.get(j));
            if(j-i+1<t) {
                j++;
            }
            else if(j-i+1==t) {
                ans.add(ls.getFirst());
                if(ls.getFirst()== arr.get(i)){
                    ls.removeFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }

}
