using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;



namespace Employee
{   
    public partial class UMS : Form
    {
        public UMS()
        {
            InitializeComponent();
        }
        
        List<Student>students=new List<Student>();
        List<Teacher>teachers=new List<Teacher>();
        List<Admin> admins=new List<Admin>();

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void StudentID_TextChanged(object sender, EventArgs e)
        {

        }

        private void Department_TextChanged(object sender, EventArgs e)
        {

        }

        private void Name_TextChanged(object sender, EventArgs e)
        {

        }

        private void Semester_TextChanged(object sender, EventArgs e)
        {

        }

        private void studentListBox_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void clearStudent_Click(object sender, EventArgs e)
        {
            StudentID.Text = String.Empty;
            nameStudent.Text = String.Empty;
            deptStudent.Text = String.Empty;
            Semester.Text = String.Empty;  
        }

        private void saveStudent_Click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(StudentID.Text);
            string name=nameStudent.Text;
            string dept=deptStudent.Text;   
            string semester=Semester.Text;
            Student studentData = new Student();
            studentData.setinfo(id, name, dept, semester);
            if (!students.Contains(studentData))
            {
                students.Add(studentData);
                showStudentMethod();
            }
        }

        private void showStudent_Click(object sender, EventArgs e)
        {
            showStudentMethod();
        }
        
        private void showStudentMethod()
        {
            studentListBox.Items.Clear();
            foreach (Student student in students)
            {
                if (!studentListBox.Items.Contains(student.getinfo()))
                {
                    studentListBox.Items.Add(student.getinfo());
                }
            }
        }

        private void teacherListBox_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void showTeacher_Click(object sender, EventArgs e)
        {
            showTeacherMethod();
        }
        private void showTeacherMethod()
        {
            teacherListBox.Items.Clear();
            foreach (Teacher teacher in teachers)
            {
                if (!teacherListBox.Items.Contains(teacher.getinfo()))
                {
                    teacherListBox.Items.Add(teacher.getinfo());
                }
            }
        }

        private void clearTeacher_Click(object sender, EventArgs e)
        {
            TeacherID.Text = String.Empty;
            nameTeacher.Text = String.Empty;
            deptTeacher.Text = String.Empty;
            designationTeacher.Text = String.Empty;
            salaryTeacher.Text= String.Empty;
        }

        private void saveTeacher_Click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(TeacherID.Text);
            string name = nameTeacher.Text;
            string dept = deptTeacher.Text;
            string designation = designationTeacher.Text;
            double salary = Convert.ToDouble(salaryTeacher.Text);

            Teacher teacherData = new Teacher();
            teacherData.setinfo(id, name, dept, designation,salary);
            if (!teachers.Contains(teacherData))
            {
                teachers.Add(teacherData);
            }
            showTeacherMethod();
        }

        private void salaryTeacher_TextChanged(object sender, EventArgs e)
        {

        }

        private void designationTeacher_TextChanged(object sender, EventArgs e)
        {

        }

        private void deptTeacher_TextChanged(object sender, EventArgs e)
        {

        }

        private void nameTeacher_TextChanged(object sender, EventArgs e)
        {

        }

        private void TeacherID_TextChanged(object sender, EventArgs e)
        {

        }

        private void AdminID_TextChanged(object sender, EventArgs e)
        {

        }

        private void nameAdmin_TextChanged(object sender, EventArgs e)
        {

        }

        private void designationAdmin_TextChanged(object sender, EventArgs e)
        {

        }

        private void salaryAdmin_TextChanged(object sender, EventArgs e)
        {

        }

        private void clearAdmin_Click(object sender, EventArgs e)
        {
            AdminID.Text = String.Empty;
            nameAdmin.Text = String.Empty;
            designationAdmin.Text = String.Empty;
            salaryAdmin.Text = String.Empty;
            
        }

        private void saveAdmin_Click(object sender, EventArgs e)
        {
            int id=Convert.ToInt32(AdminID.Text);
            string name=nameAdmin.Text;
            string designation=designationAdmin.Text;
            double salary = Convert.ToDouble(salaryAdmin.Text);
            Admin adminData = new Admin();
            adminData.setinfo(id, name, designation, salary);
            if (!admins.Contains(adminData))
            {
                admins.Add(adminData);
            }
            showAdminMethod();
        }
        
    private void adminListBox_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void showAdmin_Click(object sender, EventArgs e)
        {
            showAdminMethod();
        }
        private void showAdminMethod()
        {
            adminListBox.Items.Clear();
            foreach (Admin admin in admins)
            {
                if (!adminListBox.Items.Contains(admin.getinfo()))
                {
                    adminListBox.Items.Add(admin.getinfo());
                }
            }
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }
    }
}
