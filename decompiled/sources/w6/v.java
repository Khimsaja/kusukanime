package w6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class v extends o {
    public void H(y yVar, y yVar2) {
        kotlin.jvm.internal.l.f("source", yVar);
        kotlin.jvm.internal.l.f("target", yVar2);
        if (yVar.e().renameTo(yVar2.e())) {
            return;
        }
        throw new IOException("failed to move " + yVar + " to " + yVar2);
    }

    @Override // w6.o
    public final void b(y yVar) {
        kotlin.jvm.internal.l.f("path", yVar);
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileE = yVar.e();
        if (fileE.delete() || !fileE.exists()) {
            return;
        }
        throw new IOException("failed to delete " + yVar);
    }

    @Override // w6.o
    public final List i(y yVar) {
        kotlin.jvm.internal.l.f("dir", yVar);
        File fileE = yVar.e();
        String[] list = fileE.list();
        if (list == null) {
            if (fileE.exists()) {
                throw new IOException("failed to list " + yVar);
            }
            throw new FileNotFoundException("no such file: " + yVar);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.l.c(str);
            arrayList.add(yVar.d(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // w6.o
    public n m(y yVar) {
        kotlin.jvm.internal.l.f("path", yVar);
        File fileE = yVar.e();
        boolean zIsFile = fileE.isFile();
        boolean zIsDirectory = fileE.isDirectory();
        long jLastModified = fileE.lastModified();
        long length = fileE.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileE.exists()) {
            return new n(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // w6.o
    public final u s(y yVar) {
        return new u(new RandomAccessFile(yVar.e(), "r"));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // w6.o
    public final G v(y yVar) {
        kotlin.jvm.internal.l.f("file", yVar);
        return new C2219d(1, new FileOutputStream(yVar.e(), false), new J());
    }

    @Override // w6.o
    public final H x(y yVar) {
        kotlin.jvm.internal.l.f("file", yVar);
        return new C2220e(new FileInputStream(yVar.e()), J.f17126d);
    }
}
