package com.klef.sdp;

import com.klef.sdp.controller.VisitorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootVisitorsapiApplication {

    private final VisitorController visitorController;

    SpringbootVisitorsapiApplication(VisitorController visitorController) {
        this.visitorController = visitorController;
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootVisitorsapiApplication.class, args);
		System.out.println("Project Running Successfully .... !!!!");
	}

}
