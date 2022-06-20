import java.util.Arrays;

public class duplicateElements {
	public static void main(String[] args) {
		int[] arr1 = new int[]{2,3,5,6,7,1,2,4,3,6,4,7,8,9,7,3,3,4,6,7,8,9,10};
		Arrays.sort(arr1);
		int count=1;
		System.out.print("Original Array: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		int element = arr1[0];
			System.out.print("\nDuplicate elements are: ");
			for(int i=1;i<arr1.length;i++) {
				if(arr1[i] == element) {
					count++;
				}
				else {
					if(count>=2) {
						System.out.print(element+" ");	
					}	
					count=1;
				}
				element=arr1[i];
				}
			if(count>=2) {
				System.out.print(element+" ");
			}	
			
		}
}
