package com.alumini.aluminifinder.controllers;

import com.alumini.aluminifinder.dto.SearchRequest;
import com.alumini.aluminifinder.model.AlumniProfile;
import com.alumini.aluminifinder.services.AluminiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/alumni")
public class AlumniController {

    @Autowired
    private AluminiService aluminiService;

    @PostMapping("/search")
    public ResponseEntity<Map<String, Object>> searchAlumni(@RequestBody SearchRequest request) {
        List<AlumniProfile> results = aluminiService.searchAndSaveAlumni(request);
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("data", results);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/all")
    public ResponseEntity<Map<String, Object>> getAllAlumni() {
        List<AlumniProfile> all = aluminiService.getAllAlumni();
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("data", all);
        return ResponseEntity.ok(response);
    }
}
