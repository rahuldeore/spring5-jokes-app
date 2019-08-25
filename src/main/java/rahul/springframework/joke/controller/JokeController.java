package rahul.springframework.joke.controller;

import org.springframework.ui.Model;

/**
 * Created by Rahul on 2019-08-25
 */
public interface JokeController {

    String getRandomJoke(Model model);

}
