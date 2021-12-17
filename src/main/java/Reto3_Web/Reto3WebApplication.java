package Reto3_Web;
import Reto3_Web.interfaces.InterfaceOrder;
import Reto3_Web.interfaces.InterfaceUser;
import Reto3_Web.interfaces.InterfaceSupplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto3WebApplication implements CommandLineRunner {
   @Autowired
    private InterfaceSupplements interfaceSupplements;
    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceOrder interfaceOrder;
    
	public static void main(String[] args) {
		SpringApplication.run(Reto3WebApplication.class, args);
	}
          @Override
    public void run(String... args) throws Exception {
        interfaceSupplements.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
    }
        
}
