using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Quiz_I
{
    internal class Product
    {
        public int id;
        public string name;
        public double price;
        public int qty;
        public int min_qty;
        public int req_amount;

        public Product(int id, string name, double price, int qty, int min_qty, int req_amount)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
            this.min_qty = min_qty;
            this.req_amount = req_amount;
        }

        public void auto_req()
        {
            qty += req_amount;
        }

        public void req(int amount)
        {
            qty += amount;
        }
    }
}
