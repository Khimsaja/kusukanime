package j6;

import D4.S;
import P3.q;
import X4.y;
import b1.AbstractC0703b;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import f6.C0887A;
import f6.C0889C;
import f6.C0890D;
import f6.C0894H;
import f6.C0895I;
import f6.C0898L;
import f6.C0903a;
import f6.C0910h;
import f6.C0914l;
import f6.C0919q;
import f6.C0922t;
import f6.EnumC0888B;
import f6.InterfaceC0908f;
import io.ktor.network.sockets.DatagramKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import m6.n;
import m6.v;
import m6.w;
import n6.o;
import p.I0;
import w6.A;
import w6.AbstractC2217b;
import w6.C;
import w6.J;
import z5.AbstractC2511p;

/* loaded from: classes.dex */
public final class l extends m6.h {

    /* renamed from: b, reason: collision with root package name */
    public final C0898L f12528b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f12529c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f12530d;

    /* renamed from: e, reason: collision with root package name */
    public C0919q f12531e;

    /* renamed from: f, reason: collision with root package name */
    public EnumC0888B f12532f;

    /* renamed from: g, reason: collision with root package name */
    public n f12533g;

    /* renamed from: h, reason: collision with root package name */
    public C f12534h;

    /* renamed from: i, reason: collision with root package name */
    public A f12535i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12536j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12537k;

    /* renamed from: l, reason: collision with root package name */
    public int f12538l;

    /* renamed from: m, reason: collision with root package name */
    public int f12539m;

    /* renamed from: n, reason: collision with root package name */
    public int f12540n;

    /* renamed from: o, reason: collision with root package name */
    public int f12541o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f12542p;

    /* renamed from: q, reason: collision with root package name */
    public long f12543q;

    public l(T1.l lVar, C0898L c0898l) {
        kotlin.jvm.internal.l.f("connectionPool", lVar);
        kotlin.jvm.internal.l.f("route", c0898l);
        this.f12528b = c0898l;
        this.f12541o = 1;
        this.f12542p = new ArrayList();
        this.f12543q = Long.MAX_VALUE;
    }

    public static void d(C0887A c0887a, C0898L c0898l, IOException iOException) {
        kotlin.jvm.internal.l.f("client", c0887a);
        kotlin.jvm.internal.l.f("failedRoute", c0898l);
        kotlin.jvm.internal.l.f("failure", iOException);
        if (c0898l.f11513b.type() != Proxy.Type.DIRECT) {
            C0903a c0903a = c0898l.a;
            c0903a.f11528h.connectFailed(c0903a.f11529i.h(), c0898l.f11513b.address(), iOException);
        }
        y yVar = c0887a.f11446K;
        synchronized (yVar) {
            ((LinkedHashSet) yVar.f9916l).add(c0898l);
        }
    }

    @Override // m6.h
    public final synchronized void a(n nVar, m6.A a) {
        kotlin.jvm.internal.l.f("connection", nVar);
        kotlin.jvm.internal.l.f("settings", a);
        this.f12541o = (a.a & 16) != 0 ? a.f12994b[4] : Integer.MAX_VALUE;
    }

    @Override // m6.h
    public final void b(v vVar) {
        vVar.c(8, null);
    }

