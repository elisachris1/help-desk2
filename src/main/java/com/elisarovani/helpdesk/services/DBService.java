package com.elisarovani.helpdesk.services;
import com.elisarovani.helpdesk.domain.Call;
import com.elisarovani.helpdesk.domain.Client;
import com.elisarovani.helpdesk.domain.Technician;
import com.elisarovani.helpdesk.domain.enums.Priority;
import com.elisarovani.helpdesk.domain.enums.Profile;
import com.elisarovani.helpdesk.domain.enums.Status;
import com.elisarovani.helpdesk.repositories.CallRepository;
import com.elisarovani.helpdesk.repositories.ClientRepository;
import com.elisarovani.helpdesk.repositories.PersonRepository;
import com.elisarovani.helpdesk.repositories.TechnicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.awt.image.BandCombineOp;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TechnicianRepository technicianRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CallRepository callRepository;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public void instanceDB(){


    }
}
