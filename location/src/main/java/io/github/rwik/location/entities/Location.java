package io.github.rwik.location.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    private int id;
    private string code;
    private string name;
    private string type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getCode() {
        return code;
    }

    public void setCode(string code) {
        this.code = code;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getType() {
        return type;
    }

    public void setType(string type) {
        this.type = type;
    }



}