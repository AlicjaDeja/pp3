public class Main{

    public static void main(String[] args) {
        System.out.println("Hello");
        DrivingLicense dl = new DrivingLicense();
        dl.setName("alicja");
        dl.setSurname("deja");
        dl.setCity("Krakow");
        dl.setAddress("street 123");
        dl.setPostalCode("31-123");
        dl.setDlCat("A");
        dl.setYearIssue(1981);
        dl.setDlNumber("MNLOP123");

        // dl.display();
        System.out.println(dl); //System.out.println(dl.toString()); is longer 
    }



}