package com.sparta;

import com.sparta.dao.interfaces.DAO;
import com.sparta.dao.mySql.ActorDAO;
import com.sparta.entities.Actor;

import java.sql.SQLException;
import java.util.List;

public class MainDriver {
    public static void main(String[] args) {
        DAO<Actor> actorDAO = null;
        try {
            actorDAO = ActorDAO.getInstance();
//            Actor PenelopeNowPickelasCageUpdate = new Actor(1,"Pickelas" ,"Cage");
//            actorDAO.update(PenelopeNowPickelasCageUpdate);
//            System.out.println(actorDAO.findById(400));
            actorDAO.insert(new Actor(300,"Roger","Clark"));
            System.out.println(actorDAO.findById(300));

            actorDAO.delete(300);
            System.out.println(actorDAO.findAll());

            Actor actorFromDb = actorDAO.findById(100);

            List<Actor> allActors = actorDAO.findAll();

//            System.out.println(actorFromDb);
//            System.out.println(allActors);
//            System.out.println(actorDAO.findById(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }





    }
}
