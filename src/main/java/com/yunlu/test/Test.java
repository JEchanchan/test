/**
 * @Date 2015年3月31日  上午10:34:39
 * @author 张亚飞
 * @email verphen@163.com
 */

package com.yunlu.test;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int zeroNum = 0;
		int clearNum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0){
				clearNum ++;
			}else{
				zeroNum++;
			}
			
			if (zeroNum == arr.length - 2) {
				System.err.println("最后一个人的位置：" + i);
				break;
			}
			
			if (clearNum == 3) {
				arr[i] = 0;
				clearNum = 0;
				zeroNum = 0;
			}
			
			if(i == arr.length-1){
				i = -1;
			}
		}
	}
}
