namespace LabFinal
{
    partial class IUTRPS
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
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.studentIDlabel = new System.Windows.Forms.Label();
            this.developerName = new System.Windows.Forms.Label();
            this.informationList = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.StudentDetailsListBox = new System.Windows.Forms.ListBox();
            this.SearchButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(844, 53);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(147, 20);
            this.textBox1.TabIndex = 0;
            this.textBox1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // studentIDlabel
            // 
            this.studentIDlabel.AutoSize = true;
            this.studentIDlabel.Location = new System.Drawing.Point(779, 59);
            this.studentIDlabel.Name = "studentIDlabel";
            this.studentIDlabel.Size = new System.Drawing.Size(64, 13);
            this.studentIDlabel.TabIndex = 1;
            this.studentIDlabel.Text = "Student ID: ";
            // 
            // developerName
            // 
            this.developerName.AutoSize = true;
            this.developerName.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.developerName.ForeColor = System.Drawing.Color.IndianRed;
            this.developerName.Location = new System.Drawing.Point(865, 497);
            this.developerName.Name = "developerName";
            this.developerName.Size = new System.Drawing.Size(156, 13);
            this.developerName.TabIndex = 2;
            this.developerName.Text = "Developed by: 200042121";
            // 
            // informationList
            // 
            this.informationList.AutoSize = true;
            this.informationList.Location = new System.Drawing.Point(779, 136);
            this.informationList.Name = "informationList";
            this.informationList.Size = new System.Drawing.Size(70, 13);
            this.informationList.TabIndex = 3;
            this.informationList.Text = "Score Details";
            this.informationList.Click += new System.EventHandler(this.informationList_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(357, 13);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(330, 25);
            this.label1.TabIndex = 4;
            this.label1.Text = "IUT Result Processing System";
            // 
            // StudentDetailsListBox
            // 
            this.StudentDetailsListBox.FormattingEnabled = true;
            this.StudentDetailsListBox.Location = new System.Drawing.Point(32, 93);
            this.StudentDetailsListBox.Name = "StudentDetailsListBox";
            this.StudentDetailsListBox.Size = new System.Drawing.Size(727, 381);
            this.StudentDetailsListBox.TabIndex = 5;
            // 
            // SearchButton
            // 
            this.SearchButton.Location = new System.Drawing.Point(791, 93);
            this.SearchButton.Name = "SearchButton";
            this.SearchButton.Size = new System.Drawing.Size(75, 23);
            this.SearchButton.TabIndex = 6;
            this.SearchButton.Text = "Search";
            this.SearchButton.UseVisualStyleBackColor = true;
            this.SearchButton.Click += new System.EventHandler(this.SearchButton_Click);
            // 
            // IUTRPS
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1033, 519);
            this.Controls.Add(this.SearchButton);
            this.Controls.Add(this.StudentDetailsListBox);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.informationList);
            this.Controls.Add(this.developerName);
            this.Controls.Add(this.studentIDlabel);
            this.Controls.Add(this.textBox1);
            this.Name = "IUTRPS";
            this.Text = "IUT Result Processing System";
            this.Load += new System.EventHandler(this.IUTRPS_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label studentIDlabel;
        private System.Windows.Forms.Label developerName;
        private System.Windows.Forms.Label informationList;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ListBox StudentDetailsListBox;
        private System.Windows.Forms.Button SearchButton;
    }
}

