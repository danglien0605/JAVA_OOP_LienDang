package HW_07_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    public String name;
    public String ISBN;
    public String author;
    static List<Books> bookList = new ArrayList<>();

    public Books(String name, String ISBN, String author) {
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void addBook() {
        System.out.println("Please enter book information: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String author = sc.nextLine();
        String ISBN = sc.nextLine();
        Books book = new Books(name, author, ISBN);
        bookList.add(book);

    }

    public static void retrieveBook() {
        if(bookList.size() == 0){
            System.out.println("Book List Empty");
        }else{
            for(Books book: bookList){
                System.out.println(book.toString());

            }
        }

    }
}
