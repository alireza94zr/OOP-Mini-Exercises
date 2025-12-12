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