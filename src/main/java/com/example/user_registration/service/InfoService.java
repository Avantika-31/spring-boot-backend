package com.example.user_registration.service;

import com.example.user_registration.Repository.InfoRepo;
import com.example.user_registration.controller.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InfoService {
    @Autowired
    private InfoRepo repo;
    List<Info> list= new ArrayList<>();
     public List<Info>getinfo(){
         return repo.findAll();
     }
     public Info getinfobyId(String id){
    return repo.findById(id).orElse(null);
     }
     public void say(Info info){
      repo.save(info);
     }
     public Info editId(String id,Info info){
      repo.deleteById(id);
       repo.save(info);
         return info;
     }
     public void deleteByID(String id){
          repo.deleteById(id);
     }


}
