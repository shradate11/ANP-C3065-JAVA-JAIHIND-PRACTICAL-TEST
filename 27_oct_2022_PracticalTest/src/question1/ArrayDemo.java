package question1;

public class ArrayDemo{
	public void manupulateIntegerArray(int[] array) {
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
		System.out.println("The Value Of old Array is"+arr[i]);
		}
		for(int i=0;i<array.length;i++) {
			array[i]=array[i]+5;
			System.out.println("The Value Of new Array is" +array[i]);
		}
	}
	public void manupulateIntegerArray(int x) {
		
	}
	public static void main(String[] args) {
	  
	   int[] arr= {1,2,3,4,5};
		ArrayDemo obj=new ArrayDemo();
		obj.manupulateIntegerArray(arr);
			
	}

}
