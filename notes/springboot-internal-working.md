#Q: What happen when you on click on the run method of springboot application?  
Ans: Below steps happen internally when we click on run method of springboot application.  

step-1: JVM starts and main() methos is executed  

step-2: SpringApplication.run(MyApp.class , args)  

step-3: springBoot detects:  
- @SpringBootApplication on MyApp.class  
- Which includes:  
   @SpringBootConfiguration -> marks as @Configuration  
   @ComponentScan -> scans current packages and sub-packages  
   @EnableAutoconfiguration -> loads auto-configs from spring.factories

step-4: Creates a spring application object:  
  - Sets up ApplicationContext  
  - Sets up Environments  
  - Registers Listners, Initializers  

step-5: ApplicationContext is created  

step-6: Environment is prepared (e.g. application.propertie, args, profiles)  

step-7: Beans are scanned and prepared via @ComponentScan and Auto-configured Beans are registered ( e.g. DataSource, WebServer)  

step-8: ApplicationContext is refreshed  
  - All beans are created  
  - Dependecies are autowired  
  - Lifecycle methods are called  

step-9: Embedded Web Server (e.g. tomcat) is started  

step-10: CommandLineRunner or ApplicationRunner beans (if any) are executed.  

step-11: Application is now fully started and ready to server requests. 
