package student;

public class Student {

    private int id;
    private static int nextID;
    private String name;
    private String surname;
    private String group;
    private Subject[] subjects;

    public Student( int id , String name, String surname, String group, String[] nameSubjects)
    {
        this.id=id;

        this.name=name;
        this.surname=surname;
        this.group=group;

        this.subjects = new Subject[nameSubjects.length];

        for(int i = 0; i < subjects.length; i++)
        {

            subjects[i] = new Subject(nameSubjects[i]);

        }

    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String  getName()
    {
        return name;
    }

    public String  getSurname()
    {
        return surname;
    }
    public String getGroup()
    {
        return group;
    }

    public void setSurname(String surname)
    {
        this.surname=surname;
    }
    public void setGroup(String group)
    {
        this.group=group;
    }

    public Subject[] getSubjects()
    {

        return subjects;

    }
    public double averageMark()
    {
        double sum = 0;
        for (Subject subject : subjects)
        {
            sum += subject.getMark();
        }

        sum = sum/subjects.length;
        return sum;

    }
    public void displaySubjects()
    {
        for (Subject subject : subjects)
            System.out.printf("Subj: %s   Mark: %.2f Pass? %b", subject.getNameSubject(),subject.getMark(),subject.getPassed());
    }


}
