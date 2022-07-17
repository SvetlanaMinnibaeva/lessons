package lesson7Kaz.vkontakte;

public class List {
    private Object[] list = new Object[0];

    public List() {
    }

    public void add(Object obj) {
        Object[] newList = new Object[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        newList[list.length] = obj;
        this.list = newList;
    }


    public String getEntries() {
        StringBuilder entries = new StringBuilder();
        for (Object obj : list) {
            entries.append(" ").append(obj.toString());
        }
        return entries.toString();
    }


    public int lenght() {
        return this.list.length;
    }

    public Object getByIndex(int i) {
        return this.list[i];
    }
}

