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

namespace LabFinal
{
    public partial class IUTRPS : Form
    {
        public IUTRPS()
        {
            InitializeComponent();
        }

        private void IUTRPS_Load(object sender, EventArgs e)
        {
            informationList.Text = "Attendance: \n\n Quiz1: \n\n Quiz2: \n\n Quiz3: \n\n Quiz4: \n\n Quiz Total(Best of 3): \n\n Mid: \n\n Final: \n\n Viva: \n\n Total(Out of 300): \n\n Percentage: \n\n Grade: \n\n ";
            StudentDetailsListBox.Items.Add("Course Name: Object Oriented Concepts I");
            StudentDetailsListBox.Items.Add("");
            StudentDetailsListBox.Items.Add("ID \t\t Name \t\t Percentage \t\t Grade");
            initialise_ListBox();
            initialise_studentList();
        }

        private void initialise_studentList()
        {
            var file = @"D:\SWE4201MarkSheet.csv";
            var studentList = from student in File.ReadAllLines(file)
                              let x = student.Split(',')
                              select x;
            studentList=studentList.Skip(1);
            foreach (var dummy_student in studentList)
            {
                for(int i = 0; i < dummy_student.Count(); i++)
                {
                    if (dummy_student[i] == null || dummy_student[i]=="" || dummy_student[i]==" ")
                    {
                        dummy_student[i] = "0";
                    }
                }
            }
            foreach(var dummy_student in studentList)
            {
                string Name = dummy_student[1];
                string ID = dummy_student[0];
           
                double quiz1 = Convert.ToDouble(dummy_student[2]);
                double quiz2 = Convert.ToDouble(dummy_student[3]);
                double quiz3 = Convert.ToDouble(dummy_student[4]);
                double quiz4 = Convert.ToDouble(dummy_student[5]);
                double mid = Convert.ToDouble(dummy_student[6]);
                double final = Convert.ToDouble(dummy_student[7]);
                double viva = Convert.ToDouble(dummy_student[8]);
                double attendance = Convert.ToDouble(dummy_student[9]);
                Student student = new Student(ID,Name,quiz1,quiz2,quiz3,quiz4,mid,final,viva,attendance) ;
                Utilities.studentList.Add(student);
              
            }
            foreach(Student student in Utilities.studentList)
            {
                StudentDetailsListBox.Items.Add(student.getStudentDetailsInfo());
            }

        }

        private void initialise_ListBox()
        {
            StudentDetailsListBox.Items.Clear();
            StudentDetailsListBox.Items.Add("Course Name: Object Oriented Concepts I");
            StudentDetailsListBox.Items.Add("");
            StudentDetailsListBox.Items.Add("ID \t\t Name \t\t Percentage \t\t Grade");

        }

        private void informationList_Click(object sender, EventArgs e)
        {

        }

        private void SearchButton_Click(object sender, EventArgs e)
        {
            string txt = textBox1.Text;
            foreach(Student student in Utilities.studentList)
            {
                if (student.id == txt)
                {
                    informationList.Text = student.getResultDetails();
                }
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
