public class Dog {

	private String name;
	private String breed;
	private int age;

	public Dog( String name, String breed, int age ) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Dog( String [] parameters ) {
		this( parameters[0], 
			parameters[1], 
			Integer.parseInt(parameters[2])
		 );
	}

	public String toString() {
		return "[" + name + ":" + breed + ":" + age + "]";
	}

}