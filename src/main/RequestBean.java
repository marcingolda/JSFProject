package main;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "RequestBean")
@RequestScoped
public class RequestBean {	
	private String requestTest;

	public String getRequestTest() {
		return requestTest;
	}

	public void setRequestTest(String requestTest) {
		this.requestTest = requestTest;
	}

}
