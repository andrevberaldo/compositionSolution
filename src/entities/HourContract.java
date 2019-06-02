package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HourContract {
	
	private Integer id;
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract(Integer id, String date, Double valuePerHour, Integer hours) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		this.id = id;
		this.date = sdf1.parse(date);
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
