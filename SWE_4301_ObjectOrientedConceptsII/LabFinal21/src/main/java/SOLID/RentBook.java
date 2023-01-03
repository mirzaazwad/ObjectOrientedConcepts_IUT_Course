package SOLID;

public class RentBook {
    public Book book;
    public Integer numberOfDays;
    public Double baseRentFee;
    public RentBook(Book book, Integer numberOfDays,Double baseRentFee){
        this.book=book;
        this.numberOfDays=numberOfDays;
        this.baseRentFee=baseRentFee;
    }

    public Double CalculateRent(){
        return this.baseRentFee*this.book.rentChange()+CalculateFine();
    }

    public Double CalculateFine(){
        return this.numberOfDays>7?Double.valueOf((this.numberOfDays-7)*4):0;
    }


}
