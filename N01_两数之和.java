package ����Ŀ;

import java.util.HashMap;
import java.util.Map;

public class N01_����֮�� {

    public int[] twoSum(int[] nums, int target) {
	int[] arr = new int[2];
	// ����һ������Ϊ2�����飬���洢������������Ԫ���Լ�����
	Map<Integer, Integer> map = new HashMap<>();

	for (int i = 0; i < nums.length; i++) {

	    Integer flag = map.get(target - nums[i]);
	    // ��ȡtarget-nums[i]�����Ƿ���ڣ�����������������Ϊtarget�������䱣�浽����
	    if (flag != null) {
		arr[0] = flag;
		arr[1] = i;
		break;
	    }
	    map.put(nums[i], i);
	    // �ü������������������ֵ���������������
	}
	return arr;
    }
}
