package B2;

import A4.A;
import A4.F;
import A4.r;
import B1.AbstractC0015b;
import B1.K;
import C1.w;
import C2.E;
import D.C0049e0;
import D4.M;
import H.N;
import J1.C0289e;
import J1.z;
import K2.C0298b;
import K2.C0321z;
import K2.W;
import M0.H;
import O.AbstractC0482b;
import O.C0486d;
import O1.S;
import O1.h0;
import O3.C;
import S2.m;
import V1.n;
import X4.InterfaceC0619p;
import X4.y;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import d1.AbstractC0783b;
import e4.InterfaceC0821a;
import e5.EnumC0834d;
import f6.C0927y;
import g3.ComponentCallbacks2C0951j;
import h0.InterfaceC0995r;
import i1.AbstractC1067u;
import j0.C1296b;
import j3.AbstractC1331q;
import j3.D;
import j3.G;
import j3.X;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;
import l4.InterfaceC1443v;
import m.AbstractC1475E;
import m.AbstractC1491l;
import m.C1492m;
import m.C1498s;
import n.AbstractC1529a;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.P;
import p.I0;
import p1.C1780c;
import p1.p;
import p1.q;
import q1.C1845a;
import r4.EnumC1882k;
import s.C1904b;
import s0.C1962g;
import s2.InterfaceC1976d;
import u4.InterfaceC2103i;
import y0.C2349D;
import y1.C2392n;
import y1.C2393o;
import z0.C2471u;
import z4.C2490b;

