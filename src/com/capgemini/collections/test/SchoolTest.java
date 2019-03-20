package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collections.model.School;

public class SchoolTest {

	private School kv;
	private School ryan;
	private School podar;
	private School army;
	
	@Before
	public void setUp() {
		kv=new School("KV","Nashik","Nashik",1);
		ryan=new School("Ryan","Niphad","Nashik",4);
		podar=new School("Podar","Navi Mumbai","Mumbai",3);
		army=new School("Army","Pune","Pune",2);
	}
	@Test
	public void toTestSchoolListInInsertionOrder() {
		ArrayList<School> schools=new ArrayList<>();
		schools.add(kv);
		schools.add(ryan);
		schools.add(podar);
		schools.add(army);
		
		Iterator<School> iterator=schools.iterator();
		assertEquals(kv,iterator.next());
		assertEquals(ryan, iterator.next());
		assertEquals(podar, iterator.next());
		assertEquals(army, iterator.next());
		
	}
	@Test
	public void  toTestNoDuplicatesIsThereInSchool() {
		HashSet<School> schools=new HashSet<School>();
		schools.add(kv);
		schools.add(ryan);
		schools.add(podar);
		schools.add(army);
		schools.add(army);
		schools.add(kv);
		schools.add(podar);
		schools.add(ryan);
		
		assertEquals(4, schools.size());
	}

}
