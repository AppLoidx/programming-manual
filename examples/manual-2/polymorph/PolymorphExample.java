class Person {
	private String name;
	private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
	}
    public Person(String name, int age, int i){
        this.name = name;
        this.age = age;
	}

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
    public Boss(String name, int age){
        super(name, age);
    }
	public void doSomething(){
		System.out.println("I'm individual boss!");
	}

	public void doSomethingLikeABoss(){
		System.out.println("I'm a boss!");
    }
    
}

public class PolymorphExample {
    private static void myPolymorphMethod(Person person){
        System.out.println(person.getName());
    }
    public static void main(String ... args) {
        Person person = new Person("Alice", 21);
        Boss boss = new Boss("Juan", 38);

        myPolymorphMethod(person);      // Alice
        myPolymorphMethod(boss);        // Juan
    }
}