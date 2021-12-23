using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace laundry_management_dependencies
{
    public class BedSheet : Product
    {
        public BedSheet()
        {

        }
        public BedSheet(string ToDo, int Quantity)
        {
            this.ProductQuantity = Quantity;
            this.ToDo = ToDo;
            this.Wash = 10;
            this.Iron = 7;
            this.Both = 17;
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
