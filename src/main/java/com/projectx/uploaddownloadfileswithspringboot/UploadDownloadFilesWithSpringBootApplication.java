package com.projectx.uploaddownloadfileswithspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStoragePojo.class
})
public class UploadDownloadFilesWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadDownloadFilesWithSpringBootApplication.class, args);
	}

}
