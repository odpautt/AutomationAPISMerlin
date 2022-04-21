package com.indra.pojoApis;

public class ResponseAuthenticateApi{
	private String role;
	private String rights;
	private String username;
	private String token;

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setRights(String rights){
		this.rights = rights;
	}

	public String getRights(){
		return rights;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}
}
