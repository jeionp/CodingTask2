package CodingTask2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CodingTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test values
		LinkedList<Integer> testList1 = createLinkedList(1,2,3,4,5);
		
		// get head value/ rearranged list
		LinkedList<Integer> outputList = getHead(testList1);
		
		// display rearranged list
		for(int p=0; p < outputList.size(); p++)
		{
	      System.out.println(outputList.get(p) + " ");	     
	    } 
	}
	
	public static LinkedList<Integer> getHead(LinkedList<Integer> inputLinkedList) {
		
		for (int i=0; i<inputLinkedList.size()-2; i++) {
			
			//get values to be swapped
			int a = inputLinkedList.get(i);
			int b = inputLinkedList.get(i+2);
			
			//swap values
			a = a+b;
			b = a-b;
			a = a-b;
			
			//set swapped values
			inputLinkedList.set(i, a);
			inputLinkedList.set(i+2, b);

		}
		
		return inputLinkedList;
	}

	private static <T> LinkedList<T> createLinkedList(T...elements) {
		
	    LinkedList<T> newList = new LinkedList<T>();
	    for (T el : elements) {
	        newList.add(el);
	    }
	
	    return newList;
	}

}
