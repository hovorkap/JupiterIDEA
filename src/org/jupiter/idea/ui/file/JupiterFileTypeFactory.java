package org.jupiter.idea.ui.file;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Author: Yuri Lytvynenko
 * Date: 20.06.11
 * Time: 23:05
 */
public class JupiterFileTypeFactory extends FileTypeFactory {
    public static final JupiterFileType FILE_TYPE = new JupiterFileType();

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(FILE_TYPE, "review;jupiter");
    }
}
