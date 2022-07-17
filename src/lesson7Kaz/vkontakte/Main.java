package lesson7Kaz.vkontakte;

public class Main {
    public static void main(String[] args) {
        Profile vasya = new Profile(178999, "Вася Петин", new Date(14, 2, 2005));
        Profile petya = new Profile(29009987, "Петя Васин", new Date(19, 5, 2001));
        Profile kostya = new Profile(678889987, "Костя Иванов", new Date(8, 9, 1998));

        List profiles = new List();
        profiles.add(vasya);
        profiles.add(petya);
        profiles.add(kostya);

        WallMessage wallMessage = new WallMessage("Какой прекрасный день", vasya.getId(), new Date(22, 6, 2022));
        vasya.getWallMessages().add("\nОт кого: " + Profile.getProfile(profiles, wallMessage.getAuthorId()).getFullName()
                + " - " +wallMessage.getDate().getDateAsString() + " - " + wallMessage);

        Comment comment = new Comment("Да!!!", petya.getId(), new Date(20, 6, 2022));
        wallMessage.getComments().add("\nОт кого: " + Profile.getProfile(profiles,comment.getAuthorId()).getFullName()
                 + " - " +comment.getDate().getDateAsString() + " - " + comment);

        Message message1 = new Message("Как дела?", petya.getId(),
                vasya.getId(), new Date(21, 6, 2022));
        vasya.getMessagesIncoming().add("\nОт кого: " + Profile.getProfile(profiles, message1.getFromId()).getFullName() + " - "
                + message1.getDate().getDateAsString() + " - " + message1);

        Message message2 = new Message("Пойдем кататься на электросамокатах?", petya.getId(),
                vasya.getId(), new Date(22, 6, 2022));
        vasya.getMessagesIncoming().add("\nОт кого: " + Profile.getProfile(profiles, message2.getFromId()).getFullName() + " - "
                + message2.getDate().getDateAsString() + " - " + message2);

        Message message3 = new Message("Пoeхали!", vasya.getId(),
                petya.getId(), new Date(22, 6, 2022));
        vasya.getMessagesOutgoing().add("\nКому: " + Profile.getProfile(profiles, message3.getToId()).getFullName() + " - "
                + message3.getDate().getDateAsString() + " - " + message3);

        Message message4 = new Message("Мы с Петей идем гулять на самокатах, ты с нами?", vasya.getId(),
                kostya.getId(), new Date(22, 6, 2022));
        vasya.getMessagesOutgoing().add("\nКому: " + Profile.getProfile(profiles, message4.getToId()).getFullName() + " - "
                + message4.getDate().getDateAsString() + " - " + message4);


        System.out.println("Профиль Васи:" +
                " \nID: " + vasya.getId() +
                " \nИмя: " + vasya.getFullName() +
                " \nДата рождения: " + vasya.getDateOfBirth().getDateAsString() +
                " \nСообщения на стене Васи: " + vasya.getWallMessages().getEntries() +
                " \nКомментарии на стене Васи: " + wallMessage.getComments().getEntries() +
                " \nВходящие сообщения Васи: " + vasya.getMessagesIncoming().getEntries() +
                " \nИсходящие сообщения Васи: " + vasya.getMessagesOutgoing().getEntries());
    }
}
