public class ConditionalStatement {
    public static void main(String[] args){
        boolean isFlase = false;

        //Why the block below is executed?
        //That's because the value true is assigned to the variable isFalse
        if(isFlase=true){
            System.out.println("Is this executed?");
        }

        if(isFlase){
            System.out.println("false");
        }
        if(isFlase==false){
            System.out.println("false");
        }
        isFlase=false;
        //Abbreviated form is recommended if a value is boolean, being concise and preventing you from making mistakes
        if(!isFlase){
           System.out.println("The complement of false is always true!");
        }
    }
}
