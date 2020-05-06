package it.polito.tdp.extflightdelays.model;

public class Airline {

	private int id;
	private String iataCode;
	private String airlineName;
	
	public Airline(int id, String iataCode, String airlineName) {
		this.id = id;
		this.iataCode = iataCode;
		this.airlineName = airlineName;
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

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
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
		Airline other = (Airline) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [id=" + id + ", iataCode=" + iataCode + ", airlineName=" + airlineName + "]";
	}
}
