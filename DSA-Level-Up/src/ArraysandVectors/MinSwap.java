// Given an array of size n , calculate minimum swaps to sort the array
// Approach 1 :- Find all cycles, for a cycle of size n , n-1 swaps required.
package ArraysandVectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import ArraysandVectors.sortsub.Pair;

public class MinSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> arr= new Vector<Integer>(Arrays.asList(5,4,3,2,1));
		System.out.println(minswap(arr));
	}

	private static int minswap(Vector<Integer> arr) {
		int n = arr.size();
		 
        // Create two arrays and
        // use as pairs where first
        // array is element and second array
        // is position of first element
        ArrayList <Pair <Integer, Integer> > arrpos =
                  new ArrayList <Pair <Integer,
                                      Integer> > ();
        for (int i = 0; i < n; i++)
             arrpos.add(new Pair <Integer,
                               Integer> (arr.get(i), i));
 
        // Sort the array by array element values to
        // get right position of every element as the
        // elements of second array.
        arrpos.sort(new Comparator<Pair<Integer,
                                         Integer>>()
        {
            @Override
            public int compare(Pair<Integer, Integer> o1,
                               Pair<Integer, Integer> o2)
            {
                if (o1.value1 > o2.value1)
                    return 1;
 
                // We can change this to make
                // it then look at the
                // words alphabetical order
                else if (o1.value1.equals(o2.value1))
                    return 0;
 
                else
                    return -1;
            }
        });
 
        // To keep track of visited elements. Initialize
        // all elements as not visited or false.
        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);
 
        // Initialize result
        int ans = 0;
 
        // Traverse array elements
        for (int i = 0; i < n; i++)
        {
            // already swapped and corrected or
            // already present at correct pos
            if (vis[i] || arrpos.get(i).value2 == i)
                continue;
 
            // find out the number of  node in
            // this cycle and add in ans
            int cycle_size = 0;
            int j = i;
            while (!vis[j])
            {
                vis[j] = true;
 
                // move to next node
                j = arrpos.get(j).value2;
                cycle_size++;
            }
 
            // Update answer by adding current cycle.
            if(cycle_size > 0)
            {
                ans += (cycle_size - 1);
            }
        }
 
        // Return result
        return ans;
    }
}

