package com.team7.chcestrzelac.strzelnica.services;

import com.team7.chcestrzelac.strzelnica.DAO.StrzelnicaDAO;
import com.team7.chcestrzelac.strzelnica.model.Strzelnica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrzelnicaService {

    @Autowired
    StrzelnicaDAO StrzelnicaDAO;

    public void insertNewStrzelnica(Strzelnica strzelnica) {
        StrzelnicaDAO.insertStrzenica(strzelnica);
    }
}
