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
			
			String temp = myPopups.grabAnswer("type in your age");
			int myAge;
			
			if(isInteger(temp))
			{
				myAge = Integer.parseInt(temp);
			}
			else
			{
				myAge = -9999999;
			}
			myPopups.showResponce("You typed " + myAge);
			
			String tempWeight = myPopups.grabAnswer("Type in your weight");
			double myWeight = Double.parseDouble(tempWeight);
			//Check at home if it is a double
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
			catch(NumberFormatExeption error)
			{
				myPopups.showResponce("not an int - bad value will be used");
			}
			return isInt;
		}
		
		private boolean isDouble(String input)
		{
			boolean isDouble = false;
			
			try
			{
				double temp = Double.parseDouble(input);
				isDouble = true;
			}
			catch(NumberFormatExeption error)
			{
				myPopups.showResponce("not a double - bad value will be used");
			}
			
			return isDouble;
		}

	}
