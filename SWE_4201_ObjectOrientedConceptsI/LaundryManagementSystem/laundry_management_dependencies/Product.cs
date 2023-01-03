using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace laundry_management_dependencies
{
    public class Product
    {
        protected int ProductQuantity=0;
        protected string ToDo="No To_Do";
        protected double Cost,Wash,Iron,Both;

        public void setQuantity(int ProductQuantity)
        {
            this.ProductQuantity += ProductQuantity;
        }
        public int getQuantity()
        {
            return this.ProductQuantity;
        }
        public double getCost()
        {
            return this.Cost;
        }
        public string getToDo()
        {
            return this.ToDo;
        }


    }
}
