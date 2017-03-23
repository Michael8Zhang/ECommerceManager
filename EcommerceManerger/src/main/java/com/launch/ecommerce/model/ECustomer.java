package com.launch.ecommerce.model;
// Generated Mar 23, 2017 5:22:07 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * ECustomer generated by hbm2java
 */
@Entity
@Table(name = "e_customer", catalog = "launchtech", uniqueConstraints = @UniqueConstraint(columnNames = "ebay_id"))
public class ECustomer {//implements java.io.Serializable {

	private Integer id;
	private String ebayId;
	private String name;
	private String street;
	private String city;
	private String state;
	private String postcode;
	private String country;
	private String mobile;
	private String phone;
	private String email;
	private Date createDate;
	private Date updatetime;

	public ECustomer() {
	}

	public ECustomer(String ebayId, String street, String city, String state, String postcode, String country,
			Date createDate, Date updatetime) {
		this.ebayId = ebayId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
		this.country = country;
		this.createDate = createDate;
		this.updatetime = updatetime;
	}

	public ECustomer(String ebayId, String name, String street, String city, String state, String postcode,
			String country, String mobile, String phone, String email, Date createDate, Date updatetime) {
		this.ebayId = ebayId;
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
		this.country = country;
		this.mobile = mobile;
		this.phone = phone;
		this.email = email;
		this.createDate = createDate;
		this.updatetime = updatetime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ebay_id", unique = true, nullable = false, length = 50)
	public String getEbayId() {
		return this.ebayId;
	}

	public void setEbayId(String ebayId) {
		this.ebayId = ebayId;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "street", nullable = false, length = 128)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "city", nullable = false, length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", nullable = false, length = 16)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "postcode", nullable = false, length = 10)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "country", nullable = false, length = 10)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "mobile", length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", length = 128)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, length = 19)
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
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((ebayId == null) ? 0 : ebayId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null) return false;
		if (!(obj instanceof ECustomer))
            return false;
        ECustomer other = (ECustomer) obj;
        if (id != other.id)
            return false;
        if (ebayId == null) {
            if (other.ebayId != null)
                return false;
        } else if (!ebayId.equals(other.ebayId))
            return false;
		
		return true;
	}
	
	/*
	 * private String street;
	private String city;
	private String state;
	private String postcode;
	private String country;
	private String mobile;
	private String phone;
	private String email;
	private Date createDate;
	private Date updatetime;
	 * 
	 * 
	 */
	@Override
	public String toString(){
		return "Customer [id=" + id + ", ebayId="  + ebayId + ", name=" + name + ", crateDate="
                + createDate + ", udatetieme=" + updatetime + ", email=" + email + "]";
	}
	
	

}
