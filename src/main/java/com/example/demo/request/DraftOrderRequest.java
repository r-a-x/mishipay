package com.example.demo.request;

import java.io.Serializable;

/**
 * Created by rahulb on 15/8/17.
 */
public class DraftOrderRequest implements Serializable {

    private OrderCreationRequest draft_orders;

    public DraftOrderRequest() {
    }

    public DraftOrderRequest(OrderCreationRequest draft_orders) {
        this.draft_orders = draft_orders;
    }

    public OrderCreationRequest getDraft_orders() {
        return draft_orders;
    }

    public void setDraft_orders(OrderCreationRequest draft_orders) {
        this.draft_orders = draft_orders;
    }
}
