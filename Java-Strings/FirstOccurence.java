import java.util.*;
public class FirstOccurence {
		    public int strStr(String haystack, String needle) {
	        if (needle.length() == 0) return 0; 
	        if (!haystack.contains(needle)) return -1;

	        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
	            if (haystack.substring(i, j).equals(needle))
	                return i;
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the main string (haystack): ");
	        String haystack = sc.nextLine();

	        System.out.print("Enter the substring to find (needle): ");
	        String needle = sc.nextLine();

	        FirstOccurence obj = new FirstOccurence();
	        int index = obj.strStr(haystack, needle);

	        if (index == -1)
	            System.out.println("Substring not found.");
	        else
	            System.out.println("Substring found at index: " + index);

	        sc.close();
	    }
	}

