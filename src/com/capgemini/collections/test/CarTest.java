package com.capgemini.collections.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collections.model.Car;

public class CarTest {

	private Car car1;
	private Car car2;
	private Car car3;

	@Before
	public void setUp() {
		car1=new Car("INDIA","Maruti",2013,280000);
		car2=new Car("KOREAN","Hyundai",2012,475000);
		car3=new Car("JAPAN","Toyota",2018,690000);
			
	}
	
	@Test
	public void toCheckCarListInInsertionorder() {
		ArrayList<Car> cars=new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		Iterator<Car> iterator = cars.iterator();
		assertEquals(car1,iterator.next());
		assertEquals(car2, iterator.next());
		assertEquals(car3,iterator.next());
		
	}
	@Test
	public void toCheckCarNoDuplicateCarIsThere(){
		HashSet<Car> cars=new HashSet<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car1);
		cars.add(car3);
		assertEquals(3, cars.size());
		
	}
	@Test
	public void  toCheckTheOrderOfCarInAscendingOrder() {
		TreeSet<Car> cars=new TreeSet<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car1);
		assertEquals(3, cars.size());
		
		Iterator<Car> iterator=cars.iterator();
		assertEquals(car1, iterator.next());
		assertEquals(car3,iterator.next());
		assertEquals(car2,iterator.next());
	}
}
