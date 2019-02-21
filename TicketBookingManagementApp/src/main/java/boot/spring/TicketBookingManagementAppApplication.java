package boot.spring;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import boot.spring.entity.Ticket;
import boot.spring.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
		
		Ticket ticket = new Ticket();
		ticket.setBoookingDate(new Date());		
		ticket.setDestinationStation("Mumbai");
		ticket.setSourceStation("Kolkata");
		ticket.setPassenger_Name("Suman Chatterjee");
		ticket.setEmail("suman@suman.com");

		ticketBookingService.createTicket(ticket);
	}

}
