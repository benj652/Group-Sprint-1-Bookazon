public class Address {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zipCode;
    private String country;


    public void setAllFields(String line1, String line2, String city, String state, String zipCode, String country){
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String toString(){
        String addressString = this.line1 + "," + this.line2 + "," + this.city + "," 
        + this.state + "," + this.zipCode + "," + this.country; 
        return addressString;
    }
}
