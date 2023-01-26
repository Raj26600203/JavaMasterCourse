public class ChallengeOne {
    public static void main (String[] args){
        final double val1 = 20.00;
        final double val2 = 80.00;

        double result =calculator(val1,val2);
        String msg1 = judgement(result);
        System.out.println(msg1);

    }
    private static String judgement(double result) {
        boolean judge =(result==0.00);
        String resultMsg;

        if(!judge){
            resultMsg = "got some remainder";
        }else{
            resultMsg ="";
        }
        return resultMsg;
    }

    public static double calculator(double n1,double n2){
        double operand1 = (n1+n2)*100.00;
        double result = operand1%40.00;
        return result;
    }

}
