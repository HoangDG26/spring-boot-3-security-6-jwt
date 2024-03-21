package com.orijon.security.service;

import com.orijon.security.payload.request.AuthenticationRequest;
import com.orijon.security.payload.request.RegisterRequest;
import com.orijon.security.payload.response.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
}
