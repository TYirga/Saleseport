package tizazu.com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        System.out.println("Enter customer tax code");
        int tax_code=sc.nextInt();
        if(tax_code==0|| tax_code==1|| tax_code==5){
        if(tax_code==0)
            sales_amount=sales_amount;
        else if (tax_code==1)
            sales_amount=sales_amount+(0.03*sales_amount);
        else if(tax_code==5)
            sales_amount=sales_amount+(0.05*sales_amount);}
        else{
            System.out.println("PLease enter the correct tax code");
        tax_code=sc.nextInt();}

        sales_report+=("Customer Name= " + customer_name + "\n Customer Number= " + customer_number + "\n  Total Cost= " + sales_amount);
        System.out.println  (sales_report);
        return sales_report;
    }
}
