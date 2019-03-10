package loganalyzer;


public class LogAnalyzerSeamFactoryMethod {

    protected FileExtensionManagerInterface getManager() {
        return new FileExtensionManager();
    }

    public boolean isValidLogFileName(String fileName) {
        return getManager().isValid(fileName);
    }
}

// vi:et:ts=4:sw=4:cc=80
