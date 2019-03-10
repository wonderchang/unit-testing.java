package loganalyzer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class LogAnalyzerSeamConstructorTest {

    @Test
    public void isValidLogFileName() {
        FileExtensionManagerInterface manager = new AlwaysTrueFileExtensionManager();
        LogAnalyzerSeamConstructor logAnalyzer = new LogAnalyzerSeamConstructor(manager);
        assertTrue(logAnalyzer.isValidLogFileName("log.txt"));
    }
}

// vi:et:ts=4:sw=4:cc=80
