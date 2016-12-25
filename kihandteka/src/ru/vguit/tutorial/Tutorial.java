/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial;

import ru.vguit.tutorial.db.DBDerby;
import ru.vguit.tutorial.persistens.Client;
import ru.vguit.tutorial.persistens.Drugs;
import ru.vguit.tutorial.persistens.Employee;
import ru.vguit.tutorial.persistens.Provider;

/**
 * Главный класс программы, представляет собой точку входа в программу
 *
 * @author a.pleshkanev
 */
public class Tutorial {

    
    public static void main(String[] args) {
        
        Client newclient=new Client("Gamzatova","Yana","1234","8800353535","Voronezh","W");
        DBDerby dbclient = new DBDerby();
        dbclient.addClient(newclient);
       // Client clientqwerty=(Client)dbclient.find(1L);
        
        Drugs drug=new Drugs("valerianka",1,1,1,"sad",100,300);
        DBDerby dbdrug = new DBDerby();
        dbdrug.addDrugs(drug);
       // Itemsatstore itemqwe=(Itemsatstore)dbitem.find(1L);
        
        Employee employ=new Employee("Gamzatova","Yana","1234","Farmacevt","11111","121212","Voronezh",40000);
        DBDerby dbemploy = new DBDerby();
        dbemploy.addEmployee(employ);
       // Order_items orderqwe=(Order_items)dborder.find(1L);
        
        Provider provider =new Provider("sfds","zff","zsdds","zsdfs","zf2f");
        DBDerby dbprovider = new DBDerby();
        dbprovider.addProvider(provider);
       // Provider providerrqwe=(Provider)dbprovider.find(1L);
        
    }

}
