//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表


import com.rabbitmq.utility.IntAllocator;
import io.swagger.models.auth.In;

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(Integer i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(hashMap.containsKey(temp)){
                return new int[]{hashMap.get(temp),i};
            }
            hashMap.put(nums[i],i);


        }
        return new int[]{0,0};
    }
}
//leetcode submit region end(Prohibit modification and deletion)
