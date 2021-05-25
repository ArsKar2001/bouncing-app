package karmanchik.bounching.clientapi.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "karmanchik/bounching/clientapi/entity")
@EnableJpaRepositories(basePackages = "karmanchik.bounching.clientapi.daos")
public class DataSourceConfig {

}
