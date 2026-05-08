import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> perm, int[] nums){
        if(perm.size()==nums.length){
            res.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(perm.contains(nums[i])) continue;

            perm.add(nums[i]);
            backtrack(res, perm, nums);
            perm.remove(perm.size()-1);
        }
    }
}