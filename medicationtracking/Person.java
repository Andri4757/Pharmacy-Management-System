package medicationtracking;

public abstract class Person {
    private static int NEXT_ID = 1;

    protected final int id;
    protected String name;
    protected int age;
    protected String phoneNumber;

    public Person(String name, int age, String phoneNumber) {
        this.id = NEXT_ID++;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public String toString() {
        return String.format("ID=%d, Name=%s, Age=%d, Phone=%s", id, name, age, phoneNumber);
    }
}