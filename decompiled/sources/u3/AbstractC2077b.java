package u3;

import A3.C0007b;
import io.ktor.client.utils.CIOKt;
import java.util.Arrays;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2077b {
    public static final W.a a = new W.a(false, -683801992, new C0007b(29));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f16257b = new W.a(false, 1310017012, new C2076a(0));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f16258c = new W.a(false, -1853349148, new io.ktor.http.cio.b(23));

    /* renamed from: d, reason: collision with root package name */
    public static final W.a f16259d = new W.a(false, -167449213, new io.ktor.http.cio.b(24));

    /* JADX WARN: Removed duplicated region for block: B:116:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0507  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(e4.k r49, e4.InterfaceC0821a r50, u3.C2084i r51, O.C0510p r52, int r53) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.AbstractC2077b.a(e4.k, e4.a, u3.i, O.p, int):void");
    }

    public static final String b(long j7) {
        if (j7 <= 0) {
            return "00:00";
        }
        long j8 = j7 / CIOKt.DEFAULT_HTTP_POOL_SIZE;
        long j9 = 3600;
        long j10 = j8 / j9;
        long j11 = 60;
        long j12 = (j8 % j9) / j11;
        long j13 = j8 % j11;
        return j10 > 0 ? String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j10), Long.valueOf(j12), Long.valueOf(j13)}, 3)) : String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j12), Long.valueOf(j13)}, 2));
    }
}
