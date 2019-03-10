package loganalyzer;


public class LogAnalyzerSeamProperty {

    private FileExtensionManagerInterface fileExtensionManager;

    public void setFileExtensionManager(FileExtensionManagerInterface manager) {
        fileExtensionManager = manager;
    }

    public LogAnalyzerSeamProperty() {
        fileExtensionManager = new FileExtensionManager();
    }

    public boolean isValidLogFileName(String fileName) {
        return fileExtensionManager.isValid(fileName);
    }
}

// vi:et:ts=4:sw=4:cc=80
