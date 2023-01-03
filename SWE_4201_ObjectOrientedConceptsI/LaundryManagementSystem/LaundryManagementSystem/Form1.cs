using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using laundry_management_dependencies;

namespace LaundryManagementSystem
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            label4.Text = "Current Balance: " + Convert.ToString(Order.CurrentAccount);
        }
        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {

        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            User user = new User(textBox2.Text,textBox3.Text,textBox4.Text);
            foreach(User users in LaundryManagementSystemCollections.userList)
            {
                if (users.getUserID() == textBox2.Text)
                {
                    MessageBox.Show("User already exists, try again");
                    return;
                }
            }
            LaundryManagementSystemCollections.userList.Add(user);
            MessageBox.Show("User Added");

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

        private void button3_Click(object sender, EventArgs e)
        {
            bool found = false;
            OwnerOrder order = new OwnerOrder();
            foreach (User user in LaundryManagementSystemCollections.userList)
            {
                if (user.getUserID() == textBox5.Text)
                {
                    order.setUser(user);
                    found = true;
                }
            }
            if (!found)
            {
                MessageBox.Show("User Not Found");
                return;
            }
            Shirt shirt = new Shirt();
            Pant pant = new Pant();
            Suit suit = new Suit();
            BedSheet bedSheet = new BedSheet();
            if (textBox6.Text != null && comboBox2.Text!="")
            {
                Shirt temp = new Shirt(comboBox2.Text, Convert.ToInt32(textBox6.Text));
                shirt = temp;
            }
            if (textBox7.Text != null && comboBox3.Text != "")
            {
                Pant temp = new Pant(comboBox3.Text, Convert.ToInt32(textBox7.Text));
                pant = temp;
            }
            if(textBox8.Text != null && comboBox4.Text != "")
            {
                Suit temp = new Suit(comboBox4.Text, Convert.ToInt32(textBox8.Text));
                suit = temp;
            }
            if (textBox9.Text != null && comboBox5.Text != "")
            {
                BedSheet temp = new BedSheet(comboBox5.Text, Convert.ToInt32(textBox9.Text));
                bedSheet = temp;
            }

            order.setter(shirt, pant, suit, bedSheet);
            order.setOwnerOrderID(Convert.ToString(Order.OrderID));
            LaundryManagementSystemCollections.orderList.Add(order);
            Order.Increment();
            MessageBox.Show("Order Added Successfully, Order ID is "+Convert.ToString(Order.OrderID-1) +", You have to pay BDT"+Convert.ToString(order.getCost()));
        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void comboBox3_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            bool found = false;
            foreach(OwnerOrder orders in LaundryManagementSystemCollections.orderList)
            {
                if (orders.getID() == textBox1.Text)
                {
                    if (dateTimePicker1.Value < DateTime.Now)
                    {
                        MessageBox.Show("You can't go back in time");
                        return;
                    }
                    if (orders.getStatus() == "Delivered")
                    {
                        MessageBox.Show("Product Already Delivered");
                        return;
                    }
                    orders.setDate(dateTimePicker1.Value);
                    orders.setStatus(comboBox1.Text);
                    if (orders.getStatus() == "Delivered")
                    {
                        Order.AddToAccount(orders.getCost());
                    }
                    label4.Text = "Current Balance: " + Convert.ToString(Order.CurrentAccount);
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                MessageBox.Show("Order Not Recognised");
            }
            MessageBox.Show("Order Status Set");
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {
            if (dateTimePicker1.Value < DateTime.Now)
            {
                MessageBox.Show("You can't go back in time");
                return;
            }

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox10_TextChanged(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            bool found = false;
            foreach(OwnerOrder orders in LaundryManagementSystemCollections.orderList)
            {
                if (orders.getID() == textBox10.Text)
                {
                    found = true;
                    label15.Text = "Status" + ": " + orders.getStatus();
                    label16.Text = "Amount" + ": " + Convert.ToString(orders.getCost());
                    label17.Text = "Name:" +" "+ orders.getUser().getUserName();
                    label18.Text = "Address:" +" "+orders.getUser().getAddress();
                    label19.Text = "Delivery Date and Time: " + Convert.ToString(orders.getDate());
                    AddToListBox(orders);
                }
            }
            if (!found)
            {
                MessageBox.Show("Order not found");
            }
        }
        private void AddToListBox(OwnerOrder order)
        {
            OrderListBox.Items.Clear();
            OrderListBox.Items.Add("Type\tQuantity\tTo_Do\tAmount");
            bool found = false;
            if (order.getProductToDo("shirt") != "No To_Do")
            {
                OrderListBox.Items.Add("Shirt\t" + order.getProductQuantity("shirt") + "\t" + order.getProductToDo("shirt") + "\t" + Convert.ToString(order.getProductCost("shirt")));
                found = true;
            }
            if (order.getProductToDo("pant") != "No To_Do")
            {
                OrderListBox.Items.Add("Pant\t" + order.getProductQuantity("pant") + "\t" + order.getProductToDo("pant") + "\t" + Convert.ToString(order.getProductCost("pant")));
                found = true;
            }
            if (order.getProductToDo("bedsheet") != "No To_Do")
            {
                OrderListBox.Items.Add("Bedsheet\t" + order.getProductQuantity("bedsheet") + "\t" + order.getProductToDo("bedsheet") + "\t" + Convert.ToString(order.getProductCost("bedsheet")));
                found = true;
            }
            if (order.getProductToDo("suit") != "No To_Do")
            {
                OrderListBox.Items.Add("Suit\t" + order.getProductQuantity("suit") + "\t" + order.getProductToDo("suit") + "\t" + Convert.ToString(order.getProductCost("suit")));
                found = true;
            }
            if(!found)
            {
                OrderListBox.Items.Add("No Items to Show");
            }
        }

        private void label15_Click(object sender, EventArgs e)
        {

        }

        private void label16_Click(object sender, EventArgs e)
        {

        }

        private void label17_Click(object sender, EventArgs e)
        {

        }

        private void label18_Click(object sender, EventArgs e)
        {

        }

        private void OrderListBox_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void label19_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void comboBox4_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void comboBox5_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
