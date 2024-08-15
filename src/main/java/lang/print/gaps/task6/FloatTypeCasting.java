package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int roundIntoInteger = Math.round(numberToBeRounded);
        System.out.println(roundIntoInteger);
    }
    public  static void main (String [] args){
        FloatTypeCasting roundNbr = new FloatTypeCasting();
        roundNbr.roundNumber(3.6f);

    }
}
