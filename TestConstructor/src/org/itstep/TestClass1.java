package org.itstep;

public class TestClass1 {
	// ctrl + s = isprav pomilki;
		// ctrl +z = vertae dii;

		private String testField1;

		public String getTestField1() {
			return testField1;
		}

		public void setTestField1(String testField1) {
			this.testField1 = testField1;
		}

		public int getTestField2() {
			return testField2;
		}

		public void setTestField2(int testField2) {
			this.testField2 = testField2;
		}

		private int testField2;

		public TestClass1() { //constructor;
			// first is nothing;

		}

		public TestClass1(String tf1) {

			this.testField1 = tf1;

		}

		public TestClass1(String tf1, int tf2) {
			this.testField1 = tf1;//constructor
			this.testField2 = tf2;
			

		}


}
