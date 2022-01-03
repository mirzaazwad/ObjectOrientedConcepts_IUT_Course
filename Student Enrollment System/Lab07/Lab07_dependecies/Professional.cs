using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab07_dependecies
{
    public class Professional:Participant
    {
        private string officeName;
        private string officeAddress;
        public Professional(string name, string registrationNumber, string contactNo, string email, string address, string level,string officeName,string officeAddress):base(name,registrationNumber,contactNo,email,address, level)
        {
            this.officeName = officeName;
            this.officeAddress = officeAddress;
        }

        public string OfficeName
        {
            get { return officeName; }
            set { officeName = value; }
        }
        public string OfficeAddress
        {
            get { return officeAddress; }
            set { officeAddress = value; }
        }

        public override double GetFee()
        {
            return this.fee * (1.1);
        }
    }
}
