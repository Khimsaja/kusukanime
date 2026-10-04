package m6;

import D4.S;
import b1.AbstractC0703b;
import f.AbstractC0847h;
import f6.C0887A;
import f6.C0890D;
import f6.C0894H;
import f6.C0895I;
import f6.C0920r;
import f6.C0922t;
import f6.EnumC0888B;
import io.ktor.http.ContentDisposition;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import w6.G;
import w6.H;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class o implements k6.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f13062g = g6.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f13063h = g6.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final j6.l a;

    /* renamed from: b, reason: collision with root package name */
    public final k6.f f13064b;

    /* renamed from: c, reason: collision with root package name */
    public final n f13065c;

    /* renamed from: d, reason: collision with root package name */
    public volatile v f13066d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC0888B f13067e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f13068f;

    public o(C0887A c0887a, j6.l lVar, k6.f fVar, n nVar) {
        kotlin.jvm.internal.l.f("client", c0887a);
        kotlin.jvm.internal.l.f("connection", lVar);
        kotlin.jvm.internal.l.f("http2Connection", nVar);
        this.a = lVar;
        this.f13064b = fVar;
        this.f13065c = nVar;
        EnumC0888B enumC0888B = EnumC0888B.H2_PRIOR_KNOWLEDGE;
        this.f13067e = c0887a.f11440C.contains(enumC0888B) ? enumC0888B : EnumC0888B.HTTP_2;
    }

    @Override // k6.d
    public final void a() {
        v vVar = this.f13066d;
        kotlin.jvm.internal.l.c(vVar);
        vVar.f().close();
    }

    @Override // k6.d
    public final void b() {
        this.f13065c.flush();
    }

    @Override // k6.d
    public final H c(C0895I c0895i) {
        v vVar = this.f13066d;
        kotlin.jvm.internal.l.c(vVar);
        return vVar.f13097i;
    }

    @Override // k6.d
    public final void cancel() {
        this.f13068f = true;
        v vVar = this.f13066d;
        if (vVar != null) {
            vVar.e(9);
        }
    }

    @Override // k6.d
    public final void d(C0890D c0890d) throws IOException {
        int i7;
        v vVar;
        kotlin.jvm.internal.l.f("request", c0890d);
        if (this.f13066d != null) {
            return;
        }
        boolean z7 = true;
        boolean z8 = c0890d.f11477d != null;
        C0920r c0920r = c0890d.f11476c;
        ArrayList arrayList = new ArrayList(c0920r.size() + 4);
        arrayList.add(new C1528b(C1528b.f12998f, c0890d.f11475b));
        w6.l lVar = C1528b.f12999g;
        C0922t c0922t = c0890d.a;
        kotlin.jvm.internal.l.f("url", c0922t);
        String strB = c0922t.b();
        String strD = c0922t.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new C1528b(lVar, strB));
        String strA = c0890d.f11476c.a("Host");
        if (strA != null) {
            arrayList.add(new C1528b(C1528b.f13001i, strA));
        }
        arrayList.add(new C1528b(C1528b.f13000h, c0922t.a));
        int size = c0920r.size();
        for (int i8 = 0; i8 < size; i8++) {
            String strH = c0920r.h(i8);
            Locale locale = Locale.US;
            kotlin.jvm.internal.l.e("US", locale);
            String lowerCase = strH.toLowerCase(locale);
            kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
            if (!f13062g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.l.a(c0920r.m(i8), "trailers"))) {
                arrayList.add(new C1528b(lowerCase, c0920r.m(i8)));
            }
        }
        n nVar = this.f13065c;
        nVar.getClass();
        boolean z9 = !z8;
        synchronized (nVar.f13044G) {
            synchronized (nVar) {
                try {
                    if (nVar.f13050o > 1073741823) {
                        nVar.i(8);
                    }
                    if (nVar.f13051p) {
                        throw new C1527a();
                    }
                    i7 = nVar.f13050o;
                    nVar.f13050o = i7 + 2;
                    vVar = new v(i7, nVar, z9, false, null);
                    if (z8 && nVar.f13041D < nVar.f13042E && vVar.f13093e < vVar.f13094f) {
                        z7 = false;
                    }
                    if (vVar.h()) {
                        nVar.f13047l.put(Integer.valueOf(i7), vVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            nVar.f13044G.j(z9, i7, arrayList);
        }
        if (z7) {
            nVar.f13044G.flush();
        }
        this.f13066d = vVar;
        if (this.f13068f) {
            v vVar2 = this.f13066d;
            kotlin.jvm.internal.l.c(vVar2);
            vVar2.e(9);
            throw new IOException("Canceled");
        }
        v vVar3 = this.f13066d;
        kotlin.jvm.internal.l.c(vVar3);
        u uVar = vVar3.f13099k;
        long j7 = this.f13064b.f12703g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVar.g(j7, timeUnit);
        v vVar4 = this.f13066d;
        kotlin.jvm.internal.l.c(vVar4);
        vVar4.f13100l.g(this.f13064b.f12704h, timeUnit);
    }

    @Override // k6.d
    public final long e(C0895I c0895i) {
        if (k6.e.a(c0895i)) {
            return g6.b.k(c0895i);
        }
        return 0L;
    }

    @Override // k6.d
    public final G f(C0890D c0890d, long j7) {
        kotlin.jvm.internal.l.f("request", c0890d);
        v vVar = this.f13066d;
        kotlin.jvm.internal.l.c(vVar);
        return vVar.f();
    }

    @Override // k6.d
    public final C0894H g(boolean z7) throws IOException {
        C0920r c0920r;
        v vVar = this.f13066d;
        if (vVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (vVar) {
            vVar.f13099k.i();
            while (vVar.f13095g.isEmpty() && vVar.f13101m == 0) {
                try {
                    vVar.k();
                } catch (Throwable th) {
                    vVar.f13099k.l();
                    throw th;
                }
            }
            vVar.f13099k.l();
            if (vVar.f13095g.isEmpty()) {
                IOException iOException = vVar.f13102n;
                if (iOException != null) {
                    throw iOException;
                }
                int i7 = vVar.f13101m;
                AbstractC0703b.s(i7);
                throw new B(i7);
            }
            Object objRemoveFirst = vVar.f13095g.removeFirst();
            kotlin.jvm.internal.l.e("headersQueue.removeFirst()", objRemoveFirst);
            c0920r = (C0920r) objRemoveFirst;
        }
        EnumC0888B enumC0888B = this.f13067e;
        kotlin.jvm.internal.l.f("protocol", enumC0888B);
        ArrayList arrayList = new ArrayList(20);
        int size = c0920r.size();
        C2.H hV = null;
        for (int i8 = 0; i8 < size; i8++) {
            String strH = c0920r.h(i8);
            String strM = c0920r.m(i8);
            if (kotlin.jvm.internal.l.a(strH, ":status")) {
                hV = AbstractC0847h.v("HTTP/1.1 " + strM);
            } else if (!f13063h.contains(strH)) {
                kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, strH);
                kotlin.jvm.internal.l.f("value", strM);
                arrayList.add(strH);
                arrayList.add(AbstractC2510o.J0(strM).toString());
            }
        }
        if (hV == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C0894H c0894h = new C0894H();
        c0894h.f11483b = enumC0888B;
        c0894h.f11484c = hV.f666l;
        c0894h.f11485d = (String) hV.f668n;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        S s7 = new S(5, false);
        P3.v.f0(s7.f1530k, strArr);
        c0894h.f11487f = s7;
        if (z7 && c0894h.f11484c == 100) {
            return null;
        }
        return c0894h;
    }

    @Override // k6.d
    public final j6.l h() {
        return this.a;
    }
}
