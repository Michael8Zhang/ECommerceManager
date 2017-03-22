package com.launch.ecommerce.model;
// Generated Mar 22, 2017 3:29:12 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.LocalDate;

/**
 * ECustomer generated by hbm2java
 */
@Entity
@Table(name = "e_customer", catalog = "launchtech")
public class ECustomer implements java.io.Serializable {

	private Long id;
	private String custEbayId;
	private String custName;
	private String custAddrStreet;
	private String custAddrCity;
	private String custAddrState;
	private String custAddrePostcode;
	private String custAddrCountry;
	private String custMobile;
	private String custPhone;
	private String custEmail;
	private Date createDate;
	private Date updatetime;

	public ECustomer() {
	}

	public ECustomer(String custEbayId, String custAddrStreet, String custAddrCity, String custAddrState,
			String custAddrePostcode, String custAddrCountry, Date createDate, Date updatetime) {
		this.custEbayId = custEbayId;
		this.custAddrStreet = custAddrStreet;
		this.custAddrCity = custAddrCity;
		this.custAddrState = custAddrState;
		this.custAddrePostcode = custAddrePostcode;
		this.custAddrCountry = custAddrCountry;
		this.createDate = createDate;
		this.updatetime = updatetime;
	}

	public ECustomer(String custEbayId, String custName, String custAddrStreet, String custAddrCity,
			String custAddrState, String custAddrePostcode, String custAddrCountry, String custMobile, String custPhone,
			String custEmail, Date createDate, Date updatetime) {
		this.custEbayId = custEbayId;
		this.custName = custName;
		this.custAddrStreet = custAddrStreet;
		this.custAddrCity = custAddrCity;
		this.custAddrState = custAddrState;
		this.custAddrePostcode = custAddrePostcode;
		this.custAddrCountry = custAddrCountry;
		this.custMobile = custMobile;
		this.custPhone = custPhone;
		this.custEmail = custEmail;
		this.createDate = createDate;
		this.updatetime = updatetime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "cust_ebay_id", nullable = false, length = 50)
	public String getCustEbayId() {
		return this.custEbayId;
	}

	public void setCustEbayId(String custEbayId) {
		this.custEbayId = custEbayId;
	}

	@Column(name = "cust_name", length = 50)
	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "cust_addr_street", nullable = false, length = 128)
	public String getCustAddrStreet() {
		return this.custAddrStreet;
	}

	public void setCustAddrStreet(String custAddrStreet) {
		this.custAddrStreet = custAddrStreet;
	}

	@Column(name = "cust_addr_city", nullable = false, length = 50)
	public String getCustAddrCity() {
		return this.custAddrCity;
	}

	public void setCustAddrCity(String custAddrCity) {
		this.custAddrCity = custAddrCity;
	}

	@Column(name = "cust_addr_state", nullable = false, length = 16)
	public String getCustAddrState() {
		return this.custAddrState;
	}

	public void setCustAddrState(String custAddrState) {
		this.custAddrState = custAddrState;
	}

	@Column(name = "cust_addre_postcode", nullable = false, length = 10)
	public String getCustAddrePostcode() {
		return this.custAddrePostcode;
	}

	public void setCustAddrePostcode(String custAddrePostcode) {
		this.custAddrePostcode = custAddrePostcode;
	}

	@Column(name = "cust_addr_country", nullable = false, length = 10)
	public String getCustAddrCountry() {
		return this.custAddrCountry;
	}

	public void setCustAddrCountry(String custAddrCountry) {
		this.custAddrCountry = custAddrCountry;
	}

	@Column(name = "cust_mobile", length = 20)
	public String getCustMobile() {
		return this.custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	@Column(name = "cust_phone", length = 20)
	public String getCustPhone() {
		return this.custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	@Column(name = "cust_email", length = 128)
	public String getCustEmail() {
		return this.custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date", nullable = false, length = 10)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatetime", nullable = false, length = 19)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
	@Override
	public int hashCode(){
		final int prime=31;
		int result=1;
		result = prime * result + id.hashCode();
		result = prime * result + ((custEbayId == null) ? 0:custEbayId.hashCode());		
		return result;
	}
	

}
