package com.team7.chcestrzelac.strzelnica.DAO;

import com.team7.chcestrzelac.strzelnica.model.Strzelnica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class StrzelnicaDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertStrzenica(Strzelnica strzelnica) {

        String godziny = strzelnica.getGodzinyStart() + " - " + strzelnica.getGodzinyStop();
        String dostępneDni = Arrays.toString(strzelnica.getDostępneDni());

        jdbcTemplate.update("INSERT INTO strzelnice VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
                ,null
                ,strzelnica.getName()
                ,strzelnica.getDescription()
                ,strzelnica.getUrl()
                ,strzelnica.getEmail()
                ,strzelnica.getTelefon()
                ,strzelnica.getIloscStanowisk()
                ,strzelnica.getDlugoscOsiMin()
                ,strzelnica.getDlugoscOsiMax()
                ,godziny
                ,dostępneDni);
    }
}
