package com.scit.demo;

public class HelloWorld {

	public static void main(String[] args) {
		// Call to show method
		ShowData showData = new HelloWorld().new ShowData();
		showData.show();
	}

	public void show() {
		System.out.println("Execute  show");
		System.out.println("Test 1");

	}

	class ShowData {

		public void show() {
			System.out.println("Execute  show");
			System.out.println("Test 1");
		}

	}
}
