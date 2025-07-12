package com.alumini.aluminifinder.util;

import com.alumini.aluminifinder.dto.SearchRequest;
import com.alumini.aluminifinder.model.AlumniProfile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PhantomBusterClient {

    public List<AlumniProfile> fetchAlumniProfiles(SearchRequest request) {
        List<AlumniProfile> list = new ArrayList<>();

        AlumniProfile john = new AlumniProfile();
        john.setName("John Doe");
        john.setCurrentRole(request.getDesignation());
        john.setUniversity(request.getUniversity());
        john.setLocation("New York, NY");
        john.setLinkedinHeadline("Engineer @ Google");
        john.setPassoutYear(request.getPassoutYear() != null ? request.getPassoutYear() : 2020);

        AlumniProfile jane = new AlumniProfile();
        jane.setName("Jane Smith");
        jane.setCurrentRole(request.getDesignation());
        jane.setUniversity(request.getUniversity());
        jane.setLocation("San Francisco, CA");
        jane.setLinkedinHeadline("Data Scientist | AI Enthusiast");
        jane.setPassoutYear(request.getPassoutYear() != null ? request.getPassoutYear() : 2019);

        list.add(john);
        list.add(jane);
        return list;
    }
}
