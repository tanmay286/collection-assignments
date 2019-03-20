package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collections.model.Television;

public class TelevisionTest {

	private Television mi;
	private Television samsung;
	private Television micromax;
	private Television hp;
	
	@Before
	public void setUp() {
		mi=new Television("MI","LED",true,128964);
		samsung=new Television("Samsung","LCD",false,238965);
		micromax=new Television("Micromax","Plasma",true,561234);
		hp=new Television("HP","LCD",true,23763);
	}
	@Test
	public void toTestTelevisionListInInsertionOrder() {
		ArrayList<Television> televisions=new ArrayList<>();
		televisions.add(mi);
		televisions.add(micromax);
		televisions.add(samsung);
		televisions.add(hp);
		
		Iterator<Television> iterator=televisions.iterator();
		assertEquals(mi,iterator.next());
		assertEquals(micromax, iterator.next());
		assertEquals(samsung, iterator.next());
		assertEquals(hp, iterator.next());
		
	}
	@Test
	public void  toTestNoDuplicatesIsThereInTelevision() {
		HashSet<Television> televisions=new HashSet<Television>();
		televisions.add(mi);
		televisions.add(micromax);
		televisions.add(samsung);
		televisions.add(hp);
		televisions.add(mi);
		televisions.add(micromax);
		
		assertEquals(4, televisions.size());
	}
}
