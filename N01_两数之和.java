package 简单题目;

import java.util.HashMap;
import java.util.Map;

public class N01_两数之和 {

    public int[] twoSum(int[] nums, int target) {
	int[] arr = new int[2];
	// 定义一个长度为2的数组，来存储遍历过的数组元素以及索引
	Map<Integer, Integer> map = new HashMap<>();

	for (int i = 0; i < nums.length; i++) {

	    Integer flag = map.get(target - nums[i]);
	    // 获取target-nums[i]，看是否存在，存在则表明可以相加为target，并将其保存到数组
	    if (flag != null) {
		arr[0] = flag;
		arr[1] = i;
		break;
	    }
	    map.put(nums[i], i);
	    // 用键保存遍历过的数，用值保存遍历过的索引
	}
	return arr;
    }
}
