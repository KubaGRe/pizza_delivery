package dev.grela.jakub.pizza_delivery;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PizzaDeliveryApplication {
/*Uruchamianie całej aplikacji*/
	public static void main(String[] args) {
		SpringApplication.run(PizzaDeliveryApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory factory = (BeanFactory) context;
		Consumer consumer = (Consumer) factory.getBean("Consumer");
		consumer.run();
	}

}
