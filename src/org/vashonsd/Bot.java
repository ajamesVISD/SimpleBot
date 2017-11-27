package org.vashonsd;

/**
 * Created by andy on 11/17/17.
 */
public class Bot {

    private String name;

    public Bot() {
        name = "default Bot";
    }

    public Bot(String name) {
        this.name = name;
    }

    public String getName() {
        return "Ms. " + name;
    }
}
