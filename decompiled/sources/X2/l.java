package X2;

import O3.q;
import android.webkit.MimeTypeMap;
import c3.C0753b;
import d3.C0801m;
import d3.EnumC0790b;
import f6.C0889C;
import f6.C0890D;
import f6.C0906d;
import f6.C0920r;
import f6.C0925w;
import g3.AbstractC0946e;
import java.io.IOException;
import java.util.Map;
import w6.AbstractC2217b;
import w6.C;
import w6.o;
import w6.y;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final C0906d f9820f = new C0906d(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g, reason: collision with root package name */
    public static final C0906d f9821g = new C0906d(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C0801m f9822b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9823c;

    /* renamed from: d, reason: collision with root package name */
    public final q f9824d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9825e;

    public l(String str, C0801m c0801m, O3.i iVar, q qVar, boolean z7) {
        this.a = str;
        this.f9822b = c0801m;
        this.f9823c = iVar;
        this.f9824d = qVar;
        this.f9825e = z7;
    }

    public static String d(String str, C0925w c0925w) {
        String strB;
        String str2 = c0925w != null ? c0925w.a : null;
        if ((str2 == null || AbstractC2517v.T(str2, "text/plain", false)) && (strB = AbstractC0946e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return AbstractC2510o.E0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0203 A[Catch: Exception -> 0x018b, TryCatch #1 {Exception -> 0x018b, blocks: (B:93:0x01d4, B:95:0x01da, B:97:0x01fa, B:99:0x01ff, B:98:0x01fd, B:101:0x0203, B:102:0x0208, B:69:0x015b, B:72:0x0167, B:74:0x0173, B:76:0x0181, B:80:0x018d, B:82:0x0195, B:84:0x01b0, B:86:0x01b5, B:85:0x01b3, B:88:0x01b9), top: B:111:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[Catch: Exception -> 0x00cd, TRY_ENTER, TryCatch #0 {Exception -> 0x00cd, blocks: (B:103:0x0209, B:104:0x020c, B:67:0x0153, B:105:0x020d, B:106:0x0212, B:36:0x0097, B:38:0x00a1, B:47:0x00d1, B:49:0x00d5, B:53:0x00ee, B:63:0x013a, B:55:0x0106, B:57:0x0112, B:58:0x011b, B:41:0x00b5, B:43:0x00bd, B:60:0x0125, B:61:0x012c, B:62:0x012d), top: B:110:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:103:0x0209, B:104:0x020c, B:67:0x0153, B:105:0x020d, B:106:0x0212, B:36:0x0097, B:38:0x00a1, B:47:0x00d1, B:49:0x00d5, B:53:0x00ee, B:63:0x013a, B:55:0x0106, B:57:0x0112, B:58:0x011b, B:41:0x00b5, B:43:0x00bd, B:60:0x0125, B:61:0x012c, B:62:0x012d), top: B:110:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01da A[Catch: Exception -> 0x018b, TryCatch #1 {Exception -> 0x018b, blocks: (B:93:0x01d4, B:95:0x01da, B:97:0x01fa, B:99:0x01ff, B:98:0x01fd, B:101:0x0203, B:102:0x0208, B:69:0x015b, B:72:0x0167, B:74:0x0173, B:76:0x0181, B:80:0x018d, B:82:0x0195, B:84:0x01b0, B:86:0x01b5, B:85:0x01b3, B:88:0x01b9), top: B:111:0x015b }] */
    /* JADX WARN: Type inference failed for: r1v4, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [O3.i, java.lang.Object] */
    @Override // X2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(S3.c r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.l.a(S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [O3.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(f6.C0890D r5, U3.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof X2.j
            if (r0 == 0) goto L13
            r0 = r6
            X2.j r0 = (X2.j) r0
            int r1 = r0.f9813m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9813m = r1
            goto L18
        L13:
            X2.j r0 = new X2.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9811k
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f9813m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L90
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            P3.r.Y(r6)
            android.graphics.Bitmap$Config r6 = g3.AbstractC0946e.a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r6 = kotlin.jvm.internal.l.a(r6, r2)
            java.lang.Object r2 = r4.f9823c
            if (r6 == 0) goto L63
            d3.m r6 = r4.f9822b
            d3.b r6 = r6.f11314o
            boolean r6 = r6.f11240k
            if (r6 != 0) goto L5d
            java.lang.Object r6 = r2.getValue()
            f6.e r6 = (f6.InterfaceC0907e) r6
            f6.A r6 = (f6.C0887A) r6
            j6.i r5 = r6.b(r5)
            f6.I r5 = r5.e()
            goto L93
        L5d:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L63:
            java.lang.Object r6 = r2.getValue()
            f6.e r6 = (f6.InterfaceC0907e) r6
            f6.A r6 = (f6.C0887A) r6
            j6.i r5 = r6.b(r5)
            r0.f9813m = r3
            H5.k r6 = new H5.k
            S3.c r0 = P3.r.E(r0)
            r6.<init>(r3, r0)
            r6.r()
            L4.l r0 = new L4.l
            r2 = 6
            r0.<init>(r2, r5, r6)
            r5.d(r0)
            r6.t(r0)
            java.lang.Object r6 = r6.q()
            if (r6 != r1) goto L90
            return r1
        L90:
            r5 = r6
            f6.I r5 = (f6.C0895I) r5
        L93:
            boolean r6 = r5.e()
            if (r6 != 0) goto Lbd
            r6 = 304(0x130, float:4.26E-43)
            int r0 = r5.f11498n
            if (r0 == r6) goto Lbd
            f6.K r6 = r5.f11501q
            if (r6 == 0) goto La6
            g3.AbstractC0946e.a(r6)
        La6:
            D6.r r6 = new D6.r
            java.lang.String r1 = "HTTP "
            java.lang.String r2 = ": "
            java.lang.StringBuilder r0 = b1.AbstractC0703b.p(r0, r1, r2)
            java.lang.String r5 = r5.f11497m
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lbd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.l.b(f6.D, U3.c):java.lang.Object");
    }

    public final o c() {
        Object value = this.f9824d.getValue();
        kotlin.jvm.internal.l.c(value);
        return ((V2.j) ((V2.b) value)).a;
    }

    public final C0890D e() {
        C0889C c0889c = new C0889C();
        c0889c.f(this.a);
        C0801m c0801m = this.f9822b;
        C0920r c0920r = c0801m.f11309j;
        kotlin.jvm.internal.l.f("headers", c0920r);
        c0889c.f11472c = c0920r.j();
        for (Map.Entry entry : c0801m.f11310k.a.entrySet()) {
            Object key = entry.getKey();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.Class<kotlin.Any>", key);
            c0889c.e((Class) key, entry.getValue());
        }
        EnumC0790b enumC0790b = c0801m.f11313n;
        boolean z7 = enumC0790b.f11240k;
        boolean z8 = c0801m.f11314o.f11240k;
        if (!z8 && z7) {
            c0889c.b(C0906d.f11535o);
        } else if (!z8 || z7) {
            if (!z8 && !z7) {
                c0889c.b(f9821g);
            }
        } else if (enumC0790b.f11241l) {
            c0889c.b(C0906d.f11534n);
        } else {
            c0889c.b(f9820f);
        }
        return c0889c.a();
    }

    public final C0753b f(V2.i iVar) throws Throwable {
        Throwable th;
        C0753b c0753b;
        try {
            o oVarC = c();
            V2.d dVar = iVar.f9478k;
            if (dVar.f9455l) {
                throw new IllegalStateException("snapshot is closed");
            }
            C c2 = AbstractC2217b.c(oVarC.x((y) dVar.f9454k.f9447c.get(0)));
            try {
                c0753b = new C0753b(c2);
                try {
                    c2.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c2.close();
                } catch (Throwable th4) {
                    q0.c.j(th3, th4);
                }
                th = th3;
                c0753b = null;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.l.c(c0753b);
            return c0753b;
        } catch (IOException unused) {
            return null;
        }
    }

    public final U2.l g(V2.i iVar) {
        V2.d dVar = iVar.f9478k;
        if (dVar.f9455l) {
            throw new IllegalStateException("snapshot is closed");
        }
        y yVar = (y) dVar.f9454k.f9447c.get(1);
        o oVarC = c();
        String str = this.f9822b.f11308i;
        if (str == null) {
            str = this.a;
        }
        return new U2.l(yVar, oVarC, str, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V2.i h(V2.i r5, f6.C0890D r6, f6.C0895I r7, c3.C0753b r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.l.h(V2.i, f6.D, f6.I, c3.b):V2.i");
    }
}
