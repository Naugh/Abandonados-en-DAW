package biblioteca;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Action {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Date date;
	
	private ActionType actionType;
	private ProductCopy productCopy;
	
	
	// Constructor
	public Action() {} // Used by SpringData
	
	
	// Métodos getter/setters de los atributos
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public ActionType getActionType() {
		return actionType;
	}
	
	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}
	
	public ProductCopy getExemplary() {
		return productCopy;
	}
	
	public void setExemplary(ProductCopy exemplary) {
		this.productCopy = exemplary;
	}

}
