package com.flydubai.reaccom.inoker;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.flydubai.reaccom.inoker.dcs.auth.AuthResponse;
import com.flydubai.reaccom.inoker.dcs.auth.Authenticate;

public enum ResourceRequester {

	INSTANCE;

	private String authenticate(Authenticate auth) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(
				auth.getForm(), headers);

		ResponseEntity<AuthResponse> response = (ResponseEntity<AuthResponse>) new RestTemplate().exchange(
				"http://qa4authorization.flydubai.com/oauth2/token", HttpMethod.POST, request, AuthResponse.class);

		if (response != null && response.getBody() != null)
			return response.getBody().getAccess_token();
		return null;
	}

	public String generateToken() {
		Authenticate auth = new Authenticate();
		auth.setClient_id("18");
		auth.setClient_secret("353D4B4232A6FE4C1F7F5839321428D5");
		auth.setEnv("QA4");
		auth.setUsername("nfr2.adminqa");
		auth.setGrant_type("password");
		auth.setPassword("flydubai@123");
		auth.setRol("ADMIN");
		auth.setScope("apt:DXB");
		return authenticate(auth);

	}
	
	public <T, V> ResponseEntity<T> invokePostRequest(Class<T> retType, String url, V request, String authToken) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		if(authToken!=null)
		headers.add("Authorization", "Bearer " + authToken);
		HttpEntity<V> requestEntity = new HttpEntity<>(request, headers);
		return (ResponseEntity<T>) restTemplate.exchange(url, HttpMethod.POST, requestEntity, retType);

	}

	@SuppressWarnings("unchecked")
	public <T, V> ResponseEntity<T> invokeGetRequest(Class<V> retType, String url, String authToken) {
//		url = "http://qa4sprintcheckin.flydubai.com/api/v1/FZ/paxJourneys/DXB/2018-03-21/551/summary";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		if(authToken!=null)
		headers.add("Authorization", "Bearer " + authToken);
		HttpEntity<V> requestEntity = new HttpEntity<>(headers);
		return (ResponseEntity<T>) restTemplate.exchange(url, HttpMethod.GET, requestEntity, retType);

	}

	

	public static void main(String[] args) {

		System.out.println(ResourceRequester.INSTANCE.generateToken());

		// PaxSummary[] s= (PaxSummary[]) ResourceRequester
		// .invokeGetRequest(PaxSummary[].class, "",
		// "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoibmZyMi5hZG1pbnFhIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvZ2l2ZW5uYW1lIjoiTkZSMi5BRE1JTlFBIE5GUjIuQURNSU5RQSIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IlNEQ1NfQURNSU4iLCJQZXJtaXNzaW9ucyI6IjkwMTQsOTAxOSw5MDIwLDkwMjEsOTAyMiw5MDIzLDkwMjQsOTAyNSw5MDI2LDkwMjcsOTAyOCw5MDI5LDkwMzAsOTAwMCw5MDAxLDkwMDIsOTAwMyw5MDA0LDkwMDUsOTAwNiw5MDA3LDkwMDgsOTAwOSw5MDE3LDkwMTYsOTAxNSw5MDE4LDkwMTMsOTAxMiw5MDExLDkwMTAiLCJhaXJwb3J0cyI6IkRYQiIsImNsaWVudElQIjoiMTAuMS4yNTUuMTAwIiwiZW52IjoiUFJPRFVDVElPTiIsInJlc0NoYW5uZWxJRCI6IjE5IiwiaXNBcHRDbG50IjoiVHJ1ZSIsImNoa0xjbiI6IkFpcnBvcnQiLCJuYmYiOjE1MzE5MTcxMjgsImV4cCI6MTUzMTkyMDEyOCwiaXNzIjoiZmx5ZHViYWkuY29tIiwiYXVkIjoiMTgifQ.j583W3yF7pjVMq5WRlKYeC22lUZCEbRJITNk2Lj0wKQ")
		// .getBody();
		//
		//
		// System.out.println(s[0].getPnrNum());
		// RestTemplate restTemplate = new RestTemplate();
		// HttpHeaders headers = new HttpHeaders();
		// headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		// headers.add("Authorization", "Bearer
		// eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoibmZyMi5hZG1pbnFhIiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvZ2l2ZW5uYW1lIjoiTkZSMi5BRE1JTlFBIE5GUjIuQURNSU5RQSIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IlNEQ1NfQURNSU4iLCJQZXJtaXNzaW9ucyI6IjkwMTQsOTAxOSw5MDIwLDkwMjEsOTAyMiw5MDIzLDkwMjQsOTAyNSw5MDI2LDkwMjcsOTAyOCw5MDI5LDkwMzAsOTAwMCw5MDAxLDkwMDIsOTAwMyw5MDA0LDkwMDUsOTAwNiw5MDA3LDkwMDgsOTAwOSw5MDE3LDkwMTYsOTAxNSw5MDE4LDkwMTMsOTAxMiw5MDExLDkwMTAiLCJhaXJwb3J0cyI6IkRYQiIsImNsaWVudElQIjoiMTAuMS4yNTUuMTAwIiwiZW52IjoiUFJPRFVDVElPTiIsInJlc0NoYW5uZWxJRCI6IjE5IiwiaXNBcHRDbG50IjoiVHJ1ZSIsImNoa0xjbiI6IkFpcnBvcnQiLCJuYmYiOjE1MzE4MzE4MTgsImV4cCI6MTUzMTgzNDgxOCwiaXNzIjoiZmx5ZHViYWkuY29tIiwiYXVkIjoiMTgifQ.c1heAw0EdUPxC40zPYX1W1TmVemRdpAdNc3sUi7CZ2s");
		// HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		//
		//
		// URI url=new
		// URI("http://qa4sprintcheckin.flydubai.com/api/v1/FZ/paxJourneys/DXB/2018-03-21/551/summary");
		// String result = restTemplate.exchange(url, HttpMethod.GET, entity,
		// String.class).getBody();
		//// restTemplate.getForObject("http://qa4sprintcheckin.flydubai.com/api/v1/FZ/paxJourneys/DXB/2018-03-21/551/summary",
		// String.class);
		// System.out.println(result);

	}

}