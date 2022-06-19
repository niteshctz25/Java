import java.util.Arrays;

public class frequencyOfElement {
	public static void main(String[] args) {
		int[] arr1 = new int[]{2,3,5,6,7,1,2,4,3,6,4,7,8,9,7,3,3,4,6,7,8};
		int index=0 , freq=1 , element;
		Arrays.sort(arr1);
		System.out.print("Original Array after Sorting: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		element = arr1[0];
		for(int i=1;i<arr1.length;i++) {
			if(element == arr1[i]) {
				index++;
				freq++;
			}
			else {
				System.out.println("Frequency of " + element + " is: " + freq );
				freq=1;
			}
			element=arr1[i];
			index++;
		}
		System.out.println("Frequency of " + element + " is: " + freq );
	}
}
	
		
