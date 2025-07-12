package com.alumini.aluminifinder.services;

import com.alumini.aluminifinder.dto.SearchRequest;
import com.alumini.aluminifinder.model.AlumniProfile;
import com.alumini.aluminifinder.repository.AlumniRepository;
import com.alumini.aluminifinder.util.PhantomBusterClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluminiService {

    @Autowired
    private AlumniRepository alumniRepository;

    @Autowired
    private PhantomBusterClient phantomBusterClient;

    public List<AlumniProfile> searchAndSaveAlumni(SearchRequest request) {
        List<AlumniProfile> results = phantomBusterClient.fetchAlumniProfiles(request);
        return alumniRepository.saveAll(results);
    }

    public List<AlumniProfile> getAllAlumni() {
        return alumniRepository.findAll();
    }
}
