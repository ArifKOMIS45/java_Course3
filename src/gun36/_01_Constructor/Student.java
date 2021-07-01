package gun36._01_Constructor;

public class Student {
    int id;
    String name;
    String surname;
    int classroom;


    //constructor,new oldugu anda calisir
    public Student(int id, String name, String surname, int classroom) {
        this.id = id;//this ile gosterilirki karismasin
        this.name = name;
        this.surname = surname;
        this.classroom = classroom;

    }

    //constructor,new oldugu anda calisir
    public Student(int id, String name) {
       this(id,name,"",0);
//        this.id = id;//this ile gosterilirki karismasin
//        this.name = name;
//        this.surname = "";
//        this.classroom = 0;
    }


    public Student(int id) {
      this(id,"","",0);
//        this.id = id;//this ile gosterilirki karismasin
//        this.name = "";
//        this.surname = "";
//        this.classroom =0;

    }

    public Student() {
        System.out.println("Student olusturuldu");
    }

    public static Student createStudent(int id, String name, String surname, int classroom) {
        Student ogr = new Student();
        ogr.id = id;
        ogr.name = name;
        ogr.surname = surname;
        ogr.classroom = classroom;
        return ogr;
    }


}
