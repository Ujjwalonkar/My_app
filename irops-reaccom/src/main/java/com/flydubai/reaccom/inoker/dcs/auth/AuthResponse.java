package com.flydubai.reaccom.inoker.dcs.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthResponse {
	
	    private String audience;

	    private String scope;

	    @JsonProperty(".expires")
	    private String _expires;

	    private String rolesandpermission;

	    private String expires_in;

	    private String isAptClnt;

	    @JsonProperty(".issued")
	    private String _issued;

	    private String airports;

	    private String userId;

	    private String token_type;

	    private String refresh_token;

	    private String displayName;

	    private String resChannelID;

	    private String access_token;

	    public String getAudience ()
	    {
	        return audience;
	    }

	    public void setAudience (String audience)
	    {
	        this.audience = audience;
	    }

	    public String getScope ()
	    {
	        return scope;
	    }

	    public void setScope (String scope)
	    {
	        this.scope = scope;
	    }

	  

	    public String getRolesandpermission ()
	    {
	        return rolesandpermission;
	    }

	    public void setRolesandpermission (String rolesandpermission)
	    {
	        this.rolesandpermission = rolesandpermission;
	    }

	    public String getExpires_in ()
	    {
	        return expires_in;
	    }

	    public void setExpires_in (String expires_in)
	    {
	        this.expires_in = expires_in;
	    }

	    public String getIsAptClnt ()
	    {
	        return isAptClnt;
	    }

	    public void setIsAptClnt (String isAptClnt)
	    {
	        this.isAptClnt = isAptClnt;
	    }

	    

	    public String getAirports ()
	    {
	        return airports;
	    }

	    public void setAirports (String airports)
	    {
	        this.airports = airports;
	    }

	    public String getUserId ()
	    {
	        return userId;
	    }

	    public void setUserId (String userId)
	    {
	        this.userId = userId;
	    }

	    public String getToken_type ()
	    {
	        return token_type;
	    }

	    public void setToken_type (String token_type)
	    {
	        this.token_type = token_type;
	    }

	    public String getRefresh_token ()
	    {
	        return refresh_token;
	    }

	    public void setRefresh_token (String refresh_token)
	    {
	        this.refresh_token = refresh_token;
	    }

	    public String getDisplayName ()
	    {
	        return displayName;
	    }

	    public void setDisplayName (String displayName)
	    {
	        this.displayName = displayName;
	    }

	    public String getResChannelID ()
	    {
	        return resChannelID;
	    }

	    public void setResChannelID (String resChannelID)
	    {
	        this.resChannelID = resChannelID;
	    }

	    public String getAccess_token ()
	    {
	        return access_token;
	    }

	    public void setAccess_token (String access_token)
	    {
	        this.access_token = access_token;
	    }

		public String get_expires() {
			return _expires;
		}

		public void set_expires(String _expires) {
			this._expires = _expires;
		}

		public String get_issued() {
			return _issued;
		}

		public void set_issued(String _issued) {
			this._issued = _issued;
		}

		public void getToken()
		{
			
		}
		
		
		@Override
		public String toString() {
			return "AuthResponse [audience=" + audience + ", scope=" + scope
					+ ", _expires=" + _expires + ", rolesandpermission="
					+ rolesandpermission + ", expires_in=" + expires_in
					+ ", isAptClnt=" + isAptClnt + ", _issued=" + _issued
					+ ", airports=" + airports + ", userId=" + userId
					+ ", token_type=" + token_type + ", refresh_token="
					+ refresh_token + ", displayName=" + displayName
					+ ", resChannelID=" + resChannelID + ", access_token="
					+ access_token + "]";
		}

}