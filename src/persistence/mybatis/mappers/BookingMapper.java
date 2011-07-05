package persistence.mybatis.mappers;

import java.util.List;

import model.Booking;
import model.Structure;

public interface BookingMapper {
	public Booking findBookingById(Integer id);
	public List<Integer> findBookingIdsByIdStructure(Integer id_structure);
	public List<Booking> findBookingsByIdStructure(Integer id_structure);
	public List<Integer> findBookingIdsByIdBooker(Integer id_booker);
	public List<Booking> findBookingsByIdBooker(Integer id_booker);
	
	public Integer insertBooking(Booking booking);
	public Integer updateBooking(Booking booking);
	public Integer deleteBooking(Integer id);

}
