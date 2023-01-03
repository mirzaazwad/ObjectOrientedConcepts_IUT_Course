using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Quiz_I
{
    internal class Manager:Employee
    {
        public void addProduct(int id, string name, double price, int qty, int min_qty, int req_amount)
        {
            Inventory.products.Add(new Product(id, name, price, qty, min_qty, req_amount));
        }

        public void InitiateAutoRequisition(int productID)
        {
            foreach (Product product in Inventory.products)
            {
                if(product.id==productID && product.qty<product.min_qty)
                {
                    product.auto_req();
                }
            }
        }

        public void InitiateRequisition(int productID, int amount)
        {
            foreach (Product product in Inventory.products)
            {
                if (product.id == productID && product.qty < product.min_qty)
                {
                    product.req(amount);
                }
            }
        }
    }
}
