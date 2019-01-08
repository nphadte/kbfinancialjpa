package com.example.kbfinancialjpa;

import com.example.kbfinancialjpa.model.Bank;
import com.example.kbfinancialjpa.repository.BankJpaRepository;
import com.example.kbfinancialjpa.service.ATMService;
import org.hibernate.service.spi.InjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.inject.Inject;

import com.example.kbfinancialjpa.repository.BankJpaRepository;
import com.example.kbfinancialjpa.model.Bank;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

import com.example.kbfinancialjpa.service.ATMService;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class  KbfinancialjpaApplication {

	/*@Autowired
	BankJpaRepository  bankJpaRepository;*/

	/*@Autowired
	private  ATMService  atmService;*/

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(KbfinancialjpaApplication.class, args);

		/*for ( String  beanNames : applicationContext.getBeanDefinitionNames()){
			System.out.println("The Bean Names are :" + beanNames);
		}*/

		ATMService  atmService  = (ATMService) applicationContext.getBean("ATMService");
		//BankJpaRepository  bankJpaRepository = applicationContext.getBean("BankJpaRepository");
		@Inject
		BankJpaRepository  bankJpaRepository;

		List<Bank>  banks = new ArrayList<>();

		banks = atmService.getAllBanks();

		for ( Bank b : banks ){
			System.out.println(b.getBank_Id()+ ":" + b.getName()+ ":" + b.getCity()+ ":" +b.getState()+ ":" + b.getCreated_by()   );
		}

	}
}

