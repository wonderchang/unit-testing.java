package loganalyzer;


class AlwaysTrueFileExtensionManager implements FileExtensionManagerInterface {

    public boolean isValid(String fileName) {
        return true;
    }
}

// vi:et:ts=4:sw=4:cc=80
