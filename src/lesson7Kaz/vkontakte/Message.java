package lesson7Kaz.vkontakte;

public class Message {
    private Date date;
    private String text;
    private long fromId;
    private long toId;

    public Message(String text, long fromId, long toId, Date date) {
        this.date = date;
        this.text = text;
        this.fromId = fromId;
        this.toId = toId;
    }

    public long getFromId() {
        return fromId;
    }

    public Date getDate() {
        return date;
    }

    public long getToId() {
        return toId;
    }


    public String toString() {
        return text;
    }
}
