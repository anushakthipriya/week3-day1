package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() 
	{
		System.out.println("15'inch "); 
		}
		

	public static void main(String[] args) 
	{
		Computer comp = new Computer();
		comp.computerModel();
		comp.desktopSize();

	}

}
