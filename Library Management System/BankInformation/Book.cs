using System;
using System.Collections.Generic;

public class Book
{
	private string BookID;
	private string BookName;
	private string Author;
	private string Publisher;
	private int Quantity;
	public Book(string BookID,string BookName,string Author,string Publisher,int Quantity)
	{
		this.BookName = BookName;
		this.BookID = BookID;
		this.BookName = BookName;
		this.Author = Author;
		this.Publisher = Publisher;
		this.Quantity=Quantity;
	}
	public Book()
    {

    }
	public void BorrowBook()
    {
		this.Quantity=this.Quantity-1;
    }
	public int GetQuantity()
    {
		return this.Quantity;
    }
	public string showBook()
    {
		return "ID: "+this.BookID+"\n"+"Name: "+this.BookName+"\n"+"Author: "+this.BookName+"\n"+"Publisher: "+this.Publisher+"\n"+"Quantity: "+Convert.ToString(this.Quantity);
    }
	public string ShowBookList()
    {
		return this.BookID + "\t" +  this.BookName + "\t" + this.Author + "\t" +  this.Publisher + "\t" ;
	}
	public string GetBookID()
    {
		return this.BookID;	
    }
}
