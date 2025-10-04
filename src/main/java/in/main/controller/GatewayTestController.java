package in.main.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = {
	    "http://localhost:4200",
	    "https://hotelbookingbyadinath.netlify.app"
	})
public class GatewayTestController {

    @GetMapping("/test-config")
    public Map<String, Object> testConfig() {
        Map<String, Object> config = new HashMap<>();
        config.put("serverPort", 8082);
        config.put("routes", List.of("hotels-service", "users-service", "bookings-service", "contacts-service"));
        return config;
    }
}

