package main;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "RequestBean")
@RequestScoped
public class RequestBean {	
	private String sex;
	private String favColor;
	private ArrayList<String> favFilm;

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
