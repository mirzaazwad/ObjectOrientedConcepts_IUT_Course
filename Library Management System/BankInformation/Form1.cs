using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BankInformation
{
    public partial class Form1 : Form
    {
        List<User>users=new List<User>();
        List<Book>books=new List<Book>();
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Book book = new Book(textBox4.Text,textBox5.Text,textBox6.Text,textBox7.Text,Convert.ToInt32(textBox8.Text));
            foreach(Book book_ in books)
            {
                if (book_.GetBookID() == book.GetBookID())
                {
                    MessageBox.Show("Book already present");
                }
            }
            books.Add(book);
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            BorrowedBooks.Items.Clear();
            foreach(User user in users)
            {
                if (user.GetUserID() == textBox11.Text)
                {
                    foreach(Book book in user.BorrowBooks)
                    {
                        BorrowedBooks.Items.Add(book.ShowBookList());
                    }
                }
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            User user = new User(textBox1.Text, textBox2.Text, textBox3.Text);
            foreach(User user_ in users)
            {
                if (user_.GetUserID() == user.GetUserID())
                {
                    MessageBox.Show("User already present");
                }
            }
            users.Add(user);
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox8_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox9_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox10_TextChanged(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Book tempBook=new Book();
            bool flag = false;
            foreach(Book book in books)
            {
                if (book.GetBookID() == textBox10.Text)
                {
                    if (book.GetQuantity() <= 0)
                    {
                        MessageBox.Show("Cannot Borrow Book, Out of stock");
                        return;
                    }
                    book.BorrowBook();
                    tempBook = book;
                    flag = true;
                }
            }
    
            if (!flag)
            {
                MessageBox.Show("Book Not found");
                return;
            }
            

            flag = false;
            foreach(User user in users)
            {
                if (user.GetUserID() == textBox9.Text)
                {
                    user.addBook(tempBook);
                    flag = true;
           
                }
            }
            if (!flag)
            {
                MessageBox.Show("User Not Found");
            }
        }

        private void textBox11_TextChanged(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox12_TextChanged(object sender, EventArgs e)
        {

        }

        private void button5_Click(object sender, EventArgs e)
        {
            foreach(Book book in books)
            {
                if (book.GetBookID() == textBox12.Text)
                {
                    if(book.GetQuantity() <= 0)
                    {
                        MessageBox.Show("Book out of stock");
                    }
                    label16.Text = book.showBook();
                }
            }
        }

        private void label14_Click(object sender, EventArgs e)
        {

        }

        private void label16_Click(object sender, EventArgs e)
        {

        }
    }
}