/* loaded from: classes.dex */
public final class l implements InterfaceC1976d, E, X.i, c3.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f415k;

    /* renamed from: l, reason: collision with root package name */
    public Object f416l;

    /* renamed from: m, reason: collision with root package name */
    public Object f417m;

    /* renamed from: n, reason: collision with root package name */
    public Object f418n;

    public /* synthetic */ l(int i7, Object obj) {
        this.f415k = i7;
        this.f416l = obj;
    }

    public static final void f(l lVar, Network network, boolean z7) {
        C c2;
        boolean z8;
        Network[] allNetworks = ((ConnectivityManager) lVar.f416l).getAllNetworks();
        int length = allNetworks.length;
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            Network network2 = allNetworks[i7];
            if (kotlin.jvm.internal.l.a(network2, network)) {
                z8 = z7;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) lVar.f416l).getNetworkCapabilities(network2);
                z8 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z8) {
                z9 = true;
                break;
            }
            i7++;
        }
        ComponentCallbacks2C0951j componentCallbacks2C0951j = (ComponentCallbacks2C0951j) lVar.f417m;
        synchronized (componentCallbacks2C0951j) {
            try {
                if (((m) componentCallbacks2C0951j.f11716k.get()) != null) {
                    componentCallbacks2C0951j.f11720o = z9;
                    c2 = C.a;
                } else {
                    c2 = null;
                }
                if (c2 == null) {
                    componentCallbacks2C0951j.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long A() {
        return ((C1296b) this.f418n).f12204k.f12203d;
    }

    public View B(int i7) {
        return ((C0321z) this.f416l).a.getChildAt(i7);
    }

    public int C() {
        return ((C0321z) this.f416l).a.getChildCount();
    }

    public Enum D(M m7, InterfaceC1443v interfaceC1443v) {
        kotlin.jvm.internal.l.f("property", interfaceC1443v);
        return (Enum) ((V3.b) this.f418n).get(((InterfaceC0619p) ((T4.c) this.f417m).c(((Number) ((o) this.f416l).get(m7)).intValue())).a());
    }

    public boolean E(CharSequence charSequence, int i7, int i8, q qVar) {
        if ((qVar.f14195c & 3) == 0) {
            C1780c c1780c = (C1780c) this.f418n;
            C1845a c1845aB = qVar.b();
            int iA = c1845aB.a(8);
            if (iA != 0) {
                ((ByteBuffer) c1845aB.f7975n).getShort(iA + c1845aB.f7972k);
            }
            c1780c.getClass();
            ThreadLocal threadLocal = C1780c.f14165b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i7 < i8) {
                sb.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = c1780c.a;
            String string = sb.toString();
            int i9 = AbstractC0783b.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i10 = qVar.f14195c & 4;
            qVar.f14195c = zHasGlyph ? i10 | 2 : i10 | 1;
        }
        return (qVar.f14195c & 3) == 2;
    }

    public void F(View view) {
        ((ArrayList) this.f418n).add(view);
        C0321z c0321z = (C0321z) this.f416l;
        W wF = RecyclerView.F(view);
        if (wF != null) {
            int i7 = wF.f4534p;
            View view2 = wF.a;
            if (i7 != -1) {
                wF.f4533o = i7;
            } else {
                Field field = AbstractC1067u.a;
                wF.f4533o = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0321z.a;
            if (recyclerView.I()) {
                wF.f4534p = 4;
                recyclerView.A0.add(wF);
            } else {
                Field field2 = AbstractC1067u.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void G(E1.h hVar, Uri uri, Map map, long j7, long j8, S s7) throws h0 {
        boolean z7;
        boolean z8 = true;
        V1.k kVar = new V1.k(hVar, j7, j8);
        this.f418n = kVar;
        if (((n) this.f417m) != null) {
            return;
        }
        n[] nVarArrE = ((V1.q) this.f416l).e(uri, map);
        int length = nVarArrE.length;
        j3.E e7 = G.f12277l;
        AbstractC1331q.b(length, "expectedSize");
        D d4 = new D(length);
        if (nVarArrE.length == 1) {
            this.f417m = nVarArrE[0];
        } else {
            int length2 = nVarArrE.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                n nVar = nVarArrE[i7];
                try {
                } catch (EOFException unused) {
                    z7 = ((n) this.f417m) != null || kVar.f9392n == j7;
                } catch (Throwable th) {
                    if (((n) this.f417m) == null && kVar.f9392n != j7) {
                        z8 = false;
                    }
                    AbstractC0015b.h(z8);
                    kVar.f9394p = 0;
                    throw th;
                }
                if (nVar.b(kVar)) {
                    this.f417m = nVar;
                    kVar.f9394p = 0;
                    break;
                } else {
                    d4.c(nVar.f());
                    z7 = ((n) this.f417m) != null || kVar.f9392n == j7;
                    AbstractC0015b.h(z7);
                    kVar.f9394p = 0;
                    i7++;
                }
            }
            if (((n) this.f417m) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                F2.G g4 = new F2.G(", ");
                Iterator it = AbstractC1331q.r(G.t(nVarArrE), new I1.e(6)).iterator();
                StringBuilder sb2 = new StringBuilder();
                g4.b(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                X xF = d4.f();
                h0 h0Var = new h0(string, null, false, 1);
                G.s(xF);
                throw h0Var;
            }
        }
        ((n) this.f417m).d(s7);
    }

    public boolean H() {
        if (((H) this.f416l).getValue() != this.f418n) {
            return true;
        }
        l lVar = (l) this.f417m;
        return lVar != null && lVar.H();
    }

    public void I() {
        C2471u c2471u = ((C2349D) this.f416l).f17679s;
        if (c2471u != null) {
            c2471u.s();
        }
    }

    public Object J(CharSequence charSequence, int i7, int i8, int i9, boolean z7, p1.l lVar) {
        int i10;
        char c2;
        L0.b bVar = new L0.b((p) ((A2.b) this.f417m).f112n);
        int iCodePointAt = Character.codePointAt(charSequence, i7);
        boolean zC = true;
        int i11 = 0;
        int iCharCount = i7;
        loop0: while (true) {
            i10 = iCharCount;
            while (iCharCount < i8 && i11 < i9 && zC) {
                SparseArray sparseArray = ((p) bVar.f5999f).a;
                p pVar = sparseArray == null ? null : (p) sparseArray.get(iCodePointAt);
                if (bVar.f5995b == 2) {
                    if (pVar != null) {
                        bVar.f5999f = pVar;
                        bVar.f5997d++;
                    } else {
                        if (iCodePointAt == 65038) {
                            bVar.d();
                        } else if (iCodePointAt != 65039) {
                            p pVar2 = (p) bVar.f5999f;
                            if (pVar2.f14192b != null) {
                                if (bVar.f5997d != 1) {
                                    bVar.f6000g = pVar2;
                                    bVar.d();
                                } else if (bVar.e()) {
                                    bVar.f6000g = (p) bVar.f5999f;
                                    bVar.d();
                                } else {
                                    bVar.d();
                                }
                                c2 = 3;
                            } else {
                                bVar.d();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (pVar == null) {
                    bVar.d();
                    c2 = 1;
                } else {
                    bVar.f5995b = 2;
                    bVar.f5999f = pVar;
                    bVar.f5997d = 1;
                    c2 = 2;
                }
                bVar.f5996c = iCodePointAt;
                if (c2 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i10)) + i10;
                    if (iCharCount < i8) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c2 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i8) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c2 == 3) {
                    if (z7 || !E(charSequence, i10, iCharCount, ((p) bVar.f6000g).f14192b)) {
                        zC = lVar.c(charSequence, i10, iCharCount, ((p) bVar.f6000g).f14192b);
                        i11++;
                    }
                }
            }
            break loop0;
        }
        if (bVar.f5995b == 2 && ((p) bVar.f5999f).f14192b != null && ((bVar.f5997d > 1 || bVar.e()) && i11 < i9 && zC && (z7 || !E(charSequence, i10, iCharCount, ((p) bVar.f5999f).f14192b)))) {
            lVar.c(charSequence, i10, iCharCount, ((p) bVar.f5999f).f14192b);
        }
        return lVar.a();
    }

    public void K(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f416l).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f418n) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void L(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0482b.a) {
            this.f418n = obj;
            return;
        }
        synchronized (this.f417m) {
            W.e eVar = (W.e) ((AtomicReference) this.f416l).get();
            int iA = eVar.a(id);
            if (iA < 0) {
                ((AtomicReference) this.f416l).set(eVar.b(id, obj));
            } else {
                eVar.f9513c[iA] = obj;
            }
        }
    }

    public void M(InterfaceC0995r interfaceC0995r) {
        ((C1296b) this.f418n).f12204k.f12202c = interfaceC0995r;
    }

    public void N(T0.b bVar) {
        ((C1296b) this.f418n).f12204k.a = bVar;
    }

    public void O(T0.k kVar) {
        ((C1296b) this.f418n).f12204k.f12201b = kVar;
    }

    public void P(long j7) {
        ((C1296b) this.f418n).f12204k.f12203d = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n5.a0 Q(A4.i r7, M4.a r8, boolean r9) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = "arrayType"
            kotlin.jvm.internal.l.f(r1, r7)
            A4.C r1 = r7.f224b
            boolean r2 = r1 instanceof A4.A
            r3 = 0
            if (r2 == 0) goto L11
            r2 = r1
            A4.A r2 = (A4.A) r2
            goto L12
        L11:
            r2 = r3
        L12:
            if (r2 == 0) goto L2c
            java.lang.Class r2 = r2.a
            java.lang.Class r4 = java.lang.Void.TYPE
            boolean r4 = kotlin.jvm.internal.l.a(r2, r4)
            if (r4 == 0) goto L1f
            goto L2c
        L1f:
            java.lang.String r2 = r2.getName()
            e5.d r2 = e5.EnumC0834d.b(r2)
            r4.k r2 = r2.d()
            goto L2d
        L2c:
            r2 = r3
        L2d:
            K4.c r4 = new K4.c
            java.lang.Object r5 = r6.f416l
            A2.b r5 = (A2.b) r5
            r4.<init>(r5, r7, r0)
            java.lang.Object r7 = r5.f110l
            K4.a r7 = (K4.a) r7
            boolean r8 = r8.f6550d
            if (r2 == 0) goto L6e
            x4.A r7 = r7.f4713o
            r4.i r7 = r7.f17339n
            n5.B r7 = r7.q(r2)
            v4.i r9 = new v4.i
            v4.h r1 = r7.getAnnotations()
            r2 = 2
            v4.h[] r2 = new v4.h[r2]
            r3 = 0
            r2[r3] = r1
            r2[r0] = r4
            r9.<init>(r2)
            n5.x r7 = f6.AbstractC0905c.y(r7, r9)
            java.lang.String r9 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            kotlin.jvm.internal.l.d(r9, r7)
            n5.B r7 = (n5.B) r7
            if (r8 == 0) goto L65
            return r7
        L65:
            n5.B r8 = r7.x0(r0)
            n5.a0 r7 = n5.AbstractC1566c.f(r7, r8)
            return r7
        L6e:
            n5.W r2 = n5.W.f13382l
            r5 = 6
            M4.a r2 = n6.d.f0(r2, r8, r3, r5)
            n5.x r1 = r6.R(r1, r2)
            if (r8 == 0) goto L8b
            if (r9 == 0) goto L80
            n5.b0 r8 = n5.b0.f13392o
            goto L82
        L80:
            n5.b0 r8 = n5.b0.f13390m
        L82:
            x4.A r7 = r7.f4713o
            r4.i r7 = r7.f17339n
            n5.B r7 = r7.i(r8, r1, r4)
            return r7
        L8b:
            x4.A r8 = r7.f4713o
            r4.i r8 = r8.f17339n
            n5.b0 r9 = n5.b0.f13390m
            n5.B r8 = r8.i(r9, r1, r4)
            x4.A r7 = r7.f4713o
            r4.i r7 = r7.f17339n
            n5.b0 r9 = n5.b0.f13392o
            n5.B r7 = r7.i(r9, r1, r4)
            n5.B r7 = r7.x0(r0)
            n5.a0 r7 = n5.AbstractC1566c.f(r8, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.l.Q(A4.i, M4.a, boolean):n5.a0");
    }

    public AbstractC1586x R(N4.d dVar, M4.a aVar) {
        boolean z7 = dVar instanceof A;
        A2.b bVar = (A2.b) this.f416l;
        if (z7) {
            Class cls = ((A) dVar).a;
            EnumC1882k enumC1882kD = kotlin.jvm.internal.l.a(cls, Void.TYPE) ? null : EnumC0834d.b(cls.getName()).d();
            return enumC1882kD != null ? ((K4.a) bVar.f110l).f4713o.f17339n.s(enumC1882kD) : ((K4.a) bVar.f110l).f4713o.f17339n.w();
        }
        boolean z8 = false;
        if (!(dVar instanceof r)) {
            if (dVar instanceof A4.i) {
                return Q((A4.i) dVar, aVar, false);
            }
            if (dVar instanceof F) {
                A4.C c2 = ((F) dVar).c();
                return c2 != null ? R(c2, aVar) : ((K4.a) bVar.f110l).f4713o.f17339n.o();
            }
            if (dVar == null) {
                return ((K4.a) bVar.f110l).f4713o.f17339n.o();
            }
            throw new UnsupportedOperationException("Unsupported type: " + dVar);
        }
        r rVar = (r) dVar;
        if (!aVar.f6550d) {
            if (aVar.a != n5.W.f13381k) {
                z8 = true;
            }
        }
        boolean zD = rVar.d();
        Type type = rVar.a;
        if (!zD && !z8) {
            B bN = n(rVar, aVar, null);
            return bN != null ? bN : p5.l.c(p5.k.f14439m, type.toString());
        }
        B bN2 = n(rVar, M4.a.a(aVar, M4.b.f6555m, false, null, null, 61), null);
        if (bN2 == null) {
            return p5.l.c(p5.k.f14439m, type.toString());
        }
        B bN3 = n(rVar, M4.a.a(aVar, M4.b.f6554l, false, null, null, 61), bN2);
        return bN3 == null ? p5.l.c(p5.k.f14439m, type.toString()) : zD ? new M4.i(bN2, bN3) : AbstractC1566c.f(bN2, bN3);
    }

    public void S(View view) {
        if (((ArrayList) this.f418n).remove(view)) {
            C0321z c0321z = (C0321z) this.f416l;
            W wF = RecyclerView.F(view);
            if (wF != null) {
                int i7 = wF.f4533o;
                RecyclerView recyclerView = c0321z.a;
                if (recyclerView.I()) {
                    wF.f4534p = i7;
                    recyclerView.A0.add(wF);
                } else {
                    Field field = AbstractC1067u.a;
                    wF.a.setImportantForAccessibility(i7);
                }
                wF.f4533o = 0;
            }
        }
    }

    public void T() {
        X.k kVar = (X.k) this.f416l;
        LinkedHashMap linkedHashMap = kVar.f9691c;
        String str = (String) this.f417m;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((kotlin.jvm.internal.m) this.f418n);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        kVar.f9691c.put(str, list);
    }

    public void U() {
        ArrayList arrayList = (ArrayList) this.f417m;
        if (arrayList.isEmpty()) {
            C0486d.U("empty stack");
            throw null;
        }
        this.f418n = arrayList.remove(arrayList.size() - 1);
    }

    @Override // c3.e
    public void a() {
        ((ConnectivityManager) this.f416l).unregisterNetworkCallback((c3.f) this.f418n);
    }

    @Override // C2.E
    public void b(B1.B b4) {
        long jD;
        long j7;
        AbstractC0015b.i((B1.H) this.f417m);
        int i7 = K.a;
        B1.H h7 = (B1.H) this.f417m;
        synchronized (h7) {
            try {
                long j8 = h7.f298c;
                jD = j8 != -9223372036854775807L ? j8 + h7.f297b : h7.d();
            } finally {
            }
        }
        B1.H h8 = (B1.H) this.f417m;
        synchronized (h8) {
            j7 = h8.f297b;
        }
        if (jD == -9223372036854775807L || j7 == -9223372036854775807L) {
            return;
        }
        C2393o c2393o = (C2393o) this.f416l;
        if (j7 != c2393o.f18117s) {
            C2392n c2392nA = c2393o.a();
            c2392nA.f18079r = j7;
            C2393o c2393o2 = new C2393o(c2392nA);
            this.f416l = c2393o2;
            ((V1.G) this.f418n).a(c2393o2);
        }
        int iA = b4.a();
        ((V1.G) this.f418n).c(b4, iA, 0);
        ((V1.G) this.f418n).b(jD, 1, iA, 0, null);
    }

    @Override // C2.E
    public void c(B1.H h7, V1.p pVar, C2.K k7) {
        this.f417m = h7;
        k7.a();
        k7.b();
        V1.G gM = pVar.m(k7.f688d, 5);
        this.f418n = gM;
        gM.a((C2393o) this.f416l);
    }

    @Override // s2.InterfaceC1976d
    public int d(long j7) {
        long[] jArr = (long[]) this.f418n;
        int iA = K.a(jArr, j7, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // s2.InterfaceC1976d
    public long e(int i7) {
        AbstractC0015b.c(i7 >= 0);
        long[] jArr = (long[]) this.f418n;
        AbstractC0015b.c(i7 < jArr.length);
        return jArr[i7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(long r22, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.l.g(long, java.util.List, boolean):void");
    }

    @Override // c3.e
    public boolean h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f416l;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.InterfaceC1976d
    public List i(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = (List) this.f416l;
            if (i7 >= list.size()) {
                break;
            }
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f417m;
            if (jArr[i8] <= j7 && j7 < jArr[i8 + 1]) {
                d dVar = (d) list.get(i7);
                A1.b bVar = dVar.a;
                if (bVar.f74e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new e(1));
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            A1.a aVarA = ((d) arrayList2.get(i9)).a.a();
            aVarA.f41e = (-1) - i9;
            aVarA.f42f = 1;
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    public void j(View view, int i7, boolean z7) {
        RecyclerView recyclerView = ((C0321z) this.f416l).a;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : z(i7);
        ((C0298b) this.f417m).v(childCount, z7);
        if (z7) {
            F(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.F(view);
    }

    public void k(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z7) {
        RecyclerView recyclerView = ((C0321z) this.f416l).a;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : z(i7);
        ((C0298b) this.f417m).v(childCount, z7);
        if (z7) {
            F(view);
        }
        W wF = RecyclerView.F(view);
        if (wF != null) {
            if (!wF.i() && !wF.n()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + wF + recyclerView.w());
            }
            wF.f4527i &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void l() {
        ((ArrayList) this.f417m).clear();
        this.f418n = (C2349D) this.f416l;
        ((C2349D) this.f416l).N();
    }

    @Override // s2.InterfaceC1976d
    public int m() {
        return ((long[]) this.f418n).length;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
    /* JADX WARN: Type inference failed for: r8v22, types: [O3.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n5.B n(A4.r r23, M4.a r24, n5.B r25) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.l.n(A4.r, M4.a, n5.B):n5.B");
    }

    public void o(V1.p pVar, C2.K k7) {
        int i7 = 0;
        while (true) {
            V1.G[] gArr = (V1.G[]) this.f417m;
            if (i7 >= gArr.length) {
                return;
            }
            k7.a();
            k7.b();
            V1.G gM = pVar.m(k7.f688d, 3);
            C2393o c2393o = (C2393o) ((List) this.f416l).get(i7);
            String str = c2393o.f18112n;
            AbstractC0015b.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c2393o.a;
            if (str2 == null) {
                k7.b();
                str2 = k7.f689e;
            }
            C2392n c2392n = new C2392n();
            c2392n.a = str2;
            c2392n.f18073l = y1.D.m("video/mp2t");
            c2392n.f18074m = y1.D.m(str);
            c2392n.f18066e = c2393o.f18103e;
            c2392n.f18065d = c2393o.f18102d;
            c2392n.f18060H = c2393o.I;
            c2392n.f18077p = c2393o.f18115q;
            A6.b.r(c2392n, gM);
            gArr[i7] = gM;
            i7++;
        }
    }

    public void p(int i7) {
        W wF;
        int iZ = z(i7);
        ((C0298b) this.f417m).x(iZ);
        RecyclerView recyclerView = ((C0321z) this.f416l).a;
        View childAt = recyclerView.getChildAt(iZ);
        if (childAt != null && (wF = RecyclerView.F(childAt)) != null) {
            if (wF.i() && !wF.n()) {
                throw new IllegalArgumentException("called detach on an already detached child " + wF + recyclerView.w());
            }
            wF.a(256);
        }
        recyclerView.detachViewFromParent(iZ);
    }

    public boolean q(N n7, boolean z7) {
        boolean z8;
        boolean z9;
        C1904b c1904b = (C1904b) this.f417m;
        if (c1904b.a((C1492m) n7.f2901c, (w0.r) this.f416l, n7, z7)) {
            Q.d dVar = c1904b.a;
            int i7 = dVar.f7829m;
            if (i7 > 0) {
                Object[] objArr = dVar.f7827k;
                int i8 = 0;
                z8 = false;
                do {
                    z8 = ((C1962g) objArr[i8]).h(n7, z7) || z8;
                    i8++;
                } while (i8 < i7);
            } else {
                z8 = false;
            }
            int i9 = dVar.f7829m;
            if (i9 > 0) {
                Object[] objArr2 = dVar.f7827k;
                int i10 = 0;
                z9 = false;
                do {
                    z9 = ((C1962g) objArr2[i10]).g(n7) || z9;
                    i10++;
                } while (i10 < i9);
            } else {
                z9 = false;
            }
            c1904b.c(n7);
            if (z9 || z8) {
                return true;
            }
        }
        return false;
    }

    public void r(Object obj) {
        ((ArrayList) this.f417m).add(this.f418n);
        this.f418n = obj;
    }

    public Object s() {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0482b.a) {
            return this.f418n;
        }
        W.e eVar = (W.e) ((AtomicReference) this.f416l).get();
        int iA = eVar.a(id);
        if (iA >= 0) {
            return eVar.f9513c[iA];
        }
        return null;
    }

    public InterfaceC0995r t() {
        return ((C1296b) this.f418n).f12204k.f12202c;
    }

    public String toString() {
        switch (this.f415k) {
            case 5:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f416l;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f417m;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f418n;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String string = sb.toString();
                kotlin.jvm.internal.l.e("sb.toString()", string);
                return string;
            case 9:
                return ((C0298b) this.f417m).toString() + ", hidden list:" + ((ArrayList) this.f418n).size();
            default:
                return super.toString();
        }
    }

    public View u(int i7) {
        return ((C0321z) this.f416l).a.getChildAt(z(i7));
    }

    public int v() {
        return ((C0321z) this.f416l).a.getChildCount() - ((ArrayList) this.f418n).size();
    }

    public Object w() {
        return this.f418n;
    }

    public long x() {
        V1.k kVar = (V1.k) this.f418n;
        if (kVar != null) {
            return kVar.f9392n;
        }
        return -1L;
    }

    public C0049e0 y() {
        C0049e0 c0049e0 = (C0049e0) this.f417m;
        if (c0049e0 != null) {
            return c0049e0;
        }
        kotlin.jvm.internal.l.l("keyboardActions");
        throw null;
    }

    public int z(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int childCount = ((C0321z) this.f416l).a.getChildCount();
        int i8 = i7;
        while (i8 < childCount) {
            C0298b c0298b = (C0298b) this.f417m;
            int iS = i7 - (i8 - c0298b.s(i8));
            if (iS == 0) {
                while (c0298b.u(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += iS;
        }
        return -1;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i7) {
        this.f415k = i7;
        this.f416l = obj;
        this.f417m = obj2;
        this.f418n = obj3;
    }

    public l(o oVar, T4.c cVar, V3.b bVar, ArrayList arrayList) {
        this.f415k = 4;
        kotlin.jvm.internal.l.f("protoSet", cVar);
        kotlin.jvm.internal.l.f("entries", bVar);
        this.f416l = oVar;
        this.f417m = cVar;
        this.f418n = bVar;
    }

    public l(P4.e eVar, C2490b c2490b) {
        this.f415k = 29;
        this.f416l = eVar;
        this.f417m = c2490b;
        this.f418n = new ConcurrentHashMap();
    }

    public l(ArrayList arrayList) {
        this.f415k = 0;
        this.f416l = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f417m = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            d dVar = (d) arrayList.get(i7);
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f417m;
            jArr[i8] = dVar.f392b;
            jArr[i8 + 1] = dVar.f393c;
        }
        long[] jArr2 = (long[]) this.f417m;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f418n = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public l(w0.r rVar) {
        this.f415k = 25;
        this.f416l = rVar;
        this.f417m = new C1904b(1);
        C1498s c1498s = new C1498s();
        c1498s.a = AbstractC1475E.a;
        c1498s.f12915b = AbstractC1491l.a;
        c1498s.f12916c = AbstractC1529a.f13115c;
        c1498s.c(AbstractC1475E.f(10));
        this.f418n = c1498s;
    }

    public l(A2.b bVar, K4.e eVar) {
        this.f415k = 12;
        kotlin.jvm.internal.l.f("c", bVar);
        kotlin.jvm.internal.l.f("typeParameterResolver", eVar);
        this.f416l = bVar;
        this.f417m = eVar;
        this.f418n = new P(new M4.e());
    }

    public l(List list) {
        this.f415k = 2;
        this.f416l = list;
        this.f417m = new V1.G[list.size()];
        this.f418n = new w(new C2.G(0, this));
    }

    public l(C0321z c0321z) {
        this.f415k = 9;
        this.f416l = c0321z;
        this.f417m = new C0298b();
        this.f418n = new ArrayList();
    }

    public l(String str) {
        this.f415k = 1;
        C2392n c2392n = new C2392n();
        c2392n.f18073l = y1.D.m("video/mp2t");
        c2392n.f18074m = y1.D.m(str);
        this.f416l = new C2393o(c2392n);
    }

    public l(View view) {
        this.f415k = 13;
        this.f416l = view;
        this.f417m = z1.c.B(O3.j.f7526l, new B.e(12, this));
        this.f418n = new y(view);
    }

    public l(InterfaceC2103i interfaceC2103i, List list, l lVar) {
        this.f415k = 26;
        kotlin.jvm.internal.l.f("classifierDescriptor", interfaceC2103i);
        kotlin.jvm.internal.l.f("arguments", list);
        this.f417m = interfaceC2103i;
        this.f416l = list;
        this.f418n = lVar;
    }

    public l(C1296b c1296b) {
        this.f415k = 22;
        this.f418n = c1296b;
        this.f416l = new y(15, this);
    }

    public l(ConnectivityManager connectivityManager, ComponentCallbacks2C0951j componentCallbacks2C0951j) {
        this.f415k = 20;
        this.f416l = connectivityManager;
        this.f417m = componentCallbacks2C0951j;
        c3.f fVar = new c3.f(this);
        this.f418n = fVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), fVar);
    }

    public l(k4.g gVar, List[] listArr, Method method) {
        this.f415k = 24;
        kotlin.jvm.internal.l.f("argumentRange", gVar);
        this.f416l = gVar;
        this.f417m = listArr;
        this.f418n = method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(X.k kVar, String str, InterfaceC0821a interfaceC0821a) {
        this.f415k = 19;
        this.f416l = kVar;
        this.f417m = str;
        this.f418n = (kotlin.jvm.internal.m) interfaceC0821a;
    }

    public l(A2.b bVar, I0 i02, C1780c c1780c, Set set) {
        this.f415k = 23;
        this.f416l = i02;
        this.f417m = bVar;
        this.f418n = c1780c;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            J(str, 0, str.length(), 1, true, new F2.G(str, 5));
        }
    }

    public l(z1.g[] gVarArr) {
        this.f415k = 6;
        J1.E e7 = new J1.E();
        z1.j jVar = new z1.j();
        jVar.f18993c = 1.0f;
        jVar.f18994d = 1.0f;
        z1.e eVar = z1.e.f18959e;
        jVar.f18995e = eVar;
        jVar.f18996f = eVar;
        jVar.f18997g = eVar;
        jVar.f18998h = eVar;
        ByteBuffer byteBuffer = z1.g.a;
        jVar.f19001k = byteBuffer;
        jVar.f19002l = byteBuffer.asShortBuffer();
        jVar.f19003m = byteBuffer;
        jVar.f18992b = -1;
        z1.g[] gVarArr2 = new z1.g[gVarArr.length + 2];
        this.f416l = gVarArr2;
        System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
        this.f417m = e7;
        this.f418n = jVar;
        gVarArr2[gVarArr.length] = e7;
        gVarArr2[gVarArr.length + 1] = jVar;
    }

    public l(H h7, l lVar) {
        this.f415k = 17;
        this.f416l = h7;
        this.f417m = lVar;
        this.f418n = h7.getValue();
    }

    public l(C2349D c2349d) {
        this.f415k = 28;
        this.f416l = c2349d;
        this.f417m = new ArrayList();
        this.f418n = c2349d;
    }

    public l(int i7) {
        int i8 = 25;
        this.f415k = i7;
        switch (i7) {
            case 11:
                M1.k kVar = M1.k.f6459k;
                this.f416l = new HashSet();
                this.f417m = kVar;
                break;
            case 14:
                this.f416l = new AtomicReference(W.f.a);
                this.f417m = new Object();
                break;
            case 15:
                this.f418n = new A.e(i8);
                break;
            case 18:
                this.f416l = new WeakHashMap();
                this.f417m = new WeakHashMap();
                this.f418n = new WeakHashMap();
                break;
            case 21:
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.l.e("randomUUID().toString()", string);
                w6.l lVar = w6.l.f17157n;
                this.f416l = I0.s(string);
                this.f417m = C0927y.f11620e;
                this.f418n = new ArrayList();
                break;
            default:
                this.f416l = new L0.b();
                L0.c cVar = new L0.c();
                cVar.a = L0.a.a;
                cVar.f6001b = L0.a.f5994b;
                cVar.f6002c = 0;
                this.f417m = cVar;
                this.f418n = new A.e(i8);
                break;
        }
    }

    public l(AudioTrack audioTrack, C0289e c0289e) {
        this.f415k = 7;
        this.f416l = audioTrack;
        this.f417m = c0289e;
        this.f418n = new AudioRouting.OnRoutingChangedListener() { // from class: J1.w
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                B2.l lVar = this.a;
                if (((w) lVar.f418n) == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                ((C0289e) lVar.f417m).b(routedDevice);
            }
        };
        audioTrack.addOnRoutingChangedListener((J1.w) this.f418n, new Handler(Looper.myLooper()));
    }

    public l(J1.A a) {
        this.f415k = 8;
        this.f418n = a;
        this.f416l = new Handler(Looper.myLooper());
        this.f417m = new z(this);
    }
}
