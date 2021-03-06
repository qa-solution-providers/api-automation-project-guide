package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class MainPojo {


	    private double temp;
	    private int pressure;
	    private int humidity;
	    private double temp_min;
	    private double temp_max;
	    private double feels_like;
	    
	    
		public double getFeels_like() {
			return feels_like;
		}
		public void setFeels_like(double feels_like) {
			this.feels_like = feels_like;
		}
		public void setTemp(double temp) {
			this.temp = temp;
		}
		public void setPressure(int pressure) {
			this.pressure = pressure;
		}
		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}
		public void setTemp_min(double temp_min) {
			this.temp_min = temp_min;
		}
		public void setTemp_max(double temp_max) {
			this.temp_max = temp_max;
		}
		public double getTemp() {
			return temp;
		}
		public int getPressure() {
			return pressure;
		}
		public int getHumidity() {
			return humidity;
		}
		public double getTemp_min() {
			return temp_min;
		}
		public double getTemp_max() {
			return temp_max;
		}
	
}
