package Task03;

public class Person {
    private String Number;
    Person(String number){
        this.Number = number;
        try{
            if(ValidateNumber()){
                System.out.print("Ok: ");
                System.out.println(this.Number);
            }
        }
        catch(Exception e){
            System.out.print("Not Ok: ");
            System.out.println(e.getMessage());
        }
    }
    public boolean ValidateNumber() throws UnderscoreException,LengthException {
        int NumberCount=0;
        for(int i=0;i<Number.length();i++){
            if(Number.charAt(i)>='0' && Number.charAt(i)<='9'){
                NumberCount++;
            }
        }
        if(NumberCount!=8){
            throw new LengthException();
        }

        int UnderScoreCount=0;
        for(int i=0;i<Number.length();i++){
            if(Number.charAt(i)=='_'){
                UnderScoreCount++;
            }
        }
        if(UnderScoreCount!=1) {
            throw new UnderscoreException();
        }
        return true;
    }
}
