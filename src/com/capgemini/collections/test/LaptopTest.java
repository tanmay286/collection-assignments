package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collections.model.Laptop;

public class LaptopTest {
	private Laptop dellLaptop;
	private Laptop hpLaptop;
	private Laptop lenovoLaptop;
	
	@Before
	public void setUp() {
		dellLaptop=new Laptop("Dell","inspiron 5700","Windows-10","i5");
		hpLaptop=new Laptop("HP","notebook 5500","Linux","i7");
		lenovoLaptop=new Laptop("Lenovo","len4520","Windows-10","i5");
	}
	
	@Test
	public void toTestCheckListInInsertionOrder()
	{
		ArrayList<Laptop> laptops=new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(lenovoLaptop);
		
		Iterator<Laptop> iterator = laptops.iterator();
		assertEquals(dellLaptop,iterator.next());
		assertEquals(hpLaptop, iterator.next());
		assertEquals(lenovoLaptop,iterator.next());
	}
	
	@Test
	public void toTestNoDuplicatesIsThere() {
		  HashSet<Laptop> set=new HashSet<Laptop>();
		  set.add(dellLaptop);
		  set.add(hpLaptop);
		  set.add(lenovoLaptop);
		  set.add(hpLaptop);
		  assertEquals(3, set.size());
		  
		  Iterator<Laptop> iterator = set.iterator();
			assertEquals(dellLaptop,iterator.next());
			assertEquals(hpLaptop, iterator.next());
			assertEquals(lenovoLaptop,iterator.next());
		  
	}
}
