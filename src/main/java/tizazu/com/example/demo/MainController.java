package tizazu.com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String salesReport(){
String sales_report="";
Scanner sc =new Scanner(System.in);
System.out.println("PLease enter customer name");
String customer_name=sc.nextLine();

System.out.println("please enter customer number");
        String customer_number=sc.nextLine();
        System.out.println("Enter sales amount");
        Double sales_amount=sc.nextDouble();
        
        sales_report+=("Customer Name= " + customer_name + "\n Customer Number= " + customer_number + "\n Cost Before Tax= " + sales_amount);
System.out.println(sales_report);
return sales_report;
    }
}
