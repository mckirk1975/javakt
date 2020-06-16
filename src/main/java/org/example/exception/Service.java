package org.example.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

    Client client = new Client();

    public void doStuff(String accountId) {

        LOGGER.info("entered service");

        try {
            client.makeStuffForUs();

            LOGGER.debug("after client call");

        } catch (ClientException | ResourceUnavailableException e) {

//            LOGGER.debug("client exception caught");
//
//            LOGGER.debug("client exception message: " + e.getMessage());

            LOGGER.error("exception calling client for account id [{}]", accountId, e);


//        } catch (ResourceUnavailableException e) {
//
//            LOGGER.debug("resource unavailable exception caught");
//
//            LOGGER.debug("resource unavailable exception message: " + e.getMessage());
        } finally {

            LOGGER.debug("finally ");
        }

        LOGGER.info("leaving service");
    }


    public void doMoreStuff() throws Exception {

        FileInputStream fileA = null;
        FileInputStream fileB = null;

        try {
            fileA = new FileInputStream("a.txt");
            fileB = new FileInputStream("b.txt");

            fileA.read();
            fileB.read();

        } catch (IOException e) {

            LOGGER.debug("file not found");
        }
        finally {

            if (fileA == null) {

                fileA.close();
            }

            if (fileB == null) {

                fileB.close();
            }

        }

    }

    public void doEvenMoreStuff() throws Exception {

        try(FileInputStream fileA = new FileInputStream("a.txt");
            FileInputStream fileB = new FileInputStream("b.txt")) {

            fileA.read();
            fileB.read();

        } catch (IOException e) {

            LOGGER.debug("file not found");
        }

    }

    public static void main(String[] args) {

        try
        {

            LOGGER.debug("entered main");

            Service servie = new Service();

            servie.doStuff("123");

        } catch (Throwable t) {    // example of catch all

            LOGGER.debug("catch all in main " + t.getMessage());

            t.printStackTrace();
        }



        LOGGER.debug("leaving main");

    }

}
