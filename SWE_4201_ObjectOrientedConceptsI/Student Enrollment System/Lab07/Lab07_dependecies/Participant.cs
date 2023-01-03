using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab07_dependecies
{
    public class Participant
    {
        protected string name;
        protected string registrationNumber;
        protected string contactNo;
        protected string email;
        protected string address;//address refers to home address
        protected double fee;
        protected string level;
        protected Courses course;
        public List<Courses>courseList=new List<Courses>();

        protected Participant(string name, string registrationNumber, string contactNo, string email, string address, string level)
        {
            this.name = name;
            this.registrationNumber = registrationNumber;
            this.contactNo = contactNo;
            this.email = email;
            this.address = address;
            this.level = level;

        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public string RegistrationNumber
        {
            get { return registrationNumber; }
            set { registrationNumber = value; }
        }

        public string ContactNo
        {
            get { return contactNo; }
            set { contactNo = value; }
        }
        public string Email
        {
            get { return email; }
            set { email = value; }
        }

        public Courses Course
        {
            get { return course; }
            set { course = value; }
        }



        public string Address
        {
            get { return address; }
            set { address = value; }
        }
        public string Level
        {
            get { return level; }
            set { level = value; }
        }

        public virtual double GetFee()
        {
            return fee;
        }

        public double SetFee(double fee)
        {
            return this.fee;
        }

    }
}
