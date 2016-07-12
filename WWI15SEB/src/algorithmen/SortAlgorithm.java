package algorithmen;

public class SortAlgorithm {

	private static int[] toSort = {5, 9, 4, 8, 1};
	
	public static int[] bubbleSort(int[] array){
		
		int j = array.length - 2;
		boolean swap = false;
		
		do{
			swap = false;
			for(int i = 0; i <= j; i++){
				if(array[i] > array[i+1]){
					swapElements(array, i, i+1);
					swap = true;
				}
			}
			j--;
		}while(swap);
		return array;
	} 
	
	public static int[] insertionSort(int[] array){
		
		for(int i = 1; i < array.length; i++){
			for(int j = i; j >= 1; j--){
				if(array[j] < array[j-1]){
					swapElements(array, j, j-1);
				}else{
					break;
				}
			}
			
		}
		
		return array;
	}
	
	public static int[] insertionSortTwo(int[] array){
		
		for(int i = 1; i < array.length; i++){
			int j = i;
			while(j >= 1 && array[j] < array[j-1]){
				swapElements(array, j, j-1);
				j--;
			}
			
		}
		
		return array;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Bubble Sort: ");
		printArray(bubbleSort(toSort.clone()));

		System.out.println("Insertion Sort: ");
		printArray(insertionSort(toSort.clone()));
		
		System.out.println("Insertion Sort Two: ");
		printArray(insertionSortTwo(toSort.clone()));
		
	}
	
	private static void printArray(int[] array){
		for(int d : array){
			System.out.print(d + ", ");
		}
		
		System.out.println();
	}

	private static void swapElements(int[] array, int indexA, int indexB){
		int buffer = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = buffer;
	}
}
