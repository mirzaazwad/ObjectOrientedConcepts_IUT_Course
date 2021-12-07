using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BookClass
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        List<StudyBook>studyList=new List<StudyBook>();
        List<ResearchArticle>researchList=new List<ResearchArticle>();
        List<StudyBook>userStudyList=new List<StudyBook>();
        List<ResearchArticle>userResearchList=new List<ResearchArticle>();



        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

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

        private void textBox6_TextChanged(object sender, EventArgs e)
        {

        }

        private void label15_Click(object sender, EventArgs e)
        {

        }

        private void label16_Click(object sender, EventArgs e)
        {

        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            if (Conference.Checked==true)
            {
                Journal.Checked=false;
            }
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            if (Journal.Checked == true)
            {
                Conference.Checked = false;
            }

        }

        private void button4_Click(object sender, EventArgs e)
        {
            bool found = false;
            foreach(StudyBook study in studyList)
            {
                if (study.getBookID() == BorrowStudyBook.Text)
                {
                    if (study.getQuantity() == 0)
                    {
                        MessageBox.Show("Book Out of Stock");
                        return;
                    }
                    userStudyList.Add(study);
                    study.decrement();
                    if (!found)
                    {
                        MessageBox.Show("Book Not found");
                    }
                }
            }
        }

        private void button5_Click(object sender, EventArgs e)
        {
            StudyBookList.Items.Clear();
            foreach(StudyBook study in userStudyList)
            {
                StudyBookList.Items.Add(study.getStudyinfo());
            }
        }

        private void textBox14_TextChanged(object sender, EventArgs e)
        {

        }

        private void StudyID_TextChanged(object sender, EventArgs e)
        {

        }

        private void AddStudyBook_Click(object sender, EventArgs e)
        {
            StudyBook study=new StudyBook(StudyID.Text,StudyTitle.Text,StudyAuthor.Text,StudyPublisher.Text,Convert.ToInt32(StudyQuantity.Text),StudyISBN.Text,StudyGenre.Text);
            MessageBox.Show("Study Book Added");
            studyList.Add(study);
        }

        private void AddResearchArticle_Click(object sender, EventArgs e)
        {
            int day=Convert.ToInt32(Day.Text);
            int month = Convert.ToInt32(Month.Text);
            int year = Convert.ToInt32(Year.Text);
            if(day<0 || day > 31)
            {
                MessageBox.Show("Invalid Day");
                return;
            }
            if (month < 0 || month > 12)
            {
                MessageBox.Show("Invalid Month");
                return;
            }
            if (year<0)
            {
                MessageBox.Show("Invalid Year");
                return;
            }
            string date=Convert.ToString(day)+"/"+Convert.ToString(month)+"/"+Convert.ToString(year);
            //conference is true and journal is false
            bool ConferenceOrJournal;
            if (Conference.Checked == true)
            {
                ConferenceOrJournal = true;
            }
            else
            {
                ConferenceOrJournal = false;
            }
            ResearchArticle researchArticle = new ResearchArticle(ResearchID.Text, ResearchTitle.Text, ResearchAuthor.Text, ResearchPublisher.Text, Convert.ToInt32(ResearchQuantity.Text),DOI.Text, date,ConferenceOrJournal);
            researchList.Add(researchArticle);
            MessageBox.Show("Research Article Added");
        }

        private void BorrowResearch_Click(object sender, EventArgs e)
        {
            bool found = false;
            foreach (ResearchArticle research in researchList)
            {
                if (research.getResearchID() == BorrowResearchID.Text)
                {
                    found = true;
                    if (research.getQuantity() == 0)
                    {
                        MessageBox.Show("Book not available");
                        return;
                    }
                    userResearchList.Add(research);
                    research.decrement();
                    if (!found)
                    {
                        MessageBox.Show("Research Article Not Found");
                    }
                }
            }
        }

        private void ShowResearchArticle_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void ShowResearch_Click(object sender, EventArgs e)
        {
            ShowResearchArticle.Items.Clear();
            foreach (ResearchArticle research in userResearchList)
            {
                ShowResearchArticle.Items.Add(research.getArticleInfo());
            }
        }
    }
}
