package biblioteca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Token {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String value;
	
	private Action action;
	
	
	// Constructor
	public Token() {} // Used by SpringData
	
	
	// Métodos getter/setter de los atributos
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getValor() {
		return value;
	}
	
	public void setValor(String valor) {
		this.value = valor;
	}
	
	public Action getAction() {
		return action;
	}
	
	public void setAction(Action action) {
		this.action = action;
	}
}
