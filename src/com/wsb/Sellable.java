package com.wsb;

import com.wsb.creatures.Human;

public interface Sellable {
    void sell(Human seller, Human buyer, Double price);
}
