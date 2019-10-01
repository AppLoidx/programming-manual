public class StaticExample {
	static class MyClassNonStatic {
		int a = 0;
		void inc(){
			a++;
		}
	}

	static class MyClassWithStatic {
		static int a = 0;
		void inc(){
			a++;
		}
	}

	public static void main(String ... args) {
		MyClassNonStatic a = new MyClassNonStatic();
		MyClassNonStatic b = new MyClassNonStatic();
		a.inc();
		b.inc();
		
		System.out.println(a.a + " " + b.a);	// 1 1
		
		a.inc();	

		System.out.println(a.a + " " + b.a);	// 2 1	

		MyClassWithStatic c = new MyClassWithStatic();
		MyClassWithStatic d = new MyClassWithStatic();
		
		c.inc();
		d.inc();
		System.out.println(c.a + " " + d.a);	// 2 2

		c.inc();
		System.out.println(c.a + " " + d.a);	// 3 3
	}
}