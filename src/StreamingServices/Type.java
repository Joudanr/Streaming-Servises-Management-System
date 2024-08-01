package StreamingServices;

public abstract class Type {

    private String title;
    private String category;
    private Cast cast;
    private static int count;

    public Type(String title, String category, Cast cast) {
        this.title = title;
        this.category = category;
        this.cast = cast;
        count++;
    }

    public Type(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public Type() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Cast getCast() {
        return cast;
    }

    public void setCast(Cast cast) {
        this.cast = cast;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("Title: %s%nCategory: %s%n", getTitle(), getCategory());
    }

    public abstract String categoryType();

}