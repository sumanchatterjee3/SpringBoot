package boot.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id", nullable= true)
	private Integer ticketId;
	
	@Column(name = "passenger_name", nullable=false)
	private String passenger_Name;
	
	@Column(name = "booking_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date boookingDate;
	
	@Column(name = "source_station")
	private String sourceStation;
	
	@Column(name = "destination_station")
	private String destinationStation;
	
	@Column(name = "email")
	private String email;
	
	
	//==Getter and Setter Methods==
	
	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassenger_Name() {
		return passenger_Name;
	}

	public void setPassenger_Name(String passenger_Name) {
		this.passenger_Name = passenger_Name;
	}

	public Date getBoookingDate() {
		return boookingDate;
	}

	public void setBoookingDate(Date boookingDate) {
		this.boookingDate = boookingDate;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passenger_Name=" + passenger_Name + ", boookingDate=" + boookingDate
				+ ", sourceStation=" + sourceStation + ", destinationStation=" + destinationStation + ", email=" + email
				+ "]";
	}
	
	

}
