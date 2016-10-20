package ddi.gobelins.takenote.notes;

/**
 * Created by louisbl on 10/20/16.
 */

public class Note {
    public int id;
    public String title;
    public String description;

    public Note() {

    }

    public Note(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
