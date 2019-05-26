package entities;

import java.util.Date;

public class HourContract {
	
	private Integer id;
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract(Integer id, Date date, Double valuePerHour, Integer hours) {
		this.id = id;
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	public Integer getId() {
		return this.id;
	}
		
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return this.hours * this.valuePerHour;
	}

	@Override
	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}
	
}
