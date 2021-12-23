using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace laundry_management_dependencies
{
    public class Pant : Product
    {
        public Pant()
        {

        }
        public Pant(string ToDo, int Quantity)
        {
            this.ProductQuantity = Quantity;
            this.ToDo = ToDo;
            this.Wash = 5;
            this.Iron = 3;
            this.Both = 8;
            if (ToDo == "Wash")
            {
                this.Cost = Quantity * this.Wash;
            }
            else if (ToDo == "Iron")
            {
                this.Cost = Quantity * this.Iron;
            }
            else
            {
                this.Cost = Quantity * this.Both;
            }
        }

    }
}
