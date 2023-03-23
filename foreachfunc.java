public class foreachfunc{
    public static void main(String[] args){
        String[] fruits= {"oranges", "apples", "eggs"};
        System.out.println(fruits.toString());
        for (int i =0; i<fruits.length; i++){System.out.println(fruits[i]);
        }

        for (String fruit:fruits){
            System.out.println(fruit);
        }
    }
}