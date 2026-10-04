package J1;

import v.c0;
import y1.C2393o;

/* loaded from: classes.dex */
public final class m extends Exception {

    /* renamed from: k, reason: collision with root package name */
    public final int f4214k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4215l;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(int i7, int i8, int i9, int i10, C2393o c2393o, boolean z7, RuntimeException runtimeException) {
        StringBuilder sbB = c0.b("AudioTrack init failed ", i7, " Config(", i8, ", ");
        sbB.append(i9);
        sbB.append(", ");
        sbB.append(i10);
        sbB.append(") ");
        sbB.append(c2393o);
        sbB.append(z7 ? " (recoverable)" : "");
        super(sbB.toString(), runtimeException);
        this.f4214k = i7;
        this.f4215l = z7;
    }
}
