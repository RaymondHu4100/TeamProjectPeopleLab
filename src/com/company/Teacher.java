package com.company;

public class Teacher extends Person
{
    private String Subject, Title;
    public Teacher (Subject, Title)
    {
        this.Subject = Subject;
        this.Title = Title;

    }
    public abstract String toString();
    public String getSubject()
    {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
