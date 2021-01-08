package IfElseStatement;

public class Statement {
   
	public static void main(String[] args) {
		
		String name = "John";
		int age = 28;
		Boolean statement = true;
		
		if(name.equals("John")) {
			
			System.out.println("My name is " + name);
		}else {
			
			System.out.println("My name is not " + name);
		}
		
		if(age == 28) {
			
			System.out.println("My age is " + age);
		}else {
			
			System.out.println("My age is not " + age );
		}
		if(statement.equals(false)) {
			
			System.out.println("Statement is " + statement);
		}else {
			System.out.println("Statement is " + false);
		}
		
		if(name.equals("John") && age == 28 && statement.equals(true)) {
			
			System.out.println("My name is " + name);
			System.out.println("My age is " + age);
			System.out.println("Statement is " + statement);
			
		}else {
			
			System.out.println("My name is not " + name + "My age is not " + age + "Statement is " + false);
		}
		
		
	}

}
