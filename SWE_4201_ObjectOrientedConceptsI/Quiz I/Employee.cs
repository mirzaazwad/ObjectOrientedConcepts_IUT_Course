using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Quiz_I
{
    internal class Employee
    {
        protected int id;
        protected string name;
        protected int base_salary;
        protected Inventory inventory;
        public Employee()
        {
            inventory = new Inventory();
        }
    }
}
