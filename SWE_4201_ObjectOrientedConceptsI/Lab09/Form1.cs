using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab09
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            MessageBox.Show("For Loan Account initbalance is the amount of loan taken");
        }

        List<CurrentAccount> accounts = new List<CurrentAccount>();
        List<SavingsAccount> savings = new List<SavingsAccount>();
        List<LoanAccount> loans = new List<LoanAccount>();

        private void button1_Click(object sender, EventArgs e)
        {
            if (CurrentAccountradio.Checked)
            {
                CurrentAccount account = new CurrentAccount(textBox1.Text, textBox2.Text, dateTimePicker1.Value, dateTimePicker2.Value, Convert.ToDouble(textBox3.Text));
                accounts.Add(account);
                MessageBox.Show("Account Added "+account.AccountNum);
            }
            else if (SavingsAccountradio.Checked)
            {
                SavingsAccount account = new SavingsAccount(textBox1.Text, textBox2.Text, dateTimePicker1.Value, dateTimePicker2.Value, Convert.ToDouble(textBox3.Text));
                savings.Add(account);
                MessageBox.Show("Account Added " + account.AccountNum);
            }
            else
            {
                LoanAccount account = new LoanAccount(textBox1.Text, textBox2.Text, dateTimePicker1.Value, dateTimePicker2.Value, Convert.ToDouble(textBox3.Text)*1.09);
                loans.Add(account);
                MessageBox.Show("Account Added " + account.AccountNum);
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

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {

        }

        private void dateTimePicker2_ValueChanged(object sender, EventArgs e)
        {

        }

        private void CurrentAccountradio_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            string checker=textBox4.Text;
            foreach(CurrentAccount dummy in accounts)
            {
                if (dummy.AccountNum == checker)
                {
                    label9.Text = dummy.info();
                    return;
                }
            }
            foreach (SavingsAccount dummy in savings)
            {
                if (dummy.AccountNum == checker)
                {
                    label9.Text = dummy.info();
                    return;
                }
            }
            foreach (LoanAccount dummy in loans)
            {
                if (dummy.AccountNum == checker)
                {
                    label9.Text = dummy.info();
                    return;
                }
            }
        }


        private void label9_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            string checker = textBox5.Text;
            double amount=Convert.ToDouble(textBox6.Text);
            foreach (CurrentAccount dummy in accounts)
            {
                if (dummy.AccountNum == checker)
                {
                    dummy.withdraw(amount);
                    dummy.addTransactionDetails(dateTimePicker3.Value, amount);
                    return;
                }
            }
            foreach (SavingsAccount dummy in savings)
            {
                if (dummy.AccountNum == checker)
                {
                    dummy.withdraw(amount);
                    dummy.addTransactionDetails(dateTimePicker3.Value, amount);
                    return;
                }
            }
            foreach (LoanAccount dummy in loans)
            {
                if (dummy.AccountNum == checker)
                {
                    dummy.withdraw(amount);
                    dummy.addTransactionDetails(dateTimePicker3.Value, amount);
                    return;
                }
            }
        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            string checker = textBox7.Text;
            
            foreach (CurrentAccount dummy in accounts)
            {
                if (dummy.AccountNum == checker)
                {
                    listBox1.Items.Clear();
                    foreach(string str in dummy.transactionHistory)
                    {
                        listBox1.Items.Add(str);
                    }
                    return;
                }
            }
            foreach (SavingsAccount dummy in savings)
            {
                listBox1.Items.Clear();
                foreach (string str in dummy.transactionHistory)
                {
                    listBox1.Items.Add(str);
                }
                return;
            }
            foreach (LoanAccount dummy in loans)
            {
                listBox1.Items.Clear();
                foreach (string str in dummy.transactionHistory)
                {
                    listBox1.Items.Add(str);
                }
                return;
            }
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void dateTimePicker3_ValueChanged(object sender, EventArgs e)
        {

        }
    }
}
