package loganalyzer;


public class LogAnalyzerSeamFactoryClass {

    private FileExtensionManagerInterface fileExtensionManager;

    public LogAnalyzerSeamFactoryClass() {
        fileExtensionManager = FileExtensionManagerFactory.create();
    }

    public boolean isValidLogFileName(String fileName) {
        return fileExtensionManager.isValid(fileName);
    }
}

// vi:et:ts=4:sw=4:cc=80
