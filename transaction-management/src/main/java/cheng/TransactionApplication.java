package cheng;

import cheng.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import cheng.pojo.User;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class TransactionApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TransactionApplication.class, args);
        UserService userService = context.getBean(UserService.class);
        User user = new User("1", null, "18");
        userService.saveUser(user);
    }
}
