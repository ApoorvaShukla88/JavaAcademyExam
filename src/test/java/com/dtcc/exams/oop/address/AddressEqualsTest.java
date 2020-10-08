package com.dtcc.exams.oop.address;

import com.dtcc.exams.oop.Address;
import org.junit.Assert;
import org.junit.Test;

public class AddressEqualsTest {
    @Test
    public void checkDefaultAddressEquivalence() {
        // given
        Address address1 = new Address();
        Address address2 = new Address();

        // when
        Boolean outcome = address1.equals(address2);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void checkNonDefaultAddressEquivalence() {
        // given
        String providedLine1 = "123 Gitlabs";
        String providedLine2 = "";
        String providedCity = "New Castle";
        String providedState = "Delaware";
        String providedZipcode = "19720";
        Address address1 = new Address(providedLine1, providedLine2, providedCity, providedState, providedZipcode);
        Address address2 = new Address(providedLine1, providedLine2, providedCity, providedState, providedZipcode);

        // when
        Boolean outcome = address1.equals(address2);

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void checkNonDefaultAddressNonEquivalence() {
        // given
        String providedLine1 = "123 Gitlabs";
        String providedLine2 = "";
        String providedCity = "New Castle";
        String providedState = "Delaware";
        String providedZipcode = "19720";
        Address address1 = new Address(providedLine1, providedLine2, providedCity, providedState, providedZipcode);
        Address address2 = new Address(providedLine1, providedLine2, providedCity, providedState, "Different Zip");

        // when
        Boolean outcome = address1.equals(address2);

        // then
        Assert.assertFalse(outcome);
    }
}
