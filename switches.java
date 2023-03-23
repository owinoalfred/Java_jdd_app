public class switches {
    public static void main(String[] args){
        String Roles = new String("Admin");
        switch(Roles){
           case "Admin":{
            System.out.println("you are Admin!");
            break;
           }
           case "Moderator":{
            System.out.println("You are a Modorator!");
            break;
           }
           case "User":{
            System.out.println("You are a User");
            break;
           }
           default:{
            System.out.println("You are a guest");
            break;
           }
        }
    }
    
}
