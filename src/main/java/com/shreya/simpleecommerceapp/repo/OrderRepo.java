package com.shreya.simpleecommerceapp.repo;

import com.shreya.simpleecommerceapp.entity.Order;
import com.shreya.simpleecommerceapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

    public List<Order> findByUser(User user);

}
