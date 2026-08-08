class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>a=new HashSet<>();
         HashSet<Integer>ab=new HashSet<>();
         for(int c:nums1){
            a.add(c);
         }
         for(int d:nums2){
            if (a.contains(d)){
                ab.add(d);
            }
         }
        int[] arr=new int[ab.size()];
        int k=0;
        for(int n:ab){
            arr[k]=n;
            k++;
        }
        return arr;
    }
}