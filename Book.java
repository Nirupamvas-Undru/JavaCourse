public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;

    public Book(String author, String title, String genre, int numPages){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }//end ctor

    public String getAuthor(){
        return author;
    }//end getAuthor

    public String getTitle(){
        return title;
    }//end getTitle

    public String getGenre(){
        return genre;
    }//end getGenre

    public int getNumPages(){
        return numPages;
    }//end getNumPages

    public void printBookDetails(){
       System.out.println(getTitle());
       System.out.println("by "+getAuthor());
       System.out.println("has "+getNumPages()+" pages, and its genre is " +getGenre());

   }
}//end Book
