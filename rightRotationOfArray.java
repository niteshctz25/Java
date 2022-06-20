
public class rightRotationOfArray {
	void rightRotation(int arr[], int key) {
		for(int i=0;i<key;i++) {
			int element, j;
			element = arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = element;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		rightRotationOfArray obj = new rightRotationOfArray();
		int key = 4;
		int arr[] = new int[] {1,2,3,4,5,6,7};
		System.out.print("Original Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n\nArray after Right Rotation: ");
		obj.rightRotation(arr,key);
		
	}

}
