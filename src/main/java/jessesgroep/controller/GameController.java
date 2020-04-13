package jessesgroep.controller;

import jessesgroep.model.Game;
import jessesgroep.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("games")
public class GameController {

    @Autowired
    private GameService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllGames() {
        List<Game> games = service.getAllGames();
        return ResponseEntity.status(200).body(games);
    }
}
