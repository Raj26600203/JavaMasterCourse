/*
* The tenary operator would not be something
* you would do when writing proper code
*
* */
public class TernaryOperator {
    public static void main(String[] args){
         String myJob = "Software Engineer";

         //if myJob equals to "Software Engineer", false is assigned
         boolean isConsultant = myJob.equals("Software Engineer")?false:true;
         System.out.println(isConsultant);

         System.out.println(minorOrMajor(18));
    }
    public static String minorOrMajor(int age){

        //If the age is more than equal to 18 then Major is assigned
        String result = age>=18?"Major":"Minor";

        return result;
    }
}