    public final void c(int i7, int i8, int i9, boolean z7, InterfaceC0908f interfaceC0908f) throws Throwable {
        C0898L c0898l;
        kotlin.jvm.internal.l.f("call", interfaceC0908f);
        if (this.f12532f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f12528b.a.f11531k;
        b bVar = new b(list);
        C0903a c0903a = this.f12528b.a;
        if (c0903a.f11523c == null) {
            if (!list.contains(C0914l.f11573f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f12528b.a.f11529i.f11607d;
            o oVar = o.a;
            if (!o.a.h(str)) {
                throw new m(new UnknownServiceException(AbstractC0703b.j("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c0903a.f11530j.contains(EnumC0888B.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar = null;
        do {
            try {
                C0898L c0898l2 = this.f12528b;
                if (c0898l2.a.f11523c != null && c0898l2.f11513b.type() == Proxy.Type.HTTP) {
                    f(i7, i8, i9, interfaceC0908f);
                    if (this.f12529c == null) {
                    }
                    c0898l = this.f12528b;
                    if (c0898l.a.f11523c == null && c0898l.f11513b.type() == Proxy.Type.HTTP && this.f12529c == null) {
                        throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f12543q = System.nanoTime();
                    return;
                }
                e(i7, i8, interfaceC0908f);
                g(bVar, interfaceC0908f);
                kotlin.jvm.internal.l.f("inetSocketAddress", this.f12528b.f11514c);
                c0898l = this.f12528b;
                if (c0898l.a.f11523c == null) {
                }
                this.f12543q = System.nanoTime();
                return;
            } catch (IOException e7) {
                Socket socket = this.f12530d;
                if (socket != null) {
                    g6.b.d(socket);
                }
                Socket socket2 = this.f12529c;
                if (socket2 != null) {
                    g6.b.d(socket2);
                }
                this.f12530d = null;
                this.f12529c = null;
                this.f12534h = null;
                this.f12535i = null;
                this.f12531e = null;
                this.f12532f = null;
                this.f12533g = null;
                this.f12541o = 1;
                kotlin.jvm.internal.l.f("inetSocketAddress", this.f12528b.f11514c);
                if (mVar == null) {
                    mVar = new m(e7);
                } else {
                    q0.c.j(mVar.f12544k, e7);
                    mVar.f12545l = e7;
                }
                if (!z7) {
                    throw mVar;
                }
                bVar.f12484d = true;
                if (!bVar.f12483c) {
                    throw mVar;
                }
                if (e7 instanceof ProtocolException) {
                    throw mVar;
                }
                if (e7 instanceof InterruptedIOException) {
                    throw mVar;
                }
                if ((e7 instanceof SSLHandshakeException) && (e7.getCause() instanceof CertificateException)) {
                    throw mVar;
                }
                if (e7 instanceof SSLPeerUnverifiedException) {
                    throw mVar;
                }
            }
        } while (e7 instanceof SSLException);
        throw mVar;
    }

    public final void e(int i7, int i8, InterfaceC0908f interfaceC0908f) throws IOException {
        Socket socketCreateSocket;
        C0898L c0898l = this.f12528b;
        Proxy proxy = c0898l.f11513b;
        C0903a c0903a = c0898l.a;
        Proxy.Type type = proxy.type();
        int i9 = type == null ? -1 : j.a[type.ordinal()];
        if (i9 == 1 || i9 == 2) {
            socketCreateSocket = c0903a.f11522b.createSocket();
            kotlin.jvm.internal.l.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f12529c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f12528b.f11514c;
        kotlin.jvm.internal.l.f("call", interfaceC0908f);
        kotlin.jvm.internal.l.f("inetSocketAddress", inetSocketAddress);
        socketCreateSocket.setSoTimeout(i8);
        try {
            o oVar = o.a;
            o.a.e(socketCreateSocket, this.f12528b.f11514c, i7);
            try {
                this.f12534h = AbstractC2217b.c(AbstractC2217b.i(socketCreateSocket));
                this.f12535i = AbstractC2217b.b(AbstractC2217b.g(socketCreateSocket));
            } catch (NullPointerException e7) {
                if (kotlin.jvm.internal.l.a(e7.getMessage(), "throw with null exception")) {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f12528b.f11514c);
            connectException.initCause(e8);
            throw connectException;
        }
    }

    public final void f(int i7, int i8, int i9, InterfaceC0908f interfaceC0908f) throws IOException {
        C0889C c0889c = new C0889C();
        C0898L c0898l = this.f12528b;
        C0922t c0922t = c0898l.a.f11529i;
        kotlin.jvm.internal.l.f("url", c0922t);
        c0889c.a = c0922t;
        c0889c.d("CONNECT", null);
        C0903a c0903a = c0898l.a;
        c0889c.c("Host", g6.b.v(c0903a.f11529i, true));
        c0889c.c("Proxy-Connection", "Keep-Alive");
        c0889c.c("User-Agent", "okhttp/4.12.0");
        C0890D c0890dA = c0889c.a();
        S s7 = new S(5, false);
        AbstractC0832b.j("Proxy-Authenticate");
        AbstractC0832b.k("OkHttp-Preemptive", "Proxy-Authenticate");
        s7.x("Proxy-Authenticate");
        s7.i("Proxy-Authenticate", "OkHttp-Preemptive");
        s7.l();
        c0903a.f11526f.getClass();
        e(i7, i8, interfaceC0908f);
        String str = "CONNECT " + g6.b.v(c0890dA.a, true) + " HTTP/1.1";
        C c2 = this.f12534h;
        kotlin.jvm.internal.l.c(c2);
        A a = this.f12535i;
        kotlin.jvm.internal.l.c(a);
        Q4.b bVar = new Q4.b(null, this, c2, a);
        J jD = c2.f17113k.d();
        long j7 = i8;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jD.g(j7, timeUnit);
        a.f17109k.d().g(i9, timeUnit);
        bVar.k(c0890dA.f11476c, str);
        bVar.a();
        C0894H c0894hG = bVar.g(false);
        kotlin.jvm.internal.l.c(c0894hG);
        c0894hG.a = c0890dA;
        C0895I c0895iA = c0894hG.a();
        long jK = g6.b.k(c0895iA);
        if (jK != -1) {
            l6.d dVarJ = bVar.j(jK);
            g6.b.t(dVarJ, Integer.MAX_VALUE);
            dVarJ.close();
        }
        int i10 = c0895iA.f11498n;
        if (i10 != 200) {
            if (i10 != 407) {
                throw new IOException(AbstractC0703b.g(i10, "Unexpected response code for CONNECT: "));
            }
            c0903a.f11526f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c2.f17114l.z() || !a.f17110l.z()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, InterfaceC0908f interfaceC0908f) throws Throwable {
        C0903a c0903a = this.f12528b.a;
        SSLSocketFactory sSLSocketFactory = c0903a.f11523c;
        EnumC0888B enumC0888BP = EnumC0888B.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c0903a.f11530j;
            EnumC0888B enumC0888B = EnumC0888B.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC0888B)) {
                this.f12530d = this.f12529c;
                this.f12532f = enumC0888BP;
                return;
            } else {
                this.f12530d = this.f12529c;
                this.f12532f = enumC0888B;
                l();
                return;
            }
        }
        kotlin.jvm.internal.l.f("call", interfaceC0908f);
        C0903a c0903a2 = this.f12528b.a;
        SSLSocketFactory sSLSocketFactory2 = c0903a2.f11523c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            kotlin.jvm.internal.l.c(sSLSocketFactory2);
            Socket socket = this.f12529c;
            C0922t c0922t = c0903a2.f11529i;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, c0922t.f11607d, c0922t.f11608e, true);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type javax.net.ssl.SSLSocket", socketCreateSocket);
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C0914l c0914lA = bVar.a(sSLSocket2);
                if (c0914lA.f11574b) {
                    o oVar = o.a;
                    o.a.d(sSLSocket2, c0903a2.f11529i.f11607d, c0903a2.f11530j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                kotlin.jvm.internal.l.e("sslSocketSession", session);
                C0919q c0919qV = e3.c.v(session);
                HostnameVerifier hostnameVerifier = c0903a2.f11524d;
                kotlin.jvm.internal.l.c(hostnameVerifier);
                if (hostnameVerifier.verify(c0903a2.f11529i.f11607d, session)) {
                    C0910h c0910h = c0903a2.f11525e;
                    kotlin.jvm.internal.l.c(c0910h);
                    this.f12531e = new C0919q(c0919qV.a, c0919qV.f11593b, c0919qV.f11594c, new A.j(c0910h, c0919qV, c0903a2, 3));
                    kotlin.jvm.internal.l.f("hostname", c0903a2.f11529i.f11607d);
                    Iterator it = c0910h.a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (c0914lA.f11574b) {
                        o oVar2 = o.a;
                        strF = o.a.f(sSLSocket2);
                    }
                    this.f12530d = sSLSocket2;
                    this.f12534h = AbstractC2217b.c(AbstractC2217b.i(sSLSocket2));
                    this.f12535i = AbstractC2217b.b(AbstractC2217b.g(sSLSocket2));
                    if (strF != null) {
                        enumC0888BP = AbstractC0870c.P(strF);
                    }
                    this.f12532f = enumC0888BP;
                    o oVar3 = o.a;
                    o.a.a(sSLSocket2);
                    if (this.f12532f == EnumC0888B.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = c0919qV.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0903a2.f11529i.f11607d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.security.cert.X509Certificate", obj);
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c0903a2.f11529i.f11607d);
                sb.append(" not verified:\n              |    certificate: ");
                C0910h c0910h2 = C0910h.f11548c;
                StringBuilder sb2 = new StringBuilder("sha256/");
                w6.l lVar = w6.l.f17157n;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                kotlin.jvm.internal.l.e("publicKey.encoded", encoded);
                sb2.append(I0.x(encoded, -1234567890).c("SHA-256").a());
                sb.append(sb2.toString());
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(q.G0(s6.c.a(x509Certificate, 7), s6.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC2511p.F(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    o oVar4 = o.a;
                    o.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    g6.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(f6.C0903a r10, java.util.ArrayList r11) {
        /*
            r9 = this;
            java.lang.String r0 = "hostname"
            byte[] r1 = g6.b.a
            java.util.ArrayList r1 = r9.f12542p
            int r1 = r1.size()
            int r2 = r9.f12541o
            r3 = 0
            if (r1 >= r2) goto Le1
            boolean r1 = r9.f12536j
            if (r1 == 0) goto L15
            goto Le1
        L15:
            f6.L r1 = r9.f12528b
            f6.a r2 = r1.a
            boolean r2 = r2.a(r10)
            if (r2 != 0) goto L21
            goto Le1
        L21:
            f6.t r2 = r10.f11529i
            java.lang.String r4 = r2.f11607d
            f6.a r5 = r1.a
            f6.t r6 = r5.f11529i
            java.lang.String r6 = r6.f11607d
            boolean r4 = kotlin.jvm.internal.l.a(r4, r6)
            r6 = 1
            if (r4 == 0) goto L33
            return r6
        L33:
            m6.n r4 = r9.f12533g
            if (r4 != 0) goto L39
            goto Le1
        L39:
            if (r11 == 0) goto Le1
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L43
            goto Le1
        L43:
            java.util.Iterator r11 = r11.iterator()
        L47:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto Le1
            java.lang.Object r4 = r11.next()
            f6.L r4 = (f6.C0898L) r4
            java.net.Proxy r7 = r4.f11513b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L47
            java.net.Proxy r7 = r1.f11513b
            java.net.Proxy$Type r7 = r7.type()
            if (r7 != r8) goto L47
            java.net.InetSocketAddress r4 = r4.f11514c
            java.net.InetSocketAddress r7 = r1.f11514c
            boolean r4 = kotlin.jvm.internal.l.a(r7, r4)
            if (r4 == 0) goto L47
            s6.c r11 = s6.c.a
            javax.net.ssl.HostnameVerifier r1 = r10.f11524d
            if (r1 == r11) goto L76
            goto Le1
        L76:
            byte[] r11 = g6.b.a
            f6.t r11 = r5.f11529i
            int r1 = r11.f11608e
            int r4 = r2.f11608e
            if (r4 == r1) goto L81
            goto Le1
        L81:
            java.lang.String r11 = r11.f11607d
            java.lang.String r1 = r2.f11607d
            boolean r11 = kotlin.jvm.internal.l.a(r1, r11)
            if (r11 == 0) goto L8c
            goto Laf
        L8c:
            boolean r11 = r9.f12537k
            if (r11 != 0) goto Le1
            f6.q r11 = r9.f12531e
            if (r11 == 0) goto Le1
            java.util.List r11 = r11.a()
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto Le1
            java.lang.Object r11 = r11.get(r3)
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.l.d(r2, r11)
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11
            boolean r11 = s6.c.c(r1, r11)
            if (r11 == 0) goto Le1
        Laf:
            f6.h r10 = r10.f11525e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            kotlin.jvm.internal.l.c(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            f6.q r11 = r9.f12531e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            kotlin.jvm.internal.l.c(r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.util.List r11 = r11.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            kotlin.jvm.internal.l.f(r0, r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.lang.String r0 = "peerCertificates"
            kotlin.jvm.internal.l.f(r0, r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.util.Set r10 = r10.a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.util.Iterator r10 = r10.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            boolean r11 = r10.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            if (r11 != 0) goto Ld4
            return r6
        Ld4:
            java.lang.Object r10 = r10.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            r10.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.lang.ClassCastException r10 = new java.lang.ClassCastException     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            r10.<init>()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            throw r10     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
        Le1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.l.h(f6.a, java.util.ArrayList):boolean");
    }

    public final boolean i(boolean z7) throws SocketException {
        long j7;
        byte[] bArr = g6.b.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f12529c;
        kotlin.jvm.internal.l.c(socket);
        Socket socket2 = this.f12530d;
        kotlin.jvm.internal.l.c(socket2);
        kotlin.jvm.internal.l.c(this.f12534h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        n nVar = this.f12533g;
        if (nVar != null) {
            synchronized (nVar) {
                if (nVar.f13051p) {
                    return false;
                }
                if (nVar.f13059x < nVar.f13058w) {
                    if (jNanoTime >= nVar.f13060y) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j7 = jNanoTime - this.f12543q;
        }
        if (j7 < 10000000000L || !z7) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.z();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final k6.d j(C0887A c0887a, k6.f fVar) throws SocketException {
        kotlin.jvm.internal.l.f("client", c0887a);
        Socket socket = this.f12530d;
        kotlin.jvm.internal.l.c(socket);
        C c2 = this.f12534h;
        kotlin.jvm.internal.l.c(c2);
        A a = this.f12535i;
        kotlin.jvm.internal.l.c(a);
        n nVar = this.f12533g;
        if (nVar != null) {
            return new m6.o(c0887a, this, fVar, nVar);
        }
        int i7 = fVar.f12703g;
        socket.setSoTimeout(i7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2.f17113k.d().g(i7, timeUnit);
        a.f17109k.d().g(fVar.f12704h, timeUnit);
        return new Q4.b(c0887a, this, c2, a);
    }

    public final synchronized void k() {
        this.f12536j = true;
    }

    public final void l() throws SocketException {
        Socket socket = this.f12530d;
        kotlin.jvm.internal.l.c(socket);
        C c2 = this.f12534h;
        kotlin.jvm.internal.l.c(c2);
        A a = this.f12535i;
        kotlin.jvm.internal.l.c(a);
        socket.setSoTimeout(0);
        i6.d dVar = i6.d.f12053i;
        B0.b bVar = new B0.b(dVar);
        String str = this.f12528b.a.f11529i.f11607d;
        kotlin.jvm.internal.l.f("peerName", str);
        bVar.f276l = socket;
        String str2 = g6.b.f11776f + ' ' + str;
        kotlin.jvm.internal.l.f("<set-?>", str2);
        bVar.f277m = str2;
        bVar.f278n = c2;
        bVar.f279o = a;
        bVar.f280p = this;
        n nVar = new n(bVar);
        this.f12533g = nVar;
        m6.A a7 = n.J;
        this.f12541o = (a7.a & 16) != 0 ? a7.f12994b[4] : Integer.MAX_VALUE;
        w wVar = nVar.f13044G;
        synchronized (wVar) {
            try {
                if (wVar.f13107n) {
                    throw new IOException("closed");
                }
                Logger logger = w.f13103p;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(g6.b.i(">> CONNECTION " + m6.f.a.e(), new Object[0]));
                }
                wVar.f13104k.k(m6.f.a);
                wVar.f13104k.flush();
            } finally {
            }
        }
        w wVar2 = nVar.f13044G;
        m6.A a8 = nVar.f13061z;
        synchronized (wVar2) {
            try {
                kotlin.jvm.internal.l.f("settings", a8);
                if (wVar2.f13107n) {
                    throw new IOException("closed");
                }
                wVar2.g(0, Integer.bitCount(a8.a) * 6, 4, 0);
                int i7 = 0;
                while (i7 < 10) {
                    boolean z7 = true;
                    if (((1 << i7) & a8.a) == 0) {
                        z7 = false;
                    }
                    if (z7) {
                        int i8 = i7 != 4 ? i7 != 7 ? i7 : 4 : 3;
                        A a9 = wVar2.f13104k;
                        if (a9.f17111m) {
                            throw new IllegalStateException("closed");
                        }
                        a9.f17110l.j0(i8);
                        a9.b();
                        wVar2.f13104k.e(a8.f12994b[i7]);
                    }
                    i7++;
                }
                wVar2.f13104k.flush();
            } finally {
            }
        }
        if (nVar.f13061z.a() != 65535) {
            nVar.f13044G.v(0, r1 - DatagramKt.MAX_DATAGRAM_SIZE);
        }
        dVar.e().c(new i6.b(nVar.f13048m, 0, nVar.f13045H), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C0898L c0898l = this.f12528b;
        sb.append(c0898l.a.f11529i.f11607d);
        sb.append(':');
        sb.append(c0898l.a.f11529i.f11608e);
        sb.append(", proxy=");
        sb.append(c0898l.f11513b);
        sb.append(" hostAddress=");
        sb.append(c0898l.f11514c);
        sb.append(" cipherSuite=");
        C0919q c0919q = this.f12531e;
        if (c0919q == null || (obj = c0919q.f11593b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f12532f);
        sb.append('}');
        return sb.toString();
    }
}
