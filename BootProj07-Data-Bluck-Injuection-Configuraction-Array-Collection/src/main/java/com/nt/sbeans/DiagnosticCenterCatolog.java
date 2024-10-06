package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dcc")
@Data()
@ConfigurationProperties(prefix="loc.hyd")

public class DiagnosticCenterCatolog {

private Integer mobilno;
private String addrs;
}
