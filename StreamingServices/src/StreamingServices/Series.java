package StreamingServices;

public final class Series extends Type {

    private int seasons;
    private int numberOfEpisodes;

    public Series(String title, String category, Cast cast, int seasons, int numberOfEpisodes) {
        super(title, category, cast);
        setSeasons(seasons);
        setNumberOfEpisodes(numberOfEpisodes);
    }

    public Series(String title, String category) {
        super(title, category);
    }

    public Series() {
        this("", "", null, 0, 0);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public String toString() {
        return String.format("%sSeasons: %d%nEpisodes: %d%n", super.toString(), seasons, numberOfEpisodes);
    }

    @Override
    public String categoryType() {

        return super.getCategory();
    }

    public String disseries() {
        return String.format("Title: %s%nCategory: %s%n", getTitle(), getCategory());
    }
}