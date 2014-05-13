package javabasic;

import java.util.Arrays;

public class MichealOwen {

	private String name;
	private String position;
	private String freind[];
	
	public MichealOwen(){
		 name = "Michael Owen";
		 position = "vanguard";
		 freind = new String[]{"rio ferdinand","steven gerrard","devil beckham","frank lampard"};
		 
	}
	public String getname(){
		
	return name;
	}
	
	public String getposition(){
		
	return position;
		}
	
	public String[] getfreind(){
		
		return freind;
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MichealOwen Sc = new MichealOwen();
		String name = Sc.getname();
		String position = Sc.getposition();
		String freind[] = Sc.getfreind();
		System.out.println("Name " + name);
		System.out.println("Position " + position);
		System.out.println("Freind are " + Arrays.toString(freind));
	}

}



