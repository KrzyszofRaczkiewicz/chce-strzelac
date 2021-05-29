package com.team7.chcestrzelac.grupa.DAO;

import com.team7.chcestrzelac.grupa.model.Grupa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GrupaDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void insertGroup(Grupa grupa) {

        if (grupa.getName().isBlank()) {
            System.out.println("Grupa nie została utworzona");
        } else {
            jdbcTemplate.update("INSERT INTO grupy VALUES (?, ?, ?, ?, ?, ?)"
                    , null
                    , grupa.getName()
                    , grupa.getOrganizator()
                    , grupa.geteMailOrganizatora()
                    , grupa.getTelefonOrganizatora()
                    , grupa.getLiczbaOsob());
        }


    }

    public List<Grupa> getAllGroups() {
        String selectSQL = "SELECT * FROM grupy";
        List<Grupa> grupy = jdbcTemplate.query(selectSQL, (rs, rowNum) -> {
            Grupa grupa = new Grupa();
            grupa.setId(rs.getInt("id"));
            grupa.setName(rs.getString("name"));
            grupa.setOrganizator(rs.getString("organizator"));
            grupa.seteMailOrganizatora(rs.getString("eMailOrganizatora"));
            grupa.setTelefonOrganizatora(rs.getString("telefonOrganizatora"));
            grupa.setLiczbaOsob(rs.getInt("liczbaOsob"));

            return grupa;


        });
        return grupy;
    }
}





