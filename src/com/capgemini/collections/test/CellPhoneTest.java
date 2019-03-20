package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collections.model.Cellphone;

public class CellPhoneTest {


	private Cellphone mi;
	private Cellphone samsung;
	private Cellphone apple;
	private Cellphone vivo;
	
	@Before
	public void setUp() {
		mi=new Cellphone("Redmi","Note4","Best Mobile","Android",10000);
		samsung=new Cellphone("Samsung"," Samsung A7","Good Mobile","Android",15000);
		apple=new Cellphone("Apple","IphoneX"," Best Performance Mobile","IOS",100000);
		vivo=new Cellphone("Vivo"," Vivo 5","Good Mobile","Android",20000);
	}
	@Test
	public void toTestTelevisionListInInsertionOrder() {
		ArrayList<Cellphone> cellphones=new ArrayList<>();
		cellphones.add(mi);
		cellphones.add(apple);
		cellphones.add(samsung);
		cellphones.add(vivo);
		
		Iterator<Cellphone> iterator=cellphones.iterator();
		assertEquals(mi,iterator.next());
		assertEquals(apple, iterator.next());
		assertEquals(samsung, iterator.next());
		assertEquals(vivo, iterator.next());
		
	}
	@Test
	public void  toTestNoDuplicatesIsThereIncellphones() {
		HashSet<Cellphone> cellphones=new HashSet<Cellphone>();
		cellphones.add(mi);
		cellphones.add(apple);
		cellphones.add(samsung);
		cellphones.add(vivo);
		cellphones.add(apple);
		cellphones.add(vivo);
		
		assertEquals(4, cellphones.size());
	}
	

}
