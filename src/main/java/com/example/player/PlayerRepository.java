package com.example.player;

import java.util.*;
import com.example.player.Player;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();
    Player getPlayerbyId(int playerId);

    Player addPlayer(Player player);

    Player updatePlayer(int playerId, Player player);

    void deletePlayer(Integer playerId);
}
