package com.shreya.simpleecommerceapp.repo;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shreya.simpleecommerceapp.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {

    public Admin findByEmail(String email);

    @Transactional
    @Query(value = "SELECT setval(pg_get_serial_sequence('admins', 'id'), (SELECT MAX(id) FROM admins))", nativeQuery = true)
    void resetAdminSequence();

}
