package ����Ŀ;

public class N26_ɾ������������ظ��� {

    public int removeDuplicates(int[] nums) {
	if (nums.length == 0) {
	    return 0;
	} else {

	    int index = 0;
	    for (int i = 1; i < nums.length; i++) {
		if (nums[index] != nums[i]) {
		    // 1.���ж�nums[i]��nums[index]�Ƿ���ȣ���������ôindex��1����ʱindex=1,��nums[1]=nums[1]
		    // 2.������򲻴�����ʱindex=0,�ж�nums[i+1]��nums[index]�Ƿ���ȣ��������ظ���1����
		    // �Դ����ƣ��жϵ����һ��Ԫ��
		    index++;
		    nums[index] = nums[i];
		}
	    }
	    return index + 1;
	    // һ��������index��Ԫ�أ��ټ���nums[0],�������һ����index+1��Ԫ��
	}
    }
}