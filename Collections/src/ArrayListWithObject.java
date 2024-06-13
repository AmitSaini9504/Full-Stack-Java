import java.util.ArrayList;
public  class ArrayListWithObject {

    public static void main(String[] args) {

        ArrayList<StudentData> studentData = new ArrayList();

        StudentData studentData1 = new StudentData("Amit",20);
        StudentData studentData2 = new StudentData("Alok",25);

        studentData.add(studentData1);
        studentData.add(studentData2);
        for (StudentData student:studentData)
        {
            System.out.println(student);
        }

    }
}