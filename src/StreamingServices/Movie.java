package StreamingServices;

public final class Movie extends Type {

    private int duration;

    public Movie(String title, String category, Cast cast, int duration) {
        super(title, category, cast);
        this.duration = duration;

    }

    public Movie() {
        this("", "", null, 0);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format("%sMovie Duration: %d%n", super.toString(), duration);
    }

    @Override
    public String categoryType() {
        return getCategory();
    }
}