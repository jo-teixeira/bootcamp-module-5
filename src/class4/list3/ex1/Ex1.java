package class4.list3.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Password senhaFacebook = new Password("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$");

//        Best password
//        senhaFacebook.setValue("Bootcamp#go2110");

//        Invalid password
//        senhaFacebook.setValue("123");
    }
}