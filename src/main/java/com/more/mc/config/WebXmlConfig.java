package com.more.mc.config;
 
import java.util.ArrayList;
import java.util.List;
 
import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
/**
 * 
 * 相当于一个web的配置文件。
 * */
@Configuration
public class WebXmlConfig {
 
	/**
	 * 
	 * 根据官网提供的方法我们可以通过以下的方法配置一个web里的过滤器。
	 * 相当于在web文件中配置了一个过滤器叫StrutsPrepareAndExecuteFilter
	 * 
	 * 我们也可以直接返回StrutsPrepareAndExecuteFilter 这里默认拦截的就是所有。
	 * 
	 * 也可以直接返回一个过滤器 
	 * @Bean 
	 * public StrutsPrepareAndExecuteFilter filterRegistrationBean(){
	 *       return new StrutsPrepareAndExecuteFilter();
	 * 
	 *     }
	 * 
	 * */
  
	/**
	 * 配置过滤器
	 *
	 * @return
	 */
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean frgb = new FilterRegistrationBean();
		frgb.setFilter(new StrutsPrepareAndExecuteFilter());
		List<String> list = new ArrayList<>();
		//list.add("/*");
		list.add("*.do");
		frgb.setUrlPatterns(list);
		frgb.addInitParameter("config", "struts-default.xml,struts-plugin.xml,struts.xml,struts-sysmain.xml");
		return frgb;
	}
}