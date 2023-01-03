namespace BookClass
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.StudyID = new System.Windows.Forms.TextBox();
            this.StudyTitle = new System.Windows.Forms.TextBox();
            this.StudyAuthor = new System.Windows.Forms.TextBox();
            this.StudyPublisher = new System.Windows.Forms.TextBox();
            this.StudyQuantity = new System.Windows.Forms.TextBox();
            this.StudyISBN = new System.Windows.Forms.TextBox();
            this.StudyGenre = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.label11 = new System.Windows.Forms.Label();
            this.label12 = new System.Windows.Forms.Label();
            this.label13 = new System.Windows.Forms.Label();
            this.label14 = new System.Windows.Forms.Label();
            this.label15 = new System.Windows.Forms.Label();
            this.label16 = new System.Windows.Forms.Label();
            this.Conference = new System.Windows.Forms.RadioButton();
            this.Journal = new System.Windows.Forms.RadioButton();
            this.ResearchID = new System.Windows.Forms.TextBox();
            this.ResearchTitle = new System.Windows.Forms.TextBox();
            this.ResearchAuthor = new System.Windows.Forms.TextBox();
            this.ResearchPublisher = new System.Windows.Forms.TextBox();
            this.ResearchQuantity = new System.Windows.Forms.TextBox();
            this.Day = new System.Windows.Forms.TextBox();
            this.Month = new System.Windows.Forms.TextBox();
            this.Year = new System.Windows.Forms.TextBox();
            this.AddStudyBook = new System.Windows.Forms.Button();
            this.AddResearchArticle = new System.Windows.Forms.Button();
            this.label17 = new System.Windows.Forms.Label();
            this.label18 = new System.Windows.Forms.Label();
            this.label19 = new System.Windows.Forms.Label();
            this.BorrowStudyBook = new System.Windows.Forms.TextBox();
            this.BorrowResearchID = new System.Windows.Forms.TextBox();
            this.DOI = new System.Windows.Forms.TextBox();
            this.BorrowResearch = new System.Windows.Forms.Button();
            this.BorrowStudy = new System.Windows.Forms.Button();
            this.label20 = new System.Windows.Forms.Label();
            this.StudyBookList = new System.Windows.Forms.ListBox();
            this.ShowStudy = new System.Windows.Forms.Button();
            this.label21 = new System.Windows.Forms.Label();
            this.ShowResearchArticle = new System.Windows.Forms.ListBox();
            this.ShowResearch = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label1.Location = new System.Drawing.Point(25, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(114, 24);
            this.label1.TabIndex = 0;
            this.label1.Text = "Study Books";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(25, 48);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(21, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "ID:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(26, 79);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(30, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Title:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(26, 110);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(41, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Author:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(14, 139);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(53, 13);
            this.label5.TabIndex = 4;
            this.label5.Text = "Publisher:";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(26, 177);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(49, 13);
            this.label6.TabIndex = 5;
            this.label6.Text = "Quantity:";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(30, 212);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(35, 13);
            this.label7.TabIndex = 6;
            this.label7.Text = "ISBN:";
            this.label7.Click += new System.EventHandler(this.label7_Click);
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(32, 245);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(39, 13);
            this.label8.TabIndex = 7;
            this.label8.Text = "Genre:";
            this.label8.Click += new System.EventHandler(this.label8_Click);
            // 
            // StudyID
            // 
            this.StudyID.Location = new System.Drawing.Point(71, 45);
            this.StudyID.Name = "StudyID";
            this.StudyID.Size = new System.Drawing.Size(100, 20);
            this.StudyID.TabIndex = 8;
            this.StudyID.TextChanged += new System.EventHandler(this.StudyID_TextChanged);
            // 
            // StudyTitle
            // 
            this.StudyTitle.Location = new System.Drawing.Point(71, 79);
            this.StudyTitle.Name = "StudyTitle";
            this.StudyTitle.Size = new System.Drawing.Size(100, 20);
            this.StudyTitle.TabIndex = 9;
            this.StudyTitle.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // StudyAuthor
            // 
            this.StudyAuthor.Location = new System.Drawing.Point(73, 107);
            this.StudyAuthor.Name = "StudyAuthor";
            this.StudyAuthor.Size = new System.Drawing.Size(100, 20);
            this.StudyAuthor.TabIndex = 10;
            this.StudyAuthor.TextChanged += new System.EventHandler(this.textBox3_TextChanged);
            // 
            // StudyPublisher
            // 
            this.StudyPublisher.Location = new System.Drawing.Point(71, 136);
            this.StudyPublisher.Name = "StudyPublisher";
            this.StudyPublisher.Size = new System.Drawing.Size(100, 20);
            this.StudyPublisher.TabIndex = 11;
            this.StudyPublisher.TextChanged += new System.EventHandler(this.textBox4_TextChanged);
            // 
            // StudyQuantity
            // 
            this.StudyQuantity.Location = new System.Drawing.Point(71, 174);
            this.StudyQuantity.Name = "StudyQuantity";
            this.StudyQuantity.Size = new System.Drawing.Size(100, 20);
            this.StudyQuantity.TabIndex = 12;
            // 
            // StudyISBN
            // 
            this.StudyISBN.Location = new System.Drawing.Point(73, 205);
            this.StudyISBN.Name = "StudyISBN";
            this.StudyISBN.Size = new System.Drawing.Size(100, 20);
            this.StudyISBN.TabIndex = 13;
            this.StudyISBN.TextChanged += new System.EventHandler(this.textBox6_TextChanged);
            // 
            // StudyGenre
            // 
            this.StudyGenre.Location = new System.Drawing.Point(71, 238);
            this.StudyGenre.Name = "StudyGenre";
            this.StudyGenre.Size = new System.Drawing.Size(100, 20);
            this.StudyGenre.TabIndex = 14;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label9.Location = new System.Drawing.Point(246, 9);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(157, 24);
            this.label9.TabIndex = 15;
            this.label9.Text = "Research Articles";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(257, 48);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(21, 13);
            this.label10.TabIndex = 16;
            this.label10.Text = "ID:";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(248, 79);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(30, 13);
            this.label11.TabIndex = 17;
            this.label11.Text = "Title:";
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(237, 110);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(41, 13);
            this.label12.TabIndex = 18;
            this.label12.Text = "Author:";
            // 
            // label13
            // 
            this.label13.AutoSize = true;
            this.label13.Location = new System.Drawing.Point(225, 139);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(53, 13);
            this.label13.TabIndex = 19;
            this.label13.Text = "Publisher:";
            // 
            // label14
            // 
            this.label14.AutoSize = true;
            this.label14.Location = new System.Drawing.Point(225, 177);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(49, 13);
            this.label14.TabIndex = 20;
            this.label14.Text = "Quantity:";
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Location = new System.Drawing.Point(225, 238);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(29, 13);
            this.label15.TabIndex = 21;
            this.label15.Text = "DOI:";
            this.label15.Click += new System.EventHandler(this.label15_Click);
            // 
            // label16
            // 
            this.label16.AutoSize = true;
            this.label16.Location = new System.Drawing.Point(196, 208);
            this.label16.Name = "label16";
            this.label16.Size = new System.Drawing.Size(82, 13);
            this.label16.TabIndex = 22;
            this.label16.Text = "Published Date:";
            this.label16.Click += new System.EventHandler(this.label16_Click);
            // 
            // Conference
            // 
            this.Conference.AutoSize = true;
            this.Conference.Location = new System.Drawing.Point(210, 257);
            this.Conference.Name = "Conference";
            this.Conference.Size = new System.Drawing.Size(80, 17);
            this.Conference.TabIndex = 23;
            this.Conference.Text = "Conference";
            this.Conference.UseVisualStyleBackColor = true;
            this.Conference.CheckedChanged += new System.EventHandler(this.radioButton1_CheckedChanged);
            // 
            // Journal
            // 
            this.Journal.AutoSize = true;
            this.Journal.Location = new System.Drawing.Point(210, 280);
            this.Journal.Name = "Journal";
            this.Journal.Size = new System.Drawing.Size(59, 17);
            this.Journal.TabIndex = 24;
            this.Journal.Text = "Journal";
            this.Journal.UseVisualStyleBackColor = true;
            this.Journal.CheckedChanged += new System.EventHandler(this.radioButton2_CheckedChanged);
            // 
            // ResearchID
            // 
            this.ResearchID.Location = new System.Drawing.Point(284, 45);
            this.ResearchID.Name = "ResearchID";
            this.ResearchID.Size = new System.Drawing.Size(100, 20);
            this.ResearchID.TabIndex = 25;
            // 
            // ResearchTitle
            // 
            this.ResearchTitle.Location = new System.Drawing.Point(284, 76);
            this.ResearchTitle.Name = "ResearchTitle";
            this.ResearchTitle.Size = new System.Drawing.Size(100, 20);
            this.ResearchTitle.TabIndex = 26;
            // 
            // ResearchAuthor
            // 
            this.ResearchAuthor.Location = new System.Drawing.Point(284, 107);
            this.ResearchAuthor.Name = "ResearchAuthor";
            this.ResearchAuthor.Size = new System.Drawing.Size(100, 20);
            this.ResearchAuthor.TabIndex = 27;
            // 
            // ResearchPublisher
            // 
            this.ResearchPublisher.Location = new System.Drawing.Point(284, 136);
            this.ResearchPublisher.Name = "ResearchPublisher";
            this.ResearchPublisher.Size = new System.Drawing.Size(100, 20);
            this.ResearchPublisher.TabIndex = 28;
            // 
            // ResearchQuantity
            // 
            this.ResearchQuantity.Location = new System.Drawing.Point(284, 170);
            this.ResearchQuantity.Name = "ResearchQuantity";
            this.ResearchQuantity.Size = new System.Drawing.Size(100, 20);
            this.ResearchQuantity.TabIndex = 29;
            // 
            // Day
            // 
            this.Day.Location = new System.Drawing.Point(284, 205);
            this.Day.Name = "Day";
            this.Day.Size = new System.Drawing.Size(32, 20);
            this.Day.TabIndex = 30;
            // 
            // Month
            // 
            this.Month.Location = new System.Drawing.Point(333, 205);
            this.Month.Name = "Month";
            this.Month.Size = new System.Drawing.Size(33, 20);
            this.Month.TabIndex = 31;
            this.Month.TextChanged += new System.EventHandler(this.textBox14_TextChanged);
            // 
            // Year
            // 
            this.Year.Location = new System.Drawing.Point(382, 205);
            this.Year.Name = "Year";
            this.Year.Size = new System.Drawing.Size(40, 20);
            this.Year.TabIndex = 32;
            // 
            // AddStudyBook
            // 
            this.AddStudyBook.Location = new System.Drawing.Point(28, 280);
            this.AddStudyBook.Name = "AddStudyBook";
            this.AddStudyBook.Size = new System.Drawing.Size(143, 23);
            this.AddStudyBook.TabIndex = 33;
            this.AddStudyBook.Text = "Add Study Book";
            this.AddStudyBook.UseVisualStyleBackColor = true;
            this.AddStudyBook.Click += new System.EventHandler(this.AddStudyBook_Click);
            // 
            // AddResearchArticle
            // 
            this.AddResearchArticle.Location = new System.Drawing.Point(210, 303);
            this.AddResearchArticle.Name = "AddResearchArticle";
            this.AddResearchArticle.Size = new System.Drawing.Size(212, 23);
            this.AddResearchArticle.TabIndex = 34;
            this.AddResearchArticle.Text = "Add Research Article";
            this.AddResearchArticle.UseVisualStyleBackColor = true;
            this.AddResearchArticle.Click += new System.EventHandler(this.AddResearchArticle_Click);
            // 
            // label17
            // 
            this.label17.AutoSize = true;
            this.label17.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label17.Location = new System.Drawing.Point(474, 9);
            this.label17.Name = "label17";
            this.label17.Size = new System.Drawing.Size(70, 24);
            this.label17.TabIndex = 35;
            this.label17.Text = "Borrow";
            // 
            // label18
            // 
            this.label18.AutoSize = true;
            this.label18.Location = new System.Drawing.Point(446, 48);
            this.label18.Name = "label18";
            this.label18.Size = new System.Drawing.Size(79, 13);
            this.label18.TabIndex = 36;
            this.label18.Text = "Study Book ID:";
            // 
            // label19
            // 
            this.label19.AutoSize = true;
            this.label19.Location = new System.Drawing.Point(423, 79);
            this.label19.Name = "label19";
            this.label19.Size = new System.Drawing.Size(102, 13);
            this.label19.TabIndex = 37;
            this.label19.Text = "Research Article ID:";
            // 
            // BorrowStudyBook
            // 
            this.BorrowStudyBook.Location = new System.Drawing.Point(531, 45);
            this.BorrowStudyBook.Name = "BorrowStudyBook";
            this.BorrowStudyBook.Size = new System.Drawing.Size(100, 20);
            this.BorrowStudyBook.TabIndex = 38;
            // 
            // BorrowResearchID
            // 
            this.BorrowResearchID.Location = new System.Drawing.Point(531, 76);
            this.BorrowResearchID.Name = "BorrowResearchID";
            this.BorrowResearchID.Size = new System.Drawing.Size(100, 20);
            this.BorrowResearchID.TabIndex = 39;
            // 
            // DOI
            // 
            this.DOI.Location = new System.Drawing.Point(251, 235);
            this.DOI.Name = "DOI";
            this.DOI.Size = new System.Drawing.Size(171, 20);
            this.DOI.TabIndex = 40;
            // 
            // BorrowResearch
            // 
            this.BorrowResearch.Location = new System.Drawing.Point(637, 73);
            this.BorrowResearch.Name = "BorrowResearch";
            this.BorrowResearch.Size = new System.Drawing.Size(212, 23);
            this.BorrowResearch.TabIndex = 41;
            this.BorrowResearch.Text = "Borrow Research Article";
            this.BorrowResearch.UseVisualStyleBackColor = true;
            this.BorrowResearch.Click += new System.EventHandler(this.BorrowResearch_Click);
            // 
            // BorrowStudy
            // 
            this.BorrowStudy.Location = new System.Drawing.Point(637, 42);
            this.BorrowStudy.Name = "BorrowStudy";
            this.BorrowStudy.Size = new System.Drawing.Size(212, 23);
            this.BorrowStudy.TabIndex = 42;
            this.BorrowStudy.Text = "Borrow Study  Book";
            this.BorrowStudy.UseVisualStyleBackColor = true;
            this.BorrowStudy.Click += new System.EventHandler(this.button4_Click);
            // 
            // label20
            // 
            this.label20.AutoSize = true;
            this.label20.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label20.Location = new System.Drawing.Point(474, 110);
            this.label20.Name = "label20";
            this.label20.Size = new System.Drawing.Size(167, 24);
            this.label20.TabIndex = 43;
            this.label20.Text = "Show Study Books";
            // 
            // StudyBookList
            // 
            this.StudyBookList.FormattingEnabled = true;
            this.StudyBookList.Location = new System.Drawing.Point(478, 177);
            this.StudyBookList.Name = "StudyBookList";
            this.StudyBookList.Size = new System.Drawing.Size(562, 147);
            this.StudyBookList.TabIndex = 44;
            // 
            // ShowStudy
            // 
            this.ShowStudy.Location = new System.Drawing.Point(478, 148);
            this.ShowStudy.Name = "ShowStudy";
            this.ShowStudy.Size = new System.Drawing.Size(212, 23);
            this.ShowStudy.TabIndex = 45;
            this.ShowStudy.Text = "Show Study  Book";
            this.ShowStudy.UseVisualStyleBackColor = true;
            this.ShowStudy.Click += new System.EventHandler(this.button5_Click);
            // 
            // label21
            // 
            this.label21.AutoSize = true;
            this.label21.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F);
            this.label21.Location = new System.Drawing.Point(483, 344);
            this.label21.Name = "label21";
            this.label21.Size = new System.Drawing.Size(210, 24);
            this.label21.TabIndex = 46;
            this.label21.Text = "Show Research Articles";
            // 
            // ShowResearchArticle
            // 
            this.ShowResearchArticle.FormattingEnabled = true;
            this.ShowResearchArticle.Location = new System.Drawing.Point(478, 399);
            this.ShowResearchArticle.Name = "ShowResearchArticle";
            this.ShowResearchArticle.Size = new System.Drawing.Size(562, 147);
            this.ShowResearchArticle.TabIndex = 47;
            this.ShowResearchArticle.SelectedIndexChanged += new System.EventHandler(this.ShowResearchArticle_SelectedIndexChanged);
            // 
            // ShowResearch
            // 
            this.ShowResearch.Location = new System.Drawing.Point(478, 371);
            this.ShowResearch.Name = "ShowResearch";
            this.ShowResearch.Size = new System.Drawing.Size(212, 23);
            this.ShowResearch.TabIndex = 48;
            this.ShowResearch.Text = "Show Research Articles";
            this.ShowResearch.UseVisualStyleBackColor = true;
            this.ShowResearch.Click += new System.EventHandler(this.ShowResearch_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1052, 523);
            this.Controls.Add(this.ShowResearch);
            this.Controls.Add(this.ShowResearchArticle);
            this.Controls.Add(this.label21);
            this.Controls.Add(this.ShowStudy);
            this.Controls.Add(this.StudyBookList);
            this.Controls.Add(this.label20);
            this.Controls.Add(this.BorrowStudy);
            this.Controls.Add(this.BorrowResearch);
            this.Controls.Add(this.DOI);
            this.Controls.Add(this.BorrowResearchID);
            this.Controls.Add(this.BorrowStudyBook);
            this.Controls.Add(this.label19);
            this.Controls.Add(this.label18);
            this.Controls.Add(this.label17);
            this.Controls.Add(this.AddResearchArticle);
            this.Controls.Add(this.AddStudyBook);
            this.Controls.Add(this.Year);
            this.Controls.Add(this.Month);
            this.Controls.Add(this.Day);
            this.Controls.Add(this.ResearchQuantity);
            this.Controls.Add(this.ResearchPublisher);
            this.Controls.Add(this.ResearchAuthor);
            this.Controls.Add(this.ResearchTitle);
            this.Controls.Add(this.ResearchID);
            this.Controls.Add(this.Journal);
            this.Controls.Add(this.Conference);
            this.Controls.Add(this.label16);
            this.Controls.Add(this.label15);
            this.Controls.Add(this.label14);
            this.Controls.Add(this.label13);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.StudyGenre);
            this.Controls.Add(this.StudyISBN);
            this.Controls.Add(this.StudyQuantity);
            this.Controls.Add(this.StudyPublisher);
            this.Controls.Add(this.StudyAuthor);
            this.Controls.Add(this.StudyTitle);
            this.Controls.Add(this.StudyID);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "BookManagement";
            this.Load += new System.EventHandler(this.Form1_Load);
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
        private System.Windows.Forms.TextBox StudyID;
        private System.Windows.Forms.TextBox StudyTitle;
        private System.Windows.Forms.TextBox StudyAuthor;
        private System.Windows.Forms.TextBox StudyPublisher;
        private System.Windows.Forms.TextBox StudyQuantity;
        private System.Windows.Forms.TextBox StudyISBN;
        private System.Windows.Forms.TextBox StudyGenre;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.Label label13;
        private System.Windows.Forms.Label label14;
        private System.Windows.Forms.Label label15;
        private System.Windows.Forms.Label label16;
        private System.Windows.Forms.RadioButton Conference;
        private System.Windows.Forms.RadioButton Journal;
        private System.Windows.Forms.TextBox ResearchID;
        private System.Windows.Forms.TextBox ResearchTitle;
        private System.Windows.Forms.TextBox ResearchAuthor;
        private System.Windows.Forms.TextBox ResearchPublisher;
        private System.Windows.Forms.TextBox ResearchQuantity;
        private System.Windows.Forms.TextBox Day;
        private System.Windows.Forms.TextBox Month;
        private System.Windows.Forms.TextBox Year;
        private System.Windows.Forms.Button AddStudyBook;
        private System.Windows.Forms.Button AddResearchArticle;
        private System.Windows.Forms.Label label17;
        private System.Windows.Forms.Label label18;
        private System.Windows.Forms.Label label19;
        private System.Windows.Forms.TextBox BorrowStudyBook;
        private System.Windows.Forms.TextBox BorrowResearchID;
        private System.Windows.Forms.TextBox DOI;
        private System.Windows.Forms.Button BorrowResearch;
        private System.Windows.Forms.Button BorrowStudy;
        private System.Windows.Forms.Label label20;
        private System.Windows.Forms.ListBox StudyBookList;
        private System.Windows.Forms.Button ShowStudy;
        private System.Windows.Forms.Label label21;
        private System.Windows.Forms.ListBox ShowResearchArticle;
        private System.Windows.Forms.Button ShowResearch;
    }
}

