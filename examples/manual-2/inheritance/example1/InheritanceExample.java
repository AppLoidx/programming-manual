class Person {
	private String name;
	private int age;

	public void doSomething(){
		System.out.println("I'm individual person");
	}

	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
}

class Boss extends Person {
	public void doSomethingLikeABoss(){
		System.out.println("I'm a boss!");
	}
}

public class InheritanceExample {
	public static void main(String ... args) {
		Person person = new Person();
		
		Boss boss = new Boss();

		person.doSomething();		// I'm individual person
		person.setAge(18);
		person.setName("Lilith");
		System.out.println(person.getName() + " " + person.getAge()); // Lilith 18

		boss.setAge(30);
		boss.setName("Boris");
		System.out.println(boss.getName() + " " + boss.getAge());	// Boris 30

		boss.doSomething();				// I'm individual person
		boss.doSomethingLikeABoss();	// I'm boss!

	}
}