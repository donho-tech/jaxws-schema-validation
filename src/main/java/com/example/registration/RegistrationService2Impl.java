package com.example.registration;

import com.sun.xml.ws.developer.SchemaValidation;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

import static java.text.MessageFormat.format;

@Component(value = "registrationService2")
@WebService(endpointInterface = "com.example.registration.RegistrationService2",
        serviceName = "RegistrationService", portName = "RegistrationServicePortV2",
        targetNamespace = "http://registrationservice.example.com/",
        wsdlLocation = "registration.wsdl")
@SchemaValidation
public class RegistrationService2Impl implements RegistrationService2 {

    @Override
    public com.example.registration.v2.RegistrationResponse register2(com.example.registration.v2.Registration
                                                                             reg) {
        com.example.registration.v2.RegistrationResponse response = new com.example.registration
                .v2.RegistrationResponse();
        response.setMessage(format("Registration successful. Registered: {0}, {1}",
                reg.getNachname(), reg.getVorname()));
        return response;
    }
}
