using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LabFinal
{
    public class Student
    {
        private string Name, ID, Grade;
        private double Percentage;
        private List<double> quiz = new List<double>();
        private double mid, final, viva, attendance, total, quizTotal;

        public Student(string ID, string Name, double quiz1, double quiz2, double quiz3, double quiz4, double mid, double final, double viva, double attendance)
        {
            this.Name = Name;
            this.ID = ID;
            this.mid = mid;
            this.final = final;
            this.viva = viva;
            this.attendance = attendance;
            this.addToList(quiz1, quiz2, quiz3, quiz4);
            this.computePercentageandGrade();

        }

        private void computePercentageandGrade()
        {
            this.total = this.quizTotal + this.mid + this.final + this.viva + this.attendance;
            this.Percentage = (total / 300) * 100;
            this.computeGrade();
        }

        private void computeGrade()
        {
            if (this.Percentage >= 80)
            {
                this.Grade = "A+";
            }
            else if (this.Percentage >= 75)
            {
                this.Grade = "A";
            }
            else if (this.Percentage >= 70)
            {
                this.Grade = "A-";
            }
            else if (this.Percentage >= 65)
            {
                this.Grade = "B+";
            }
            else if (this.Percentage >= 60)
            {
                this.Grade = "B";
            }
            else if (this.Percentage >= 55)
            {
                this.Grade = "B-";
            }
            else if (this.Percentage >= 50)
            {
                this.Grade = "C+";
            }
            else if (this.Percentage >= 45)
            {
                this.Grade = "C";
            }
            else if (this.Percentage >= 40)
            {
                this.Grade = "D";
            }
            else
            {
                this.Grade = "F";
            }
        }

        private void addToList(double quiz1, double quiz2, double quiz3, double quiz4)
        {
            this.quiz.Add(quiz1);
            this.quiz.Add(quiz2);
            this.quiz.Add(quiz3);
            this.quiz.Add(quiz4);
            this.quiz.Sort();
            this.quizTotal = this.quiz[1] + this.quiz[2] + this.quiz[3];
        }

        public string getStudentDetailsInfo()
        {
            return this.Name + "\t" + this.ID + "\t" + this.Percentage + "\t\t" + this.Grade;
        }

        public string getResultDetails()
        {
            return $"Attendance: {this.attendance}\n\n Quiz1: {this.quiz[0]}\n\n Quiz2: {this.quiz[1]}\n\n Quiz3: {this.quiz[2]}\n\n Quiz4: {this.quiz[3]}\n\n Quiz Total(Best of 3): {this.quizTotal}\n\n Mid: {this.mid}\n\n Final: {this.final}\n\n Viva: {this.viva}\n\n Total(Out of 300): {this.total} \n\n Percentage: {this.Percentage} \n\n Grade: {this.Grade} \n\n ";
        }

        public string id
        {
            get { return ID; }
            set { ID = value; }
        }

    }
}