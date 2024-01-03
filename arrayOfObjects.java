class Student{
    int marks;
    String name;
}
public class arrayOfObjects {
    
    public static void main(String ar[])
    {
        Student s1 = new Student();
        s1.name = "Deempal";
        s1.marks = 97;
        
        Student s2 = new Student();
        s2.name = "Khushboo";
        s2.marks = 87;

        Student s3 = new Student();
        s3.name = "Neha";
        s3.marks = 107;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++)
        {
            System.out.println(students[i].name+" : "+students[i].marks);
        }


    }
}
