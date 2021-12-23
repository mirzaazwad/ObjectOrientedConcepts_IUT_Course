using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace laundry_management_dependencies
{
    public class Shirt : Product
    {
        public Shirt()
        {

        }
        public Shirt(string ToDo, int Quantity)
        {
            this.ProductQuantity = Quantity;
            this.ToDo = ToDo;
            this.Wash = 7;
            this.Iron = 5;
            this.Both = 12;
            if (ToDo == "Wash")
            {
                this.Cost = Quantity * this.Wash;
            }
            else if (ToDo == "Iron")
            {
                this.Cost= Quantity*this.Iron;
            }
            else
            {
                this.Cost= Quantity*this.Both;
            }
        }
    }
}
