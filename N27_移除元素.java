package 简单题目;

public class N27_移除元素 {

    public int removeElement(int[] nums, int val) {
	if (nums.length == 0) {
	    return 0;
	} else {
	    int index = 0;
	    for (int i = 0; i < nums.length; i++) {
		if (nums[i] != val) {
		    // 1.先判断nums[i]和val是否相等，若不等那么令nums[index]=nums[i],index加1，此时index=1
		    // 2.若相等则不处理，此时index=0,判断nums[i+1]和val是否相等，若不等重复第1步。
		    // 以此类推，判断到最后一个元素
		    nums[index] = nums[i];
		    index++;
		}
	    }
	    return index;
	    // 遍历整个数组之后，index为不等于val的元素的数量，也就是处理后的数组的长度
	}
    }
}
