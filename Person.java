/** CSCI 271 
 * OOP and OOD (First attempt)
 * 2020/02/26
 * Creating a person class
**/
public class Person{
	// Instance variables	

	private String fname; // Person firstname
	private String lname; // Person lastname
	private int age; // Person age in years

	// Accessor Methods
	
	public String getFname(){
		return fname;
	}

	public String getLname(){
		return lname;
	}	

	public int getAge(){
		return age;
	}

	// Mutator Methods (void methods)
	
	public void setFname(String newFname){
		fname = newFname;	
	}	
	public void setLname(String newLname){
		lname = newLname;
	}
	public void setAge(int newAge){
		age = newAge;
	}

	// Constructors (init methods)
	// Only used when creating an object	
	// Same name as class
	
	//Person(){ // Default constuctor Always
	//	fname = "";
	//	lname = "";
	//	age = -1;
	//}	

	Person(String newFname, String newLname, int newAge){
		fname = newFname;
		lname = newLname;
		age = newAge;
	}

	// Other
	
	public void print(){
		System.out.println(fname + " " + lname + " " + age);
	}

	// Toy main program to test class
	public static void main(String[] args){
		Person myObject = new Person("John", "Pearson", 21);
		Person otherObject = new Person("Matthew", "Pearson", 18);

		myObject.print();
		otherObject.print();
	}
		
}
