package karmanchik.bouncing.uijfx.config;

import karmanchik.bounching.clientapi.config.DataSourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {DataSourceConfig.class})
public class MyConfig {
}
