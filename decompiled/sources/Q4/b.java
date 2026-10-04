package Q4;

import K2.C0298b;
import P3.r;
import X4.y;
import f.AbstractC0847h;
import f6.AbstractC0893G;
import f6.C0887A;
import f6.C0890D;
import f6.C0894H;
import f6.C0895I;
import f6.C0903a;
import f6.C0920r;
import f6.C0922t;
import f6.EnumC0888B;
import f6.InterfaceC0908f;
import io.ktor.sse.ServerSentEventKt;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import w6.A;
import w6.C;
import w6.G;
import w6.H;

/* loaded from: classes.dex */
public final class b implements k6.d {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f8004b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8005c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8006d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8007e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8008f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8009g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8010h;

    public b(a aVar, T4.f fVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i7) {
        l.f("kind", aVar);
        this.f8005c = aVar;
        this.f8006d = fVar;
        this.f8007e = strArr;
        this.f8008f = strArr2;
        this.f8009g = strArr3;
        this.f8010h = str;
        this.f8004b = i7;
    }

    @Override // k6.d
    public void a() {
        ((A) this.f8008f).flush();
    }

    @Override // k6.d
    public void b() {
        ((A) this.f8008f).flush();
    }

    @Override // k6.d
    public H c(C0895I c0895i) {
        if (!k6.e.a(c0895i)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(C0895I.b(c0895i, "Transfer-Encoding"))) {
            C0922t c0922t = c0895i.f11495k.a;
            if (this.f8004b == 4) {
                this.f8004b = 5;
                return new l6.c(this, c0922t);
            }
            throw new IllegalStateException(("state: " + this.f8004b).toString());
        }
        long jK = g6.b.k(c0895i);
        if (jK != -1) {
            return j(jK);
        }
        if (this.f8004b == 4) {
            this.f8004b = 5;
            ((j6.l) this.f8006d).k();
            return new l6.f(this);
        }
        throw new IllegalStateException(("state: " + this.f8004b).toString());
    }

    @Override // k6.d
    public void cancel() {
        Socket socket = ((j6.l) this.f8006d).f12529c;
        if (socket != null) {
            g6.b.d(socket);
        }
    }

    @Override // k6.d
    public void d(C0890D c0890d) {
        l.f("request", c0890d);
        Proxy.Type type = ((j6.l) this.f8006d).f12528b.f11513b.type();
        l.e("connection.route().proxy.type()", type);
        StringBuilder sb = new StringBuilder();
        sb.append(c0890d.f11475b);
        sb.append(' ');
        C0922t c0922t = c0890d.a;
        if (c0922t.f11613j || type != Proxy.Type.HTTP) {
            String strB = c0922t.b();
            String strD = c0922t.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(c0922t);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        l.e("StringBuilder().apply(builderAction).toString()", string);
        k(c0890d.f11476c, string);
    }

    @Override // k6.d
    public long e(C0895I c0895i) {
        if (!k6.e.a(c0895i)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C0895I.b(c0895i, "Transfer-Encoding"))) {
            return -1L;
        }
        return g6.b.k(c0895i);
    }

    @Override // k6.d
    public G f(C0890D c0890d, long j7) throws ProtocolException {
        l.f("request", c0890d);
        AbstractC0893G abstractC0893G = c0890d.f11477d;
        if (abstractC0893G != null && abstractC0893G.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(c0890d.f11476c.a("Transfer-Encoding"))) {
            if (this.f8004b == 1) {
                this.f8004b = 2;
                return new l6.b(this);
            }
            throw new IllegalStateException(("state: " + this.f8004b).toString());
        }
        if (j7 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f8004b == 1) {
            this.f8004b = 2;
            return new l6.e(this);
        }
        throw new IllegalStateException(("state: " + this.f8004b).toString());
    }

    @Override // k6.d
    public C0894H g(boolean z7) throws IOException {
        C0298b c0298b = (C0298b) this.f8009g;
        int i7 = this.f8004b;
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(("state: " + this.f8004b).toString());
        }
        try {
            String strS = ((C) c0298b.f4552m).s(c0298b.f4551l);
            c0298b.f4551l -= strS.length();
            C2.H hV = AbstractC0847h.v(strS);
            int i8 = hV.f666l;
            C0894H c0894h = new C0894H();
            c0894h.f11483b = (EnumC0888B) hV.f667m;
            c0894h.f11484c = i8;
            c0894h.f11485d = (String) hV.f668n;
            c0894h.f11487f = c0298b.w().j();
            if (z7 && i8 == 100) {
                return null;
            }
            if (i8 == 100) {
                this.f8004b = 3;
                return c0894h;
            }
            if (102 > i8 || i8 >= 200) {
                this.f8004b = 4;
                return c0894h;
            }
            this.f8004b = 3;
            return c0894h;
        } catch (EOFException e7) {
            throw new IOException("unexpected end of stream on ".concat(((j6.l) this.f8006d).f12528b.a.f11529i.g()), e7);
        }
    }

    @Override // k6.d
    public j6.l h() {
        return (j6.l) this.f8006d;
    }

    public boolean i() {
        return this.f8004b < ((List) this.f8008f).size() || !((ArrayList) this.f8010h).isEmpty();
    }

    public l6.d j(long j7) {
        if (this.f8004b == 4) {
            this.f8004b = 5;
            return new l6.d(this, j7);
        }
        throw new IllegalStateException(("state: " + this.f8004b).toString());
    }

    public void k(C0920r c0920r, String str) {
        l.f("requestLine", str);
        if (this.f8004b != 0) {
            throw new IllegalStateException(("state: " + this.f8004b).toString());
        }
        A a = (A) this.f8008f;
        a.R(str);
        a.R(ServerSentEventKt.END_OF_LINE);
        int size = c0920r.size();
        for (int i7 = 0; i7 < size; i7++) {
            a.R(c0920r.h(i7));
            a.R(": ");
            a.R(c0920r.m(i7));
            a.R(ServerSentEventKt.END_OF_LINE);
        }
        a.R(ServerSentEventKt.END_OF_LINE);
        this.f8004b = 1;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((a) this.f8005c) + " version=" + ((T4.f) this.f8006d);
            default:
                return super.toString();
        }
    }

    public b(C0903a c0903a, y yVar, InterfaceC0908f interfaceC0908f) {
        List listL;
        l.f("routeDatabase", yVar);
        l.f("call", interfaceC0908f);
        this.f8005c = c0903a;
        this.f8006d = yVar;
        this.f8007e = interfaceC0908f;
        P3.y yVar2 = P3.y.f7779k;
        this.f8008f = yVar2;
        this.f8009g = yVar2;
        this.f8010h = new ArrayList();
        C0922t c0922t = c0903a.f11529i;
        l.f("url", c0922t);
        Proxy proxy = c0903a.f11527g;
        if (proxy != null) {
            listL = r.H(proxy);
        } else {
            URI uriH = c0922t.h();
            if (uriH.getHost() == null) {
                listL = g6.b.l(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = c0903a.f11528h.select(uriH);
                if (listSelect != null && !listSelect.isEmpty()) {
                    listL = g6.b.w(listSelect);
                } else {
                    listL = g6.b.l(Proxy.NO_PROXY);
                }
            }
        }
        this.f8008f = listL;
        this.f8004b = 0;
    }

    public b(C0887A c0887a, j6.l lVar, C c2, A a) {
        l.f("connection", lVar);
        l.f("source", c2);
        l.f("sink", a);
        this.f8005c = c0887a;
        this.f8006d = lVar;
        this.f8007e = c2;
        this.f8008f = a;
        this.f8009g = new C0298b(c2);
    }
}
