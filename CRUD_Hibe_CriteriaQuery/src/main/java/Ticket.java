import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Ticket {
	@Id
	@Column(name = "id")
	private Integer id ;
	
	@Column(name = "bookedBy")
	private String bookedBy ;
	
	@Column(name = "event")
	private String event ;
	
	@Column(name = "price")
	private float price ;
	
	
	public Ticket() {
		
	}
	
	public Ticket(Integer id, String bookedBy, String event, float price) {
		super();
		this.id = id;
		this.bookedBy = bookedBy;
		this.event = event;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
	}

	public String getEevnt() {
		return event;
	}

	public void setEevnt(String eevnet) {
		this.event = event;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
