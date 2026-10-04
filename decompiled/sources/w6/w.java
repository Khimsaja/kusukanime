package w6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import p.I0;

/* loaded from: classes.dex */
public final class w extends v {
    public static Long J(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // w6.v
    public final void H(y yVar, y yVar2) throws IOException {
        kotlin.jvm.internal.l.f("source", yVar);
        kotlin.jvm.internal.l.f("target", yVar2);
        try {
            Files.move(yVar.f(), yVar2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e7) {
            throw new FileNotFoundException(e7.getMessage());
        }
    }

    @Override // w6.v, w6.o
    public final n m(y yVar) throws IOException {
        y yVarT;
        kotlin.jvm.internal.l.f("path", yVar);
        Path pathF = yVar.f();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathF, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathF) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = y.f17190l;
                yVarT = I0.t(symbolicLink.toString());
            } else {
                yVarT = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lJ = fileTimeCreationTime != null ? J(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lJ2 = fileTimeLastModifiedTime != null ? J(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new n(zIsRegularFile, zIsDirectory, yVarT, lValueOf, lJ, lJ2, fileTimeLastAccessTime != null ? J(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // w6.v
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
