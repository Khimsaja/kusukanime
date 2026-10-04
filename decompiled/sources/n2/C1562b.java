package n2;

import V1.k;
import X4.y;
import java.util.ArrayDeque;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1562b {
    public final byte[] a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13227b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final e f13228c = new e();

    /* renamed from: d, reason: collision with root package name */
    public y f13229d;

    /* renamed from: e, reason: collision with root package name */
    public int f13230e;

    /* renamed from: f, reason: collision with root package name */
    public int f13231f;

    /* renamed from: g, reason: collision with root package name */
    public long f13232g;

    public final long a(k kVar, int i7) {
        kVar.a(this.a, 0, i7, false);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = (j7 << 8) | (r0[i8] & 255);
        }
        return j7;
    }
}
