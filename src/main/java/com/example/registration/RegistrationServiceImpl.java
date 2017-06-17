package com.example.registration;

import com.sun.xml.ws.developer.SchemaValidation;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

import static java.text.MessageFormat.format;

@Component(value = "registrationService")
@WebService(endpointInterface = "com.example.registration.RegistrationService",
        serviceName = "RegistrationService", portName = "RegistrationServicePort",
        targetNamespace = "http://registrationservice.example.com/",
        wsdlLocation = "registration.wsdl")
@SchemaValidation
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public RegistrationResponse register(Registration reg) {
        RegistrationResponse response = new RegistrationResponse();
        response.setMessage(format("Registration successful. Registered: {0}, {1}",
                reg.getLastName(), reg.getFirstName()));
        return response;
    }
}
