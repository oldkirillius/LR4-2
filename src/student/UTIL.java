package student;

public class UTIL {
    public static String bestStudent(Student[] students)
    {
        double sum[] = new double [students.length];
        for (Student student : students) {
            for (int i = 0; i < student.getSubjects().length; i++) {
                sum[i]+=student.getSubjects()[i].getMark();

            }

            }

        double avrMark = sum[0] / students.length;

        int count = 0;

        for(int i = 1; i < sum.length; i++)
        {

            if(avrMark < (sum[i] / students.length))
            {

                avrMark = sum[i] / students.length;

                count = i;

            }

        }

        return System.out.printf("Subject: %s has the best average mark - %.1f\n",students[0].getSubjects()[count].getNameSubject(),avrMark).toString();


    }
    public static Student getTheBestStudent(Student[] students)
    {

        Student buffStudent = students[0];

        for(int i = 1; i < students.length;i++)
        {

            if(buffStudent.averageMark() < students[i].averageMark())
            {

                buffStudent = students[i];

            }

        }

        return buffStudent;

    }




}
