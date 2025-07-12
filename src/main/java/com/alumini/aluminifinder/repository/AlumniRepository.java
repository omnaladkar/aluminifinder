package com.alumini.aluminifinder.repository;

import com.alumini.aluminifinder.model.AlumniProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumniRepository extends JpaRepository<AlumniProfile, Long> {
}
