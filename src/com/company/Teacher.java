package com.company;

public class Teacher extends Person
{
    private String Subject;
    private String Title;
    public Teacher (Subject, Title)
    {
        super(firstName, lastName);
        this.Subject = Subject;
        this.Title = Title;
    }
    public String toString();
    {
        String Output =
    }
    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}

