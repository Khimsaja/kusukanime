package I2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4033b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4034c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4035d;

    public i(int i7, int i8, long j7, long j8) {
        this.a = i7;
        this.f4033b = i8;
        this.f4034c = j7;
        this.f4035d = j8;
    }

    public static i a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.a);
            dataOutputStream.writeInt(this.f4033b);
            dataOutputStream.writeLong(this.f4034c);
            dataOutputStream.writeLong(this.f4035d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f4033b == iVar.f4033b && this.f4034c == iVar.f4034c && this.a == iVar.a && this.f4035d == iVar.f4035d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4033b), Long.valueOf(this.f4034c), Integer.valueOf(this.a), Long.valueOf(this.f4035d));
    }
}
