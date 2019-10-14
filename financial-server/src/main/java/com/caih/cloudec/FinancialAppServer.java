package com.caih.cloudec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.ConfigurableEnvironment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.caih.cloudec"})
@EnableDiscoveryClient
@MapperScan(value ="com.caih.cloudec.financial.dao")
@ComponentScan(basePackages = {"com.caih.cloudec"})
@ServletComponentScan("com.caih.cloudec")
//@Import(MybatisBusiConfig.class)
//@CloudecMqClientAnno
//@CloudecMqProducerAnno
public class FinancialAppServer 
{
    public static void main( String[] args )
    {
    	 ConfigurableApplicationContext context = SpringApplication.run(FinancialAppServer.class, args);
         ConfigurableEnvironment env = context.getEnvironment();
      /*   log.info("FinancialAppServer绯荤粺鍚姩鎴愬姛");
         String[] activeProfiles = env.getActiveProfiles();
         if (null != activeProfiles && activeProfiles.length > 0) {
             for (int i = 0; i < activeProfiles.length; i++) {
                 log.info("FinancialAppServer绯荤粺鍚姩鎴愬姛,鑾峰彇鍒扮幆澧冨弬鏁癧" + activeProfiles[i] + "]");
             }
         } else {
             log.error("FinancialAppServer绯荤粺鍚姩鎴愬姛,鏃犳硶鑾峰彇鍒扮幆澧冨弬鏁癧activeProfiles]");
         }
        System.out.println( "Hello World!" );*/
    }
}
