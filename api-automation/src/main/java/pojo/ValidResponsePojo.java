package pojo;


public class ValidResponsePojo {
	

	private MainPojo main;
	private CoordPojo coord;
	private WeatherPojo[] weather;
    private int timezone;
    private int id;
    private String name;
    private int cod;
    private int visibility;
    private String base;
    private WindPojo wind;
    private CloudPojo clouds;
	private long dt;
    private SysPojo sys;
    
    public long getDt() {
		return dt;
	}
	public void setDt(long dt) {
		this.dt = dt;
	}
	public SysPojo getSys() {
		return sys;
	}
	public void setSys(SysPojo sys) {
		this.sys = sys;
	}  
    
	public CloudPojo getClouds() {
		return clouds;
	}
	public void setClouds(CloudPojo clouds) {
		this.clouds = clouds;
	}
	public WindPojo getWind() {
		return wind;
	}
	public void setWind(WindPojo wind) {
		this.wind = wind;
	}
	public MainPojo getMain() {
		return main;
	}
	public void setMain(MainPojo main) {
		this.main = main;
	}
	public CoordPojo getCoord() {
		return coord;
	}
	public void setCoord(CoordPojo coord) {
		this.coord = coord;
	}
	public WeatherPojo[] getWeather() {
		return weather;
	}
	public void setWeather(WeatherPojo[] weather) {
		this.weather = weather;
	}
	public int getTimezone() {
		return timezone;
	}
	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
    
	
	
	

}
