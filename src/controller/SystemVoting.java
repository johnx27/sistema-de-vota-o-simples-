package controller;

import java.util.Map;
import java.util.Scanner;

public class SystemVoting extends RegisterCandidates {
    Scanner scanner;
    int voting;

    public void OptionUser(){
        voting=0;
        this.scanner=new Scanner(System.in);
        System.out.println("escolha o numero do candidato:");
        int optionuser= scanner.nextInt();

        for (Map.Entry<String,Integer> entry:getListCandidates().entrySet()){
            if (entry.getValue()==optionuser){
                voting=voting+1;
                System.out.println("Name:"+entry.getKey()+" | Titles:"+entry.getValue()+"| votings:"+voting);
            }


        }
    }

}
