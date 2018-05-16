/**
 * 
 */
package org.portale.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Denilson
 */
@Entity
@Table (name="fornitore_passw")
public class PasswFornitore 
{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_passw_supplier;
    
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY ,  cascade = CascadeType.ALL)
    @JoinColumn(name = "vw_rentalVendor_id_fk")
	private Fornitore fornitore;

	public Long getId_passw_supplier() {
		return id_passw_supplier;
	}

	public void setId_passw_supplier(Long id_passw_supplier) {
		this.id_passw_supplier = id_passw_supplier;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	

	public PasswFornitore() {
	}

	public PasswFornitore(Long id_passw_supplier, String password) {
		this.id_passw_supplier = id_passw_supplier;
		this.password = password;
	}	
	

}
