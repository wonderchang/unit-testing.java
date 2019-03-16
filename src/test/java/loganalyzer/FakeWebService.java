package loganalyzer;


class FakeWebService implements WebService {

    public String lastError;

    public void logError(String message) {
        lastError = message;
    }
}

// vi:et:ts=4:sw=4:cc=80
