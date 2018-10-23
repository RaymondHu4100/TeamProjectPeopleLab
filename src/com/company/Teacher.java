package com.company;

public abstract class Teacher extends Person
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

    public void setSubject(String subject)
    {
        this.Subject = subject;
    }
    public  String getTitle()
    {
        return Title;
    }
    public void setTitle(String title)
    {
        this.Title = title;
    }
}
