package ����Ŀ;

public class N27_�Ƴ�Ԫ�� {

    public int removeElement(int[] nums, int val) {
	if (nums.length == 0) {
	    return 0;
	} else {
	    int index = 0;
	    for (int i = 0; i < nums.length; i++) {
		if (nums[i] != val) {
		    // 1.���ж�nums[i]��val�Ƿ���ȣ���������ô��nums[index]=nums[i],index��1����ʱindex=1
		    // 2.������򲻴�����ʱindex=0,�ж�nums[i+1]��val�Ƿ���ȣ��������ظ���1����
		    // �Դ����ƣ��жϵ����һ��Ԫ��
		    nums[index] = nums[i];
		    index++;
		}
	    }
	    return index;
	    // ������������֮��indexΪ������val��Ԫ�ص�������Ҳ���Ǵ���������ĳ���
	}
    }
}
