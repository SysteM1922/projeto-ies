package com.PASSIT.PASSIT.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player extends User {
    private String position;
    private String team;
    private int age;
    private int height;
    private int weight;
    private int number;

    public Player() {
        super();
    }

    public Player(long id, String name, String username, String password, String email, String role, String position,
            String team, int age, int height, int weight, int number) {
        super(id, name, username, password, email, role);
        this.position = position;
        this.team = team;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    public Player(String name, String username, String password, String email, String role, String position,
            String team, int age, int height, int weight, int number) {
        super(name, username, password, email, role);
        this.position = position;
        this.team = team;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumber() {
        return number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", number=" + number +
                ", team='" + team + '\'' +
                '}';
    }
}
