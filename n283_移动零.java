package 简单题目;

public class n283_移动零 {

    public void moveZeroes(int[] nums) {

	int index = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 0) {
		// 1.先判断nums[i]是否等于0，若不等那么令nums[i]=nums[index],index加1，此时index=1,
		// 2.若相等则不处理，此时index=0,判断nums[i+1]和nums[index]是否相等，若不等重复第1步。
		// 以此类推，判断到最后一个元素
		nums[index] = nums[i];
		index++;
	    }
	}
	// 前面index个元素已经筛选出数组中所有不为0的元素，剩下nums.length个元素都为0
	for (int j = index; j < nums.length; j++) {
	    nums[j] = 0;
	}
	
    }
}
