package htq.mail.core;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.ServletContextResource;

public class AppConfigListener implements ServletContextListener {
	private static final String config = "/WEB-INF/app.properties";
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			//加载系统配置文件
			ServletContext context = arg0.getServletContext();
			Resource resource = new ServletContextResource(context,config);
			Properties properties = new Properties();
			properties.load(resource.getInputStream());
			System.setProperties(properties);
			//加载系统路径
			String rootKey = context.getInitParameter("WebRoot");
			
			if(StringUtils.isNotBlank(rootKey)){
				System.setProperty(rootKey, context.getRealPath("/"));
			}
			
		} catch (Exception e) {
			throw new RuntimeException("系统配置文件加载失败！！",e);
		}
		
	}

}
