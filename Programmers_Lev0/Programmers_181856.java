package Programmers_Lev0;

public class Programmers_181856 {
	public static void main(String[] args) {
		int[] arr1 = {49, 13};
		int[] arr2 = {70, 11, 2};
		
		System.out.println(solution(arr1, arr2));

	}

    public static int solution(int[] arr1, int[] arr2) {		// 배열 비교하기
        int answer = 0;
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        
        if(arr1Len == arr2Len) {
        	int arr1Sum = 0;
        	int arr2Sum = 0;
        	
        	for(int i=0; i<arr1Len; i++) {
        		arr1Sum += arr1[i];
        	}
        	for(int i=0; i<arr2Len; i++) {
        		arr2Sum += arr2[i];
        	}
        	
        	if(arr1Sum > arr2Sum) {
        		answer = 1;
        	} else if(arr1Sum < arr2Sum) {
        		answer = -1;
        	} else {
        		answer = 0;
        	}
        } else {
        	if(arr1Len > arr2Len) {
        		answer = 1;
        	} else if(arr1Len < arr2Len) {
        		answer = -1;
        	} else {
        		answer = 0;
        	}
        }
        
        return answer;
    }
}
