using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Lab07_dependecies;

namespace Lab07
{
    public partial class StudentEnrollment : Form
    {
        public StudentEnrollment()
        {
            InitializeComponent();
        }
        public bool isProfessional=false;
        private void Form1_Load(object sender, EventArgs e)
        {
            MessageBox.Show("Enter Student Type First");
            CoursesList.Items.Clear();
        }

        private void Student_CheckedChanged(object sender, EventArgs e)
        {
            if (TypeStudent.Checked)
            {
                TypeProfessional.Checked = false;
            }
        }

        private void Professional_CheckedChanged(object sender, EventArgs e)
        {
            if (TypeProfessional.Checked)
            {
                TypeStudent.Checked = false;
            }
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void Intermediate_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void Beginner_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void Add_Click(object sender, EventArgs e)
        {
            string level=null;
            if (Beginner.Checked)
            {
                level = "Beginner";
            }
            else if (Intermediate.Checked)
            {
                level = "Intermediate";
            }
            else if(Advanced.Checked)
            {
                level = "Advanced";
            }
            if (TypeStudent.Checked)
            {
                Student student = new Student(textBox1.Text,RegNo.Text,ContactNo.Text,Email.Text,Address.Text,level,SchoolName.Text);
                StudentID.Items.Add(RegNo.Text);
                Enroll.studentsList.Add(student);
            }
            else
            {
                Professional professional = new Professional(textBox1.Text, RegNo.Text, ContactNo.Text, Email.Text, Address.Text, level, OfficeName.Text,OfficeAddress.Text);
                StudentID.Items.Add(RegNo.Text);
                Enroll.professionalList.Add(professional);
            }
            MessageBox.Show("Student Added");
        }

        private void label19_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            CoursesList.Items.Clear();
            for(int i = 0; i < Enroll.courseIDList.Count(); i++)
            {
                CoursesList.Items.Add(Enroll.courseIDList[i]+"\t"+Convert.ToString(Enroll.dateList[i]));
            }
            
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void AddCourse_Click(object sender, EventArgs e)
        {
            string level = null;
            if (CourseBeginner.Checked)
            {
                level = "Beginner";
            }
            else if (CourseIntermediate.Checked)
            {
                level = "Intermediate";
            }
            else if (CourseAdvanced.Checked)
            {
                level = "Advanced";
            }
            Courses course = new Courses(Title.Text, Convert.ToDouble(CourseFee.Text), level);
            Enroll.coursesList.Add(course);
            CourseID.Items.Add(Title.Text);

        }

        private void button1_Click(object sender, EventArgs e)
        {
            StudentID2.Items.Add(StudentID.Text);
            Enroll.courseIDList.Add(CourseID.Text);
            
            Enroll.enrollmentDate = dateTimePicker1.Value;
            Enroll.dateList.Add(Enroll.enrollmentDate);

        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {

        }

        private void CourseID_SelectedIndexChanged(object sender, EventArgs e)
        {
         
            foreach (Courses course in Enroll.coursesList)
            {
                if (course.Title == CourseID.Text)
                {
                    double fee = course.Fee;
                    if (isProfessional)
                    {
                        fee = fee * 1.10;
                    }
                    label21.Text = "Course Fee: BDT" + Convert.ToString(fee);
                }
            }
        }

        private void StudentID_SelectedIndexChanged(object sender, EventArgs e)
        {
            foreach(Student student in Enroll.studentsList)
            {
                if (student.RegistrationNumber == StudentID.Text)
                {
                    isProfessional = false;
                    return;
                }
            }
            foreach(Professional professional in Enroll.professionalList)
            {
                if (professional.RegistrationNumber == StudentID.Text)
                {
                    isProfessional = true;
                    return;
                }
            }
        }
    }
}
