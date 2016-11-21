package main;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "RequestBean")
@RequestScoped
public class RequestBean {	
	private String sex;
	private String favColor;
	private ArrayList<String> favFilm;
	
	public void valueChangeMethod(ValueChangeEvent event){
		System.out.println(event.getNewValue());
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getFavColor() {
		return favColor;
	}

	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}

	public ArrayList<String> getFavFilm() {
		return favFilm;
	}

	public void setFavFilm(ArrayList<String> favFilm) {
		this.favFilm = favFilm;
	}
}
