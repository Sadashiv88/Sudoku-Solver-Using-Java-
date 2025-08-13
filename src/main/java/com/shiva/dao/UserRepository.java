package com.shiva.dao;
import com.shiva.entites.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    public List<User> findByName(String name);

    public List<User> findByNameAndCity(String name,String city);

    public List<User> findByCity(String city);
    @Query("select u FROM User u")
    public List<User> getAllUser();
    @Query("select u FROM User u WHERE u.name=:n")
    public List<User> getUserByName(@Param("n") String name);

    @Query(value="select * from user",nativeQuery = true)
    public List<User> getUsers();
}
