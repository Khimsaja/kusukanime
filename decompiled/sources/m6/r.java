package m6;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import w6.C;

/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f13075n;

    /* renamed from: k, reason: collision with root package name */
    public final C f13076k;

    /* renamed from: l, reason: collision with root package name */
    public final q f13077l;

    /* renamed from: m, reason: collision with root package name */
    public final c f13078m;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        kotlin.jvm.internal.l.e("getLogger(Http2::class.java.name)", logger);
        f13075n = logger;
    }

    public r(C c2) {
        kotlin.jvm.internal.l.f("source", c2);
        this.f13076k = c2;
        q qVar = new q(c2);
        this.f13077l = qVar;
        this.f13078m = new c(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0243, code lost:
    
        throw new java.io.IOException(b1.AbstractC0703b.g(r10, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r20, A3.q r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.r.b(boolean, A3.q):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13076k.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0128, code lost:
    
        if (r8 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012a, code lost:
    
        r16.i(g6.b.f11772b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(A3.q r18, int r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.r.e(A3.q, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        throw new java.io.IOException(b1.AbstractC0703b.g(r7, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List g(int r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.r.g(int, int, int, int):java.util.List");
    }

    public final void i(A3.q qVar, int i7, int i8, int i9) throws IOException {
        int i10;
        int i11 = 1;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z7 = false;
        boolean z8 = (i8 & 1) != 0;
        if ((i8 & 8) != 0) {
            byte b4 = this.f13076k.readByte();
            byte[] bArr = g6.b.a;
            i10 = b4 & 255;
        } else {
            i10 = 0;
        }
        if ((i8 & 32) != 0) {
            C c2 = this.f13076k;
            c2.readInt();
            c2.readByte();
            byte[] bArr2 = g6.b.a;
            i7 -= 5;
        }
        List listG = g(p.a(i7, i8, i10), i10, i8, i9);
        ((n) qVar.f179l).getClass();
        if (i9 != 0 && (i9 & 1) == 0) {
            z7 = true;
        }
        if (z7) {
            n nVar = (n) qVar.f179l;
            nVar.getClass();
            nVar.f13054s.c(new l(nVar.f13048m + '[' + i9 + "] onHeaders", nVar, i9, listG, z8), 0L);
            return;
        }
        n nVar2 = (n) qVar.f179l;
        synchronized (nVar2) {
            v vVarE = nVar2.e(i9);
            if (vVarE != null) {
                vVarE.i(g6.b.u(listG), z8);
                return;
            }
            if (nVar2.f13051p) {
                return;
            }
            if (i9 <= nVar2.f13049n) {
                return;
            }
            if (i9 % 2 == nVar2.f13050o % 2) {
                return;
            }
            v vVar = new v(i9, nVar2, false, z8, g6.b.u(listG));
            nVar2.f13049n = i9;
            nVar2.f13047l.put(Integer.valueOf(i9), vVar);
            nVar2.f13052q.e().c(new i(nVar2.f13048m + '[' + i9 + "] onStream", nVar2, vVar, i11), 0L);
        }
    }

    public final void j(A3.q qVar, int i7, int i8, int i9) throws IOException {
        int i10;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i8 & 8) != 0) {
            byte b4 = this.f13076k.readByte();
            byte[] bArr = g6.b.a;
            i10 = b4 & 255;
        } else {
            i10 = 0;
        }
        int i11 = this.f13076k.readInt() & Integer.MAX_VALUE;
        List listG = g(p.a(i7 - 4, i8, i10), i10, i8, i9);
        n nVar = (n) qVar.f179l;
        nVar.getClass();
        synchronized (nVar) {
            if (nVar.I.contains(Integer.valueOf(i11))) {
                nVar.s(i11, 2);
                return;
            }
            nVar.I.add(Integer.valueOf(i11));
            nVar.f13054s.c(new l(nVar.f13048m + '[' + i11 + "] onRequest", nVar, i11, listG), 0L);
        }
    }
}
