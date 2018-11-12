package com;

import com.vendor.Container;

public class App {

	public static void main(String[] args) {

		Container container = new Container();

		//
		container.processAnyRequest("/login");

	}

}
