package com.sebastianczech.adapter;

public class AuthenicationServiceBeta implements AuthenicationService {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean authenticate(String param) {
        return token != null && token.length() > 0;
    }

}
