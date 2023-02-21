package com.example.rv4;

public class Contact {
    private String cName;
    private String cNumber;
    private int cPhoto;

    public Contact(String cName, String cNumber, int cPhoto) {
        this.cName = cName;
        this.cNumber = cNumber;
        this.cPhoto = cPhoto;
    }

    public String getcName() {
        return cName;
    }

    public String getcNumber() {
        return cNumber;
    }

    public int getcPhoto() {
        return cPhoto;
    }
}
