
package guessgame;


public class GuessMachine {
    private int number;
    private int numguesses;
    private int myguess;
    
    public GuessMachine(){
        numguesses=0;
        number = (int)(Math.random() * 100) + 1;
        myguess = 0;
}
    public boolean setGuess(int num){
        numguesses++;
        if(num>100|| num < 0) return false;
        myguess = num;
        myguess++;
        return true;
}
    public String giveResult(){
        if(myguess==number)return "You got it";
        else if (myguess<number)return "Too Low";
        else return "Too High";
    }
    public int getnumGuesses(){
        return numguesses;
    }
}



