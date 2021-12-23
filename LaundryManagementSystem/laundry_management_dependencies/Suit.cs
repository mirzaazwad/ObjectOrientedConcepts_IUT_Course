using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace laundry_management_dependencies
{
    public class Suit : Product
    {
        public Suit(string ToDo, int Quantity)
        {
            this.ProductQuantity = Quantity;
            this.ToDo = ToDo;
            this.Wash = 15;
            this.Iron = 13;
            this.Both = 28;
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
        public Suit()
        {

        }

    }
}
