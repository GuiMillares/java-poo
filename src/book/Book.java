package book;

public class Book {
    
    private String title;
    private int year;
    private String author;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public Book(String title, int year, String author){
        this.title = title;
        this.year = year;
        this.author = author;
    }

}
