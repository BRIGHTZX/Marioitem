public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");


        int[] nums = {1,2,3,4,5};
        int a = 9;
        int b = 1;
        //System.out.println(nums[5]);
        //System.out.println("The rest of the code...");

        try {

            int c = a / b;
            System.out.println(nums[3]);
            System.out.println(c);
            //int x = Integer.parseInt("50");

        } catch (ArrayIndexOutOfBoundsException bug) {
            System.out.println("catch1" + bug.getMessage());
            System.out.println(nums[nums.length - 1]);

        } catch (ArithmeticException bug) {
            System.out.println("catch2" + bug.getMessage());
            System.out.println(a / (b + 2));

        } catch (Exception bug) {
            System.out.println("All kind bug: " + bug.getMessage());
            System.out.println("There is a bug!");
        }finally{
            System.out.println("Finally Block!");
        }

        try {
            validate(15);
        } catch(ArithmeticException bug){
            System.out.println(bug.getMessage());
            System.out.println(bug.getStackTrace());
            System.out.println("Can see votng infomation..");

        }
        System.out.println("The rest of the code...");
        sleeping(10000);
        
    }// close main

    static void sleeping(long sleepTime) throws Exception {
        Thread.sleep(sleepTime) ;
        System.out.println("Wake Up");
    }

    static void validate(int age ){
        if(age<18){
            //System.out.println("not eligible to vote! ");
            System.out.println("result!");
            throw new ArithmeticException("not eligible to vote");
        }else{
            System.out.println("eligile to vote! ");
        }
    }
}
