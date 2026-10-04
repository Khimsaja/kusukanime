package io.ktor.util;

import P3.q;
import Z3.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0006\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u0006¨\u0006\u0013"}, d2 = {"Ljava/io/File;", "", "relativePath", "combineSafe", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "normalizeAndRelativize", "(Ljava/io/File;)Ljava/io/File;", "dir", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "notRooted", "path", "", "dropLeadingTopDirs", "(Ljava/lang/String;)I", "", "", "isPathSeparator", "(C)Z", "isPathSeparatorOrDot", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathKt {
    public static final File combineSafe(File file, String str) {
        l.f("<this>", file);
        l.f("relativePath", str);
        return combineSafe(file, new File(str));
    }

    public static final int dropLeadingTopDirs(String str) {
        l.f("path", str);
        int length = str.length() - 1;
        int i7 = 0;
        while (i7 <= length) {
            char cCharAt = str.charAt(i7);
            if (!isPathSeparator(cCharAt)) {
                if (cCharAt != '.') {
                    break;
                }
                if (i7 == length) {
                    return i7 + 1;
                }
                char cCharAt2 = str.charAt(i7 + 1);
                int i8 = 2;
                if (!isPathSeparator(cCharAt2)) {
                    if (cCharAt2 == '.') {
                        int i9 = i7 + 2;
                        if (i9 != str.length()) {
                            if (!isPathSeparator(str.charAt(i9))) {
                                break;
                            }
                            i8 = 3;
                        }
                    } else {
                        break;
                    }
                }
                i7 += i8;
            } else {
                i7++;
            }
        }
        return i7;
    }

    private static final boolean isPathSeparator(char c2) {
        return c2 == '\\' || c2 == '/';
    }

    private static final boolean isPathSeparatorOrDot(char c2) {
        return c2 == '.' || isPathSeparator(c2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public static final File normalizeAndRelativize(File file) throws IOException {
        l.f("<this>", file);
        Z3.a aVarI = android.support.v4.media.session.b.I(file);
        ?? r12 = aVarI.f10248b;
        ArrayList arrayList = new ArrayList(r12.size());
        for (File file2 : r12) {
            String name = file2.getName();
            if (!l.a(name, ".")) {
                if (!l.a(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || l.a(((File) q.A0(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                }
            }
        }
        String str = File.separator;
        l.e("separator", str);
        return dropLeadingTopDirs(notRooted(j.P(aVarI.a, q.y0(arrayList, str, null, null, null, 62))));
    }

    private static final File notRooted(File file) {
        String strSubstring;
        l.f("<this>", file);
        String path = file.getPath();
        l.e("getPath(...)", path);
        if (android.support.v4.media.session.b.A(path) <= 0) {
            return file;
        }
        File file2 = file;
        while (true) {
            File parentFile = file2.getParentFile();
            if (parentFile == null) {
                break;
            }
            file2 = parentFile;
        }
        String path2 = file.getPath();
        l.e("getPath(...)", path2);
        String strY = AbstractC2510o.Y(file2.getName().length(), path2);
        int length = strY.length();
        int i7 = 0;
        while (true) {
            if (i7 < length) {
                char cCharAt = strY.charAt(i7);
                if (cCharAt != '\\' && cCharAt != '/') {
                    strSubstring = strY.substring(i7);
                    l.e("substring(...)", strSubstring);
                    break;
                }
                i7++;
            } else {
                strSubstring = "";
                break;
            }
        }
        return new File(strSubstring);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    private static final File combineSafe(File file, File file2) throws IOException {
        File fileNormalizeAndRelativize = normalizeAndRelativize(file2);
        l.f("<this>", fileNormalizeAndRelativize);
        File file3 = new File("..");
        Z3.a aVarI = android.support.v4.media.session.b.I(fileNormalizeAndRelativize);
        Z3.a aVarI2 = android.support.v4.media.session.b.I(file3);
        boolean zEquals = false;
        if (aVarI.a.equals(aVarI2.a)) {
            ?? r2 = aVarI.f10248b;
            int size = r2.size();
            ?? r12 = aVarI2.f10248b;
            if (size >= r12.size()) {
                zEquals = r2.subList(0, r12.size()).equals(r12);
            }
        }
        if (zEquals) {
            throw new IllegalArgumentException("Bad relative path " + file2);
        }
        if (!fileNormalizeAndRelativize.isAbsolute()) {
            return new File(file, fileNormalizeAndRelativize.getPath());
        }
        throw new IllegalStateException(("Bad relative path " + file2).toString());
    }

    private static final File dropLeadingTopDirs(File file) {
        String path = file.getPath();
        if (path == null) {
            path = "";
        }
        int iDropLeadingTopDirs = dropLeadingTopDirs(path);
        if (iDropLeadingTopDirs == 0) {
            return file;
        }
        if (iDropLeadingTopDirs >= file.getPath().length()) {
            return new File(".");
        }
        String path2 = file.getPath();
        l.e("getPath(...)", path2);
        String strSubstring = path2.substring(iDropLeadingTopDirs);
        l.e("substring(...)", strSubstring);
        return new File(strSubstring);
    }
}
