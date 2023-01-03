using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class GradeCalculator : Form
    {
        public GradeCalculator()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void Submit_Click(object sender, EventArgs e)
        {
            bool errorPresent = false;
            int attendance=Convert.ToInt32(textBox1.Text);
            if(attendance<0 || attendance > 28)
            {
                MessageBox.Show("Error Entry for Attendance  (0-28)");
                errorPresent = true;

            }
            int semester=Convert.ToInt32(textBox10.Text);
            if (semester < 0 || semester > 8)
            {
                MessageBox.Show("Error semester is out of range(0-8)");
            }
            string fullname = textBox8.Text;
            string StudentIDstr = textBox9.Text;
            if (StudentIDstr.Length != 9)
            {
                MessageBox.Show("Error StudentID is out of range(has to be of length 9)");
                errorPresent = true;
            }
            double attendance_Decimal = Convert.ToDouble(attendance);
            double attendanceRatio = (attendance_Decimal / 28.0) * 30.0 + 0.00000000001;
            double quiz1=Convert.ToDouble(textBox2.Text);
            if(quiz1<0 || quiz1 > 15)
            {
                MessageBox.Show("Error Entry for Quiz 1 (0-15)");
                errorPresent = true;
            }
            double quiz2=Convert.ToDouble(textBox3.Text);
            if(quiz2<0 || quiz2 > 15)
            {
                MessageBox.Show("Error Entry for Quiz 2 (0-15)");
                errorPresent = true;
            }
            double quiz3=Convert.ToDouble(textBox4.Text);
            if(quiz3<0 || quiz3 > 15)
            {
                MessageBox.Show("Error Entry for Quiz 3 (0-15)");
                errorPresent = true;
            }
            double quiz4=Convert.ToDouble(textBox5.Text); 
            if(quiz4<0 || quiz4 > 15)
            {
                MessageBox.Show("Error Entry for Quiz 4 (0-15)");
                errorPresent = true;
            }
            double[] arr = { quiz1, quiz2, quiz3, quiz4 };
            Array.Sort(arr);
            double sum = 0;
            for(int i=1;i<arr.Length; i++)
            {
                sum+=arr[i];
            }
            sum += 0.00000000001;
            double midMarks=Convert.ToDouble(textBox6.Text);
            midMarks += 0.00000000001;
            if(midMarks<0 || midMarks > 75.000000000011)
            {
                MessageBox.Show("Error Entry Mid Marks (0-75)");
                errorPresent = true;
            }
            double finalMarks=Convert.ToDouble(textBox7.Text);
            finalMarks += 0.00000000001;
            if(finalMarks<0 || finalMarks > 150.000000000011)
            {
                MessageBox.Show("Error Entry Final Marks (0-150)");
                errorPresent = true;
            }
            double Total=attendanceRatio+sum+midMarks+finalMarks;
            double finalResult = (Total / 300.00) * 100.00;
            string finalResultstr = Convert.ToString(finalResult);
            string grd;
            if (finalResult >= 80) grd = "A+";
            else if (finalResult >= 75) grd = "A";
            else if (finalResult >= 70) grd = "A-";
            else if (finalResult >= 65) grd = "B+";
            else if (finalResult >= 60) grd = "B";
            else if (finalResult >= 55) grd = "B-";
            else if (finalResult >= 50) grd = "C+";
            else if (finalResult >= 45) grd = "C";
            else if (finalResult >= 40) grd = "D";
            else
            {
                grd = "F";
            }
            
            if (!errorPresent)
            {
                
                label11.Text = "Attendance: " + Convert.ToString(attendanceRatio).Substring(0, 5) + "\n" +
                    "Mid:" + Convert.ToString(midMarks).Substring(0, 5) + "\n" +
                    "Quiz: " + Convert.ToString(sum).Substring(0, 5) + "\n" +
                    "Final: " + Convert.ToString(finalMarks).Substring(0, 5);
                label14.Text = "Total: "+ Convert.ToString(Total).Substring(0, 6)+"/300";
                label15.Text = "Grade: "+grd;
                label17.Text = fullname + " obtained " + finalResultstr.Substring(0, 5) + "% marks.";
            }


            

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

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {

        }

        private void label11_Click(object sender, EventArgs e)
        {

        }

        private void label9_Click(object sender, EventArgs e)
        {

        }

        private void textBox10_TextChanged(object sender, EventArgs e)
        {

        }

        private void pictureBox4_Click_1(object sender, EventArgs e)
        {

        }

        private void label14_Click(object sender, EventArgs e)
        {

        }

        private void label15_Click(object sender, EventArgs e)
        {

        }
    }
}
