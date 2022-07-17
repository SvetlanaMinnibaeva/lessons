package lesson7Kaz.vkontakte;

public class WallMessage {
    private String text;
    private List comments = new List();
    private long authorId;
    private Date date;

    public Date getDate() {
        return date;
    }

    public long getAuthorId() {
        return authorId;
    }

    public WallMessage(String text, long authorId, Date date) {
        this.text = text;
        this.authorId = authorId;
        this.date = date;
    }

    public List getComments() {
        return comments;
    }

    public String toString() {
        return text;
    }
}
