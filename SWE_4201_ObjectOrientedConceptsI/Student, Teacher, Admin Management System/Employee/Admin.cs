using System;

class Admin
{
    private int adminID;
    private string adminName;
    private string adminDesignation;
    private double adminSalary;
    public string getinfo()
    {
        string retString = Convert.ToString(this.adminID) + "  " + this.adminName + "  " + this.adminDesignation + "  " + Convert.ToString(this.adminSalary);
        return retString;
    }
    public void setinfo(int adminID, string adminName, string adminDesignation, double adminSalary)
    {
        this.adminID = adminID;
        this.adminName = adminName;
        this.adminDesignation = adminDesignation;
        this.adminSalary = adminSalary;
    }
}
