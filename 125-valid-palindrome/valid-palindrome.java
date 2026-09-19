class Solution {
    public boolean isPalindrome(String s) {
        char[] str= new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
            ch=Character.toLowerCase(ch);
            str[j]=ch;
            j++;
            }
        }
        for(int i=0;i<j/2;i++){
            if(str[i]!=str[j-1-i]){
                return false;
            }
        }
        return true;
       
    }
}