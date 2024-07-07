package NGlesson34.classwork.StreamMapExample;

public class Book {
    private String name;
    private Person borrowedBy;

    public Book(String name, Person rentedBy) {
        this.name = name;
        this.borrowedBy = rentedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(Person borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", rentedBy=" + borrowedBy +
                '}';
    }
}
