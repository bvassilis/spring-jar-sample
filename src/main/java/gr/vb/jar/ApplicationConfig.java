package gr.vb.jar;

import gr.vb.jar.bean.Customer;
import gr.vb.jar.bean.DrinkCustomer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    
    @Bean 
    public Customer customer() {
        return new DrinkCustomer();
    }

}
