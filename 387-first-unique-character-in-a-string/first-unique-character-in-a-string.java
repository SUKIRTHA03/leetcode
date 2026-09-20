class Solution {
    public int firstUniqChar(String s) {
     int n=s.length();
     int[] count = new int[26];
     for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch>='A'&& ch<='Z'||ch>='a' &&  ch<='z'){
            count[ch -'a']++;
        }
     }
        for(int i=0;i<n;i++){        
            char ch=s.charAt(i);

            if(count[ch - 'a']==1){
                return i;
            }
        }
     
     return -1;
    }
}