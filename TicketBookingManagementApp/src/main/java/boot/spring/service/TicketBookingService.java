/**
 * @author suman
 *
 */
package boot.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.spring.dao.TicketBookingDAO;
import boot.spring.entity.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDAO ticketBookingDAO;
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDAO.save(ticket);
	}
	public Ticket getTicketById(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketBookingDAO.findById(ticketId).get();
	}
	public Iterable<Ticket> getAllBookedTickets() {
		// TODO Auto-generated method stub
		return ticketBookingDAO.findAll();
	}
	public void deleteTicketById(Integer ticketId) {
		// TODO Auto-generated method stub
		ticketBookingDAO.deleteById(ticketId);
		
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		// TODO Auto-generated method stub
		
		Ticket ticketFromDb = ticketBookingDAO.findById(ticketId).get();
			ticketFromDb.setEmail(newEmail);
			ticketBookingDAO.save(ticketFromDb);
			return getTicketById(ticketId);
		}
			
	}