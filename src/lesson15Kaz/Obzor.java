package lesson15Kaz;

public class Obzor {
    private String text;

    public Obzor() {
    }

    public Obzor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Obzor)) return false;

        Obzor obzor = (Obzor) o;

        return text != null ? text.equals(obzor.text) : obzor.text == null;
    }

    @Override
    public int hashCode() {
        return text != null ? text.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Обзор{" +
                "text ='" + text + '\'' +
                '}';
    }
}
