import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static int maximumDifference(Integer array[]){
        ArrayList<Integer> list = new ArrayList<Integer>  (Arrays.asList(array));
        System.out.println("Unordered List");
        print(list);
        for(int i=1; i<list.size();i++){
            boolean added = false;
            for(int j=i; j>0 && !added; j--){
                Integer one = list.get(j);
                Integer two = list.get(j-1);
                if(one < two){
                    list.set(j, two);
                    list.set(j-1, one);
                }else{
                    added= true;
                }
            }

        }
        System.out.println("Ordered List");
        print(list);
        return list.get(list.size()-1)-list.get(0);

    }

    public static void validateAccess(){
        Map<String, String> users = new HashMap<>(){{
            put("yesinaranjo", "1a6247");
            put("joflorez","4a7b54");
            put("silvigarcia","8k6r41");
            put("yenimontoya","9u4t47");
        }};

        String username = "";
        String password = "";
        int attempts =4;


            String username2 = " ";
            String password2 = " ";

            while (attempts-- > 0 && !username2.equals(username) && !password2.equals(password)) {
                System.out.println("Enter your username: ");
                username = scanner.nextLine();
                System.out.println("Enter your password: ");
                password = scanner.nextLine();

                for (String key : users.keySet()) {


                if(key.equals(username) && users.get(key).equals(password)){
                    username2 = key;
                    password2 = users.get(key);

                }

            }
                if(username2.equals(username) && password2.equals(password)){
                    System.out.println("ACCESS GRANTED!");
                }else{
                    System.out.println("ACCESS DENIED!");
                }
        }
    }
    public static boolean validateSum(Integer array[], int value){
        ArrayList<Integer> list = new ArrayList<Integer>  (Arrays.asList(array));
        int i=1;
        int j=1;
        for(Integer item1: list){
            for(Integer item2: list){
                if(i!=j){
                    if(item1+item2 == value){
                        return true;
                    }
                }
                j++;
            }
            i++;
        }
        return false;
    }
    public static void print(ArrayList<Integer> list){

        for(Integer item: list){
            System.out.print(item + " ");
        }
        System.out.print("\n");
    }
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Maximum difference in an ArrayList");
        Integer arr[] = { 2, 7, 9, 5, 1, 3, 5 };
        System.out.println("maximum difference is :" + maximumDifference(arr));

        System.out.println("User authentication with Maps");
        validateAccess();

        System.out.println("Sum validation in an ArrayList");
        System.out.println(validateSum(arr, 16));
    }
}
