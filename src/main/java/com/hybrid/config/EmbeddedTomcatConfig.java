package com.hybrid.config;
import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.ErrorPage;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Configuration;
@Configuration
public class EmbeddedTomcatConfig implements EmbeddedServletContainerCustomizer{
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		TomcatEmbeddedServletContainerFactory factory = (TomcatEmbeddedServletContainerFactory) container;
		factory.addContextCustomizers(new TomcatContextCustomizer() {
			@Override
			public void customize(Context context) {
				context.addWelcomeFile("index.jsp");
				ErrorPage errorpage = new ErrorPage();
				errorpage.setErrorCode(404);
				errorpage.setLocation("/WEB-INF/error/404.jsp");
//				context.addErrorPage(errorpage);
				ErrorPage errorArithmaticPage = new ErrorPage();
				errorArithmaticPage.setExceptionType("java.lang.ArithmeticException");
				errorArithmaticPage.setLocation("/WEB-INF/error/arithmetic.jsp");
				context.addErrorPage(errorArithmaticPage);
			}
		});
	}
}