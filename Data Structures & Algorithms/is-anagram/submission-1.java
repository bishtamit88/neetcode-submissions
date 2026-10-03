class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        boolean flag=false;
        if(str1.length==str2.length){
        for(int i=0;i<str1.length;i++){
            if(str1[i]!= str2[i]){
                flag=false;
                return flag;
            }
            else{
                flag=true;
            }
        }
        } return flag;
    }
}
