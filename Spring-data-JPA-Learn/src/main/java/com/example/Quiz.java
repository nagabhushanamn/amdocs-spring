package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


class MyList<E> implements Iterable<E>{
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
			@Override
			public E next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}

public class Quiz {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		for (String item : arrayList) {
		}

		LinkedList<String> linkedList = new LinkedList<>();
		for (String item : linkedList) {
		}
		
		MyList<String> myList=new MyList<>();
		for(String item:myList) {}

	}

}
