// Given an input, replace all space with '%20'
// Approach 1: Shifting character whenever a space is hit , worst case quadratic time.
// Approach 2:- 1 calculate spaces
// 
package SelfPractice.String;

public class Space20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi My Name is Hrishabh";
		replaceSpace(s);
	}

	private static void replaceSpace(String s) {
		// TODO Auto-generated method stub
        s = s.replaceAll("\\s", "%20");
        System.out.println(s);
	}

}
