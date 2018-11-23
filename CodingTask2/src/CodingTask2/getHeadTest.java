package CodingTask2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CodingTask2.CodingTask2;

class getHeadTest {
	
	private CodingTask2 ct2;

	@BeforeEach
	void setUp() throws Exception {
		ct2 = new CodingTask2();
	}

	@AfterEach
	void tearDown() throws Exception {
		ct2 = null;
	}

	@Test
	void normal_test1() {
		
		LinkedList<Integer> testList1 = createLinkedList(1,2,3,4);
		LinkedList<Integer> actual = createLinkedList(3,4,1,2);
		LinkedList<Integer> expected = ct2.getHead(testList1);
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	void normal_test2() {
		
		LinkedList<Integer> testList1 = createLinkedList(1,2,3,4,5);
		LinkedList<Integer> actual = createLinkedList(3,4,5,2,1);
		LinkedList<Integer> expected = ct2.getHead(testList1);
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	void normal_test3() {
		
		LinkedList<Integer> testList1 = createLinkedList(1,2,3,4,5,6);
		LinkedList<Integer> actual = createLinkedList(3,4,5,6,1,2);
		LinkedList<Integer> expected = ct2.getHead(testList1);
		
		Assert.assertEquals(actual, expected);
	}
	
	private static <T> LinkedList<T> createLinkedList(T...elements) {
		
	    LinkedList<T> newList = new LinkedList<T>();
	    for (T el : elements) {
	        newList.add(el);
	    }
	
	    return newList;
	}

}
