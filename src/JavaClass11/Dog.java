package JavaClass11;

public class Dog {

	
		// State
		// attributes/properties/fields

		String name;
		String color;
		String breed;
		double weight;
		int age;
		// These are the behaviors of a dog  
		
		void bark() {
			System.out.println("Barking........................");
			}
		void sleep() {
			System.out.println("Dog is sleeping................");
		}
		public static void main(String[] args) {
			
			Dog dog1=new Dog();
			dog1.bark();
			
		}
		
	}


