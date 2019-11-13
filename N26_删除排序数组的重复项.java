package 简单题目;

public class N26_删除排序数组的重复项 {

    public int removeDuplicates(int[] nums) {
	if (nums.length == 0) {
	    return 0;
	} else {

	    int index = 0;
	    for (int i = 1; i < nums.length; i++) {
		if (nums[index] != nums[i]) {
		    // 1.先判断nums[i]和nums[index]是否相等，若不等那么index加1，此时index=1,令nums[1]=nums[1]
		    // 2.若相等则不处理，此时index=0,判断nums[i+1]和nums[index]是否相等，若不等重复第1步。
		    // 以此类推，判断到最后一个元素
		    index++;
		    nums[index] = nums[i];
		}
	    }
	    return index + 1;
	    // 一共更新了index个元素，再加上nums[0],因此数组一共有index+1个元素
	}
    }
}