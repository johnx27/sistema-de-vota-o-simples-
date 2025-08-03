package controller;

import interfaces.InterfaceRegister;

import java.util.HashMap;
import java.util.Map;

public class RegisterCandidates implements InterfaceRegister {
    private String name;
    private int numberTitles;
    private Map<String, Integer> ListCandidates;

    public RegisterCandidates() {
        this.ListCandidates =new HashMap<String,Integer>();
    }

    @Override
    public void register(String name, int numberTitles) {
        this.name=name;
        this.numberTitles=numberTitles;
        ListCandidates.put(name,numberTitles);
    } @Override
    public void display() {
        for (Map.Entry<String,Integer> entry:ListCandidates.entrySet()){
            System.out.println("Name:"+entry.getKey()+" | Titles:"+entry.getValue());
        }

    }

    public Map<String, Integer> getListCandidates() {
        return ListCandidates;
    }
}
