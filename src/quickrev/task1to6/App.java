package quickrev.task1to6;

import java.util.stream.Collectors;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;  

public class App {
    
    public static void main(String[] args)throws IOException {
        String filepath = null;
        if (args.length >= 1){
            filepath = args[0];
        }
        File file = new File(filepath);

        ArrayList<Product> products = new ArrayList<Product>();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
        LocalDateTime now = LocalDateTime.now();

        products.add(new Product(1,"Mouse","For click UI on screen","Computer",(float)99.0,now));
        products.add(new Product(2,"Keyboard","device that applows alpha numerics inputs","Computer",(float)235.5,now));
        products.add(new Product(3,"15.6 inch monitor","Extended display panel","Computer",(float)157.5,now));
        products.add(new Product(4,"Huawei Pura 70 Ultra","Huawei phone","Mobile",(float)900.0,now));
        products.add(new Product(5,"Huawei Mate 50 Pr","Huawei phone","Mobiler",(float)1200.0,now));
        products.add(new Product(6,"iPhone 16 Pro","Iphone","Mobile",(float)2000.0,now));
        products.add(new Product(7,"iPhone 14 Pro","Iphone","Mobile",(float)1800.0,now));

        //price above 1500
        // List<Product> filteredProd = new ArrayList<>();
        // filteredProd = products.stream()
        // .filter(p->(p.getPrice() > 1500))
        // .collect(Collectors.toList());
        // for(Product prod : filteredProd){
        //     System.out.println(prod.toString());
        // }


        //using lambda

        FileWriter fr = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(fr);

        products.forEach(p->{
            if(p.getPrice() > 1500){
                System.out.println(p.toString());
                try{
                br.write(p.toString()+"\n");
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        });
        br.close();
        fr.close();



    }

}
