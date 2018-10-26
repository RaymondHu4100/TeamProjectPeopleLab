package com.company;

public class Teacher extends Person
{
    private String Subject;
    private String Title;
    public Teacher ( String Subject,String Title)
    {
        super("firstName","fhhdhfhdh");
        this.Subject = Subject;
        this.Title = Title;
    }
    public String toString()
    {
        String Name1 = Title;
        String Name2 = getFamilyName();
        return Name1+". "+Name2;
    }
    public String getSubject()
    {
        return Subject;
    }

    public void setSubject(String subject)
    {
        Subject = subject;
    }

    public String getTitle()
    {
        return Title;
    }

    public void setTitle(String title)
    {
        Title = title;
    }
}

