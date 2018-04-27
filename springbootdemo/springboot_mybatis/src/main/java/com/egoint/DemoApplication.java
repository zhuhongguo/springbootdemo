package com.egoint;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@MapperScan("com.egoint.mapper")
@EnableSwagger2
public class DemoApplication {
	
	/* private static Logger logger = Logger.getLogger(DemoApplication.class.toString());
    
    @Bean  
    @ConfigurationProperties(prefix = "spring.redis.pool")  
    public JedisPoolConfig getRedisConfig() {  
        JedisPoolConfig config = new JedisPoolConfig();  
        config.setMaxIdle(8);
        config.setMinIdle(0);
        config.setMaxWaitMillis(-1);
        config.setTestOnBorrow(true);
        return config;  
    }  
  
    @Bean  
    @ConfigurationProperties(prefix = "spring.redis")  
    public JedisConnectionFactory getConnectionFactory() {  
        JedisConnectionFactory factory = new JedisConnectionFactory();  
        factory.setUsePool(true);  
        JedisPoolConfig config = getRedisConfig();  
        factory.setPoolConfig(config); 
        factory.setHostName("192.168.91.128");
        factory.setPassword("123456");
        factory.setPort(6379);
        factory.setTimeout(0);
        return factory;  
    }  
  
  
    @Bean  
    public RedisTemplate<?, ?> getRedisTemplate() {  
        RedisTemplate<?, ?> template = new StringRedisTemplate(getConnectionFactory());  
        return template;  
    }  
    */
    //DataSource配置
/*    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource() {
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }

    //提供SqlSeesion
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
*/

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
    
}
