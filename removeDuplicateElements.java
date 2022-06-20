import java.util.Arrays;

public class removeDuplicateElements {
	public static void main(String[] args) {
		int[] arr1 = new int[]{2,3,5,4,3,4,6,7,8,9,10};
		Arrays.sort(arr1);
		int count=1;
		System.out.print("Original Array: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		int element = arr1[0];
			System.out.print("\nAfter removing the Duplicate elements: ");
			for(int i=1;i<arr1.length;i++) {
				if(arr1[i] == element) {
					count++;
				}
				else {
					if(count == 1) {
						System.out.print(element+" ");	
					}	
				}
				element=arr1[i];
				count=1;
				}
			if(count == 1) {
				System.out.print(element+" ");	
			}	
		}
}
