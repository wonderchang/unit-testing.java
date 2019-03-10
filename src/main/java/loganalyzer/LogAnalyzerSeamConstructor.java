package loganalyzer;


public class LogAnalyzerSeamConstructor {

    private FileExtensionManagerInterface fileExtensionManager;

    public LogAnalyzerSeamConstructor(FileExtensionManagerInterface manager) {
        fileExtensionManager = manager;
    }

    public boolean isValidLogFileName(String fileName) {
        return fileExtensionManager.isValid(fileName);
    }
}

// vi:et:ts=4:sw=4:cc=80
