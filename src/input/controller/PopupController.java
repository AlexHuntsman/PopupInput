package input.controller;

import input.view.PopupDisplay;
import input.model.Thingy;


public class PopupController
	{
		private PopupDisplay myPopups;
		private Thingy myTestThing;
		public PopupController()
		{
			myPopups = new PopupDisplay();
		}
		
		public void start()
		{
			String myName = myPopups.grabAnswer("type in your name");
			myPopups.showResponce("You typed in: " + myName);
			
			String userNumber = myPopups.grabAnswer("type in your age");
			int myAge;
			
			while(!isInteger(userNumber))
			{
				userNumber = myPopups.grabAnswer("type in a positive intiger for your age!!");
			}
			
			if(isInteger(userNumber))
			{
				myAge = Integer.parseInt(userNumber);
			}
			else
			{
				myAge = -9999999;
			}
			
			
			myPopups.showResponce("You typed " + myAge);
			
			String tempWeight = myPopups.grabAnswer("Type in your weight");
			double myWeight;
			
			//Check at home if it is a double
			
			while(!isDouble(tempWeight))
			{
				tempWeight = myPopups.grabAnswer("type in a real number for your weight");
			}
			
			if(isDouble(tempWeight))
			{
				myWeight = Double.parseDouble(tempWeight);
			}
			else
			{
				myWeight = -9999.99;
			}
			
			myPopups.showResponce("You typed "+ myWeight);
			
			myTestThing = new Thingy(myName, myAge, myWeight);
			
		}
		
		private boolean isInteger(String input)
		{
			Boolean isInt = false;
			
			try
			{
				int  temp = Integer.parseInt(input);
				isInt = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.showResponce("not an int - bad value will be used");
			}
			return isInt;
		}
		
		private boolean isDouble(String input)
		{
			Boolean isDouble = false;
			
			try
			{
				double temp = Double.parseDouble(input);
				isDouble = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.showResponce("not a double - bad value will be used");
			}
			
			return isDouble;
		}

	}
