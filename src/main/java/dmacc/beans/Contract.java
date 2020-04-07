package dmacc.beans;
// Austin Rathje

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contract {
	// class attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String launchDate;
	private String rocket;
	private String launchProvider;
	private String beneficiary;
	private double cost;
	
	/**
	 * default no arguments constructor
	 */
	public Contract() {
		this.launchDate = "No launch date";
	}

	/**
	 * @param rocket
	 * @param launchProvider
	 * @param beneficiary
	 * @param cost
	 */
	public Contract(String rocket, String launchProvider, String beneficiary, double cost) {
		this.rocket = rocket;
		this.launchProvider = launchProvider;
		this.beneficiary = beneficiary;
		this.cost = cost;
	}
	
	/**
	 * @param id
	 * @param launchDate
	 * @param rocket
	 * @param launchProvider
	 * @param beneficiary
	 * @param cost
	 */
	public Contract(long id, String launchDate, String rocket, String launchProvider, String beneficiary, double cost) {
		this.id = id;
		this.launchDate = launchDate;
		this.rocket = rocket;
		this.launchProvider = launchProvider;
		this.beneficiary = beneficiary;
		this.cost = cost;
	}

	/**
	 * @return the launchDate
	 */
	public String getLaunchDate() {
		return launchDate;
	}

	/**
	 * @param launchDate the launchDate to set
	 */
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	/**
	 * @return the rocket
	 */
	public String getRocket() {
		return rocket;
	}

	/**
	 * @param rocket the rocket to set
	 */
	public void setRocket(String rocket) {
		this.rocket = rocket;
	}

	/**
	 * @return the launchProvider
	 */
	public String getLaunchProvider() {
		return launchProvider;
	}

	/**
	 * @param launchProvider the launchProvider to set
	 */
	public void setLaunchProvider(String launchProvider) {
		this.launchProvider = launchProvider;
	}

	/**
	 * @return the beneficiary
	 */
	public String getBeneficiary() {
		return beneficiary;
	}

	/**
	 * @param beneficiary the beneficiary to set
	 */
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Launch Date: " + launchDate + " | Rocket: " + rocket + " | Launch Provider: " + launchProvider
				+ " | Beneficiary: " + beneficiary + " | Cost: $" + cost;
	}

}
