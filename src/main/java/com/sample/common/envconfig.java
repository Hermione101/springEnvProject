package com.sample.common;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("envconfig")
public class envconfig {

    @Value("${url}")
    private String urlpost;

    public String getUrlpost() {
        return urlpost;
    }

    public void setUrlpost(String urlpost) {
        this.urlpost = urlpost;
    }
}
