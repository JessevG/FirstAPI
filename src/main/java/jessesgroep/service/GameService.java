package jessesgroep.service;


import jessesgroep.model.Game;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GameService {

    List<Game> games;

    public GameService() {

        this.games = Arrays.asList(
                new Game(1, "Mount & Blade II: Bannerlord", false, 4499),
                new Game(2, "Boneworks", true, 2499),
                new Game(3, "Half-Life: Alyx", true, 4999),
                new Game(4, "World of Warcraft", false, 1499)
        );
    }
    public List<Game> getAllGames(){return games;}
}
