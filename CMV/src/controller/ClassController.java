package controller;

import model.Classes;

import java.util.ArrayList;
import java.util.List;

public class ClassController {
    private String name;
    public List<Classes> classesList = new ArrayList<>();

    public ClassController(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    public ClassController(String name, List<Classes> classesList) {
        this.name = name;
        this.classesList = classesList;
    }

    public Classes findByCode(String name){
        for(Classes c: classesList){
            if (c.getCode().equals(name))
                return c;
        }
        return null;
    }
}
