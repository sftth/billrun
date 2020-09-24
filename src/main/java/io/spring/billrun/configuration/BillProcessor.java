package io.spring.billrun.configuration;

import io.spring.billrun.model.Bill;
import io.spring.billrun.model.Usage;
import org.springframework.batch.item.ItemProcessor;

public class BillProcessor implements ItemProcessor<Usage, Bill> {
    @Override
    public Bill process(Usage usage) throws Exception {
        Double billAmount = usage.getDataUsage() * 0.001 + usage.getMinutes() * 0.01;

        return new Bill(usage.getId(), usage.getFirstName(), usage.getLastName(),
                usage.getDataUsage(), usage.getMinutes(), billAmount);
    }
}
