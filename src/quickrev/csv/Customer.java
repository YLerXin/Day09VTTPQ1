package quickrev.csv;

//public class Customers {
//     private String customerID;
//     private String firstName;
//     private String lastName;
//     private String company;
//     private String city;
//     private String country;
//     private String phone1;
//     private String phone2;
//     private String email;
//     private String subscriptionDate;
//     private String website;


//     public Customers(String customerID,String firstName,String lastName,String company,String city,String country,String phone1,String phone2,String email,String subscriptionDate,String website){
//         this.customerID = customerID;
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.company = company;
//         this.city = city;
//         this.country = country;
//         this.phone1 = phone1;
//         this.phone2 = phone2;
//         this.email = email;
//         this.subscriptionDate = subscriptionDate;
//         this.website = website;
//     }

//     public String getCustomerID() {return customerID;}
//     public void setCustomerID(String customerID) {this.customerID = customerID;}
//     public String getFirstName() {return firstName;}
//     public void setFirstName(String firstName) {this.firstName = firstName;}
//     public String getLastName() {return lastName;}
//     public void setLastName(String lastName) {this.lastName = lastName;}
//     public String getCompany() {return company;}
//     public void setCompany(String company) {this.company = company;}
//     public String getCity() {return city;}
//     public void setCity(String city) { this.city = city;}
//     public String getCountry() {return country;}
//     public void setCountry(String country) {this.country = country;}
//     public String getPhone1() {return phone1;}
//     public void setPhone1(String phone1) {this.phone1 = phone1;}
//     public String getPhone2() {return phone2;}
//     public void setPhone2(String phone2) {this.phone2 = phone2;}
//     public String getEmail() {return email;}
//     public void setEmail(String email) {this.email = email;}
//     public String getSubscriptionDate() {return subscriptionDate;}
//     public void setSubscriptionDate(String subscriptionDate) {this.subscriptionDate = subscriptionDate;}
//     public String getWebsite() {return website;}
//     public void setWebsite(String website) {this.website = website;}

    





// }
public class Customer {
    private String index;
    private String customerId;
    private String firstName;
    private String lastName;
    private String company;
    private String city;
    private String country;
    private String phone1;
    private String phone2;
    private String email;
    private String subscriptionDate;
    private String website;

    // Constructor
    public Customer(String index, String customerId, String firstName, String lastName, String company, String city,
            String country, String phone1, String phone2, String email, String subscriptionDate, String website) {
        this.index = index;
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.city = city;
        this.country = country;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.subscriptionDate = subscriptionDate;
        this.website = website;
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "index='" + index + '\'' +
                ", customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", email='" + email + '\'' +
                ", subscriptionDate='" + subscriptionDate + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}