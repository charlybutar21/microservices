package com.charly.microservices.order.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {
    private CharSequence orderNumber;
    private CharSequence email;
    private CharSequence firstName;
    private CharSequence lastName;
}
