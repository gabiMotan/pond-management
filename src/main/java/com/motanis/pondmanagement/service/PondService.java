package com.motanis.pondmanagement.service;

import com.motanis.pondmanagement.model.Pond;
import com.motanis.pondmanagement.repository.PondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PondService {

@Autowired
    public PondRepository repo;

    public List<Pond> listAll(){
        return repo.findAll();
    }
    public void save (Pond pond){
      repo.save (pond);
    }
    public Pond get(Integer id){
        return repo.findById(id).get();
    }
    private void delete(Integer id){
        repo.deleteById(id);
    }

}
