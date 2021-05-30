package com.team7.chcestrzelac.strzelnica.model;

public class Strzelnica {

    public static int ID_GENERATOR = 0;
    private int id;
    private String name;
    private String description;
    private String url;

    private String email;
    private String telefon;

    private int iloscStanowisk;
    private int dlugoscOsiMin;
    private int dlugoscOsiMax;
    private String godzinyStart;
    private String godzinyStop;
    private String[] dostępneDni;

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Strzelnica() {
        this.id = ID_GENERATOR;
        ID_GENERATOR++;
    }

    public Strzelnica(String name, String description, String url, String email, String telefon, int iloscStanowisk, int dlugoscOsiMin, int dlugoscOsiMax, String godzinyStart, String godzinyStop, String[] dostępneDni, int status) {
        this.id = ID_GENERATOR;
        ID_GENERATOR++;
        this.name = name;
        this.description = description;
        this.url = url;
        this.email = email;
        this.telefon = telefon;
        this.iloscStanowisk = iloscStanowisk;
        this.dlugoscOsiMin = dlugoscOsiMin;
        this.dlugoscOsiMax = dlugoscOsiMax;
        this.godzinyStart = godzinyStart;
        this.godzinyStop = godzinyStop;
        this.dostępneDni = dostępneDni;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getIloscStanowisk() {
        return iloscStanowisk;
    }

    public void setIloscStanowisk(int iloscStanowisk) {
        this.iloscStanowisk = iloscStanowisk;
    }

    public int getDlugoscOsiMin() {
        return dlugoscOsiMin;
    }

    public void setDlugoscOsiMin(int dlugoscOsiMin) {
        this.dlugoscOsiMin = dlugoscOsiMin;
    }

    public int getDlugoscOsiMax() {
        return dlugoscOsiMax;
    }

    public void setDlugoscOsiMax(int dlugoscOsiMax) {
        this.dlugoscOsiMax = dlugoscOsiMax;
    }

    public String getGodzinyStart() {
        return godzinyStart;
    }

    public void setGodzinyStart(String godzinyStart) {
        this.godzinyStart = godzinyStart;
    }

    public String getGodzinyStop() {
        return godzinyStop;
    }

    public void setGodzinyStop(String godzinyStop) {
        this.godzinyStop = godzinyStop;
    }

    public String[] getDostępneDni() {
        return dostępneDni;
    }

    public void setDostępneDni(String[] dostępneDni) {
        this.dostępneDni = dostępneDni;

    }
}
