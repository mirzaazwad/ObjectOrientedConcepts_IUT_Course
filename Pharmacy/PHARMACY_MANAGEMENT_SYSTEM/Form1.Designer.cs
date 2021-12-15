namespace PHARMACY_MANAGEMENT_SYSTEM
{
    partial class Form1
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
            this.ExpiryDate = new System.Windows.Forms.DateTimePicker();
            this.ManufacturingDate = new System.Windows.Forms.DateTimePicker();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.DIN = new System.Windows.Forms.TextBox();
            this.DrugName = new System.Windows.Forms.TextBox();
            this.Miligrams = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.Cost = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.AddQuantity = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.AddMedicine = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.label8 = new System.Windows.Forms.Label();
            this.SellDrugName = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.SellMiligrams = new System.Windows.Forms.TextBox();
            this.SellMedicine = new System.Windows.Forms.Button();
            this.MedicineInformation = new System.Windows.Forms.ListBox();
            this.button3 = new System.Windows.Forms.Button();
            this.CAB = new System.Windows.Forms.Label();
            this.SellQuantity = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // ExpiryDate
            // 
            this.ExpiryDate.Location = new System.Drawing.Point(117, 182);
            this.ExpiryDate.Name = "ExpiryDate";
            this.ExpiryDate.Size = new System.Drawing.Size(200, 20);
            this.ExpiryDate.TabIndex = 0;
            this.ExpiryDate.ValueChanged += new System.EventHandler(this.ExpiryDate_ValueChanged);
            // 
            // ManufacturingDate
            // 
            this.ManufacturingDate.Location = new System.Drawing.Point(117, 140);
            this.ManufacturingDate.Name = "ManufacturingDate";
            this.ManufacturingDate.Size = new System.Drawing.Size(200, 20);
            this.ManufacturingDate.TabIndex = 1;
            this.ManufacturingDate.ValueChanged += new System.EventHandler(this.ManufacturingDate_ValueChanged_1);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(4, 146);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(107, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Manufacturing Date: ";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(4, 188);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(64, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Expiry Date:";
            // 
            // DIN
            // 
            this.DIN.Location = new System.Drawing.Point(117, 25);
            this.DIN.Name = "DIN";
            this.DIN.Size = new System.Drawing.Size(200, 20);
            this.DIN.TabIndex = 5;
            // 
            // DrugName
            // 
            this.DrugName.Location = new System.Drawing.Point(117, 62);
            this.DrugName.Name = "DrugName";
            this.DrugName.Size = new System.Drawing.Size(200, 20);
            this.DrugName.TabIndex = 6;
            // 
            // Miligrams
            // 
            this.Miligrams.Location = new System.Drawing.Point(117, 98);
            this.Miligrams.Name = "Miligrams";
            this.Miligrams.Size = new System.Drawing.Size(200, 20);
            this.Miligrams.TabIndex = 7;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(58, 28);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(29, 13);
            this.label1.TabIndex = 8;
            this.label1.Text = "DIN:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(23, 65);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(64, 13);
            this.label4.TabIndex = 9;
            this.label4.Text = "Drug Name:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(34, 101);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(53, 13);
            this.label5.TabIndex = 10;
            this.label5.Text = "Miligrams:";
            this.label5.Click += new System.EventHandler(this.label5_Click);
            // 
            // Cost
            // 
            this.Cost.Location = new System.Drawing.Point(405, 25);
            this.Cost.Name = "Cost";
            this.Cost.Size = new System.Drawing.Size(200, 20);
            this.Cost.TabIndex = 11;
            this.Cost.TextChanged += new System.EventHandler(this.textBox4_TextChanged);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(370, 28);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(31, 13);
            this.label6.TabIndex = 12;
            this.label6.Text = "Cost:";
            // 
            // AddQuantity
            // 
            this.AddQuantity.Location = new System.Drawing.Point(405, 62);
            this.AddQuantity.Name = "AddQuantity";
            this.AddQuantity.Size = new System.Drawing.Size(200, 20);
            this.AddQuantity.TabIndex = 13;
            this.AddQuantity.TextChanged += new System.EventHandler(this.textBox5_TextChanged);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(350, 65);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(49, 13);
            this.label7.TabIndex = 14;
            this.label7.Text = "Quantity:";
            this.label7.Click += new System.EventHandler(this.label7_Click);
            // 
            // AddMedicine
            // 
            this.AddMedicine.Location = new System.Drawing.Point(405, 101);
            this.AddMedicine.Name = "AddMedicine";
            this.AddMedicine.Size = new System.Drawing.Size(200, 23);
            this.AddMedicine.TabIndex = 15;
            this.AddMedicine.Text = "Add Medicine";
            this.AddMedicine.UseVisualStyleBackColor = true;
            this.AddMedicine.Click += new System.EventHandler(this.AddMedicine_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.pictureBox1.Location = new System.Drawing.Point(7, 205);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(598, 10);
            this.pictureBox1.TabIndex = 16;
            this.pictureBox1.TabStop = false;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(23, 227);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(64, 13);
            this.label8.TabIndex = 17;
            this.label8.Text = "Drug Name:";
            // 
            // SellDrugName
            // 
            this.SellDrugName.Location = new System.Drawing.Point(117, 224);
            this.SellDrugName.Name = "SellDrugName";
            this.SellDrugName.Size = new System.Drawing.Size(200, 20);
            this.SellDrugName.TabIndex = 18;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(34, 250);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(53, 13);
            this.label9.TabIndex = 19;
            this.label9.Text = "Miligrams:";
            // 
            // SellMiligrams
            // 
            this.SellMiligrams.Location = new System.Drawing.Point(117, 247);
            this.SellMiligrams.Name = "SellMiligrams";
            this.SellMiligrams.Size = new System.Drawing.Size(200, 20);
            this.SellMiligrams.TabIndex = 20;
            // 
            // SellMedicine
            // 
            this.SellMedicine.Location = new System.Drawing.Point(117, 323);
            this.SellMedicine.Name = "SellMedicine";
            this.SellMedicine.Size = new System.Drawing.Size(200, 23);
            this.SellMedicine.TabIndex = 21;
            this.SellMedicine.Text = "Sell Medicine";
            this.SellMedicine.UseVisualStyleBackColor = true;
            this.SellMedicine.Click += new System.EventHandler(this.button2_Click);
            // 
            // MedicineInformation
            // 
            this.MedicineInformation.FormattingEnabled = true;
            this.MedicineInformation.Location = new System.Drawing.Point(631, 25);
            this.MedicineInformation.Name = "MedicineInformation";
            this.MedicineInformation.Size = new System.Drawing.Size(370, 238);
            this.MedicineInformation.TabIndex = 22;
            this.MedicineInformation.SelectedIndexChanged += new System.EventHandler(this.listBox1_SelectedIndexChanged);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(631, 273);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(370, 23);
            this.button3.TabIndex = 23;
            this.button3.Text = "View Stock";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // CAB
            // 
            this.CAB.AutoSize = true;
            this.CAB.Location = new System.Drawing.Point(350, 227);
            this.CAB.Name = "CAB";
            this.CAB.Size = new System.Drawing.Size(129, 13);
            this.CAB.TabIndex = 24;
            this.CAB.Text = "Current Account Balance:";
            // 
            // SellQuantity
            // 
            this.SellQuantity.Location = new System.Drawing.Point(117, 273);
            this.SellQuantity.Name = "SellQuantity";
            this.SellQuantity.Size = new System.Drawing.Size(200, 20);
            this.SellQuantity.TabIndex = 25;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(34, 276);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(66, 13);
            this.label11.TabIndex = 26;
            this.label11.Text = "Sell Quantity";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(353, 250);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(252, 23);
            this.button1.TabIndex = 27;
            this.button1.Text = "Get Current Account Balance";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1013, 450);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.SellQuantity);
            this.Controls.Add(this.CAB);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.MedicineInformation);
            this.Controls.Add(this.SellMedicine);
            this.Controls.Add(this.SellMiligrams);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.SellDrugName);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.AddMedicine);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.AddQuantity);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.Cost);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.Miligrams);
            this.Controls.Add(this.DrugName);
            this.Controls.Add(this.DIN);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.ManufacturingDate);
            this.Controls.Add(this.ExpiryDate);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DateTimePicker ExpiryDate;
        private System.Windows.Forms.DateTimePicker ManufacturingDate;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox DIN;
        private System.Windows.Forms.TextBox DrugName;
        private System.Windows.Forms.TextBox Miligrams;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox Cost;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox AddQuantity;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Button AddMedicine;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox SellDrugName;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.TextBox SellMiligrams;
        private System.Windows.Forms.Button SellMedicine;
        private System.Windows.Forms.ListBox MedicineInformation;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Label CAB;
        private System.Windows.Forms.TextBox SellQuantity;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Button button1;
    }
}

