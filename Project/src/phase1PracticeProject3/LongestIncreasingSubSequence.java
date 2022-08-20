package phase1PracticeProject3;

public class LongestIncreasingSubSequence {
	static int max_ref; // stores the LIS
	 
   
    static int _lis(int arr[], int n)
    {
        // base case
        if (n == 1)
            return 1;
        int res, max_end = 1;
           for (int i = 1; i < n; i++) {
            res = _lis(arr, i);
            if (arr[i - 1] < arr[n - 1] && res + 1 > max_end)
                max_end = res + 1;
        }
 
        // Compare max_ending_here with the overall max. And
        // update the overall max if needed
        if (max_ref < max_end)
            max_ref = max_end;
 
        // Return length of LIS ending with arr[n-1]
        return max_end;
    }
 
   
    static int lis(int arr[], int n)
    {
       
        max_ref = 1;
        _lis(arr, n);
        return max_ref;
        }
 
   
    public static void main(String args[])
    {
        int arr[] = { 10, 11, 9, -1, 21, 51, 31, 90 };
        int n = arr.length;
        System.out.println("Length of Longest Subsequence  is "
                           + lis(arr, n));
    }
}