package com.dtcc.exams.oop.address;

import com.dtcc.exams.oop.Address;
import org.junit.Assert;
import org.junit.Test;

public class AddressToStringTest {
    @Test
    public void testNullaryConstructor() {
        // given
        String expected = "Address{addressLine1='', addressLine2='', city='', state='', zipcode=''}";
        Address address = new Address();

        // when
        String actual = address.toString();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        String providedLine1 = "123 Gitlabs";
        String providedLine2 = "";
        String providedCity = "New Castle";
        String providedState = "Delaware";
        String providedZipcode = "19720";
        Address address = new Address(providedLine1, providedLine2, providedCity, providedState, providedZipcode);
        String expected = "Address{addressLine1='123 Gitlabs', addressLine2='', city='New Castle', state='Delaware', zipcode='19720'}";

        // when
        String actual = address.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
