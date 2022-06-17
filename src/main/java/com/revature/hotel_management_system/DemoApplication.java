package com.revature.hotel_management_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.revature.hotel_management_system.controllers.BookRoomController;
import com.revature.hotel_management_system.controllers.AddCustomerController;
import com.revature.hotel_management_system.controllers.AddNewServicesController;
import com.revature.hotel_management_system.controllers.AddReceptionistController;
import com.revature.hotel_management_system.controllers.AddServicesController;
import com.revature.hotel_management_system.controllers.BookingHistoryController;
import com.revature.hotel_management_system.controllers.BookingInfoController;
import com.revature.hotel_management_system.controllers.CheckBillController;
import com.revature.hotel_management_system.controllers.CheckOutController;
import com.revature.hotel_management_system.controllers.CustomerBillCheckController;
import com.revature.hotel_management_system.controllers.CustomersController;
import com.revature.hotel_management_system.controllers.LogOutController;
import com.revature.hotel_management_system.controllers.ReceptionistLogInController;
import com.revature.hotel_management_system.controllers.RoomBookingController;
import com.revature.hotel_management_system.controllers.RoomsController;
import com.revature.hotel_management_system.controllers.ShowAllReceptionistsController;
import com.revature.hotel_management_system.controllers.UpdateCustomerProfileController;

@SpringBootApplication
@Controller
@ComponentScan(basePackages="com.revature.hotel_management_system")
public class DemoApplication {

	static ApplicationContext context=null;
	public static void main(String[] args) {
		context=SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("/customer/index.jsp");
	}
	@RequestMapping("/login")
	public ReceptionistLogInController login() {
		
		return new ReceptionistLogInController();
		
	}
//	@RequestMapping("/logout")
//	public LogOutController logout(){
//		
//		return new LogOutController();
//	}
	@RequestMapping(value={"/receptionist/addCustomer","/admin/addCustomer","/customer/register"})
	public AddCustomerController addCustomer() {
		
		return new AddCustomerController();
		
	}
	@RequestMapping(value={"/receptionist/availableRooms","/admin/availableRooms","/customer/availableRooms"})
	public RoomsController availableRooms() {
		return new RoomsController();
	}
	@RequestMapping("/receptionist/bookRoom")
	public RoomBookingController bookRoom() {
		return new RoomBookingController();
	}
	@RequestMapping(value={"/receptionist/bookingInfo","/admin/bookingInfo"})
	public BookingInfoController bookingInfo() {
		return new BookingInfoController();
	}
	@RequestMapping("/receptionist/addServices")
	public AddServicesController addServices() {
		return new AddServicesController();
	}
	@RequestMapping("/receptionist/checkOut")
	public CheckOutController checkOut() {
		return new CheckOutController();
	}
	@RequestMapping(value={"/receptionist/checkBill","/admin/checkBill"})
	public CheckBillController checkBill() {
		return new CheckBillController();
	}
	@RequestMapping("/receptionist/dashboard")
	public ReceptionistLogInController dashboard() {
		return new ReceptionistLogInController();
	}
	@RequestMapping(value={"/receptionist/pricing","/customer/pricing","/pricing","/admin/pricing"})
	public ModelAndView rpricing() {
		return new ModelAndView("/pricing.jsp");
	}
	@RequestMapping("/admin")
	public ModelAndView adminIndex() {
		return new ModelAndView("/admin/index.jsp");
	}
	@RequestMapping("/admin/admin-dashboard.jsp")
	public ModelAndView adminDashBoard() {
		return new ModelAndView("/admin/admin-dashboard.jsp");
	}
	@RequestMapping("/admin/showAllCustomers")
	public CustomersController showAllCustomers() {
		return new CustomersController();
	}
	
	@RequestMapping("/admin/addReceptionist")
	public AddReceptionistController addReceptionist() {
		return new AddReceptionistController();
	}
	
	@RequestMapping("/admin/showAllReceptionists")
	public ShowAllReceptionistsController showAllReceptionists() {
		return new ShowAllReceptionistsController();
	}
	@RequestMapping("/receptionist")
	public ModelAndView customerLogin() {
		return new ModelAndView("/receptionist/index.jsp");
	}
	@RequestMapping("/customer/user-dashboard")
	public ModelAndView userDashBoard() {
		return new ModelAndView("/customer/user-dashboard.jsp");
	}
	@RequestMapping("/customer/profile")
	public CustomersController userProfile() {
		return new CustomersController();
	}
	@RequestMapping("/admin/addNewServices")
	public AddNewServicesController addNewServiceController() {
		return new AddNewServicesController();
	}
	@RequestMapping("/customer/updateCustomerProfile")
	public UpdateCustomerProfileController updateCustomerProfile() {
		return new UpdateCustomerProfileController();
	}
	@RequestMapping("/customer/bookingHistory")
	public BookingHistoryController customerBookingHistory() {
		return new BookingHistoryController();
	}
	@RequestMapping("/customer/bookRoom")
	public BookRoomController customerBookRoom() {
		return new BookRoomController();
	}
	@RequestMapping("/customer/checkBill")
	public CustomerBillCheckController customerBillCheck() {
		System.out.println("hi");
		return new CustomerBillCheckController();
	}

}
