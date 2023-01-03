using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace laundry_management_dependencies
{
    public static class Order
    {
        public static int OrderID = 0;
        public static double CurrentAccount=0.00;
        public static int getOrderID()
        {
            return Order.OrderID;
        }
        public static void Increment()
        {
            Order.OrderID++;
        }
        public static void AddToAccount(double money)
        {
            Order.CurrentAccount += money;
        }
    }
}
