package input.model;
/**
 * Creates a Thingy object to show access and proper variable types
 * @author ahun0442
 *@version 1,0 9/24/15
 */
public class Thingy
	{
		private String name;
		private int age;
		private double weight;
		/**
		 * Sets default values for variables
		 */
		public Thingy()
		{
			name = "";
			age = -99;
			weight = -.008;
			
		}
		/**
		 * Constructor that sets user input to the values Name, Age, and Weight.
		 * @param name String Value for user name
		 * @param age An int value for user age
		 * @param weight A double value for user weight
		 */
		public Thingy(String name, int age, double weight)
		{
			//this. refers to the current instance of this object (A thingy)
			this.name = name;
			this.age = age;
			this.weight = weight;
		}
		public String getName()
		{
			return name;
		}
		public int getAge()
		{
			return age;
		}
		public double getWeight()
		{
			return weight;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		public void setWeight(double weight)
		{
			this.weight = weight;
		}

	}
