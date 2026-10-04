package s2;

import j3.G;
import java.util.List;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1973a {
    public final G a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15508b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15509c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15510d;

    public C1973a(long j7, long j8, List list) {
        this.a = G.s(list);
        this.f15508b = j7;
        this.f15509c = j8;
        long j9 = -9223372036854775807L;
        if (j7 != -9223372036854775807L && j8 != -9223372036854775807L) {
            j9 = j7 + j8;
        }
        this.f15510d = j9;
    }
}
