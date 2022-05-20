package com.example.project;

public class ProgrammingLanguages {
    String programmingName;
    String programmingDescr;
    int image;


    public ProgrammingLanguages(String programmingName, String programmingDescr, int image) {
        this.programmingName = programmingName;
        this.programmingDescr = programmingDescr;
        this.image = image;
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
}
