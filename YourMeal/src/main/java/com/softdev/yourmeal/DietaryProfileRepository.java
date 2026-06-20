package com.softdev.yourmeal;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DietaryProfileRepository extends JpaRepository<DietaryProfile, Long> {

    Optional<DietaryProfile> findByUser(AppUser user);
}
