package ����Ŀ;

public class n283_�ƶ��� {

    public void moveZeroes(int[] nums) {

	int index = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 0) {
		// 1.���ж�nums[i]�Ƿ����0����������ô��nums[i]=nums[index],index��1����ʱindex=1,
		// 2.������򲻴�����ʱindex=0,�ж�nums[i+1]��nums[index]�Ƿ���ȣ��������ظ���1����
		// �Դ����ƣ��жϵ����һ��Ԫ��
		nums[index] = nums[i];
		index++;
	    }
	}
	// ǰ��index��Ԫ���Ѿ�ɸѡ�����������в�Ϊ0��Ԫ�أ�ʣ��nums.length��Ԫ�ض�Ϊ0
	for (int j = index; j < nums.length; j++) {
	    nums[j] = 0;
	}
	
    }
}
