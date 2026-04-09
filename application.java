# Spring Application Name
spring.application.name=Finteka

# Spring DataSource Configuration
#spring.datasource.url=jdbc:mysql://tramway.proxy.rlwy.net:32221/railway?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC
#spring.datasource.username=root
#spring.datasource.password=wggVjfOysgoKcjhOsWNylZIZsjamChCf
spring.datasource.url=jdbc:mysql://localhost:3306/finteka?useSSL=false&serverTimezone=UTC&createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=admin

#spring.datasource.url=${DB_URL}
#spring.datasource.username=${DB_USER}
#spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


# Spring Data JPA Configuration
spring.jpa.show-sql=true

# Spring Data JPA Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.open-in-view=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.naming.physical-strategy=backend.finteka.shared.infrastructure.persistence.jpa.configuration.strategy.SnakeCaseWithPluralizedTablePhysicalNamingStrategy

# Application Information for Documentation
documentation.application.description=@project.description@
documentation.application.version=@project.version@
