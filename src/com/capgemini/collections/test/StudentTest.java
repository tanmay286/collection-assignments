package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collections.model.Student;

public class StudentTest {
	private Student tanmay;
	private Student ruchir;
	private Student akshay;
	private Student kapil;
	
	@Before
	public void setUp() {
		tanmay=new Student("Tanmay",134,1);
		ruchir=new Student("Ruchir",123,5);
		akshay=new Student("Akshay",124,3);
		kapil=new Student("Kapil",346,4);
	}
	
	@Test
	public void toTestStudentListInInsertionOrder() {
		ArrayList<Student> students=new ArrayList<>();
		students.add(tanmay);
		students.add(ruchir);
		students.add(akshay);
		students.add(kapil);
		
		Iterator<Student> iterator=students.iterator();
		assertEquals(tanmay, iterator.next());
		assertEquals(ruchir, iterator.next());
		assertEquals(akshay, iterator.next());
		assertEquals(kapil, iterator.next());
	}
	
	@Test
	public void toCheckTheOrderOfStudentInAscendingOrder() {
		TreeSet<Student> students= new TreeSet<Student>();
		students.add(akshay);
		students.add(ruchir);
		students.add(tanmay);
		students.add(kapil);
		
		Iterator<Student> iterators  =students.iterator();
		assertEquals(tanmay, iterators.next());
		assertEquals(akshay, iterators.next());
		assertEquals(kapil, iterators.next());
		assertEquals(ruchir, iterators.next());
	}
	@Test
	public void toCheckKeyValuePairOfStudent() {
		 HashMap<String, String> hashmap = new HashMap<String, String>();
		 hashmap.put("tanmay", "mango");
		 hashmap.put("ruchir", "orange");
		 hashmap.put("akshay", "apple");
		 hashmap.put("kapil", "banana");
	//	 assertEquals(4, hashmap.size());
		 Collection<String> keys=hashmap.keySet();
		 assertEquals(4, keys.size());
		 
		 Collection<String> values=hashmap.keySet();
		 assertEquals(4, values.size());
		 
		 assertEquals("mango", hashmap.get("tanmay"));
		 assertEquals("orange", hashmap.get("ruchir"));
		 assertEquals("apple", hashmap.get("akshay"));
		 assertEquals("banana", hashmap.get("kapil"));
		 
		 
	}
	
}
