package loganalyzer;


class FileExtensionManager implements FileExtensionManagerInterface {

    public boolean isValid(String fileName) {
        return Math.random() < 0.5;
    }
}

// vi:et:ts=4:sw=4:cc=80
