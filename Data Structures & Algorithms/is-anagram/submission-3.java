class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] freq = new int[26];
        boolean flag = true;
        if(s.length() != t.length()){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++){
               freq[s.charAt(i)-'a']++;
            }
            for(int i=0;i<s.length();i++){
               freq[t.charAt(i)-'a']--;
            }
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
