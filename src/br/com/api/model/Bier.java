package br.com.api.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Bier {

	private Integer id;
	private String name;
	private String brewery;
	private Type type;	
		
	public Bier(Integer id, String name, String brewery, Type type) {
		this.setType(type);
		this.setName(name);
		this.setBrewery(brewery);
		this.setId(id);
	}	
	
	public Bier() {}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrewery() {
		return brewery;
	}
	
	public void setBrewery(String brewery) {
		this.brewery = brewery;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public enum Type {
		PALE_LAGERS, LAGER, PILSEN, ALE,
		PALE_ALE, INDIAN_PALE_ALE, WEIZEN,
		LIGHT_HYBRID_BEER, PILSNER;
	}
	
}
