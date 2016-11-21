package main;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "SessionBean")
@SessionScoped
public class SessionBean {	
	private String firstName;
	private String lastName;
	
	public void valueChangeMethod(ValueChangeEvent event){
		System.out.println(event.getNewValue());
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
