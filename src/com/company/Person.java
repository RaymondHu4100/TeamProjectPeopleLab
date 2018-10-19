package com.company;

public abstract class Person
{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract String toString();

    public boolean equals(Person firstName)
    {
        return firstName.equals(lastName);
    }
}
