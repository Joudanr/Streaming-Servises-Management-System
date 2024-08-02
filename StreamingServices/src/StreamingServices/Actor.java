package StreamingServices;

public final class Actor extends Person {

    // the time that the actor has been worked
    private int actingCareer;

    // Full constructor
    public Actor(int age, String name, int actingCareer) {
        super(age, name);
        setActingCareer(actingCareer);
    }

    public Actor() {
        this(0, "", 0);
    }

    public int getActingCareer() {
        return actingCareer;
    }

    public void setActingCareer(int actingCareer) {
        this.actingCareer = actingCareer;
    }

    @Override
    public String toString() {
        return String.format("%s%nActing career:%d", super.toString(), getActingCareer());
    }

}