package com.codingshuttle.youtube.shubham;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShubhamApplication implements CommandLineRunner {

	public static void main(String[] args)
    {
		SpringApplication.run(ShubhamApplication.class, args);
	}


     private RazorpayPayments shubham =new RazorpayPayments();
    // now after bean is done now everytime get do not have to creqate the class for declaration if the value
     public ShubhamApplication(RazorpayPayments shubham){
         this.shubham=shubham;
     }

     // this create and formed by constructor  dependency framework and niw the thi class os depended on the object


    @Override
    public void run (String...args) throws Exception {
        String payment=shubham.pay();
        System.out.println("Payment done:"+payment);
    }

}
