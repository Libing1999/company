Project Name: COMPANY






Stack  : spring boot




application.yaml file



     spring:
    datasource:
    url: jdbc:h2:file:/data/demo;
  
    username: sa
   
    password: password
   
    driverClassName: org.h2.Driver


      h2:
    console.enabled: true


     jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    hibernate:
      ddl-auto: update



