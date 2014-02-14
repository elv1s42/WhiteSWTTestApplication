/**
 * Created by Murzinov Ilya on 2/14/14.
 */
package main.java.com.TestStack.White.SWTTestApplication.Application;

import main.java.com.TestStack.White.SWTTestApplication.View.*;
import main.java.com.TestStack.White.SWTTestApplication.Controller.*;
import main.java.com.TestStack.White.SWTTestApplication.Model.*;

public class Main {
	public static void main(String[] args)
	{
		MainWindowModel model = new MainWindowModel();
		MainWindowView view = new MainWindowView();
		MainWindowController controller = 
				new MainWindowController(model, view);
		
		view.show();
	}
}