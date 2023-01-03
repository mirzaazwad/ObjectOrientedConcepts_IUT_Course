public class BottleProblem {
    public String song;

    public void VerseN(int n){
        String FirstNumber=String.valueOf(n);
        String SecondNumber=String.valueOf(n-1);
        song=song+FirstNumber+" bottles of beer on the wall, "+FirstNumber+" bottles of beer.\n" +
                "Take one down and pass it around, "+SecondNumber+" bottles of beer on the wall.\n";
    }

    public void Verse2(){
        String FirstNumber=String.valueOf(2);
        String SecondNumber=String.valueOf(1);
        song=song+FirstNumber+" bottles of beer on the wall, "+FirstNumber+" bottles of beer.\n" +
                "Take one down and pass it around, "+SecondNumber+" bottle of beer on the wall.\n";
    }

    public void Verse1(){
        String FirstNumber=String.valueOf(1);
        String SecondNumber="no more";
        song=song+FirstNumber+" bottle of beer on the wall, "+FirstNumber+" bottle of beer.\n" +
                "Take one down and pass it around, "+SecondNumber+" bottles of beer on the wall.\n";
    }

    public void Verse0(){
        song=song+"No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
    }


    public BottleProblem(){
        song="";
    }

    public String verseRange(int start,int end) throws Exception{
        if(start<=end){
            throw new Exception("Range is invalid");
        }
        song="";
        for(int i=start;i>=end;i--){
            if(i>2){
                VerseN(i);
            }
            else if(i==2){
                Verse2();
            }
            else if(i==1){
                Verse1();
            }
            else{
                Verse0();
            }
        }
        return song;
    }
    public String verse(int numberOfLines) throws Exception{
        song="";
        if(numberOfLines>99){
            throw new Exception("Number Of Bottles greater than 99");
        }
        if(numberOfLines<0){
            throw new Exception("Number of Bottles less than 0");
        }
        while(numberOfLines>=0){
            if(numberOfLines>2){
                VerseN(numberOfLines);
            }
            else if(numberOfLines==2){
                Verse2();
            }
            else if(numberOfLines==1){
                Verse1();
            }
            else{
                Verse0();
            }
            numberOfLines--;
        }

        return song;
    }
}
