package io.ktor.util;

import P3.r;
import h0.AbstractC1001x;
import java.io.File;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0002\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/file/Path;", "relativePath", "combineSafe", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "normalizeAndRelativize", "(Ljava/nio/file/Path;)Ljava/nio/file/Path;", "dropLeadingTopDirs", "Ljava/io/File;", "(Ljava/io/File;Ljava/nio/file/Path;)Ljava/io/File;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NioPathKt {
    public static final Path combineSafe(Path path, Path path2) {
        l.f("<this>", path);
        l.f("relativePath", path2);
        Path pathNormalizeAndRelativize = normalizeAndRelativize(path2);
        if (pathNormalizeAndRelativize.startsWith("..")) {
            AbstractC1001x.u();
            throw AbstractC1001x.j(path2.toString(), "Relative path " + path2 + " beginning with .. is invalid");
        }
        if (pathNormalizeAndRelativize.isAbsolute()) {
            throw new IllegalStateException(("Bad relative path " + path2).toString());
        }
        if (path.getNameCount() == 0) {
            return pathNormalizeAndRelativize;
        }
        Path pathResolve = path.resolve(pathNormalizeAndRelativize);
        l.e("resolve(...)", pathResolve);
        return pathResolve;
    }

    private static final Path dropLeadingTopDirs(Path path) {
        Iterator it = path.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            Object next = it.next();
            if (i7 < 0) {
                r.X();
                throw null;
            }
            if (!l.a(AbstractC1001x.k(next).toString(), "..")) {
                break;
            }
            i7++;
        }
        if (i7 <= 0) {
            return path;
        }
        Path pathSubpath = path.subpath(i7, path.getNameCount());
        l.e("subpath(...)", pathSubpath);
        return pathSubpath;
    }

    public static final Path normalizeAndRelativize(Path path) {
        Path pathRelativize;
        Path pathNormalize;
        Path pathDropLeadingTopDirs;
        l.f("<this>", path);
        Path root = path.getRoot();
        if (root != null && (pathRelativize = root.relativize(path)) != null && (pathNormalize = pathRelativize.normalize()) != null && (pathDropLeadingTopDirs = dropLeadingTopDirs(pathNormalize)) != null) {
            return pathDropLeadingTopDirs;
        }
        Path pathNormalize2 = path.normalize();
        l.e("normalize(...)", pathNormalize2);
        return dropLeadingTopDirs(pathNormalize2);
    }

    public static final File combineSafe(File file, Path path) {
        l.f("<this>", file);
        l.f("relativePath", path);
        Path pathNormalizeAndRelativize = normalizeAndRelativize(path);
        if (!pathNormalizeAndRelativize.startsWith("..")) {
            if (!pathNormalizeAndRelativize.isAbsolute()) {
                return new File(file, pathNormalizeAndRelativize.toString());
            }
            throw new IllegalStateException(("Bad relative path " + path).toString());
        }
        AbstractC1001x.u();
        throw AbstractC1001x.j(path.toString(), "Relative path " + path + " beginning with .. is invalid");
    }
}
