public class Person{
	public Person(String nameIn, int numberOfPetsIn){
		name=nameIn;
		numberOfPets= numberOfPetsIn;
		}
	public void greeting(){
		System.out.println("Hello, my name is " + name);
		System.out.println("and I have " + numberOfPets + " pet.");
		}
public void setName(String newName){
		name=newName;
		}
	public String getName(){
		return name;
		}
	public void setNumberOfPets(int newNumberOfPets){
		numberOfPets= newNumberOfPets;
		}
	public int getNumberOfPets(){
		return numberOfPets;
		}
		private String name;
		private int numberOfPets;
	}
		
