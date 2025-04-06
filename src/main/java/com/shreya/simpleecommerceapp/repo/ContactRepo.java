package com.shreya.simpleecommerceapp.repo;

import com.shreya.simpleecommerceapp.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Message, Long> {

}
