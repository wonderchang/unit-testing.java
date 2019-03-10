package loganalyzer;


public class FileExtensionManagerFactory {

    private static FileExtensionManagerInterface customManager = null;

    public static FileExtensionManagerInterface create() {
        if (customManager != null) {
            return customManager;
        }
        return new FileExtensionManager();
    }

    public static void setFileExtensionManager(FileExtensionManagerInterface manager) {
        customManager = manager;
    }
}

// vi:et:ts=4:sw=4:cc=80
