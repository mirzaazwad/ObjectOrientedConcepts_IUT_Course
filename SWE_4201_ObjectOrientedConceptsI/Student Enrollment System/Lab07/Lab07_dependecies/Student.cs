using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab07_dependecies
{
    public class Student:Participant
    {
        private string schoolName;
        public Student(string name, string registrationNumber, string contactNo, string email, string address, string level,string schoolName) : base(name, registrationNumber, contactNo, email, address, level)
        {
            this.schoolName = schoolName;
        }
        public string SchoolName
        {
            get { return schoolName; }
            set { schoolName = value; }
        }
    }
}
