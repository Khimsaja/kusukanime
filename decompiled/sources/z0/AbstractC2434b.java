package z0;

import io.ktor.http.ContentType;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2434b {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18734b = new int[2];

    public abstract int[] a(int i7);

    public final int[] b(int i7, int i8) {
        if (i7 < 0 || i8 < 0 || i7 == i8) {
            return null;
        }
        int[] iArr = this.f18734b;
        iArr[0] = i7;
        iArr[1] = i8;
        return iArr;
    }

    public final String c() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.l.l(ContentType.Text.TYPE);
        throw null;
    }

    public abstract int[] d(int i7);
}
