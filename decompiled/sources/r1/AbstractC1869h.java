package r1;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: r1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1869h {
    public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j7, int i7) {
        return Os.lseek(fileDescriptor, j7, i7);
    }
}
