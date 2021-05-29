package com.team7.chcestrzelac.strzelnica.services;

import com.team7.chcestrzelac.strzelnica.DAO.StrzelnicaDAO;
import com.team7.chcestrzelac.strzelnica.model.Strzelnica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrzelnicaService {

    @Autowired
    StrzelnicaDAO StrzelnicaDAO;

    public List<Strzelnica> getAllStrzelnicas() {
        List<Strzelnica> strzelnice = StrzelnicaDAO.getAllStrzelnicas();
        if(strzelnice == null){
            System.out.println("NIESTETY NIE ZAREJESTROWANO ŻADNYCH STRZELNIC");
        }
            return strzelnice;

    }
    public void insertNewStrzelnica(Strzelnica strzelnica) {
        StrzelnicaDAO.insertStrzenica(strzelnica);
    }
}
