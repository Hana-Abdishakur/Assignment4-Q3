public class Main {

    public static void main(String[] args) {

        Address ad= new Address(10, "Paris", "DOWN", "France");
        Student st= new Student(5, "Adan", ad);

        System.out.println("Roll no: "+ st.rno);
        System.out.println("Name: "+ st.stName);
        System.out.println("Street: "+ st.stAddr.strNum);
        System.out.println("City: "+ st.stAddr.city);
        System.out.println("State: "+ st.stAddr.state);
        System.out.println("Country: "+ st.stAddr.country);


    }
}