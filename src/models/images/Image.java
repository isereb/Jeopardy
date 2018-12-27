package models.images;

public class Image {

    private String path;

    public Image() {}

    public Image(String path) {
        setPath(path);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String toHTML() {
        return "<img class=\"item\" src=\"" + getPath() + "\" />";
    }

    public String toHTML(boolean intext) {
        if (intext)
            return "<img class=\"in text item\" src=\"" + getPath() + "\" />";
        else
            return toHTML();
    }

    @Override
    public String toString() {
        return toHTML();
    }
}
