package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
    @Value("1234")
    private Integer hotelId;

    @Value("${hotel.name}")
    private String hotelName;

    @Value("${hotel.addrs}")
    private String hotelAddrs;

    @Value("${hotel.contactno}")
    private String moblileNO;

    @Value("${customer.name}")
    private String custName;

     @Value("#{menup.idlyPrice + menup.dosaPrice}")
      private Float billAmount;

    @Value("${os.name}")
    private String osName;

    @Value("${user.name}")
    private String WindowUsr;

    @Override
    public String toString() {
        return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", moblileNO="
                + moblileNO + ", custName=" + custName + ", osName=" + osName + ", billAmount= "+ billAmount +" ,WindowUsr=" + WindowUsr + "]";
    }
}
