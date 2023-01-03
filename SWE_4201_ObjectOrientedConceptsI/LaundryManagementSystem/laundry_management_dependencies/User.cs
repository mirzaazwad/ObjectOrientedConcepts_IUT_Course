using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace laundry_management_dependencies
{
    public class User
    {
        private string UserID;
        private string Name;
        private string Address;

        public User()
        {

        }
        public User(string UserID, string Name, string Address)
        {
            this.UserID = UserID;
            this.Name = Name;
            this.Address = Address;
        }

        public string getUserID()
        {
            return this.UserID;
        }
        public string getUserName()
        {
            return this.Name;
        }
        public string getAddress()
        {
            return this.Address;
        }
    }
}
