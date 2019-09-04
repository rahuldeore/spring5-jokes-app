package rahul.springframework.joke.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by Rahul on 2019-09-04
 */
//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
