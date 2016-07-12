package algorithmen;

public class SortAlgorithm {

	private static int[] toSort = {5, 9, 4, 8, 1};
	
	public static int[] bubbleSort(int[] array){
		
		long startTime = System.currentTimeMillis();
		
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
		
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("BubbleSort Duration: \t" + duration + "ms");
		return array;
	} 
	
	public static int[] insertionSort(int[] array){
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 1; i < array.length; i++){
			for(int j = i; j >= 1; j--){
				if(array[j] < array[j-1]){
					swapElements(array, j, j-1);
				}else{
					break;
				}
			}
			
		}
		
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("InsertionSort Duration: \t" + duration + "ms");
		return array;
	}
	
	public static int[] insertionSortTwo(int[] array){
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 1; i < array.length; i++){
			int j = i;
			while(j >= 1 && array[j] < array[j-1]){
				swapElements(array, j, j-1);
				j--;
			}
			
		}
		
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("InsertionSortTwo Duration: \t" + duration + "ms");
		
		return array;
	}
	
	public static int[] selectionSort(int[] array){
		
		long startTime = System.currentTimeMillis();
		
		int marker = array.length - 1;
		
		while(marker > 0){
			int posMax = 0;
			for(int i = 0; i <= marker; i++){
				if(array[i] > array[posMax]){
					posMax = i;
				}
			}
			
			swapElements(array, marker, posMax);
			marker--;
		}
		
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("SelectionSort Duration: \t" + duration + "ms");
		
		return array;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Bubble Sort: ");
		printArray(bubbleSort(toSort.clone()));

		System.out.println("Insertion Sort: ");
		printArray(insertionSort(toSort.clone()));
		
		System.out.println("Insertion Sort Two: ");
		printArray(insertionSortTwo(toSort.clone()));
		
		System.out.println("Selection Sort: ");
		printArray(selectionSort(toSort.clone()));
		
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
