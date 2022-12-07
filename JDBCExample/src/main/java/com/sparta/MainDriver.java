package com.sparta;

import com.sparta.dao.interfaces.DAO;
import com.sparta.dao.mySql.ActorDAO;
import com.sparta.entities.Actor;

import java.util.List;

public class MainDriver {
    public static void main(String[] args) {
        DAO<Actor> actorDAO = ActorDAO.getInstance();
        Actor actorFromDb = actorDAO.findById(100);
        List<Actor> allActors = actorDAO.findAll();
//        System.out.println(actorFromDb);
//        System.out.println(allActors);
        System.out.println(actorDAO.findById(1));

        Actor PenelopeNowPickelasCageUpdate = new Actor(1,"Pickelas" ,"Cage");
        actorDAO.update(PenelopeNowPickelasCageUpdate);
        System.out.println(actorDAO.findById(1));


    }
}
