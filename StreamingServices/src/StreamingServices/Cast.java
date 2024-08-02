package StreamingServices;

public final class Cast {

    private String nameOfDirector;
    private Actor[] actors;

    public Cast(String nameOfDirector, Actor[] actors) {
        this.nameOfDirector = nameOfDirector;
        this.actors = actors;
    }

    public Cast() {
        this("", null);
    }

    public String getNameOfDirector() {
        return nameOfDirector;
    }

    public void setNameOfDirector(String nameOfDirector) {
        this.nameOfDirector = nameOfDirector;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    public boolean containsActor(String actorName) {
        for (Actor actor : actors) {
            if (actor.getName().equalsIgnoreCase(actorName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Name Of Director: %s%n", getNameOfDirector());
    }

}