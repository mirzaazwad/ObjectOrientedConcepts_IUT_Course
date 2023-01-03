using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab07_dependecies
{
    public class Courses
    {
        private string title;
        private double fee;
        private string level;
        public Courses(string title, double fee, string level)
        {
            this.title = title;
            this.fee = fee; 

            this.level = level; 
        }

        public string Title
        {
            get { return title; }
            set { title = value; }
        }
        public double Fee
        {
            get { return fee; }
            set { fee = value; }
        }
        public string GetCourse()
        {
            return this.title+ "\t" + Convert.ToDouble(this.fee)+"\t"+this.level;
        }
    }
}
