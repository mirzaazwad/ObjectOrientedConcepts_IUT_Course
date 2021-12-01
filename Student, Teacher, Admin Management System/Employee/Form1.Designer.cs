namespace Employee
{
    partial class UMS
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
            this.StudentID = new System.Windows.Forms.TextBox();
            this.nameStudent = new System.Windows.Forms.TextBox();
            this.deptStudent = new System.Windows.Forms.TextBox();
            this.Semester = new System.Windows.Forms.TextBox();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.TeacherID = new System.Windows.Forms.TextBox();
            this.nameTeacher = new System.Windows.Forms.TextBox();
            this.deptTeacher = new System.Windows.Forms.TextBox();
            this.designationTeacher = new System.Windows.Forms.TextBox();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.label11 = new System.Windows.Forms.Label();
            this.label12 = new System.Windows.Forms.Label();
            this.nameAdmin = new System.Windows.Forms.TextBox();
            this.label13 = new System.Windows.Forms.Label();
            this.AdminID = new System.Windows.Forms.TextBox();
            this.label14 = new System.Windows.Forms.Label();
            this.designationAdmin = new System.Windows.Forms.TextBox();
            this.label15 = new System.Windows.Forms.Label();
            this.salaryAdmin = new System.Windows.Forms.TextBox();
            this.label16 = new System.Windows.Forms.Label();
            this.salaryTeacher = new System.Windows.Forms.TextBox();
            this.clearStudent = new System.Windows.Forms.Button();
            this.saveStudent = new System.Windows.Forms.Button();
            this.clearTeacher = new System.Windows.Forms.Button();
            this.saveTeacher = new System.Windows.Forms.Button();
            this.clearAdmin = new System.Windows.Forms.Button();
            this.saveAdmin = new System.Windows.Forms.Button();
            this.studentListBox = new System.Windows.Forms.ListBox();
            this.teacherListBox = new System.Windows.Forms.ListBox();
            this.adminListBox = new System.Windows.Forms.ListBox();
            this.showStudent = new System.Windows.Forms.Button();
            this.showTeacher = new System.Windows.Forms.Button();
            this.showAdmin = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label1.Location = new System.Drawing.Point(142, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(74, 24);
            this.label1.TabIndex = 0;
            this.label1.Text = "Student";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(17, 55);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(58, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Student ID";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(20, 91);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(35, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Name";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(20, 124);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(62, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Department";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(20, 160);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(51, 13);
            this.label5.TabIndex = 4;
            this.label5.Text = "Semester";
            // 
            // StudentID
            // 
            this.StudentID.Location = new System.Drawing.Point(96, 55);
            this.StudentID.Name = "StudentID";
            this.StudentID.Size = new System.Drawing.Size(226, 20);
            this.StudentID.TabIndex = 5;
            this.StudentID.TextChanged += new System.EventHandler(this.StudentID_TextChanged);
            // 
            // nameStudent
            // 
            this.nameStudent.Location = new System.Drawing.Point(96, 88);
            this.nameStudent.Name = "nameStudent";
            this.nameStudent.Size = new System.Drawing.Size(226, 20);
            this.nameStudent.TabIndex = 6;
            this.nameStudent.TextChanged += new System.EventHandler(this.Name_TextChanged);
            // 
            // deptStudent
            // 
            this.deptStudent.Location = new System.Drawing.Point(96, 124);
            this.deptStudent.Name = "deptStudent";
            this.deptStudent.Size = new System.Drawing.Size(226, 20);
            this.deptStudent.TabIndex = 7;
            this.deptStudent.TextChanged += new System.EventHandler(this.Department_TextChanged);
            // 
            // Semester
            // 
            this.Semester.Location = new System.Drawing.Point(96, 157);
            this.Semester.Name = "Semester";
            this.Semester.Size = new System.Drawing.Size(226, 20);
            this.Semester.TabIndex = 8;
            this.Semester.TextChanged += new System.EventHandler(this.Semester_TextChanged);
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.pictureBox1.Location = new System.Drawing.Point(328, 2);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(10, 515);
            this.pictureBox1.TabIndex = 9;
            this.pictureBox1.TabStop = false;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label6.Location = new System.Drawing.Point(540, 9);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(81, 24);
            this.label6.TabIndex = 10;
            this.label6.Text = "Teacher";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(344, 48);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(61, 13);
            this.label7.TabIndex = 11;
            this.label7.Text = "Teacher ID";
            this.label7.Click += new System.EventHandler(this.label7_Click);
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(344, 77);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(35, 13);
            this.label8.TabIndex = 12;
            this.label8.Text = "Name";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(344, 104);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(62, 13);
            this.label9.TabIndex = 13;
            this.label9.Text = "Department";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(344, 133);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(63, 13);
            this.label10.TabIndex = 14;
            this.label10.Text = "Designation";
            // 
            // TeacherID
            // 
            this.TeacherID.Location = new System.Drawing.Point(413, 45);
            this.TeacherID.Name = "TeacherID";
            this.TeacherID.Size = new System.Drawing.Size(306, 20);
            this.TeacherID.TabIndex = 15;
            this.TeacherID.TextChanged += new System.EventHandler(this.TeacherID_TextChanged);
            // 
            // nameTeacher
            // 
            this.nameTeacher.Location = new System.Drawing.Point(413, 77);
            this.nameTeacher.Name = "nameTeacher";
            this.nameTeacher.Size = new System.Drawing.Size(306, 20);
            this.nameTeacher.TabIndex = 16;
            this.nameTeacher.TextChanged += new System.EventHandler(this.nameTeacher_TextChanged);
            // 
            // deptTeacher
            // 
            this.deptTeacher.Location = new System.Drawing.Point(413, 103);
            this.deptTeacher.Name = "deptTeacher";
            this.deptTeacher.Size = new System.Drawing.Size(306, 20);
            this.deptTeacher.TabIndex = 17;
            this.deptTeacher.TextChanged += new System.EventHandler(this.deptTeacher_TextChanged);
            // 
            // designationTeacher
            // 
            this.designationTeacher.Location = new System.Drawing.Point(413, 130);
            this.designationTeacher.Name = "designationTeacher";
            this.designationTeacher.Size = new System.Drawing.Size(306, 20);
            this.designationTeacher.TabIndex = 18;
            this.designationTeacher.TextChanged += new System.EventHandler(this.designationTeacher_TextChanged);
            // 
            // pictureBox2
            // 
            this.pictureBox2.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.pictureBox2.Location = new System.Drawing.Point(738, 2);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(10, 521);
            this.pictureBox2.TabIndex = 19;
            this.pictureBox2.TabStop = false;
            this.pictureBox2.Click += new System.EventHandler(this.pictureBox2_Click);
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label11.Location = new System.Drawing.Point(892, 9);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(119, 24);
            this.label11.TabIndex = 20;
            this.label11.Text = "Administrator";
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(764, 74);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(35, 13);
            this.label12.TabIndex = 21;
            this.label12.Text = "Name";
            // 
            // nameAdmin
            // 
            this.nameAdmin.Location = new System.Drawing.Point(833, 71);
            this.nameAdmin.Name = "nameAdmin";
            this.nameAdmin.Size = new System.Drawing.Size(237, 20);
            this.nameAdmin.TabIndex = 22;
            this.nameAdmin.TextChanged += new System.EventHandler(this.nameAdmin_TextChanged);
            // 
            // label13
            // 
            this.label13.AutoSize = true;
            this.label13.Location = new System.Drawing.Point(764, 48);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(50, 13);
            this.label13.TabIndex = 23;
            this.label13.Text = "Admin ID";
            // 
            // AdminID
            // 
            this.AdminID.Location = new System.Drawing.Point(833, 45);
            this.AdminID.Name = "AdminID";
            this.AdminID.Size = new System.Drawing.Size(237, 20);
            this.AdminID.TabIndex = 24;
            this.AdminID.TextChanged += new System.EventHandler(this.AdminID_TextChanged);
            // 
            // label14
            // 
            this.label14.AutoSize = true;
            this.label14.Location = new System.Drawing.Point(764, 100);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(63, 13);
            this.label14.TabIndex = 25;
            this.label14.Text = "Designation";
            // 
            // designationAdmin
            // 
            this.designationAdmin.Location = new System.Drawing.Point(833, 97);
            this.designationAdmin.Name = "designationAdmin";
            this.designationAdmin.Size = new System.Drawing.Size(237, 20);
            this.designationAdmin.TabIndex = 26;
            this.designationAdmin.TextChanged += new System.EventHandler(this.designationAdmin_TextChanged);
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Location = new System.Drawing.Point(764, 131);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(36, 13);
            this.label15.TabIndex = 27;
            this.label15.Text = "Salary";
            // 
            // salaryAdmin
            // 
            this.salaryAdmin.Location = new System.Drawing.Point(833, 128);
            this.salaryAdmin.Name = "salaryAdmin";
            this.salaryAdmin.Size = new System.Drawing.Size(237, 20);
            this.salaryAdmin.TabIndex = 28;
            this.salaryAdmin.TextChanged += new System.EventHandler(this.salaryAdmin_TextChanged);
            // 
            // label16
            // 
            this.label16.AutoSize = true;
            this.label16.Location = new System.Drawing.Point(344, 155);
            this.label16.Name = "label16";
            this.label16.Size = new System.Drawing.Size(36, 13);
            this.label16.TabIndex = 29;
            this.label16.Text = "Salary";
            // 
            // salaryTeacher
            // 
            this.salaryTeacher.Location = new System.Drawing.Point(413, 154);
            this.salaryTeacher.Name = "salaryTeacher";
            this.salaryTeacher.Size = new System.Drawing.Size(306, 20);
            this.salaryTeacher.TabIndex = 30;
            this.salaryTeacher.TextChanged += new System.EventHandler(this.salaryTeacher_TextChanged);
            // 
            // clearStudent
            // 
            this.clearStudent.Location = new System.Drawing.Point(20, 179);
            this.clearStudent.Name = "clearStudent";
            this.clearStudent.Size = new System.Drawing.Size(75, 23);
            this.clearStudent.TabIndex = 31;
            this.clearStudent.Text = "Clear";
            this.clearStudent.UseVisualStyleBackColor = true;
            this.clearStudent.Click += new System.EventHandler(this.clearStudent_Click);
            // 
            // saveStudent
            // 
            this.saveStudent.Location = new System.Drawing.Point(247, 183);
            this.saveStudent.Name = "saveStudent";
            this.saveStudent.Size = new System.Drawing.Size(75, 23);
            this.saveStudent.TabIndex = 32;
            this.saveStudent.Text = "Save";
            this.saveStudent.UseVisualStyleBackColor = true;
            this.saveStudent.Click += new System.EventHandler(this.saveStudent_Click);
            // 
            // clearTeacher
            // 
            this.clearTeacher.Location = new System.Drawing.Point(347, 183);
            this.clearTeacher.Name = "clearTeacher";
            this.clearTeacher.Size = new System.Drawing.Size(75, 23);
            this.clearTeacher.TabIndex = 33;
            this.clearTeacher.Text = "Clear";
            this.clearTeacher.UseVisualStyleBackColor = true;
            this.clearTeacher.Click += new System.EventHandler(this.clearTeacher_Click);
            // 
            // saveTeacher
            // 
            this.saveTeacher.Location = new System.Drawing.Point(644, 183);
            this.saveTeacher.Name = "saveTeacher";
            this.saveTeacher.Size = new System.Drawing.Size(75, 23);
            this.saveTeacher.TabIndex = 34;
            this.saveTeacher.Text = "Save";
            this.saveTeacher.UseVisualStyleBackColor = true;
            this.saveTeacher.Click += new System.EventHandler(this.saveTeacher_Click);
            // 
            // clearAdmin
            // 
            this.clearAdmin.Location = new System.Drawing.Point(767, 154);
            this.clearAdmin.Name = "clearAdmin";
            this.clearAdmin.Size = new System.Drawing.Size(75, 23);
            this.clearAdmin.TabIndex = 35;
            this.clearAdmin.Text = "Clear";
            this.clearAdmin.UseVisualStyleBackColor = true;
            this.clearAdmin.Click += new System.EventHandler(this.clearAdmin_Click);
            // 
            // saveAdmin
            // 
            this.saveAdmin.Location = new System.Drawing.Point(995, 149);
            this.saveAdmin.Name = "saveAdmin";
            this.saveAdmin.Size = new System.Drawing.Size(75, 23);
            this.saveAdmin.TabIndex = 36;
            this.saveAdmin.Text = "Save";
            this.saveAdmin.UseVisualStyleBackColor = true;
            this.saveAdmin.Click += new System.EventHandler(this.saveAdmin_Click);
            // 
            // studentListBox
            // 
            this.studentListBox.FormattingEnabled = true;
            this.studentListBox.Location = new System.Drawing.Point(17, 208);
            this.studentListBox.Name = "studentListBox";
            this.studentListBox.Size = new System.Drawing.Size(305, 199);
            this.studentListBox.TabIndex = 37;
            this.studentListBox.SelectedIndexChanged += new System.EventHandler(this.studentListBox_SelectedIndexChanged);
            // 
            // teacherListBox
            // 
            this.teacherListBox.FormattingEnabled = true;
            this.teacherListBox.Location = new System.Drawing.Point(347, 208);
            this.teacherListBox.Name = "teacherListBox";
            this.teacherListBox.Size = new System.Drawing.Size(372, 199);
            this.teacherListBox.TabIndex = 38;
            this.teacherListBox.SelectedIndexChanged += new System.EventHandler(this.teacherListBox_SelectedIndexChanged);
            // 
            // adminListBox
            // 
            this.adminListBox.FormattingEnabled = true;
            this.adminListBox.Location = new System.Drawing.Point(767, 179);
            this.adminListBox.Name = "adminListBox";
            this.adminListBox.Size = new System.Drawing.Size(303, 186);
            this.adminListBox.TabIndex = 39;
            this.adminListBox.SelectedIndexChanged += new System.EventHandler(this.adminListBox_SelectedIndexChanged);
            // 
            // showStudent
            // 
            this.showStudent.Location = new System.Drawing.Point(17, 416);
            this.showStudent.Name = "showStudent";
            this.showStudent.Size = new System.Drawing.Size(305, 23);
            this.showStudent.TabIndex = 40;
            this.showStudent.Text = "Show Student List";
            this.showStudent.UseVisualStyleBackColor = true;
            this.showStudent.Click += new System.EventHandler(this.showStudent_Click);
            // 
            // showTeacher
            // 
            this.showTeacher.Location = new System.Drawing.Point(347, 416);
            this.showTeacher.Name = "showTeacher";
            this.showTeacher.Size = new System.Drawing.Size(372, 23);
            this.showTeacher.TabIndex = 41;
            this.showTeacher.Text = "Show Teacher List";
            this.showTeacher.UseVisualStyleBackColor = true;
            this.showTeacher.Click += new System.EventHandler(this.showTeacher_Click);
            // 
            // showAdmin
            // 
            this.showAdmin.Location = new System.Drawing.Point(767, 374);
            this.showAdmin.Name = "showAdmin";
            this.showAdmin.Size = new System.Drawing.Size(303, 23);
            this.showAdmin.TabIndex = 42;
            this.showAdmin.Text = "Show Admin List";
            this.showAdmin.UseVisualStyleBackColor = true;
            this.showAdmin.Click += new System.EventHandler(this.showAdmin_Click);
            // 
            // UMS
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1119, 506);
            this.Controls.Add(this.showAdmin);
            this.Controls.Add(this.showTeacher);
            this.Controls.Add(this.showStudent);
            this.Controls.Add(this.adminListBox);
            this.Controls.Add(this.teacherListBox);
            this.Controls.Add(this.studentListBox);
            this.Controls.Add(this.saveAdmin);
            this.Controls.Add(this.clearAdmin);
            this.Controls.Add(this.saveTeacher);
            this.Controls.Add(this.clearTeacher);
            this.Controls.Add(this.saveStudent);
            this.Controls.Add(this.clearStudent);
            this.Controls.Add(this.salaryTeacher);
            this.Controls.Add(this.label16);
            this.Controls.Add(this.salaryAdmin);
            this.Controls.Add(this.label15);
            this.Controls.Add(this.designationAdmin);
            this.Controls.Add(this.label14);
            this.Controls.Add(this.AdminID);
            this.Controls.Add(this.label13);
            this.Controls.Add(this.nameAdmin);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.designationTeacher);
            this.Controls.Add(this.deptTeacher);
            this.Controls.Add(this.nameTeacher);
            this.Controls.Add(this.TeacherID);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.Semester);
            this.Controls.Add(this.deptStudent);
            this.Controls.Add(this.nameStudent);
            this.Controls.Add(this.StudentID);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "UMS";
            this.Text = "University Management System";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox StudentID;
        private System.Windows.Forms.TextBox deptStudent;
        private System.Windows.Forms.TextBox Semester;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox TeacherID;
        private System.Windows.Forms.TextBox nameTeacher;
        private System.Windows.Forms.TextBox deptTeacher;
        private System.Windows.Forms.TextBox designationTeacher;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.TextBox nameAdmin;
        private System.Windows.Forms.Label label13;
        private System.Windows.Forms.TextBox AdminID;
        private System.Windows.Forms.Label label14;
        private System.Windows.Forms.TextBox designationAdmin;
        private System.Windows.Forms.Label label15;
        private System.Windows.Forms.TextBox salaryAdmin;
        private System.Windows.Forms.Label label16;
        private System.Windows.Forms.TextBox salaryTeacher;
        private System.Windows.Forms.Button clearStudent;
        private System.Windows.Forms.Button saveStudent;
        private System.Windows.Forms.Button clearTeacher;
        private System.Windows.Forms.Button saveTeacher;
        private System.Windows.Forms.Button clearAdmin;
        private System.Windows.Forms.Button saveAdmin;
        private System.Windows.Forms.ListBox studentListBox;
        private System.Windows.Forms.ListBox teacherListBox;
        private System.Windows.Forms.ListBox adminListBox;
        private System.Windows.Forms.Button showStudent;
        private System.Windows.Forms.Button showTeacher;
        private System.Windows.Forms.Button showAdmin;
        private System.Windows.Forms.TextBox nameStudent;
    }
}

