package com.example.player;



public class Player {
    private Integer playerId;
    private String name;
    private Integer jerseyNumber;
    private String role;

    public Player(Integer playerId, String name, Integer jerseyNumber, String role) {
        this.playerId = playerId;
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
        
    }


    public Integer getplayerId() {
        return this.playerId;
    }

    public void setplayerId(Integer updatedPalyerId) {
        this.playerId = updatedPalyerId;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String updatedName) {
        this.name = updatedName;
    }

    public Integer getJerseyNumber() {
        return this.jerseyNumber;
    }

    public void setJerseyNumber(Integer updatedJerseyNumber) {
        this.jerseyNumber = updatedJerseyNumber;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String updatedRole) {
        this.role = updatedRole;
    }

}