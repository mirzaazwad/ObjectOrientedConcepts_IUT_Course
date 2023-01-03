using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BankAccount
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        List<Client>clients=new List<Client>();
        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

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

        private void button1_Click(object sender, EventArgs e)
        {
            Account account = new Account(textBox3.Text,Convert.ToDouble(textBox5.Text),textBox6.Text);
            Client client = new Client(textBox1.Text, textBox2.Text , textBox4.Text, account);
            foreach(Client client2 in clients)
            {
                if (client2.GetClientID() == client.GetClientID())
                {
                    MessageBox.Show("Client Already Exists");
                    return;
                }
                if (client2.GetClientInfo().GetNumber() == client.GetClientInfo().GetNumber())
                {
                    MessageBox.Show("Client Account Exists Already");
                    return;
                }
            }
            clients.Add(client);
            MessageBox.Show("Client Successfully Added");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            bool found = false;
            double temp;
            foreach(Client client in clients)
            {
                temp = client.GetClientInfo().ShowBalance();
                if (client.GetClientInfo().GetNumber() == textBox7.Text)
                {
                    if (temp <= 0.00)
                    {
                        MessageBox.Show("Account empty");
                        return;
                    }
                    if (temp - Convert.ToDouble(textBox8.Text) >= 0.00)
                    {
                        client.GetClientInfo().MakeWithdrawl(Convert.ToDouble(textBox8.Text));
                    }
                    else
                    {
                        MessageBox.Show("Your withdrawl exceeds your balance");
                        return;
                    }
                    found= true;
                    break;
                }
            }
            if (found)
            {
                MessageBox.Show("Withdrawed USD" + Convert.ToString(textBox8.Text));
            }
            else
            {
                MessageBox.Show("Account Does Not Exist");
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            bool found = false;
            foreach (Client client in clients)
            {
                if (client.GetClientInfo().GetNumber() == textBox7.Text)
                {
                    client.GetClientInfo().MakeDeposit(Convert.ToDouble(textBox8.Text));
                    found = true;
                    break;
                }
                
            }
            if (found)
            {
                MessageBox.Show("Deposited USD" + Convert.ToString(textBox8.Text));
            }
            else
            {
                MessageBox.Show("Account Does Not Exist");
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            foreach (Client client in clients)
            {
                if (client.GetClientInfo().GetNumber() == textBox9.Text)
                {
                    label10.Text="Balance: USD "+Convert.ToString(client.GetClientInfo().ShowBalance());
                    break;
                }
            }
        }

        private void label10_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
