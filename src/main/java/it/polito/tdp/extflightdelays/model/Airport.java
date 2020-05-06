package it.polito.tdp.extflightdelays.model;

public class Airport {
	
	private int id;
	private String iataCode;
	private String airportName;
	private String city;
	private String state;
	private String country;
	private Double latitude;
	private Double longitude;
	private Double timezoneOffset;
	
	public Airport(int id, String iataCode, String airportName, String city, String state, String country,
			Double latitude, Double longitude, Double timezoneOffset) {
		this.id = id;
		this.iataCode = iataCode;
		this.airportName = airportName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
		this.timezoneOffset = timezoneOffset;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getTimezoneOffset() {
		return timezoneOffset;
	}

	public void setTimezoneOffset(Double timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", iataCode=" + iataCode + ", airportName=" + airportName + "]";
	}
	
}
