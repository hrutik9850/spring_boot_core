package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dcc")
@Data()
@ConfigurationProperties(prefix="dc")
public class DiagnosticCenterCatolog {

     private Double xrayRate;

     private Double ctsscanRate;
 
     private Double mriscanRate;

     private Double ecgRate;
     
}
