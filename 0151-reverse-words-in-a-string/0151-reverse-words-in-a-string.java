class Solution {
    public String reverseWords(String s) {
        String [] sr=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=sr.length-1;i>=0;i--){
            sb.append(sr[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}