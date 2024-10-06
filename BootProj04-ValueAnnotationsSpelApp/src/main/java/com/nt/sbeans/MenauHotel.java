package com.nt.sbeans;

import org.springframework.stereotype.Component;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Component("menup")
@Data
public class MenauHotel {
    @Value("${menu.dosarate}")
    private Float dosaPrice;

    @Value("${menu.idlyrate}")
    private Float idlyPrice;

    @Value("${menu.poharate}")
    private Float pohaPrice;

    @Value("${menu.vprate}")
    private Float vadaPrice;
}
