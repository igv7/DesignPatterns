package structural.command;

//The client instructs to execute when most of the data needed to execute the request is already packed within the customer's request
//RestTemplate


//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
//
//import com.johnbryce.SpringMVC.benas.Person;
//
//@SpringBootApplication(scanBasePackages="com.johnbryce.SpringMVC")
//public class SpringMvcApplication {
//
//	public static void main(String[] args) {
//		System.out.println("Yalla");
//		SpringApplication.run(SpringMvcApplication.class, args);
//		System.out.println("Yalla");
//		
//		RestTemplate client=new RestTemplate();
//		System.out.println(client.getForObject("http://localhost:8080/greet?name=Moshe", String.class));
//	}
//	
//	@Bean
//    public Collection<Person> people(){
//        return new ArrayList<Person>();
//    }
//
//}