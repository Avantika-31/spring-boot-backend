package com.example.user_registration.Repository;

import com.example.user_registration.controller.Info;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepo extends MongoRepository<Info,String> {

}
