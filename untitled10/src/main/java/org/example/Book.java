package org.example;

public class Book {
    String title;
    String author;
    String isbn; //شناسه منحصر به فرد
    boolean isavailable;
    String currentborrower;


    public Book(String title,String author,String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isavailable = true;
        this.currentborrower = " ";
    }




    public void borrowBook(String borrowename)
    {
        if(!(this.isavailable))
        {
            System.out.println("sorry the Book"+this.title+"is already borrowed by"+this.currentborrower+".");
        }else{

            this.isavailable = false;
            this.currentborrower = borrowename;
            System.out.println(borrowename+"borrowed the Book"+this.title+"successfully by"+this.currentborrower+".");
        }
    }


    public void returnBook()
    {
        if(!(this.isavailable))
        {
            this.isavailable = true;
            this.currentborrower = " ";
            System.out.println("Book returned");
        }

    }

    public String getinfoBook()
    {
        return "title = "+this.title+"\nauthor = "+this.author+"\nisbn = "+this.isbn+"available = "+this.isavailable;
    }
    public String getisbn()
    {
        return this.isbn;
    }

    public String gettitle()
    {
        return this.title;
    }

    public String getauthor()
    {
        return this.author;
    }

    public boolean getisavailable()
    {
        return this.isavailable;
    }

}