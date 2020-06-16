package org.example.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    public void makeStuffForUs() throws ClientException, ResourceUnavailableException {

        System.out.println("entered client");

        boolean broken = true;
        boolean resourceAvailable = true;

        if (broken) {


            throw new ClientException("client broke");
        }

        if (!resourceAvailable) {
            throw new ResourceUnavailableException("client resources unavailable");
        }

        System.out.println("leaving client");

    }

}
