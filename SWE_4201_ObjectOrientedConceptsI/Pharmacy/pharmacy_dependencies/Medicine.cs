using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pharmacy_dependencies
{
    public class Medicine
    {
        private string drugName;//Drug Name
        private string DIN;//Drug Identification Number
        private int miligrams;
        private int medicineQuantity;//medicine stock
        private double cost;
        private DateTime manufacturingDate=new DateTime();
        private DateTime expiryDate=new DateTime();

        public Medicine()
        {

        }
        public Medicine(string drugName, string DIN, int miligrams, int medicineQuantity, double cost, DateTime manufacturingDate, DateTime expiryDate)
        {
            this.drugName = drugName;
            this.DIN = DIN;
            this.miligrams = miligrams;
            this.medicineQuantity = medicineQuantity;
            this.cost = cost;
            this.manufacturingDate = manufacturingDate;
            this.expiryDate = expiryDate;
        }
        public string getMedicineInfo()
        {
            return this.drugName + "\t" + this.DIN + "\t" + Convert.ToString(this.miligrams) + "\t" + Convert.ToString(this.medicineQuantity) +"\t" +Convert.ToString(this.cost) + "\t"+Convert.ToString(this.manufacturingDate) +"\t"+ Convert.ToString(this.expiryDate);
        }
	public string getDrugName(){
		return this.drugName;
	}
	public int getMiligrams(){
		return this.miligrams;
	}
        public double getCost()
        {
            return this.cost;
        }

        public void adjustMedicineCost(double cost)
        {
            this.cost = cost;
        }
        public void addQuantity(int quantity)
        {
            this.medicineQuantity += quantity;
        }
        public void buyMedicine(int quantity)
        {
            this.medicineQuantity -= quantity;
        }
        public int getQuantity()
        {
            return this.medicineQuantity;
        }
    }
}
