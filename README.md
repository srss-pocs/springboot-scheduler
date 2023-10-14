# springboot-scheduler
Spring Boot 3.1.4

Spring Boot Scheduler Use Cases:

Periodic Data Cleanup: Schedule tasks to clean up old or unnecessary data from the database at regular intervals.

Report Generation: Automatically generate and send reports via email or store them in the system.

Notification System: Schedule notifications to be sent to users for various events, such as reminders, updates, or alerts.

Cache Refresh: Refresh the application cache periodically to ensure that the data remains up-to-date.

Database Backup: Schedule regular backups of the application's database to prevent data loss.

Scheduler Annotations

@Scheduled(fixedRate = 2000L) -->>> At every 2 seconds this method will run irrespective of method execution

Sample

![image](https://github.com/srss-pocs/springboot-scheduler/assets/145287517/e22a1073-c93e-45b0-9d72-f5406d02d9ab)


@Scheduled(fixedDelay  = 2000L) -->>> After method execution this will wait for 2 seconds and again starts execution

Sample

![image](https://github.com/srss-pocs/springboot-scheduler/assets/145287517/9a688206-b96b-43a8-a88f-9c3cf3cb3963)


@Scheduled(fixedDelay  = 2000L, initialDelay = 3000L) -->>> Execution start after server up, waits for 3 seconds and After method execution this will wait for 2 seconds and again starts execution

Sample

![image](https://github.com/srss-pocs/springboot-scheduler/assets/145287517/abd97302-1ce8-470e-874b-0452383970ec)



@Scheduled(fixedDelayString = "PT2S")  // P-Durion T-TimePeriod 2S-2 Seconds; 2M- 2 Minutes; 2H-2 Hours

Sample

![image](https://github.com/srss-pocs/springboot-scheduler/assets/145287517/9c65f2f2-374d-479e-a71f-9005c9bc05c5)


![image](https://github.com/srss-pocs/springboot-scheduler/assets/145287517/e21ba080-7056-4212-b3d8-40879d717533)

Add 6 starts 
![image](https://github.com/srss-pocs/springboot-scheduler/assets/145287517/8837a78e-479c-4ea2-9127-bbeb3612beb8)

@Scheduled(cron = "*/2 * * * * *")  for 2 Seconds

Sample
![image](https://github.com/srss-pocs/springboot-scheduler/assets/145287517/995bf76e-cc44-44bc-ba40-5e7e0d292d59)


To run multiple schedulers we have add multi threaded paramter in application.properties file
Note: Schedulers are single threded so after sompletion of first scheduler, secon will start to run parallel check above step








