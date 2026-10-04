package t6;

import H1.C0231l;
import P3.r;
import b1.AbstractC0703b;
import f6.AbstractC0902P;
import f6.C0890D;
import f6.C0895I;
import f6.EnumC0888B;
import f6.InterfaceC0901O;
import io.ktor.http.ContentDisposition;
import io.ktor.network.sockets.DatagramKt;
import j6.k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.jvm.internal.l;
import p.I0;
import w6.C2224i;
import w6.t;

/* loaded from: classes.dex */
public final class g implements InterfaceC0901O {

    /* renamed from: w, reason: collision with root package name */
    public static final List f16160w = r.H(EnumC0888B.HTTP_1_1);
    public final AbstractC0902P a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f16161b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16162c;

    /* renamed from: d, reason: collision with root package name */
    public h f16163d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16164e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16165f;

    /* renamed from: g, reason: collision with root package name */
    public j6.i f16166g;

    /* renamed from: h, reason: collision with root package name */
    public e f16167h;

    /* renamed from: i, reason: collision with root package name */
    public i f16168i;

    /* renamed from: j, reason: collision with root package name */
    public j f16169j;

    /* renamed from: k, reason: collision with root package name */
    public final i6.c f16170k;

    /* renamed from: l, reason: collision with root package name */
    public String f16171l;

    /* renamed from: m, reason: collision with root package name */
    public k f16172m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f16173n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f16174o;

    /* renamed from: p, reason: collision with root package name */
    public long f16175p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16176q;

    /* renamed from: r, reason: collision with root package name */
    public int f16177r;

    /* renamed from: s, reason: collision with root package name */
    public String f16178s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16179t;

    /* renamed from: u, reason: collision with root package name */
    public int f16180u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16181v;

