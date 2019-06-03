package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Employee {

	private String name;
	private EmployeeLevel level;
	private Double baseSalary;
	List<HourContract> contracts = new ArrayList<>();
	
	public Employee(String name, EmployeeLevel level, Double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}

	public EmployeeLevel getLevel() {
		return level;
	}

	public void setLevel(EmployeeLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(Integer id) {
		for (HourContract c : contracts) {
			if (c.getId() == id) {
				contracts.remove(c);
			}
		}
	}
	
	public double getIncome(int month, int year) {
		Calendar cal = Calendar.getInstance();
		double monthIncome = 0;
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());  
			int monthT = cal.get(Calendar.MONTH);
			int yearT = cal.get(Calendar.YEAR);
			if ((monthT+1) == month && yearT == year) {
				monthIncome += c.totalValue();
			}
			
		}
		
		return (monthIncome + this.baseSalary);
	}
	
	public void getContracts() {
		for (HourContract c : contracts) {
			System.out.println(c);
		}
	}
	
}
