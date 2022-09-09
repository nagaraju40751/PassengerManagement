package com.example.Passenger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.Passanger;

@SpringBootApplication
@RestController
public class PassengerManagementApplication {
	@GetMapping("/Passenger")
	public String display()
	{
		return "Passanger details are printed in the console";
	}

	public static void main(String[] args) {
		SpringApplication.run(PassengerManagementApplication.class, args);
		List<Passanger> passanger=new ArrayList<>();
		   Passanger p1=new Passanger(101,"Nagaraju",23,'M');
	       Passanger p2=new Passanger(101,"Nagaraju",23,'M');
	       Passanger p3=new Passanger(101,"Nagaraju",23,'M');
	       Passanger p4=new Passanger(101,"Nagaraju",23,'M');
	       Passanger p5=new Passanger(101,"Nagaraju",23,'M');
	       Passanger p6=new Passanger(101,"Nagaraju",23,'M');
	       Passanger p7=new Passanger(101,"Nagaraju",23,'M');
	       Passanger p8=new Passanger(101,"Nagaraju",23,'M');
	       Passanger p9=new Passanger(101,"Nagaraju",23,'M');
	       Passanger p10=new Passanger(101,"Nagaraju",23,'M');
	       passanger.add(p1);
	       passanger.add(p2);
	       passanger.add(p3);
	       passanger.add(p4);
	       passanger.add(p5);
	       passanger.add(p6);
	       passanger.add(p7);
	       passanger.add(p8);
	       passanger.add(p9);
	       passanger.add(p10);
	       for(Passanger s:passanger)
	       {
	    	   System.out.println(s.toString());
	       }
	}

}
