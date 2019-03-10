package loganalyzer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class LogAnalyzerSeamFactoryClassTest {

    @Test
    public void isValidLogFileName() {
        FileExtensionManagerInterface manager = new AlwaysTrueFileExtensionManager();
        FileExtensionManagerFactory.setFileExtensionManager(manager);
        LogAnalyzerSeamFactoryClass logAnalyzer = new LogAnalyzerSeamFactoryClass();
        assertTrue(logAnalyzer.isValidLogFileName("log.txt"));
    }
}

// vi:et:ts=4:sw=4:cc=80
