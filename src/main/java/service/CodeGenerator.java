package service;

import org.apache.log4j.Logger;

import java.util.Random;

public class CodeGenerator {
    private static final Random random = new Random();
    private static final Logger logger = Logger.getLogger(CodeGenerator.class);

    public static int generateCode() {
        int limit = 9999;
        int randomNumber = random.nextInt(limit);
        logger.info("Generating Code");
        return randomNumber;
    }

    public static String generateId(String str) {
        str = str.replace(" ", "");
        logger.info("Generating Id");
        return str.substring(0, 4) + generateCode();
    }

}
