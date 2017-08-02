package filter;

import java.io.File;

public class PersonFileFilter extends CustomFileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = getFileExtension(f);

        return "per".equals(extension);
    }

    @Override
    public String getDescription() {
        return "Person files (*.per)";
    }
}
