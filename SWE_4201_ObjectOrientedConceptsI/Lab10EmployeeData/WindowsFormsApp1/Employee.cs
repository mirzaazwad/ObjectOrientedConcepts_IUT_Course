using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp1
{

    public class Employee
    {
        private string employeeID, firstName, lastName, email, phoneNumber, hiringDate, jobID, salary, managerID, deptID, commissionPCT;
        public Employee()
        {

        }
        public Employee(string employeeID, string firstName, string lastName, string email, string phoneNumber, string hiringDate, string jobID, string salary, string managerID, string deptID)
        {
            this.commissionPCT = null;
            this.employeeID = employeeID;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.hiringDate = hiringDate;
            this.jobID = jobID;
            this.salary = salary;
            this.managerID = managerID;
            this.deptID = deptID;
        }

        public string Commission_PCT
        {
            get { return commissionPCT; }
            set { commissionPCT = value; }
        }

        public string Employee_ID
        {
            get { return employeeID; }
            set { employeeID = value; }
        }

        public string getInfo()
        {
            return this.deptID + "\t" + this.firstName + "\t" + this.lastName+"\t"+this.email+"\t"+this.phoneNumber+"\t"+this.salary;
        }

        public string getDetailedInformation()
        {
            return "Employee ID: " + this.employeeID + "\n" + "Name: " + this.firstName+" "+this.lastName+"\n"+"Salary: "+this.salary+"\n";
        }
    }

 }
