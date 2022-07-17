package lesson7Kaz.vkontakte;

public class Comment {
    private String text;
    private Date date;

    private long authorId;

    public Date getDate() {
        return date;
    }

    public long getAuthorId() {
        return authorId;
    }

    public Comment(String text, long authorId, Date date) {
        this.text = text;
        this.authorId = authorId;
        this.date = date;
    }

    public String toString() {
        return text;
    }
}
