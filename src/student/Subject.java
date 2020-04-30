package student;

import java.util.Random;

public class Subject {
    private String nameSubject;
    private  float mark;
    private  boolean passed;

    public Subject(String nameSubject)
    {
        Random number = new Random();
        this.nameSubject = nameSubject;
        setMark();
        setPassed();

    }
    public void  setMark(){
        this.mark = (float)Math.random()%3 +2;
    }
    public void setPassed(){
        if (mark >2)
        {
            passed = true;
        }
        else
        {
            passed = false;
        }
    }
    public double getMark()
    {

        return this.mark;

    }
    public boolean getPassed()
    {

        return this.passed;

    }

    public String getNameSubject()
    {

        return this.nameSubject;

    }
    public void setNameSubject(String nameSubject)
    {

        this.nameSubject = nameSubject;

    }

}
