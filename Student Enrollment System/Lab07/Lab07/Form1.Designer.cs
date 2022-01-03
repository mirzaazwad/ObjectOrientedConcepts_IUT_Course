using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab07
{
    partial class StudentEnrollment
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.label11 = new System.Windows.Forms.Label();
            this.RegNo = new System.Windows.Forms.TextBox();
            this.ContactNo = new System.Windows.Forms.TextBox();
            this.Email = new System.Windows.Forms.TextBox();
            this.Address = new System.Windows.Forms.TextBox();
            this.OfficeAddress = new System.Windows.Forms.TextBox();
            this.TypeStudent = new System.Windows.Forms.RadioButton();
            this.TypeProfessional = new System.Windows.Forms.RadioButton();
            this.Type = new System.Windows.Forms.Label();
            this.label12 = new System.Windows.Forms.Label();
            this.Beginner = new System.Windows.Forms.RadioButton();
            this.Intermediate = new System.Windows.Forms.RadioButton();
            this.Advanced = new System.Windows.Forms.RadioButton();
            this.OfficeName = new System.Windows.Forms.TextBox();
            this.SchoolName = new System.Windows.Forms.TextBox();
            this.AddStudent = new System.Windows.Forms.Button();
            this.label13 = new System.Windows.Forms.Label();
            this.label14 = new System.Windows.Forms.Label();
            this.label15 = new System.Windows.Forms.Label();
            this.label16 = new System.Windows.Forms.Label();
            this.CourseBeginner = new System.Windows.Forms.RadioButton();
            this.CourseIntermediate = new System.Windows.Forms.RadioButton();
            this.CourseAdvanced = new System.Windows.Forms.RadioButton();
            this.AddCourse = new System.Windows.Forms.Button();
            this.Title = new System.Windows.Forms.TextBox();
            this.CourseFee = new System.Windows.Forms.TextBox();
            this.label17 = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.panel2 = new System.Windows.Forms.Panel();
            this.panel3 = new System.Windows.Forms.Panel();
            this.label18 = new System.Windows.Forms.Label();
            this.label19 = new System.Windows.Forms.Label();
            this.label20 = new System.Windows.Forms.Label();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.StudentID = new System.Windows.Forms.ComboBox();
            this.CourseID = new System.Windows.Forms.ComboBox();
            this.label21 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.label22 = new System.Windows.Forms.Label();
            this.label23 = new System.Windows.Forms.Label();
            this.StudentID2 = new System.Windows.Forms.ComboBox();
            this.button2 = new System.Windows.Forms.Button();
            this.CoursesList = new System.Windows.Forms.ListBox();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            this.panel3.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(32, 25);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(169, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Enter Participant Information";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(32, 72);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(35, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Name";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(32, 107);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(44, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Reg No";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(32, 140);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(61, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Contact No";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(32, 179);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(32, 13);
            this.label5.TabIndex = 4;
            this.label5.Text = "Email";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(32, 218);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(48, 13);
            this.label6.TabIndex = 5;
            this.label6.Text = "Address:";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(32, 248);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(133, 13);
            this.label7.TabIndex = 6;
            this.label7.Text = "For Professionals Only";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(17, 278);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(76, 13);
            this.label8.TabIndex = 7;
            this.label8.Text = "Office Address";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(32, 308);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(66, 13);
            this.label9.TabIndex = 8;
            this.label9.Text = "Office Name";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(344, 248);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(108, 13);
            this.label10.TabIndex = 9;
            this.label10.Text = "For Students Only";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(344, 278);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(71, 13);
            this.label11.TabIndex = 10;
            this.label11.Text = "School Name";
            // 
            // RegNo
            // 
            this.RegNo.Location = new System.Drawing.Point(101, 100);
            this.RegNo.Name = "RegNo";
            this.RegNo.Size = new System.Drawing.Size(140, 20);
            this.RegNo.TabIndex = 12;
            // 
            // ContactNo
            // 
            this.ContactNo.Location = new System.Drawing.Point(101, 133);
            this.ContactNo.Name = "ContactNo";
            this.ContactNo.Size = new System.Drawing.Size(140, 20);
            this.ContactNo.TabIndex = 13;
            // 
            // Email
            // 
            this.Email.Location = new System.Drawing.Point(101, 172);
            this.Email.Name = "Email";
            this.Email.Size = new System.Drawing.Size(140, 20);
            this.Email.TabIndex = 14;
            // 
            // Address
            // 
            this.Address.Location = new System.Drawing.Point(101, 211);
            this.Address.Name = "Address";
            this.Address.Size = new System.Drawing.Size(206, 20);
            this.Address.TabIndex = 15;
            // 
            // OfficeAddress
            // 
            this.OfficeAddress.Location = new System.Drawing.Point(101, 275);
            this.OfficeAddress.Name = "OfficeAddress";
            this.OfficeAddress.Size = new System.Drawing.Size(206, 20);
            this.OfficeAddress.TabIndex = 16;
            // 
            // TypeStudent
            // 
            this.TypeStudent.AutoSize = true;
            this.TypeStudent.Location = new System.Drawing.Point(14, 14);
            this.TypeStudent.Name = "TypeStudent";
            this.TypeStudent.Size = new System.Drawing.Size(62, 17);
            this.TypeStudent.TabIndex = 17;
            this.TypeStudent.TabStop = true;
            this.TypeStudent.Text = "Student";
            this.TypeStudent.UseVisualStyleBackColor = true;
            this.TypeStudent.CheckedChanged += new System.EventHandler(this.Student_CheckedChanged);
            // 
            // TypeProfessional
            // 
            this.TypeProfessional.AutoSize = true;
            this.TypeProfessional.Location = new System.Drawing.Point(14, 37);
            this.TypeProfessional.Name = "TypeProfessional";
            this.TypeProfessional.Size = new System.Drawing.Size(82, 17);
            this.TypeProfessional.TabIndex = 18;
            this.TypeProfessional.TabStop = true;
            this.TypeProfessional.Text = "Professional";
            this.TypeProfessional.UseVisualStyleBackColor = true;
            this.TypeProfessional.CheckedChanged += new System.EventHandler(this.Professional_CheckedChanged);
            // 
            // Type
            // 
            this.Type.AutoSize = true;
            this.Type.Location = new System.Drawing.Point(294, 68);
            this.Type.Name = "Type";
            this.Type.Size = new System.Drawing.Size(31, 13);
            this.Type.TabIndex = 19;
            this.Type.Text = "Type";
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(284, 122);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(33, 13);
            this.label12.TabIndex = 20;
            this.label12.Text = "Level";
            // 
            // Beginner
            // 
            this.Beginner.AutoSize = true;
            this.Beginner.Location = new System.Drawing.Point(13, 11);
            this.Beginner.Name = "Beginner";
            this.Beginner.Size = new System.Drawing.Size(67, 17);
            this.Beginner.TabIndex = 21;
            this.Beginner.TabStop = true;
            this.Beginner.Text = "Beginner";
            this.Beginner.UseVisualStyleBackColor = true;
            this.Beginner.CheckedChanged += new System.EventHandler(this.Beginner_CheckedChanged);
            // 
            // Intermediate
            // 
            this.Intermediate.AutoSize = true;
            this.Intermediate.Location = new System.Drawing.Point(13, 34);
            this.Intermediate.Name = "Intermediate";
            this.Intermediate.Size = new System.Drawing.Size(83, 17);
            this.Intermediate.TabIndex = 22;
            this.Intermediate.TabStop = true;
            this.Intermediate.Text = "Intermediate";
            this.Intermediate.UseVisualStyleBackColor = true;
            this.Intermediate.CheckedChanged += new System.EventHandler(this.Intermediate_CheckedChanged);
            // 
            // Advanced
            // 
            this.Advanced.AutoSize = true;
            this.Advanced.Location = new System.Drawing.Point(13, 57);
            this.Advanced.Name = "Advanced";
            this.Advanced.Size = new System.Drawing.Size(74, 17);
            this.Advanced.TabIndex = 23;
            this.Advanced.TabStop = true;
            this.Advanced.Text = "Advanced";
            this.Advanced.UseVisualStyleBackColor = true;
            this.Advanced.CheckedChanged += new System.EventHandler(this.radioButton3_CheckedChanged);
            // 
            // OfficeName
            // 
            this.OfficeName.Location = new System.Drawing.Point(101, 305);
            this.OfficeName.Name = "OfficeName";
            this.OfficeName.Size = new System.Drawing.Size(140, 20);
            this.OfficeName.TabIndex = 24;
            this.OfficeName.TextChanged += new System.EventHandler(this.textBox7_TextChanged);
            // 
            // SchoolName
            // 
            this.SchoolName.Location = new System.Drawing.Point(421, 275);
            this.SchoolName.Name = "SchoolName";
            this.SchoolName.Size = new System.Drawing.Size(140, 20);
            this.SchoolName.TabIndex = 25;
            // 
            // AddStudent
            // 
            this.AddStudent.Font = new System.Drawing.Font("Arial", 8.25F);
            this.AddStudent.Location = new System.Drawing.Point(35, 343);
            this.AddStudent.Name = "AddStudent";
            this.AddStudent.Size = new System.Drawing.Size(75, 23);
            this.AddStudent.TabIndex = 26;
            this.AddStudent.Text = "Add";
            this.AddStudent.UseVisualStyleBackColor = true;
            this.AddStudent.Click += new System.EventHandler(this.Add_Click);
            // 
            // label13
            // 
            this.label13.AutoSize = true;
            this.label13.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label13.Location = new System.Drawing.Point(32, 391);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(106, 13);
            this.label13.TabIndex = 27;
            this.label13.Text = "Enter Course Info";
            // 
            // label14
            // 
            this.label14.AutoSize = true;
            this.label14.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F);
            this.label14.Location = new System.Drawing.Point(35, 421);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(27, 13);
            this.label14.TabIndex = 28;
            this.label14.Text = "Title";
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F);
            this.label15.Location = new System.Drawing.Point(37, 449);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(61, 13);
            this.label15.TabIndex = 29;
            this.label15.Text = "Course Fee";
            // 
            // label16
            // 
            this.label16.AutoSize = true;
            this.label16.Location = new System.Drawing.Point(37, 477);
            this.label16.Name = "label16";
            this.label16.Size = new System.Drawing.Size(33, 13);
            this.label16.TabIndex = 30;
            this.label16.Text = "Level";
            // 
            // CourseBeginner
            // 
            this.CourseBeginner.AutoSize = true;
            this.CourseBeginner.Location = new System.Drawing.Point(6, 4);
            this.CourseBeginner.Name = "CourseBeginner";
            this.CourseBeginner.Size = new System.Drawing.Size(67, 17);
            this.CourseBeginner.TabIndex = 31;
            this.CourseBeginner.TabStop = true;
            this.CourseBeginner.Text = "Beginner";
            this.CourseBeginner.UseVisualStyleBackColor = true;
            // 
            // CourseIntermediate
            // 
            this.CourseIntermediate.AutoSize = true;
            this.CourseIntermediate.Location = new System.Drawing.Point(6, 27);
            this.CourseIntermediate.Name = "CourseIntermediate";
            this.CourseIntermediate.Size = new System.Drawing.Size(83, 17);
            this.CourseIntermediate.TabIndex = 32;
            this.CourseIntermediate.TabStop = true;
            this.CourseIntermediate.Text = "Intermediate";
            this.CourseIntermediate.UseVisualStyleBackColor = true;
            // 
            // CourseAdvanced
            // 
            this.CourseAdvanced.AutoSize = true;
            this.CourseAdvanced.Location = new System.Drawing.Point(6, 50);
            this.CourseAdvanced.Name = "CourseAdvanced";
            this.CourseAdvanced.Size = new System.Drawing.Size(74, 17);
            this.CourseAdvanced.TabIndex = 33;
            this.CourseAdvanced.TabStop = true;
            this.CourseAdvanced.Text = "Advanced";
            this.CourseAdvanced.UseVisualStyleBackColor = true;
            // 
            // AddCourse
            // 
            this.AddCourse.Font = new System.Drawing.Font("Arial", 8.25F);
            this.AddCourse.Location = new System.Drawing.Point(40, 542);
            this.AddCourse.Name = "AddCourse";
            this.AddCourse.Size = new System.Drawing.Size(75, 23);
            this.AddCourse.TabIndex = 34;
            this.AddCourse.Text = "Add";
            this.AddCourse.UseVisualStyleBackColor = true;
            this.AddCourse.Click += new System.EventHandler(this.AddCourse_Click);
            // 
            // Title
            // 
            this.Title.Location = new System.Drawing.Point(113, 418);
            this.Title.Name = "Title";
            this.Title.Size = new System.Drawing.Size(140, 20);
            this.Title.TabIndex = 35;
            // 
            // CourseFee
            // 
            this.CourseFee.Location = new System.Drawing.Point(113, 446);
            this.CourseFee.Name = "CourseFee";
            this.CourseFee.Size = new System.Drawing.Size(140, 20);
            this.CourseFee.TabIndex = 36;
            // 
            // label17
            // 
            this.label17.AutoSize = true;
            this.label17.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label17.Location = new System.Drawing.Point(346, 391);
            this.label17.Name = "label17";
            this.label17.Size = new System.Drawing.Size(109, 13);
            this.label17.TabIndex = 37;
            this.label17.Text = "Enroll In A Course";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.TypeStudent);
            this.panel1.Controls.Add(this.TypeProfessional);
            this.panel1.Location = new System.Drawing.Point(331, 53);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(103, 61);
            this.panel1.TabIndex = 38;
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.Beginner);
            this.panel2.Controls.Add(this.Intermediate);
            this.panel2.Controls.Add(this.Advanced);
            this.panel2.Location = new System.Drawing.Point(331, 122);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(103, 83);
            this.panel2.TabIndex = 39;
            // 
            // panel3
            // 
            this.panel3.Controls.Add(this.CourseBeginner);
            this.panel3.Controls.Add(this.CourseIntermediate);
            this.panel3.Controls.Add(this.CourseAdvanced);
            this.panel3.Location = new System.Drawing.Point(113, 472);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(127, 73);
            this.panel3.TabIndex = 40;
            // 
            // label18
            // 
            this.label18.AutoSize = true;
            this.label18.Location = new System.Drawing.Point(341, 418);
            this.label18.Name = "label18";
            this.label18.Size = new System.Drawing.Size(87, 13);
            this.label18.TabIndex = 41;
            this.label18.Text = "Select A Student";
            // 
            // label19
            // 
            this.label19.AutoSize = true;
            this.label19.Location = new System.Drawing.Point(344, 446);
            this.label19.Name = "label19";
            this.label19.Size = new System.Drawing.Size(85, 13);
            this.label19.TabIndex = 42;
            this.label19.Text = "Selected Course";
            this.label19.Click += new System.EventHandler(this.label19_Click);
            // 
            // label20
            // 
            this.label20.AutoSize = true;
            this.label20.Location = new System.Drawing.Point(344, 472);
            this.label20.Name = "label20";
            this.label20.Size = new System.Drawing.Size(82, 13);
            this.label20.TabIndex = 43;
            this.label20.Text = "Enrollment Date";
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.Location = new System.Drawing.Point(432, 470);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(200, 20);
            this.dateTimePicker1.TabIndex = 44;
            this.dateTimePicker1.ValueChanged += new System.EventHandler(this.dateTimePicker1_ValueChanged);
            // 
            // StudentID
            // 
            this.StudentID.FormattingEnabled = true;
            this.StudentID.Location = new System.Drawing.Point(432, 413);
            this.StudentID.Name = "StudentID";
            this.StudentID.Size = new System.Drawing.Size(121, 21);
            this.StudentID.TabIndex = 45;
            this.StudentID.SelectedIndexChanged += new System.EventHandler(this.StudentID_SelectedIndexChanged);
            // 
            // CourseID
            // 
            this.CourseID.FormattingEnabled = true;
            this.CourseID.Location = new System.Drawing.Point(432, 440);
            this.CourseID.Name = "CourseID";
            this.CourseID.Size = new System.Drawing.Size(121, 21);
            this.CourseID.TabIndex = 46;
            this.CourseID.SelectedIndexChanged += new System.EventHandler(this.CourseID_SelectedIndexChanged);
            // 
            // label21
            // 
            this.label21.AutoSize = true;
            this.label21.Location = new System.Drawing.Point(344, 503);
            this.label21.Name = "label21";
            this.label21.Size = new System.Drawing.Size(89, 13);
            this.label21.TabIndex = 47;
            this.label21.Text = "Course Fee: BDT";
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Arial", 8.25F);
            this.button1.Location = new System.Drawing.Point(519, 503);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(113, 23);
            this.button1.TabIndex = 48;
            this.button1.Text = "Pay And Enroll";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // label22
            // 
            this.label22.AutoSize = true;
            this.label22.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label22.Location = new System.Drawing.Point(623, 25);
            this.label22.Name = "label22";
            this.label22.Size = new System.Drawing.Size(133, 13);
            this.label22.TabIndex = 49;
            this.label22.Text = "View Enrolled Courses";
            // 
            // label23
            // 
            this.label23.AutoSize = true;
            this.label23.Location = new System.Drawing.Point(623, 53);
            this.label23.Name = "label23";
            this.label23.Size = new System.Drawing.Size(87, 13);
            this.label23.TabIndex = 50;
            this.label23.Text = "Select A Student";
            // 
            // StudentID2
            // 
            this.StudentID2.FormattingEnabled = true;
            this.StudentID2.Location = new System.Drawing.Point(734, 50);
            this.StudentID2.Name = "StudentID2";
            this.StudentID2.Size = new System.Drawing.Size(121, 21);
            this.StudentID2.TabIndex = 51;
            // 
            // button2
            // 
            this.button2.Font = new System.Drawing.Font("Arial", 8.25F);
            this.button2.Location = new System.Drawing.Point(626, 77);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(211, 23);
            this.button2.TabIndex = 52;
            this.button2.Text = "Show Enrolled Courses";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // CoursesList
            // 
            this.CoursesList.FormattingEnabled = true;
            this.CoursesList.Location = new System.Drawing.Point(626, 122);
            this.CoursesList.Name = "CoursesList";
            this.CoursesList.Size = new System.Drawing.Size(318, 147);
            this.CoursesList.TabIndex = 53;
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(100, 65);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(140, 20);
            this.textBox1.TabIndex = 54;
            this.textBox1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // StudentEnrollment
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(972, 596);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.CoursesList);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.StudentID2);
            this.Controls.Add(this.label23);
            this.Controls.Add(this.label22);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label21);
            this.Controls.Add(this.CourseID);
            this.Controls.Add(this.StudentID);
            this.Controls.Add(this.dateTimePicker1);
            this.Controls.Add(this.label20);
            this.Controls.Add(this.label19);
            this.Controls.Add(this.label18);
            this.Controls.Add(this.panel3);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.label17);
            this.Controls.Add(this.CourseFee);
            this.Controls.Add(this.Title);
            this.Controls.Add(this.AddCourse);
            this.Controls.Add(this.label16);
            this.Controls.Add(this.label15);
            this.Controls.Add(this.label14);
            this.Controls.Add(this.label13);
            this.Controls.Add(this.AddStudent);
            this.Controls.Add(this.SchoolName);
            this.Controls.Add(this.OfficeName);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.Type);
            this.Controls.Add(this.OfficeAddress);
            this.Controls.Add(this.Address);
            this.Controls.Add(this.Email);
            this.Controls.Add(this.ContactNo);
            this.Controls.Add(this.RegNo);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "StudentEnrollment";
            this.Text = "Student Course Enrollment";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.TextBox RegNo;
        private System.Windows.Forms.TextBox ContactNo;
        private System.Windows.Forms.TextBox Email;
        private System.Windows.Forms.TextBox Address;
        private System.Windows.Forms.TextBox OfficeAddress;
        private System.Windows.Forms.RadioButton TypeStudent;
        private System.Windows.Forms.RadioButton TypeProfessional;
        private System.Windows.Forms.Label Type;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.RadioButton Beginner;
        private System.Windows.Forms.RadioButton Intermediate;
        private System.Windows.Forms.RadioButton Advanced;
        private System.Windows.Forms.TextBox OfficeName;
        private System.Windows.Forms.TextBox SchoolName;
        private System.Windows.Forms.Button AddStudent;
        private System.Windows.Forms.Label label13;
        private System.Windows.Forms.Label label14;
        private System.Windows.Forms.Label label15;
        private System.Windows.Forms.Label label16;
        private System.Windows.Forms.RadioButton CourseBeginner;
        private System.Windows.Forms.RadioButton CourseIntermediate;
        private System.Windows.Forms.RadioButton CourseAdvanced;
        private System.Windows.Forms.Button AddCourse;
        private System.Windows.Forms.TextBox Title;
        private System.Windows.Forms.TextBox CourseFee;
        private System.Windows.Forms.Label label17;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Label label18;
        private System.Windows.Forms.Label label19;
        private System.Windows.Forms.Label label20;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
        private System.Windows.Forms.ComboBox StudentID;
        private System.Windows.Forms.ComboBox CourseID;
        private System.Windows.Forms.Label label21;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label22;
        private System.Windows.Forms.Label label23;
        private System.Windows.Forms.ComboBox StudentID2;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.ListBox CoursesList;
        private TextBox textBox1;
    }
}

