package biblioteca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCopy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String locationCode;
	
	private Product product;
	
	
	// Constructor
	public ProductCopy() {} // Used by SpringData
	
	
	// Métodos getter/setter de los atributos
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocationCode() {
		return locationCode;
	}
	
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}

}
