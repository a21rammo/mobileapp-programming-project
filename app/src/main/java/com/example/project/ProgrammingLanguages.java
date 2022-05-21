package com.example.project;

public class ProgrammingLanguages {
    String name;
    String company;
    String location;
    int size;
    String auxdata;

    public ProgrammingLanguages(String name, String company, String location, int size, String auxdata) {
        this.name = name;
        this.company = company;
        this.location = location;
        this.size = size;
        this.auxdata = auxdata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAuxdata() {
        return auxdata;
    }

    public void setAuxdata(String auxdata) {
        this.auxdata = auxdata;
    }
}
