package pw.javbus.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:resource.properties")
@ConfigurationProperties(prefix = "test.resource") // 定义资源名称前缀，当有@ConfigurationProperties标签时，属性定义中则可不用@Value标签绑定属性名称，但要求bean中的属性名称与properties静态资源文件中的属性名称一致
public class ServiceDto {

	// @Value("${test.resource.name}")
	private String name;
	// @Value("${test.resource.domain}")
	private String domain;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
