package boot.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import boot.spring.entity.Ticket;

@Repository
public interface TicketBookingDAO extends CrudRepository<Ticket, Integer> {

	
	
	
}
