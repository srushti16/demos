package com.revature.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.revature.beans.Car;
import com.revature.comparators.VinComparator;

public class CollectionsExamples {
	public static void main(String[] args) {

		// list have order and the interface places no restrictions on duplicates but an
		// implementation possibly could
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(1, 5, "Lambo", "Aventador", "yellow"));
		cars.add(new Car(2, 1000, "Honda", "Civic", "white"));
		cars.add(new Car(3, 7, "Chevy", "Apollo", "black"));
		cars.add(new Car(1, 5, "Lambo", "Aventador", "yellow"));

//		Collections.sort(cars); // sort by natural ordering which we defined to be the horsepower
		cars.sort(new VinComparator());
		
		System.out.println("List of cars");
		Iterator<Car> iterate = cars.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}

		// sets cannot contain duplicates and the interface has no guarantee of order
		// but some implementations do
		Set<Car> carSet = new HashSet<>();
		carSet.add(new Car(1, 5, "Lambo", "Aventador", "yellow"));
		carSet.add(new Car(2, 1000, "Honda", "Civic", "white"));
		carSet.add(new Car(3, 7, "Chevy", "Apollo", "black"));
		carSet.add(new Car(1, 5, "Lambo", "Aventador", "yellow"));

		System.out.println("Set of Cars");
		for (Car c : carSet) {
			System.out.println(c);
		}

		// maps are key value pairs
		Map<String, Car> ourCars = new HashMap<>();
		ourCars.put("bobby", new Car(1, 1, "Stallion", "New", "Gold"));
		ourCars.put("betty", new Car(2, -1, "Dead Horse", "old", "greenish, pale"));
		ourCars.put("bob", new Car(3, 5, "Pony", "fresh", "purple"));

		System.out.println("bobbys car is " + ourCars.get("bobby"));
		System.out.println("ian car is " + ourCars.get("ian"));

		// if we want to iterate through a map, we need to get either the keyset or the
		// entry set
		for (String key : ourCars.keySet()) {
			System.out.println("key is " + key);
			System.out.println("value is " + ourCars.get(key));
		}

		// queues are first in first out, we can push to the back and poll from the
		// front
		Queue<Car> q = new LinkedList<>();
		q.add(new Car(1, 5, "Lambo", "Aventador", "yellow"));
		q.add(new Car(2, 1000, "Honda", "Civic", "white"));
		q.add(new Car(3, 7, "Chevy", "Apollo", "black"));
		q.add(new Car(1, 5, "Lambo", "Aventador", "yellow"));

		System.out.println("our queue has " + q.size() + " elements");
		System.out.println("nor processing " + q.poll());
		System.out.println("queue now has " + q.size() + " elements");
	}
}
