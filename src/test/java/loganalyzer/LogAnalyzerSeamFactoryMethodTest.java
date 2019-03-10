package loganalyzer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


class TestableLogAnalyzer extends LogAnalyzerSeamFactoryMethod {

    public FileExtensionManagerInterface manager;

    public TestableLogAnalyzer(FileExtensionManagerInterface manager) {
        this.manager = manager;
    }

    protected FileExtensionManagerInterface getManager() {
        return manager;
    }
}


public class LogAnalyzerSeamFactoryMethodTest {

    @Test
    public void isValidLogFileName() {
        FileExtensionManagerInterface manager = new AlwaysTrueFileExtensionManager();
        TestableLogAnalyzer logAnalyzer = new TestableLogAnalyzer(manager);
        assertTrue(logAnalyzer.isValidLogFileName("log.txt"));
    }
}

// vi:et:ts=4:sw=4:cc=80
