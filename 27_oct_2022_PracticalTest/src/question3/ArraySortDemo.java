package question3;

import question2.ArraySortDemo;

public class ArraySortDemo {
	public void sortArray(int[] array) {
		for(int i=0;i<array.length;++i) {
			for(int j=i+1;j<array.length;++j) {
				if(array[i]<array[j]) {
					int a=array[i];
					array[i]=array[j];
					array[j]=a;
					
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			
			System.out.println("The sorted array is:" +array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={30,40,60};
		ArraySortDemo obj= new ArraySortDemo();
		obj.sortArray(array);
	}

}
