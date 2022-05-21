package com.example.project;

public class ProgrammingLanguages {
    String programmingName;
    String programmingDescr;
    int programmingJobs;
    int image;
    String company;


    public ProgrammingLanguages(String programmingName, String programmingDescr, int image, String company, int programmingJobs) {
        this.programmingName = programmingName;
        this.programmingDescr = programmingDescr;
        this.image = image;
        this.company = company;
        this.programmingJobs = programmingJobs;
    }

    public String getProgrammingName() {
        return programmingName;
    }

    public void setProgrammingName(String programmingName) {
        this.programmingName = programmingName;
    }

    public String getProgrammingDescr() {
        return programmingDescr;
    }

    public void setProgrammingDescr(String programmingDescr) {
        this.programmingDescr = programmingDescr;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getProgrammingJobs() {
        return programmingJobs;
    }

    public void setProgrammingJobs(int programmingJobs) {
        this.programmingJobs = programmingJobs;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



}