    public g(i6.d dVar, C0890D c0890d, AbstractC0902P abstractC0902P, Random random, long j7, long j8) {
        l.f("taskRunner", dVar);
        this.a = abstractC0902P;
        this.f16161b = random;
        this.f16162c = j7;
        this.f16163d = null;
        this.f16164e = j8;
        this.f16170k = dVar.e();
        this.f16173n = new ArrayDeque();
        this.f16174o = new ArrayDeque();
        this.f16177r = -1;
        String str = c0890d.f11475b;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(AbstractC0703b.i("Request must be GET: ", str).toString());
        }
        w6.l lVar = w6.l.f17157n;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f16165f = I0.x(bArr, -1234567890).a();
    }

    public final void a(C0895I c0895i, C0231l c0231l) {
        int i7 = c0895i.f11498n;
        if (i7 != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i7);
            sb.append(' ');
            throw new ProtocolException(A6.b.j(sb, c0895i.f11497m, '\''));
        }
        String strB = C0895I.b(c0895i, "Connection");
        if (!"Upgrade".equalsIgnoreCase(strB)) {
            throw new ProtocolException(A6.b.d('\'', "Expected 'Connection' header value 'Upgrade' but was '", strB));
        }
        String strB2 = C0895I.b(c0895i, "Upgrade");
        if (!"websocket".equalsIgnoreCase(strB2)) {
            throw new ProtocolException(A6.b.d('\'', "Expected 'Upgrade' header value 'websocket' but was '", strB2));
        }
        String strB3 = C0895I.b(c0895i, "Sec-WebSocket-Accept");
        w6.l lVar = w6.l.f17157n;
        String strA = I0.s(this.f16165f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").c("SHA-1").a();
        if (l.a(strA, strB3)) {
            if (c0231l == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strB3 + '\'');
    }

    public final boolean b(int i7, String str) {
        String str2;
        synchronized (this) {
            w6.l lVarS = null;
            try {
                if (i7 < 1000 || i7 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i7;
                } else if ((1004 > i7 || i7 >= 1007) && (1015 > i7 || i7 >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i7 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    w6.l lVar = w6.l.f17157n;
                    lVarS = I0.s(str);
                    if (lVarS.f17158k.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f16179t && !this.f16176q) {
                    this.f16176q = true;
                    this.f16174o.add(new c(i7, lVarS));
                    f();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void c(Exception exc, C0895I c0895i) {
        synchronized (this) {
            if (this.f16179t) {
                return;
            }
            this.f16179t = true;
            k kVar = this.f16172m;
            this.f16172m = null;
            i iVar = this.f16168i;
            this.f16168i = null;
            j jVar = this.f16169j;
            this.f16169j = null;
            this.f16170k.e();
            try {
                this.a.onFailure(this, exc, c0895i);
            } finally {
                if (kVar != null) {
                    g6.b.c(kVar);
                }
                if (iVar != null) {
                    g6.b.c(iVar);
                }
                if (jVar != null) {
                    g6.b.c(jVar);
                }
            }
        }
    }

    public final void d(String str, k kVar) {
        l.f(ContentDisposition.Parameters.Name, str);
        h hVar = this.f16163d;
        l.c(hVar);
        synchronized (this) {
            try {
                this.f16171l = str;
                this.f16172m = kVar;
                this.f16169j = new j(kVar.f12526l, this.f16161b, hVar.a, hVar.f16183c, this.f16164e);
                this.f16167h = new e(this);
                long j7 = this.f16162c;
                if (j7 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j7);
                    this.f16170k.c(new f(str.concat(" ping"), this, nanos), nanos);
                }
                if (!this.f16174o.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16168i = new i(kVar.f12525k, this, hVar.a, hVar.f16185e);
    }

    public final void e() {
        while (this.f16177r == -1) {
            i iVar = this.f16168i;
            l.c(iVar);
            iVar.e();
            if (!iVar.f16195s) {
                int i7 = iVar.f16192p;
                if (i7 != 1 && i7 != 2) {
                    byte[] bArr = g6.b.a;
                    String hexString = Integer.toHexString(i7);
                    l.e("toHexString(this)", hexString);
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (!iVar.f16191o) {
                    long j7 = iVar.f16193q;
                    C2224i c2224i = iVar.f16198v;
                    if (j7 > 0) {
                        iVar.f16187k.G(c2224i, j7);
                    }
                    if (iVar.f16194r) {
                        if (iVar.f16196t) {
                            a aVar = iVar.f16199w;
                            if (aVar == null) {
                                aVar = new a(iVar.f16190n, 1);
                                iVar.f16199w = aVar;
                            }
                            C2224i c2224i2 = aVar.f16151m;
                            if (c2224i2.f17156l != 0) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            Inflater inflater = (Inflater) aVar.f16152n;
                            if (aVar.f16150l) {
                                inflater.reset();
                            }
                            c2224i2.l(c2224i);
                            c2224i2.r(DatagramKt.MAX_DATAGRAM_SIZE);
                            long bytesRead = inflater.getBytesRead() + c2224i2.f17156l;
                            do {
                                ((t) aVar.f16153o).b(c2224i, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        g gVar = iVar.f16188l;
                        AbstractC0902P abstractC0902P = gVar.a;
                        if (i7 == 1) {
                            abstractC0902P.onMessage(gVar, c2224i.a0());
                        } else {
                            w6.l lVarT = c2224i.T(c2224i.f17156l);
                            l.f("bytes", lVarT);
                            abstractC0902P.onMessage(gVar, lVarT);
                        }
                    } else {
                        while (!iVar.f16191o) {
                            iVar.e();
                            if (!iVar.f16195s) {
                                break;
                            } else {
                                iVar.b();
                            }
                        }
                        if (iVar.f16192p != 0) {
                            int i8 = iVar.f16192p;
                            byte[] bArr2 = g6.b.a;
                            String hexString2 = Integer.toHexString(i8);
                            l.e("toHexString(this)", hexString2);
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    }
                }
                throw new IOException("closed");
            }
            iVar.b();
        }
    }

    public final void f() {
        byte[] bArr = g6.b.a;
        e eVar = this.f16167h;
        if (eVar != null) {
            this.f16170k.c(eVar, 0L);
        }
    }

    public final synchronized boolean g(int i7, w6.l lVar) {
        if (!this.f16179t && !this.f16176q) {
            long j7 = this.f16175p;
            byte[] bArr = lVar.f17158k;
            if (bArr.length + j7 > 16777216) {
                b(1001, null);
                return false;
            }
            this.f16175p = j7 + bArr.length;
            this.f16174o.add(new d(i7, lVar));
            f();
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a5, B:39:0x00a9, B:40:0x00aa, B:41:0x00ab, B:43:0x00af, B:73:0x0121, B:75:0x0125, B:84:0x013e, B:85:0x0140, B:61:0x00da, B:65:0x00ff, B:66:0x0108, B:62:0x00ee, B:67:0x0109, B:69:0x0113, B:70:0x0116, B:86:0x0141, B:87:0x0146, B:35:0x009a, B:72:0x011e), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [t6.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.g.h():boolean");
    }
}
