using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab09
{
    public class TransactionException:ApplicationException
    {
        public TransactionException(string message) : base(message)
        {

        }
    }

    public class AccountCreationException : ApplicationException
    {
        public AccountCreationException(string message) : base(message)
        {

        }
    }
    public abstract class Account
    {
        protected string AccountNo;
        protected string AccountName;
        protected string AccountPassword;
        protected DateTime AccountCreation;
        protected DateTime AccountExpiry;
        protected double MinBalance;
        protected double MinAccountCreate;
        protected int transactionLimit;
        protected int transactionNumber;
        protected int WithdrawlCharge;
        protected double MaximumTransactionAmount;
        protected double initBalance;

        public List<string>transactionHistory=new List<string>();
        public abstract void makeTransaction(double amount, string particular);
        public abstract double validateAccountCreationAmmount(double amount);

        public abstract void withdraw(double amount);

        public abstract string info();

        public string AccountNum
        {
            get { return AccountNo; }
            set { AccountNo = value; }
        }

        public void addTransactionDetails(DateTime date, double Amount)
        {
            transactionHistory.Add("DateTime: " + Convert.ToString(date) + "\t" + "Amount: " + Convert.ToString(Amount) + "\tTransactionType: Withdraw"); ;
        }
    }

    public class CurrentAccount : Account
    {
        private static int initnumber = 0;
        private static string Account_Suffix = "300";
        
        public CurrentAccount(string AccountName, string AccountPassword, DateTime AccountCreation, DateTime AccountExpiry,double initBalance)
        {
            this.AccountNo = Convert.ToString(initnumber) + Account_Suffix;
            initnumber++;
            this.AccountName = AccountName;
            this.AccountPassword=AccountPassword;
            this.AccountExpiry = AccountExpiry;
            this.AccountCreation = AccountCreation;
            this.initBalance = validateAccountCreationAmmount(initBalance);
            this.transactionLimit = -1;
            this.MaximumTransactionAmount = 100000;
            this.MinBalance = 500;
            this.WithdrawlCharge = 0;
            this.transactionNumber = 0;

        }

        public override double validateAccountCreationAmmount(double amount)
        {
            //0+500 since Minimum Allowable Balance is 500
            if (amount < 500) throw (new AccountCreationException("Lesser than Minimum Allowabkle Balance"));
            return amount;

        }

        public override void makeTransaction(double amount, string particular)
        {
            if(this.transactionLimit!=-1 && this.transactionNumber == this.transactionLimit)
            {
                throw new TransactionException("Transaction Greater than Transaction Limit");
                return;
            }
            this.transactionNumber++;
            if (amount > this.MaximumTransactionAmount)
            {
                throw new TransactionException("Transaction Amount is too much");
            }

            if (particular == "debit")
            {
                this.initBalance += amount;
            }
            else if (particular == "credit")//withdraw falls under this
            {
                if (this.initBalance - amount >= this.MinBalance)
                {
                    this.initBalance -= amount;
                }
                else
                {
                    throw new TransactionException("Transaction exceeds range of minimum balance");
                }
            }
        }
        public override void withdraw(double amount)
        {
            if (this.initBalance - amount >= this.MinBalance)
            {
                this.initBalance -= amount;
            }
            else
            {
                throw new TransactionException("Transaction exceeds range of minimum balance");
            }
        }

        public override string info()
        {
            return "Account Holder: " + this.AccountName + "\n" + "AccountNo: " + this.AccountNo + "\n" + "Balance: " + Convert.ToString(this.initBalance) + "\n" + "Account Type: Current";

        }

        
    }

    public class SavingsAccount : Account
    {
        private static int initnumber = 0;
        private static string Account_Suffix = "314";

        public SavingsAccount(string AccountName, string AccountPassword, DateTime AccountCreation, DateTime AccountExpiry, double initBalance)
        {
            this.AccountNo = Convert.ToString(initnumber) + Account_Suffix;
            initnumber++;
            this.AccountName = AccountName;
            this.AccountPassword = AccountPassword;
            this.AccountExpiry = AccountExpiry;
            this.AccountCreation = AccountCreation;
            this.initBalance = validateAccountCreationAmmount(initBalance);
            this.transactionLimit = 5;
            this.MaximumTransactionAmount = -1;
            this.MinBalance = 0;
            this.WithdrawlCharge = 15;
            this.transactionNumber = 0;

        }

        public override double validateAccountCreationAmmount(double amount)
        {
            //0+500 since Minimum Allowable Balance is 500
            if (amount < 50000) throw (new AccountCreationException("Lesser than Minimum Allowabkle Balance"));
            return amount;

        }

        public override void makeTransaction(double amount, string particular)
        {
            if (this.transactionLimit != -1 && this.transactionNumber == this.transactionLimit)
            {
                throw new TransactionException("Transaction Greater than Transaction Limit");
                return;
            }
            this.transactionNumber++;
            if (this.MaximumTransactionAmount>=0 && amount > this.MaximumTransactionAmount)
            {
                throw new TransactionException("Transaction Amount is too much");
            }

            if (particular == "debit")
            {
                this.initBalance += amount;
            }
            else if (particular == "credit")//withdraw falls under this
            {
                if (this.initBalance - amount >= this.MinBalance)
                {
                    this.initBalance -= amount;
                }
                else
                {
                    throw new TransactionException("Transaction exceeds range of minimum balance");
                }
            }
        }

        public override void withdraw(double amount)
        {
            if (this.initBalance - (amount+this.WithdrawlCharge) >= this.MinBalance)
            {
                this.initBalance -= (amount+this.WithdrawlCharge);
            }
            else
            {
                throw new TransactionException("Transaction exceeds range of minimum balance");
            }
        }
        public override string info()
        {
            return "Account Holder: " + this.AccountName + "\n" + "AccountNo: " + this.AccountNo + "\n" + "Balance: " + Convert.ToString(this.initBalance) + "\n" + "Account Type: Savings";

        }
    }

    public class LoanAccount : Account
    {
        private static int initnumber = 0;
        private static string Account_Suffix = "400";

        public LoanAccount(string AccountName, string AccountPassword, DateTime AccountCreation, DateTime AccountExpiry, double initBalance)
        {
            this.AccountNo = Convert.ToString(initnumber) + Account_Suffix;
            initnumber++;
            this.AccountName = AccountName;
            this.AccountPassword = AccountPassword;
            this.AccountExpiry = AccountExpiry;
            this.AccountCreation = AccountCreation;
            this.initBalance = validateAccountCreationAmmount(initBalance);
            this.transactionLimit = -1;
            this.MaximumTransactionAmount = -1;
            this.MinBalance = 0;
            this.WithdrawlCharge = -1;
            this.transactionNumber = 0;

        }

        public override double validateAccountCreationAmmount(double amount)
        {
            return amount;

        }

        public override void makeTransaction(double amount, string particular)
        {
            if (this.transactionLimit != -1 && this.transactionNumber == this.transactionLimit)
            {
                throw new TransactionException("Transaction Greater than Transaction Limit");
                return;
            }
            this.transactionNumber++;
            if (this.MaximumTransactionAmount >= 0 && amount > this.MaximumTransactionAmount)
            {
                throw new TransactionException("Transaction Amount is too much");
            }

            if (particular == "debit")
            {
                this.initBalance += amount;
            }
            else if (particular == "credit")//withdraw falls under this
            {
                throw new TransactionException("Loan Account do not allow withdrawls");
            }
        }

        public override void withdraw(double amount)
        {
            throw new TransactionException("Loan Account do not allow withdrawls");
        }

        public override string info()
        {
            return "Account Holder: " + this.AccountName + "\n" + "AccountNo: " + this.AccountNo + "\n" + "Remaining: " + Convert.ToString(this.initBalance) + "\n" + "Account Type: Loan";

        }
    }
}
