using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace WindowsFormsApp1
{
    public partial class EmployeeForm : Form
    {
        public EmployeeForm()
        {
            InitializeComponent();
            using (var reader = new StreamReader(@"C:\employees.csv"))
            {
                while (!reader.EndOfStream)
                {
                    var line = reader.ReadLine();
                    var values = line.Split(',');
                    Employee dummy_employee = new Employee(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[9], values[10]);
                    UtilitiesEmployee.employeeList.Add(dummy_employee);
                }
            }
            InitializeListBoxValues();

        }
        private void InitializeListBoxValues()
        {
            EmployeeInformation.Items.Clear();
            foreach(Employee temp in UtilitiesEmployee.employeeList)
            {
                EmployeeInformation.Items.Add(temp.getInfo());
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void EmployeeInformation_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void SearchIDInput_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            bool found = false;
            foreach(Employee temp in UtilitiesEmployee.employeeList)
            {
                if (temp.Employee_ID == SearchIDInput.Text)
                {
                    EmployeeInformationData.Text = "Employee Information" + "\n" + temp.getDetailedInformation();
                    using (StreamWriter writer = File.AppendText(@"C:\log.txt"))
                    {
                        writer.WriteLine(temp.getInfo());
                    }
                    found = true;
                }

            }
            if (!found)
            {
                MessageBox.Show("ID Not Found");
                using (StreamWriter writer = File.AppendText(@"C:\log.txt"))
                {
                    writer.WriteLine(SearchIDInput.Text+": ID Not Found");
                }

            }
        }

        private void EmployeeInformationData_Click(object sender, EventArgs e)
        {

        }
    }
}
