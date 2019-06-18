package com.flydubai.reaccom.inoker.dcs.auth;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class Authenticate {

	private String grant_type;
	private String client_secret;
	private String username;
	private String password;
	private String client_id;
	private String scope;
	private String env;
	private String rol;

	public String getGrant_type() {
		return grant_type;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

	public String getClient_secret() {
		return client_secret;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Authenticate [grant_type=" + grant_type + ", client_secret=" + client_secret + ", username=" + username
				+ ", password=" + password + ", client_id=" + client_id + ", scope=" + scope + ", env=" + env + ", rol="
				+ rol + "]";
	}

	public MultiValueMap<String, String> getForm() {
		MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
		form.add("client_id", this.getClient_id());
		form.add("client_secret", this.getClient_secret());
		form.add("env", this.getEnv());
		form.add("username", this.getUsername());
		form.add("grant_type", this.getGrant_type());
		form.add("password", this.getPassword());
		form.add("scope", this.getScope());
		return form;
	}

}