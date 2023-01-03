namespace WindowsFormsApp1
{
    partial class EmployeeForm
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
            this.EmployeeInformation = new System.Windows.Forms.ListBox();
            this.SearchIDInput = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.EmployeeInformationData = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // EmployeeInformation
            // 
            this.EmployeeInformation.FormattingEnabled = true;
            this.EmployeeInformation.Location = new System.Drawing.Point(13, 24);
            this.EmployeeInformation.Name = "EmployeeInformation";
            this.EmployeeInformation.Size = new System.Drawing.Size(538, 420);
            this.EmployeeInformation.TabIndex = 0;
            this.EmployeeInformation.SelectedIndexChanged += new System.EventHandler(this.EmployeeInformation_SelectedIndexChanged);
            // 
            // SearchIDInput
            // 
            this.SearchIDInput.Location = new System.Drawing.Point(706, 34);
            this.SearchIDInput.Name = "SearchIDInput";
            this.SearchIDInput.Size = new System.Drawing.Size(271, 20);
            this.SearchIDInput.TabIndex = 1;
            this.SearchIDInput.TextChanged += new System.EventHandler(this.SearchIDInput_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(631, 37);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(24, 13);
            this.label1.TabIndex = 2;
            this.label1.Text = "ID: ";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(706, 76);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(271, 23);
            this.button1.TabIndex = 3;
            this.button1.Text = "SearchButton";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // EmployeeInformationData
            // 
            this.EmployeeInformationData.AutoSize = true;
            this.EmployeeInformationData.Location = new System.Drawing.Point(619, 134);
            this.EmployeeInformationData.Name = "EmployeeInformationData";
            this.EmployeeInformationData.Size = new System.Drawing.Size(108, 13);
            this.EmployeeInformationData.TabIndex = 4;
            this.EmployeeInformationData.Text = "Employee Information";
            this.EmployeeInformationData.Click += new System.EventHandler(this.EmployeeInformationData_Click);
            // 
            // EmployeeForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(989, 450);
            this.Controls.Add(this.EmployeeInformationData);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.SearchIDInput);
            this.Controls.Add(this.EmployeeInformation);
            this.Name = "EmployeeForm";
            this.Text = "Employee Information";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox EmployeeInformation;
        private System.Windows.Forms.TextBox SearchIDInput;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label EmployeeInformationData;
    }
}

