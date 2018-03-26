package org.itstep;

public class TestConstructorRunner {
	public static void main(String[] args) {
		TestClass1 tc1 = new TestClass1();
		tc1.setTestField1("Some string");
		tc1.setTestField2(542);
		
		TestClass1 tc1v2 = new TestClass1("Yasy",18);
		System.out.println(tc1v2.getTestField1());
		System.out.println(tc1v2.getTestField2());
		
		TestClass1 tc1v3 = new TestClass1("yana",34);
		System.out.println(tc1v3.getTestField1());
		System.out.println(tc1v3.getTestField2());
		
		//ctrl + mouth on class;
		
	}

}
