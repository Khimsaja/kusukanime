package m6;

import io.ktor.network.sockets.DatagramKt;

/* loaded from: classes.dex */
public final class A {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f12994b = new int[10];

    public final int a() {
        return (this.a & 128) != 0 ? this.f12994b[7] : DatagramKt.MAX_DATAGRAM_SIZE;
    }

    public final void b(A a) {
        kotlin.jvm.internal.l.f("other", a);
        for (int i7 = 0; i7 < 10; i7++) {
            if (((1 << i7) & a.a) != 0) {
                c(i7, a.f12994b[i7]);
            }
        }
    }

    public final void c(int i7, int i8) {
        if (i7 >= 0) {
            int[] iArr = this.f12994b;
            if (i7 >= iArr.length) {
                return;
            }
            this.a = (1 << i7) | this.a;
            iArr[i7] = i8;
        }
    }
}
