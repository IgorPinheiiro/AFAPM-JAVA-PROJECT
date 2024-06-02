package com.example.AFAPM.model;

public class Redirect {
    
    private final long id;
    private String name;

    public Redirect(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setid(long id) {
        id = id;
    }

    public void setname(String name) {
        name = name;
    }

    public long getid () {
        return id;
    }

    public String getname() {
        return name;
    }

    

    
}
