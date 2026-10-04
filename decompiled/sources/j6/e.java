package j6;

import F5.o;
import f6.C0898L;
import f6.C0903a;
import f6.C0922t;
import java.io.IOException;
import m6.B;
import m6.C1527a;

/* loaded from: classes.dex */
public final class e {
    public final T1.l a;

    /* renamed from: b, reason: collision with root package name */
    public final C0903a f12496b;

    /* renamed from: c, reason: collision with root package name */
    public final i f12497c;

    /* renamed from: d, reason: collision with root package name */
    public o f12498d;

    /* renamed from: e, reason: collision with root package name */
    public Q4.b f12499e;

    /* renamed from: f, reason: collision with root package name */
    public int f12500f;

    /* renamed from: g, reason: collision with root package name */
    public int f12501g;

    /* renamed from: h, reason: collision with root package name */
    public int f12502h;

    /* renamed from: i, reason: collision with root package name */
    public C0898L f12503i;

    public e(T1.l lVar, C0903a c0903a, i iVar) {
        kotlin.jvm.internal.l.f("connectionPool", lVar);
        kotlin.jvm.internal.l.f("call", iVar);
        this.a = lVar;
        this.f12496b = c0903a;
        this.f12497c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j6.l a(int r13, int r14, int r15, boolean r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e.a(int, int, int, boolean, boolean):j6.l");
    }

    public final boolean b(C0922t c0922t) {
        kotlin.jvm.internal.l.f("url", c0922t);
        C0922t c0922t2 = this.f12496b.f11529i;
        return c0922t.f11608e == c0922t2.f11608e && kotlin.jvm.internal.l.a(c0922t.f11607d, c0922t2.f11607d);
    }

    public final void c(IOException iOException) {
        kotlin.jvm.internal.l.f("e", iOException);
        this.f12503i = null;
        if ((iOException instanceof B) && ((B) iOException).f12995k == 8) {
            this.f12500f++;
        } else if (iOException instanceof C1527a) {
            this.f12501g++;
        } else {
            this.f12502h++;
        }
    }
}
