package quick.pager.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author siguiyang
 */
@SpringCloudApplication
@EnableFeignClients
public class Cart {

    public static void main(String[] args) {
        SpringApplication.run(Cart.class, args);
    }
}

