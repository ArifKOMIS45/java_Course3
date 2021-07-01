package gun36._01_Constructor;

public class Okul {
    //bir Student sinifi olusturnuz(id,name,suranme,classroom) ve bundan yedi adet ogrenci olustrunuz.
    public static void main(String[] args) {
        //1.yontem
        Student ogr1 = new Student();
        ogr1.id = 1;
        ogr1.name = "Sevim";
        ogr1.surname = "Yilmaz";
        ogr1.classroom = 9;

        //2.yontem
        Student ogr2 = Student.createStudent(2, "Ilhan", "Demir", 8);

        //3.yontem yeni!!!
        Student ogr3 = new Student(3, "Mehmet", "Demiz", 4);
        Student ogr4 = new Student(4, "Arif");


    }


}
