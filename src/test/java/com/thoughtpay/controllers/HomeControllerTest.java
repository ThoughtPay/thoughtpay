package com.thoughtpay.controllers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class HomeControllerTest {

    @Test
    public void shouldReturnHomePageWhenAppStarts() {
        HomeController homeController = new HomeController();
        assertThat("home", is(homeController.home()));
    }

}