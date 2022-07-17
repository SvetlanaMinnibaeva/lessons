package lesson7Kaz.vkontakte;

public class Profile {
    private long id;
    private String fullName;
    private Date dateOfBirth;
    private List messagesOutgoing = new List();
    private List messagesIncoming = new List();
    private List wallMessages = new List();

    public Profile(long id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public Profile(List wallMessages) {
        this.wallMessages = wallMessages;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List getWallMessages() {
        return wallMessages;
    }

    public String getFullName() {
        return fullName;
    }

    public List getMessagesOutgoing() {
        return messagesOutgoing;
    }

    public List getMessagesIncoming() {
        return messagesIncoming;
    }

    public static Profile getProfile(List profiles, long id) {
        Profile profile = null;
        for (int i = 0; i < profiles.lenght(); i++) {
            profile = (Profile) profiles.getByIndex(i);
            if (profile.getId() == id)
                return profile;
        }
        return profile;
    }
}