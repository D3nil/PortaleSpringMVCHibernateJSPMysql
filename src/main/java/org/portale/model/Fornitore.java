/**
 * 
 */
package org.portale.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Denilson
 */
@Entity
@Table(name = "vw_bodyrentalvendor")
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = {"updatedAt"}, 
//        allowGetters = true)
public class Fornitore implements Serializable 
{
	private static final long serialVersionUID = -6274872120846571052L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vw_rental_vendor_id")
	private Long VW_BodyRentalVendor_Id;

	@Column(name = "Company")

	private String company;

	@Column(name = "CompanyName_No_")

	private String companyNameNo;

	@Column(name = "Name")

	private String name;

	@Column(name = "Name2")

	private String name2;

	@Column(name = "Address")

	private String address;

	@Column(name = "Address2")

	private String address2;

	@Column(name = "City")

	private String city;

	@Column(name = "Post_Code")
	private String postCode;

	@Column(name = "country_region_code")
	private String countryRegionCode;

	@Column(name = "E_mail")

	private String email;

	@Column(name = "Phone_No_")

	private String phoneNumber;

	@Column(name = "Fax_No_")

	private String faxNumber;

	@Column(name = "VATRegistration_No_")
	private String vatNumber;

	@Column(name = "Blocked_Qualification")

	private String blockedQualification;

	@Column(name = "Qualification_Notes")

	private String qualificationNotes;
	
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "fornitore")
    private PasswFornitore passwFornitore;

	

	public Fornitore() { }

	public Long getVW_BodyRentalVendor_Id() {
		return VW_BodyRentalVendor_Id;
	}

	public void setVW_BodyRentalVendor_Id(Long id) {
		this.VW_BodyRentalVendor_Id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyNameNo() {
		return companyNameNo;
	}

	public void setCompanyNameNo(String companyNameNo) {
		this.companyNameNo = companyNameNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountryRegionCode() {
		return countryRegionCode;
	}

	public void setCountryRegionCode(String countryRegionCode) {
		this.countryRegionCode = countryRegionCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getBlockedQualification() {
		return blockedQualification;
	}

	public void setBlockedQualification(String blockedQualification) {
		this.blockedQualification = blockedQualification;
	}

	public String getQualificationNotes() {
		return qualificationNotes;
	}

	public void setQualificationNotes(String qualificationNotes) {
		this.qualificationNotes = qualificationNotes;
	}

	public Fornitore(Long VW_BodyRentalVendor_Id, String company, String companyNameNo, String name, String name2, String address,
			String address2, String city, String postCode, String countryRegionCode, String email, String phoneNumber,
			String faxNumber, String vatNumber, String blockedQualification, String qualificationNotes) {
		this.VW_BodyRentalVendor_Id = VW_BodyRentalVendor_Id;
		this.company = company;
		this.companyNameNo = companyNameNo;
		this.name = name;
		this.name2 = name2;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.postCode = postCode;
		this.countryRegionCode = countryRegionCode;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.vatNumber = vatNumber;
		this.blockedQualification = blockedQualification;
		this.qualificationNotes = qualificationNotes;
	}
	
	
		
}
