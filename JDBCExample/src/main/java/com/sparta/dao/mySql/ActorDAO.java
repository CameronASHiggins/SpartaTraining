package com.sparta.dao.mySql;

import com.sparta.dao.interfaces.DAO;
import com.sparta.entities.Actor;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ActorDAO implements DAO<Actor>, AutoCloseable{
    // going to use a nested-like singleton pattern for out connection
    // we want to re-use this and not have to create a new connection for every method we call

    private static Connection conn = null;
    private ActorDAO(){}
    private static ActorDAO theInstance = null;

    private static PreparedStatement findByIdPS = null;
    private static PreparedStatement deleteByIdPS = null;
    private static PreparedStatement insertActorPS = null;

    private static PreparedStatement updateActorPS = null;
    public static ActorDAO getInstance() throws SQLException{
        if(theInstance == null){
            theInstance = new ActorDAO();
        }
        if(conn == null){
            Properties props = new Properties();
            try {
                props.load(new FileReader("dbconnect.properties"));
                conn = DriverManager.getConnection(props.getProperty("url"),props.getProperty("user") ,props.getProperty("pass"));
            } catch (IOException | SQLException e) {
                throw new RuntimeException(e);
            }
        }

        //init prepared statment
        if(findByIdPS == null){
            try {
                findByIdPS = conn.prepareStatement("SELECT * FROM actor WHERE actor_id = ?");
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
        if(deleteByIdPS == null){
            try {
                deleteByIdPS = conn.prepareStatement("DELETE FROM actor WHERE actor_id = ?");
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
        if(insertActorPS == null){
            try {
                insertActorPS = conn.prepareStatement("INSERT INTO actor (actor_id, first_name, last_name) VALUES (?,?,?)");
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
        if(updateActorPS == null){
            try {
                updateActorPS = conn.prepareStatement("UPDATE actor SET first_name = ?,last_name = ? WHERE actor_id = ?");
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
        return theInstance;
    }

    /**
     * @param id - The id of the actor you wish to find.
     *           This code will update the prepared statement, findByIdPS, outlined above
     *           and create a result set from this statement. It should only be 1 entry long.
     * @return an Actor object.
     */
    @Override
    public Actor findById(int id) {
        Actor result = null;

        try {
            findByIdPS.setInt(1,id);
            ResultSet rs = findByIdPS.executeQuery();
            while(rs.next()) {
                result = new Actor(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public int insert(Actor newRow) {
        int result = 0;
        int id = newRow.getId();
        String firstName = newRow.getFirstName();
        String lastName = newRow.getLastName();
        try {
            insertActorPS.setInt(1,id);
            insertActorPS.setString(2,firstName);
            insertActorPS.setString(3,lastName);

            result = insertActorPS.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("You are trying to insert an actor with a duplicate actor_id.\nIf you want to change this actor's details, use the update method");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void delete(int id) {
        try {
            deleteByIdPS.setInt(1,id);
            deleteByIdPS.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Actor update) {
        int id = update.getId();
        String firstName = update.getFirstName();
        String lastName = update.getLastName();
        try {
            updateActorPS.setInt(3,id);
            updateActorPS.setString(1,firstName);
            updateActorPS.setString(2,lastName);

            updateActorPS.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Actor> findAll() {
        List<Actor> actorList = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM actor");
            while(rs.next()) {
                actorList.add(new Actor(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return actorList;
    }

    @Override
    public void close() throws SQLException {
        conn.close();
    }
}
