/*
 
* You can use the following import statements
 
 * import org.springframework.web.server.ResponseStatusException;
 * import org.springframework.http.HttpStatus;
 
 */

package com.example.player;

import com.example.player.Player;
import com.example.player.PlayerRepository;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.*;

import javax.validation.OverridesAttribute;

// Don't modify the below code

public class PlayerService implements PlayerRepository {

    private static HashMap<Integer, Player> team = new HashMap<>();
    Integer uniqueId = 12;
    public PlayerService() {
        team.put(1, new Player(1, "Alexander", 5, "All-rounder"));
        team.put(2, new Player(2, "Benjamin", 3, "All-rounder"));
        team.put(3, new Player(3, "Michael", 18, "Batsman"));
        team.put(4, new Player(4, "William", 45, "Batsman"));
        team.put(5, new Player(5, "Joshua", 19, "Batsman"));
        team.put(6, new Player(6, "Daniel", 10, "Bowler"));
        team.put(7, new Player(7, "Matthew", 34, "Bowler"));
        team.put(8, new Player(8, "Samuel", 17, "Batsman"));
        team.put(9, new Player(9, "John", 1, "Bowler"));
        team.put(10, new Player(10, "Earnest", 2, "All-rounder"));
        team.put(11, new Player(11, "Bob", 25, "Batsman"));
    }

    // Don't modify the above code
    @Override 
    
    public ArrayList<Player> getPlayers() {
        Collection<Player> teamCollection = team.values();
        ArrayList<Player> players = new ArrayList<>(teamCollection);

        return players;
    }

    @Override 

    public Player getPlayerbyId(int playerId) {
        Player existingPlayer = team.get(playerId);
        if(existingPlayer == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return existingPlayer;
        }
        
    }

    @Override 
    public Player addPlayer(Player player) {
        player.setplayerId(uniqueId);
        team.put(uniqueId, player);

        uniqueId += 1;
        return player;
    }

    @Override 

    public Player updatePlayer(int playerId, Player player) {
        Player existingPlayer = team.get(playerId);
        if(existingPlayer == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        if(player.getName() != null) {
            existingPlayer.setName(player.getName());
        }

        if(player.getplayerId() != null) {
            existingPlayer.setplayerId(player.getplayerId());
        }

        if(player.getJerseyNumber() != null) {
            existingPlayer.setJerseyNumber(player.getJerseyNumber());
        }

        if(player.getRole() != null) {
            existingPlayer.setRole(player.getRole());
        }

        return existingPlayer;
    }

    @Override 
    public void deletePlayer(Integer playerId) {
        if(team.get(playerId) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            team.remove(playerId);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }
}
