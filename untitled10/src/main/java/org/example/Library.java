package org.example;

import java.util.*;

public class Library

{
    ArrayList <Book> Books;
    public Library()
    {
        Books = new ArrayList();
    }

    public void addbook(Book book)
    {
        Books.add(book);
        System.out.println("Book added");
    }

    public void removebook(String isbn)
    {
        for(Book b : Books)
        {
            if(b.getisbn().equals(isbn))
            {
                Books.remove(b);
                System.out.println("removed");
            }
        }
        System.out.println("not found");
    }


    public void findbookbytitle(String title)
    {
        for(Book b : Books)
        {
            if(b.gettitle().equals(title))
            {
                System.out.println(b.getinfoBook());

            }
        }
        System.out.println("not found");
    }




    public void findbookbyauthor(String author)
    {
        for(Book b : Books)
        {
            if(b.getauthor().equals(author))
            {
                System.out.println(b.getinfoBook());

            }
        }
        System.out.println("not found");
    }



    public void showinfoisavalaible()
    {
        for(Book b : Books)
        {
            if(b.getisavailable())
            {
                System.out.println(b.getinfoBook());
            }
        }
    }


    public void showinfoborrowedbooks()
    {
        for(Book b : Books)
        {
            if(!b.getisavailable())
            {
                System.out.println(b.getinfoBook());
            }
        }

    }




    public static void main(String[] args)
    {
        Library myLibrary = new Library();

        Book b1 = new Book("math","ali","1");
        Book b2 = new Book("physic","mohammad","2");
        Book b3 = new Book("java","hossein","3");
        myLibrary.addbook(b1);
        myLibrary.addbook(b2);
        myLibrary.addbook(b3);

    }
}

public class Book {
    String title;
    String author;
    String isbn;
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
        }

        this.isavailable = false;
        this.currentborrower = borrowename;
        System.out.println(borrowename+"borrowed the Book"+this.title+"successfully by"+this.currentborrower+".");
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