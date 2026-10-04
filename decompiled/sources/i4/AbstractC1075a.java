package i4;

import java.util.Random;
import kotlin.jvm.internal.l;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1075a extends AbstractC1079e {
    @Override // i4.AbstractC1079e
    public final int a(int i7) {
        return ((-i7) >> 31) & (h().nextInt() >>> (32 - i7));
    }

    @Override // i4.AbstractC1079e
    public final void b(byte[] bArr) {
        l.f("array", bArr);
        h().nextBytes(bArr);
    }

    @Override // i4.AbstractC1079e
    public final int d() {
        return h().nextInt();
    }

    @Override // i4.AbstractC1079e
    public final long e() {
        return h().nextLong();
    }

    public abstract Random h();
}
