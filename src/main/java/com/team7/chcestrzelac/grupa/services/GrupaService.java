package com.team7.chcestrzelac.grupa.services;

import com.team7.chcestrzelac.grupa.DAO.GrupaDAO;
import com.team7.chcestrzelac.grupa.model.Grupa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupaService {

    @Autowired
    GrupaDAO GrupaDAO;

    public List<Grupa> getAllGroups(){
        List<Grupa> grupy = GrupaDAO.getAllGroups();
        if(grupy == null){
            System.out.println("Brak zarejestrowanych grup");
        }
        return grupy;

    }
    public void insertNewGroup(Grupa grupa) {GrupaDAO.insertGroup(grupa);
    }


}
