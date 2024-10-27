package quickrev.task1to6;

import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;  


public class Product {
    private long id;
    private String prodName;
    private String prodDesc;
    private String prodCat;
    private Float price;
    private LocalDateTime createdDate;
    

    public Product(long id, String prodName, String prodDesc,String prodCat,Float price,LocalDateTime createdDate){
        this.id = id;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodCat = prodCat;
        this.price = price;
        this.createdDate = createdDate;




    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public String getProdDesc() {
        return prodDesc;
    }
    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }
    public String getProdCat() {
        return prodCat;
    }
    public void setProdCat(String prodCat) {
        this.prodCat = prodCat;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  

    @Override
    public String toString() {
        return "Product [id=" + id + ", prodName=" + prodName + ", prodDesc=" + prodDesc + ", prodCat=" + prodCat
                + ", price=" + price + ", createdDate=" + dtf.format(createdDate) + "]";
    }

    
    
}
