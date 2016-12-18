package com.wolfgang;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class TheDarkKnight extends Movie {
    public TheDarkKnight() {
        super("The Dark Knight");
    }

    @Override
    public String plot() {
        return "A man in a bat suit faces off againt a man in a clown suit";
    }
}

class TheMatrix extends Movie {
    public TheMatrix() {
        super("The Matrix");
    }

    @Override
    public String plot() {
        return "A computer hack is reborn to fend off machines";
    }
}

class ToyStory extends Movie {
    public ToyStory() {
        super("Toy Story");
    }

    @Override
    public String plot() {
        return "Toys have the same problems humans do";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    // No plot method
    // will check the Movie class for this method
}



public class Main {

    // movie.plot() is doing a lot of work here polymorphically
    // java looks at object called movie that was returned from random movie method
    // it checks for a plot method and executes the method found in the child class first
    // assigning different functionality depending on the type of object that is created

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i
                + ": " + movie.getName() + "\n" +
                "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {

        // must be casted because number returned is of type double
        // returns a random number between 1 and 0
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);


        // do not need break statements here because we are returning on one line
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new TheDarkKnight();

            case 3:
                return new TheMatrix();

            case 4:
                return new ToyStory();

            case 5:
                return new Forgettable();
        }

        return null;
    }
}
