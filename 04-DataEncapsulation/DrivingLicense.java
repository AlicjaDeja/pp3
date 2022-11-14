public class DrivingLicense{

    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String dlNumber;
    private int yearIssue;
    private String dlCat;

    public String getName(){return name;}
    public String getSurname(){return surname;}
    public String getAddress(){return address;}
    public String getPostalCode(){return postalCode;}
    public String getCity(){return city;}
    public String getDlNumber(){return dlNumber;}
    public int getYearIssue(){return yearIssue;}
    public String getDlCat(){return dlCat;}

    public void setName(String newName){
        this.name = newName.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();
    }
    public void setSurname(String newSurname){
        this.surname = newSurname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
    }
    public void setAddress(String newAddress){this.address = newAddress;}
    public void setPostalCode(String newPostalCode){this.postalCode = newPostalCode;}
    public void setCity(String newCity){this.city = newCity;}
    public void setDlNumber(String newDlNumber){this.dlNumber = newDlNumber;}
    public void setDlCat(String newDlCat){this.dlCat = newDlCat;}
    public void setYearIssue(int newYearIssue){
        if(newYearIssue >= 1980 && newYearIssue <= 2022){
            this.yearIssue = newYearIssue;
        } else {
            System.out.println("Dirving license is invalid");
        }
        
    }
    

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Address: "+address);
        System.out.println("Postal code: "+postalCode);
        System.out.println("City: "+city);
        System.out.println("Dl Number: "+dlNumber);
        System.out.println("Year issue: "+yearIssue);
        System.out.println("DlCat: "+dlCat);
    }

    public String toString(){

        String details = "";
        details += name+" "+surname+"\n";
        details += address+", "+postalCode+", "+city+"\n";
        details += dlNumber+", "+yearIssue+", "+dlCat; 
        return details;
    }
}

