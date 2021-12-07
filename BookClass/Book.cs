using System;
using System.Collections.Generic;

namespace BookClass{
    class Book
    {
        protected string ID;
        protected string Title;
        protected string Author;
        protected string Publisher;
        protected int Quantity;

        public Book()
        {

        }
        public Book(string ID, string Title, string Author, string Publisher, int Quantity)
        {
            this.ID = ID;
            this.Title = Title;
            this.Author = Author;
            this.Publisher = Publisher;
            this.Quantity=Quantity;
        }
        public int getQuantity()
        {
            return this.Quantity;
        }
        public string getinfo()
        {
            return this.ID + "\t" + this.Title + "\t" + this.Author+"\t"+Convert.ToString(this.Quantity);
        }
    }
}
