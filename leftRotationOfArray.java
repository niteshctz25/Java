
public class leftRotationOfArray {
	void leftRotation(int arr[], int key) {
		for(int i=0;i<key;i++) {
			int element,j;
			element = arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = element;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		leftRotationOfArray obj = new leftRotationOfArray();
		int key = 4;
		int arr[] = new int[] {1,2,3,4,5,6,7};
		System.out.print("Original Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n\nArray after Left Rotation: ");
		obj.leftRotation(arr,key);
		
	}
}
