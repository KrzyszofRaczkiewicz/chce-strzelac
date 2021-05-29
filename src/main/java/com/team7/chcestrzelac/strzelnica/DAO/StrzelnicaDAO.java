package com.team7.chcestrzelac.strzelnica.DAO;

import com.team7.chcestrzelac.strzelnica.model.Strzelnica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class StrzelnicaDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertStrzenica(Strzelnica strzelnica) {

        String godziny = String.join("-",strzelnica.getGodzinyStart(),strzelnica.getGodzinyStop());
        String dostępneDni = Arrays.toString(strzelnica.getDostępneDni());

        if(strzelnica.getName().isBlank() || strzelnica.getEmail().isBlank() || strzelnica.getTelefon().isBlank()){
            System.out.println("BRAK PODANIA PODSTAWOWYCH DANYCH - STRZELNICA NIE ZOSTAŁA ZREJESTROWANA");
        } else {
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

    public List<Strzelnica> getAllStrzelnicas() {

        String selectSQL = "SELECT * FROM strzelnice";

        List<Strzelnica> strzelnice = jdbcTemplate.query(selectSQL, (rs, rowNum) ->{
            Strzelnica strzelnica = new Strzelnica();
            strzelnica.setId(rs.getInt("id"));
            strzelnica.setName(rs.getString("name"));
            strzelnica.setDescription(rs.getString("description"));
            strzelnica.setUrl(rs.getString("url"));
            strzelnica.setEmail(rs.getString("email"));
            strzelnica.setTelefon(rs.getString("telefon"));
            strzelnica.setIloscStanowisk(rs.getInt("iloscStanowisk"));
            strzelnica.setDlugoscOsiMin(rs.getInt("dlugoscOsiMin"));
            strzelnica.setDlugoscOsiMax(rs.getInt("dlugoscOsiMax"));

            String dostepneGodzinyString = rs.getString("godzinyOtwarcia");
            String[] dostepneGodziny = dostepneGodzinyString.split("-");
            strzelnica.setGodzinyStart(dostepneGodziny[0]);
            strzelnica.setGodzinyStop(dostepneGodziny[1]);

            String dostepneDniString = rs.getString("dostępneDni");
            String[] dostępneDni = dostepneDniString.split(" ");
            strzelnica.setDostępneDni(dostępneDni);

            return strzelnica;
        });
        return strzelnice;
    }

}
