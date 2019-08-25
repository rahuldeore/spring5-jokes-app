package rahul.springframework.joke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rahul.springframework.joke.service.JokeService;

/**
 * Created by Rahul on 2019-08-25
 */
@Controller
public class JokeControllerImplementation implements JokeController{

    private JokeService jokeService;

    public JokeControllerImplementation(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @Override
    @RequestMapping(path = {"", "/"})
    public String getRandomJoke(Model model) {
        String chuckJoke = jokeService.getJoke();
        model.addAttribute("chuckJoke1",chuckJoke);
        return "chuckJoke";
    }
}
