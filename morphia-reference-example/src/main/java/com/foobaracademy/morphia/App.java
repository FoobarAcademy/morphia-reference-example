package com.foobaracademy.morphia;

/**
 * Hello world!
 *
 */
public class App {
    
	private MorphiaService morphiaService;
	
	private UserDAO userDAO;
	private CompanyDAO companyDAO;
	
	public App(){
		this.morphiaService = new MorphiaService();
		this.userDAO = new UserDAOImpl(User.class, morphiaService.getDatastore());
		this.companyDAO = new CompanyDAOImpl(Company.class, morphiaService.getDatastore());
	}
	
	public void saveEntitites(){
		
		Company company = new Company("Foobar Academy", "742 Evergreen Terrace Sprigfield");
		companyDAO.save(company);
		
		User user = new User("Alex", "Foo", company);
		userDAO.save(user);
		
	}
	
	
	
	public void fetchEntities(){
		
		User user = userDAO.getByFirstNameLastName("Alex", "Foo");
		
		System.out.println("user employer name and employer address : ");
		System.out.println(user.getEmployer().getName());
		System.out.println(user.getEmployer().getAddress());
		
	}
	
	public static void main( String[] args ){
		App app = new App();
		app.saveEntitites();
		app.fetchEntities();
	}
}
