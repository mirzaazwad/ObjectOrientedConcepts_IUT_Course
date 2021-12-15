using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using pharmacy_dependencies;

namespace PHARMACY_MANAGEMENT_SYSTEM
{
    public partial class Form1 : Form
    {
        public double CurrentAccount;

        public Form1()
        {
            InitializeComponent();
            CurrentAccount = 0;
        }
        List<Medicine>medList=new List<Medicine>();
        

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void ManufacturingDate_ValueChanged(object sender, EventArgs e)
        {

        }

        private void ExpiryDate_ValueChanged(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void AddMedicine_Click(object sender, EventArgs e)
        {
            Medicine medicine = new Medicine(DrugName.Text,DIN.Text,Convert.ToInt32(Miligrams.Text), Convert.ToInt32(AddQuantity.Text), Convert.ToDouble(Cost.Text),ManufacturingDate.Value,ExpiryDate.Value);
            medList.Add(medicine);
            MessageBox.Show("Medicine Added");

        }

        private void ManufacturingDate_ValueChanged_1(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            
            foreach(Medicine dummy_medicine in medList)
            {
                if(dummy_medicine.getDrugName()==SellDrugName.Text && dummy_medicine.getMiligrams() == Convert.ToInt32(SellMiligrams.Text))
                {
                    if (dummy_medicine.getQuantity() - Convert.ToInt32(SellQuantity.Text) < 0)
                    {
                        MessageBox.Show("Not enough medicine in stock");
                        return;
                    }
                    dummy_medicine.buyMedicine(Convert.ToInt32(SellQuantity.Text));
                    CurrentAccount += (dummy_medicine.getCost()*Convert.ToInt32(SellQuantity.Text));
                    if (dummy_medicine.getQuantity() == 0)
                    {
                        MessageBox.Show("Medicine Sold and it is out of stock");
                    }
                    else
                    {
                        MessageBox.Show("Medicine Sold");
                    }
                }
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MedicineInformation.Items.Clear();
            foreach(Medicine dummy_medicine in medList)
            {
                MedicineInformation.Items.Add(dummy_medicine.getMedicineInfo());
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            CAB.Text = "Current Account Balance: " + Convert.ToString(CurrentAccount);
        }
    }
}
