using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace laundry_management_dependencies
{
    public class OwnerOrder
    {
        private string OwnerOrderID;
        private User UserInfo;
        private DateTime DeliveryDate;
        private string OwnerOrderStatus="Processing";
        private Shirt shirt;
        private Pant pant;
        private Suit suit;
        private BedSheet bedSheet;
        private double cost;

        public OwnerOrder()
        {

        }
        public OwnerOrder(User UserInfo)
        {
            this.UserInfo = UserInfo;
        }
        public void setUser(User users)
        {
            this.UserInfo = users;
        }
        public User getUser()
        {
            return this.UserInfo;
        }
        public void setDate(DateTime DeliveryDate)
        {
            this.DeliveryDate = DeliveryDate;
        }
        public DateTime getDate()
        {
            return this.DeliveryDate;
        }
        public string getID()
        {
            return this.OwnerOrderID;
        }
        public void setOwnerOrderID(string OwnerOrderID)
        {
            this.OwnerOrderID = OwnerOrderID;
        }

        public void setShirt(Shirt shirt)
        {
            this.shirt = shirt;
        }
        public void setPant(Pant pant)
        {
            this.pant = pant;
        }
        public void setBedSheet(BedSheet bs)
        {
            this.bedSheet = bs;
        }
        public void setSuit(Suit suit)
        {
            this.suit = suit;
        }
        public void setter(Shirt shirt, Pant pant, Suit suit, BedSheet bedsheet)
        {
            this.shirt = shirt;
            this.pant = pant;
            this.suit = suit;
            this.bedSheet = bedsheet;
            double money = this.shirt.getCost() * this.shirt.getQuantity() + this.pant.getCost() * this.pant.getQuantity() + this.suit.getCost() * this.suit.getQuantity() + this.bedSheet.getCost() * this.bedSheet.getQuantity();
            this.cost = money;
        }
        public void setStatus(string status)
        {
            this.OwnerOrderStatus = status;
        }
        public string getStatus()
        {
            return this.OwnerOrderStatus;
        }
        public double getCost()
        {
            return this.cost;
        }
        public string getProductQuantity(string product)
        {
            if (product == "shirt")
            {
                return Convert.ToString(this.shirt.getQuantity());
            }
            else if (product == "pant")
            {
                return Convert.ToString(this.pant.getQuantity());
            }
            else if (product == "bedsheet")
            {
                return Convert.ToString(this.bedSheet.getQuantity());
            }
            else
            {
                return Convert.ToString(this.suit.getQuantity());
            }
        }
        public string getProductCost(string product)
        {
            if (product == "shirt")
            {
                return Convert.ToString(this.shirt.getCost()*this.shirt.getQuantity());
            }
            else if (product == "pant")
            {
                return Convert.ToString(this.pant.getCost()*this.pant.getQuantity());
            }
            else if (product == "bedsheet")
            {
                return Convert.ToString(this.bedSheet.getCost()*this.bedSheet.getQuantity());
            }
            else
            {
                return Convert.ToString(this.suit.getCost()*this.suit.getQuantity());
            }
        }
        public string getProductToDo(string product)
        {
            if (product == "shirt")
            {
                return this.shirt.getToDo();
            }
            else if (product == "pant")
            {
                return this.pant.getToDo();
            }
            else if (product == "bedsheet")
            {
                return this.bedSheet.getToDo();
            }
            else
            {
                return this.suit.getToDo();
            }
        }
    }
}
