
public class IndexArray {
	public static void main(String[] args) {
		int []arr = {3,5,8,9,7};
		int key = 9;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("The index of the element is: "+ i);
			}
		}
	}
}
