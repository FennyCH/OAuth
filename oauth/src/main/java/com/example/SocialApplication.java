package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author evivehealth on 06/02/19.
 */
@SpringBootApplication
public class SocialApplication {

  public static void main(String[] args) {
    SpringApplication.run(SocialApplication.class, args);
  }

//  @RequestMapping("/user")
//  public Principal user(Principal principal) {
//    return principal;
//  }

}
