package springmvctwo.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		
		webAppContext.setServletContext(servletContext);
		
		ServletRegistration.Dynamic frntCntrl =  servletContext.addServlet("dispatcher", new DispatcherServlet(webAppContext));
		
		frntCntrl.addMapping("/spring/*");
		frntCntrl.setLoadOnStartup(1);
		
		webAppContext.register(springMVCConfiguration.class);
	}
}
