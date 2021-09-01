class Solution {
    static int RedOrGreen(int N, String S) {
       int red=0;
       int green=0;
       for(int i=0;i<N;i++){
           char r=S.charAt(i);
           if(r=='R'){
               red++;
           }else{
               green++;
           }
       }
      if(red>green){
          return green;
      }else{
          return red;
      }
      
    }
}
