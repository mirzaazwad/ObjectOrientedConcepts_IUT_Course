using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Quiz_I
{
    internal class SalesAssociate:Employee
    {
        protected double bonus = 0;

        public void saleProduct(int id, int amount)
        {
            foreach(Product product in Inventory.products)
            {
                if(product.id == id && product.qty>=amount)
                {
                    double total_price = product.price * amount;
                    bonus += total_price * 0.01;

                    product.qty -= amount;
                }
            }
        }
    }
}
