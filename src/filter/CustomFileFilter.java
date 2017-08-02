package filter;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class CustomFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        return false;
    }

    @Override
    public String getDescription() {
        return null;
    }

    protected String getFileExtension(File f) {
        String name = f.getName();

        int index = name.lastIndexOf('.');

        if (index == -1 || index == name.length() - 1) {
            return null;
        }

        return name.substring(index + 1, name.length());
    }
}
