package it.unical.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import it.unical.calculator.*;


public class Main {
	public static void main(String []args) {
		System.out.println("Calcolatrice");
		try {
		System.out.println("Primo numero: ");
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		int o1 = Integer.parseInt(reader.readLine());			
		System.out.println("Secondo numero: ");
		int o2 = Integer.parseInt(reader.readLine());
		System.out.println("Scegli l'operazione: (1)Somma, (2)Sottrazione, (3)Moltiplicazione, (4)Divisione");
		int operation=Integer.parseInt(reader.readLine());
		Operation calc=null;
		switch(operation) {
		case 1: 
			calc=new Sum(o1,o2);
			break;
		case 2:
			calc=new Subtraction(o1,o2);
			break;
		case 3:
			calc=new Multiply(o1,o2);
			break;
		case 4:
			calc=new Division(o1,o2);
			break;
		default:
			System.out.println("Wrong operation mio dudo");
		}
		if(calc!=null) {
			System.out.println("Result: "+calc.execute());			
		}
		
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}