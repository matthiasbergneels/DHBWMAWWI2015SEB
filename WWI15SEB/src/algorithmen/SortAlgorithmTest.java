package algorithmen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortAlgorithmTest {

	static int count = 100000;
	static int randomRange = 3000000;
	static int[] toSort = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// vor allen Tests einmal
		generateArray();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// nach allen Tests einmal
	}

	@Before
	public void setUp() throws Exception {
		// Vor jedem Test
	}
	
	@Test
	public void bubbleSortTest() {
		assertTrue(isSorted(SortAlgorithm.bubbleSort(toSort.clone())));
	}
	
	@Test
	public void insertionSortTest() {
		assertTrue(isSorted(SortAlgorithm.insertionSort(toSort.clone())));
	}
	
	@Test
	public void insertionSortTwoTest() {
		assertTrue(isSorted(SortAlgorithm.insertionSortTwo(toSort.clone())));
	}
	
	@Test
	public void selectionSortTest() {
		assertTrue(isSorted(SortAlgorithm.selectionSort(toSort.clone())));
	}

	@After
	public void tearDown() throws Exception {
		// nach jedem Test
	}

	
	
	private static boolean isSorted(int[] array){
		for(int i = 0; i < array.length-1; i++){
			if(array[i] > array[i+1]){
				return false;
			}
		}
		return true;
	}

	
	private static void generateArray(){
		toSort = new int[count];
		for(int i = 0; i < count; i++){
			boolean notInserted = true;
			while(notInserted){
				int randomNumber = (int)(Math.random() * randomRange);
				
				boolean found = false;
				for(int j = 0; j < i; j++){
					if(toSort[j] == randomNumber){
						found = true;
						break;
					}
				}
				
				if(!found){
					toSort[i] = randomNumber;
					notInserted = false;
				}
				
			}
		}
	}
}
