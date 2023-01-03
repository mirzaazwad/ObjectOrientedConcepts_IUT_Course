using System;
using System.Collections.Generic;

public class Client
{
	private string ClientID;
	private string ClientName;
	private string Address;
	private Account clientAccount=new Account();
	public Client(string ClientID, string ClientName, string Address, Account clientAccount)
    {
		this.clientAccount = clientAccount;
		this.ClientID = ClientID;
		this.ClientName = ClientName;
		this.Address = Address;
    }
	public Account GetClientInfo()
    {
		return this.clientAccount;
    }
	public string GetClientID()
    {
		return this.ClientID;
    }
}