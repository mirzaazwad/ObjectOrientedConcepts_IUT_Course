using System;
using System.Collections.Generic;

public class Account
{
	private string Number;
	private double Balance;
	private string Branch;
	public Account(string Number, double Balance, string Branch)
	{
		this.Number = Number;
		this.Balance = Balance;
		this.Branch = Branch;
	}
	public Account()
    {

    }
	public string GetNumber()
    {
		return this.Number;
    }
	public void SetAccount(string Number, double Balance, string Branch)
    {
		this.Number = Number;
		this.Balance = Balance;
		this.Branch = Branch;
	}
	public void MakeWithdrawl(double withdraw)
    {
		this.Balance-=withdraw;
    }
	public void MakeDeposit(double deposit)
    {
		this.Balance+=deposit;
    }
	public double ShowBalance()
    {
		return this.Balance;
    }
}

