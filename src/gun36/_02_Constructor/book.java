package gun36._02_Constructor;

public class book {
    String name;
    int publishYear;
    String autor;

    public book(String name, int publishYear, String autor) {
        this.name = name;
        this.publishYear = publishYear;
        this.autor = autor;
    }

    public book(String name, int publishYear) {
        this(name, publishYear, "");
    }

    public book(String name) {
        this(name, 0, "");
    }

    public void showInfos() {

        System.out.println(name + " " + publishYear + " " + autor);
    }


    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", autor='" + autor + '\'' +
                '}';




    }
}
