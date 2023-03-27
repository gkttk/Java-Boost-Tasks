package com.gkttk.tasks.task42;


import java.io.FileNotFoundException;
import java.io.FileReader;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {

        JAXBContext context = JAXBContext.newInstance(Individual.class);
        Individual unmarshal = (Individual) context.createUnmarshaller().unmarshal(new FileReader(
                "C:\\Users\\Kirill_Sviridov\\Desktop\\Learning\\Java\\Java Boost\\tasks\\src\\main\\java\\com\\gkttk\\tasks\\task42\\person2.xml"));
        System.out.println(unmarshal);

    }

}
