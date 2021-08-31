class Solution 
{ 
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            if(matrix[i][j]==x){
	                return true;
	            }
	        }
	    }
	    return false;
	} 
} 
