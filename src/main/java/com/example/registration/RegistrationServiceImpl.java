package com.example.registration;

import com.sun.xml.ws.developer.SchemaValidation;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import javax.servlet.Registration;

@Component(value = "registrationService")
@WebService(endpointInterface = "com.example.registration.RegistrationService",
        serviceName = "RegistrationService", portName = "RegistrationServicePort",
        targetNamespace = "http://registrationservice.example.com/",
        wsdlLocation = "registration.wsdl")
@SchemaValidation
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public RegistrationResponse register(com.example.registration.Registration parameters) {
        RegistrationResponse registrationResponse = new RegistrationResponse();
        registrationResponse.setMessage("Registration successful.");
        return registrationResponse;
    }
}
