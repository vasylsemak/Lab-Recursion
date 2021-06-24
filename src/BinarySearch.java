import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] myArr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int num = 80;
		
		BinarySearch bs = new BinarySearch();
		System.out.println("Your element position is : " + bs.binarySearch(num, myArr));
		System.out.println("'Arrays.toString' method: " + Arrays.toString(myArr));
	}
	
	
	
	public int binarySearch(int num, int[] myArr) {
		if(myArr == null || myArr.length == 0) return -1;
		
		int minIdx = 0;
		int maxIdx = myArr.length;
		int middleElem = myArr[maxIdx / 2];
		
		if(middleElem == num) return maxIdx / 2;
		else if(myArr.length == 1 && middleElem != num) return -1;
		else if(middleElem > num) {
			maxIdx /= 2;
			
			int[] slicedArr = copyArr(myArr, minIdx, maxIdx);
			return binarySearch(num, slicedArr);
		}
		else if(middleElem < num) {
			minIdx = maxIdx / 2;
			
			int[] slicedArr = copyArr(myArr, minIdx, maxIdx);
			int firstHalfIdx = maxIdx / 2;
			
			return firstHalfIdx + binarySearch(num, slicedArr);
		}

		return -1;
	}
	
	
	
	// helper copyArr f-n
	public int[] copyArr(int[] arr, int startIdx, int endIdx) {
		int[] copyArr = new int[endIdx - startIdx];
		
		for(int i = 0; i < copyArr.length; i++) {
			copyArr[i] = arr[startIdx + i];
		}
		
		return copyArr;
	}

}
