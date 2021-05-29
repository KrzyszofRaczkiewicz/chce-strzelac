package com.team7.chcestrzelac.grupa.model;

public class Grupa {

    public static int ID_GENERATOR = 0;
    private int id;
    private String name;
    private String Organizator;

    private String eMailOrganizatora;
    private String telefonOrganizatora;

    private int liczbaOsob;

    public Grupa(){
        this.id = ID_GENERATOR;
        ID_GENERATOR ++;
    }

    public Grupa(String name, String organizator, String eMailOrganizatora, String telefonOrganizatora, int liczbaOsob) {
        this.name = name;
        Organizator = organizator;
        this.eMailOrganizatora = eMailOrganizatora;
        this.telefonOrganizatora = telefonOrganizatora;
        this.liczbaOsob = liczbaOsob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizator() {
        return Organizator;
    }

    public void setOrganizator(String organizator) {
        Organizator = organizator;
    }

    public String geteMailOrganizatora() {
        return eMailOrganizatora;
    }

    public void seteMailOrganizatora(String eMailOrganizatora) {
        this.eMailOrganizatora = eMailOrganizatora;
    }

    public String getTelefonOrganizatora() {
        return telefonOrganizatora;
    }

    public void setTelefonOrganizatora(String telefonOrganizatora) {
        this.telefonOrganizatora = telefonOrganizatora;
    }

    public int getLiczbaOsob() {
        return liczbaOsob;
    }

    public void setLiczbaOsob(int liczbaOsob) {
        this.liczbaOsob = liczbaOsob;
    }
}

