import java.util.ArrayList;

/**
 * Created by admin on 4/19/16.
 */
public class User {
    String name;
    ArrayList<Game> games = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }
}
