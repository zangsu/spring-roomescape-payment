package roomescape.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import roomescape.service.PaymentClient;
import roomescape.service.TossPaymentClient;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentClient tossPaymentClient() {
        return new TossPaymentClient(RestClient.builder().baseUrl("https://api.tosspayments.com").build());
    }
}
