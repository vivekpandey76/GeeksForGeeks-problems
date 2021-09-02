class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        char[] tempArray=arr.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
