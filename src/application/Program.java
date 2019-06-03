package application;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

import entities.Employee;
import entities.EmployeeLevel;
import entities.HourContract;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		HourContract contract;
		
		Employee andre = new Employee("André Beraldo", EmployeeLevel.JUNIOR, 2000.0);
		
		for (int i=0; i<2; i++) {
			System.out.println("Qual a data?");
			String data = sc.nextLine();
			contract = new HourContract(i+1, data, 50.0, 5);
			andre.addContract(contract);
		}
		
				
		
		System.out.println("Qual o mês?");
		int mes = sc.nextInt();
		System.out.println("Qual o ano?");
		int ano = sc.nextInt();
		
		System.out.println(andre.getIncome(mes, ano));
		
			
		
		sc.close();
	}

}
