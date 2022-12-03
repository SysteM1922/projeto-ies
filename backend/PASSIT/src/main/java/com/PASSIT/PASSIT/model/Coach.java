package com.PASSIT.PASSIT.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Coach")
public class Coach extends User {

    private String team;
    private ArrayList<Integer> teamPlayers;

    public Coach() {
        super();
    }

    public Coach(long id, String name, String username, String password, String email, String role, String team) {
        super(id, name, username, password, email, role);
        this.team = team;
        this.teamPlayers = new ArrayList<Integer>();
    }

    public Coach(String name, String username, String password, String email, String role, String team) {
        super(name, username, password, email, role);
        this.team = team;
        this.teamPlayers = new ArrayList<Integer>();
    }

    public String getTeam() {
        return team;
    }

    public ArrayList<Integer> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setTeamPlayers(ArrayList<Integer> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    public void addTeamPlayer(Integer id_player) {
        this.teamPlayers.add(id_player);
    }

    public void removeTeamPlayer(Integer id_player) {
        this.teamPlayers.remove(id_player);
    }

    @Override
    public String toString() {
        return "Coach{" +
                "id=" + super.getId() +
                ", name=" + super.getName() +
                ", username=" + super.getUsername() +
                ", email=" + super.getEmail() +
                ", team=" + team +
                ", teamPlayers=" + teamPlayers +
                "}";
    }
}
