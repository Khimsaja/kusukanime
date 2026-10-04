package t6;

import b1.AbstractC0703b;
import j6.k;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import v.c0;
import w6.C;
import w6.C2224i;
import w6.H;

/* loaded from: classes.dex */
public final class i implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final C f16187k;

    /* renamed from: l, reason: collision with root package name */
    public final g f16188l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f16189m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f16190n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16191o;

    /* renamed from: p, reason: collision with root package name */
    public int f16192p;

    /* renamed from: q, reason: collision with root package name */
    public long f16193q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16194r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16195s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16196t;

    /* renamed from: u, reason: collision with root package name */
    public final C2224i f16197u;

    /* renamed from: v, reason: collision with root package name */
    public final C2224i f16198v;

    /* renamed from: w, reason: collision with root package name */
    public a f16199w;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f16200x;

    public i(C c2, g gVar, boolean z7, boolean z8) {
        l.f("source", c2);
        this.f16187k = c2;
        this.f16188l = gVar;
        this.f16189m = z7;
        this.f16190n = z8;
        this.f16197u = new C2224i();
        this.f16198v = new C2224i();
        this.f16200x = null;
    }

    public final void b() throws IOException {
        String strA0;
        short s7;
        i iVar;
        j jVar;
        long j7 = this.f16193q;
        if (j7 > 0) {
            this.f16187k.G(this.f16197u, j7);
        }
        switch (this.f16192p) {
            case 8:
                C2224i c2224i = this.f16197u;
                long j8 = c2224i.f17156l;
                if (j8 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                k kVar = null;
                if (j8 != 0) {
                    s7 = c2224i.readShort();
                    strA0 = this.f16197u.a0();
                    String strG = (s7 < 1000 || s7 >= 5000) ? AbstractC0703b.g(s7, "Code must be in range [1000,5000): ") : ((1004 > s7 || s7 >= 1007) && (1015 > s7 || s7 >= 3000)) ? null : c0.a(s7, "Code ", " is reserved and may not be used.");
                    if (strG != null) {
                        throw new ProtocolException(strG);
                    }
                } else {
                    strA0 = "";
                    s7 = 1005;
                }
                g gVar = this.f16188l;
                if (s7 == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (gVar) {
                    if (gVar.f16177r != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    gVar.f16177r = s7;
                    gVar.f16178s = strA0;
                    if (gVar.f16176q && gVar.f16174o.isEmpty()) {
                        k kVar2 = gVar.f16172m;
                        gVar.f16172m = null;
                        iVar = gVar.f16168i;
                        gVar.f16168i = null;
                        jVar = gVar.f16169j;
                        gVar.f16169j = null;
                        gVar.f16170k.e();
                        kVar = kVar2;
                    } else {
                        iVar = null;
                        jVar = null;
                    }
                }
                try {
                    gVar.a.onClosing(gVar, s7, strA0);
                    if (kVar != null) {
                        gVar.a.onClosed(gVar, s7, strA0);
                    }
                    this.f16191o = true;
                    return;
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
            case 9:
                g gVar2 = this.f16188l;
                C2224i c2224i2 = this.f16197u;
                w6.l lVarT = c2224i2.T(c2224i2.f17156l);
                synchronized (gVar2) {
                    try {
                        l.f("payload", lVarT);
                        if (!gVar2.f16179t && (!gVar2.f16176q || !gVar2.f16174o.isEmpty())) {
                            gVar2.f16173n.add(lVarT);
                            gVar2.f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                g gVar3 = this.f16188l;
                C2224i c2224i3 = this.f16197u;
                w6.l lVarT2 = c2224i3.T(c2224i3.f17156l);
                synchronized (gVar3) {
                    l.f("payload", lVarT2);
                    gVar3.f16181v = false;
                }
                return;
            default:
                int i7 = this.f16192p;
                byte[] bArr = g6.b.a;
                String hexString = Integer.toHexString(i7);
                l.e("toHexString(this)", hexString);
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        a aVar = this.f16199w;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void e() throws IOException {
        boolean z7;
        if (this.f16191o) {
            throw new IOException("closed");
        }
        C c2 = this.f16187k;
        long jH = c2.f17113k.d().h();
        H h7 = c2.f17113k;
        h7.d().b();
        try {
            byte b4 = c2.readByte();
            byte[] bArr = g6.b.a;
            h7.d().g(jH, TimeUnit.NANOSECONDS);
            int i7 = b4 & 15;
            this.f16192p = i7;
            int i8 = 0;
            boolean z8 = (b4 & 128) != 0;
            this.f16194r = z8;
            boolean z9 = (b4 & 8) != 0;
            this.f16195s = z9;
            if (z9 && !z8) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z10 = (b4 & 64) != 0;
            if (i7 == 1 || i7 == 2) {
                if (!z10) {
                    z7 = false;
                } else {
                    if (!this.f16189m) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z7 = true;
                }
                this.f16196t = z7;
            } else if (z10) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b4 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b4 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b7 = c2.readByte();
            boolean z11 = (b7 & 128) != 0;
            if (z11) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j7 = b7 & 127;
            this.f16193q = j7;
            C2224i c2224i = c2.f17114l;
            if (j7 == 126) {
                this.f16193q = c2.readShort() & 65535;
            } else if (j7 == 127) {
                c2.Q(8L);
                long j8 = c2224i.readLong();
                this.f16193q = j8;
                if (j8 < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f16193q);
                    l.e("toHexString(this)", hexString);
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (this.f16195s && this.f16193q > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!z11) {
                return;
            }
            byte[] bArr2 = this.f16200x;
            l.c(bArr2);
            try {
                c2.Q(bArr2.length);
                c2224i.W(bArr2);
            } catch (EOFException e7) {
                while (true) {
                    long j9 = c2224i.f17156l;
                    if (j9 <= 0) {
                        throw e7;
                    }
                    int iL = c2224i.L(bArr2, i8, (int) j9);
                    if (iL == -1) {
                        throw new AssertionError();
                    }
                    i8 += iL;
                }
            }
        } catch (Throwable th) {
            h7.d().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
