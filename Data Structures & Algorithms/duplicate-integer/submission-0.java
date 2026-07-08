class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> s = new HashSet<>();
        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            if(s.contains(nums[i])){
                flag = true;
                break;
            }
            s.add(nums[i]);
        }
        return flag;
    }
}