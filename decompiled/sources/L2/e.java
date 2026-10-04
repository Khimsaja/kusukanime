package L2;

import A4.AbstractC0011d;
import B1.AbstractC0015b;
import B1.C0020g;
import B1.G;
import B1.K;
import D6.ExecutorC0107a;
import D6.RunnableC0131z;
import H0.C0214f;
import H0.H;
import M.C0460s;
import M1.l;
import M1.m;
import N0.i;
import N0.w;
import O3.o;
import O4.g;
import P3.E;
import P3.F;
import P3.q;
import P3.r;
import P3.y;
import P3.z;
import R4.C0574e;
import R4.C0575f;
import R4.C0577h;
import R4.C0583n;
import R4.C0591w;
import R4.EnumC0573d;
import R4.J;
import R4.U;
import R4.Z;
import R4.c0;
import S5.p;
import X4.AbstractC0605b;
import X4.AbstractC0615l;
import X4.C0612i;
import X4.C0616m;
import Z5.C0630d0;
import Z5.C0642k;
import Z5.C0648q;
import Z5.O;
import Z5.X;
import Z5.p0;
import a5.C0667a;
import a5.InterfaceC0668b;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.lifecycle.EnumC0689p;
import b1.AbstractC0703b;
import b3.C0710b;
import b3.C0711c;
import b3.C0714f;
import b3.C0715g;
import b3.InterfaceC0717i;
import b3.InterfaceC0718j;
import b5.C0719a;
import b5.s;
import b5.v;
import b5.x;
import b6.InterfaceC0738m;
import d1.C0782a;
import d3.C0791c;
import d3.C0793e;
import d3.C0797i;
import d3.C0800l;
import e4.k;
import e4.n;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import g1.C0939g;
import g1.RunnableC0933a;
import g3.AbstractC0942a;
import g3.AbstractC0945d;
import g3.C0950i;
import g3.ComponentCallbacks2C0951j;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.util.GzipHeaderFlags;
import j5.AbstractC1347b;
import j5.AbstractC1368w;
import j5.C1349d;
import j5.C1366u;
import j5.InterfaceC1346a;
import j5.InterfaceC1348c;
import j5.InterfaceC1350e;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k5.C1397a;
import kotlinx.serialization.KSerializer;
import l4.AbstractC1420H;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import n5.AbstractC1566c;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.B;
import n5.C1575l;
import n5.I;
import n5.L;
import n5.M;
import n5.Q;
import n5.a0;
import o5.AbstractC1707g;
import o5.C1701a;
import o5.C1705e;
import o5.C1706f;
import o5.C1709i;
import o5.InterfaceC1702b;
import o5.InterfaceC1703c;
import o5.t;
import p.AbstractC1755i;
import q5.C1858a;
import q5.h;
import q5.j;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import u4.AbstractC2115v;
import u4.EnumC2100f;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2118y;
import v4.C2155c;
import x4.C2272S;
import x4.C2283j;
import z4.C2490b;
import z4.C2491c;

/* loaded from: classes.dex */
public final class e implements l, m, InterfaceC1350e, X.m, InterfaceC1702b, p0, InterfaceC0717i, InterfaceC0738m, InterfaceC1346a, InterfaceC1348c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6044k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6045l;

    /* renamed from: m, reason: collision with root package name */
    public Object f6046m;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.f6044k = i7;
        this.f6045l = obj;
        this.f6046m = obj2;
    }

    public static I b1(List list) {
        return list.isEmpty() ? I.f13363m : new I(list);
    }

    public static C0793e f1(C0797i c0797i, Throwable th) {
        Drawable drawable;
        if (th instanceof C0800l) {
            C0791c c0791c = c0797i.f11300z;
            drawable = c0791c.f11252l;
            C0791c c0791c2 = AbstractC0945d.a;
            if (drawable == null) {
                drawable = c0791c.f11251k;
            }
        } else {
            drawable = c0797i.f11300z.f11251k;
            C0791c c0791c3 = AbstractC0945d.a;
        }
        return new C0793e(drawable, c0797i, th);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean A(h hVar) {
        return AbstractC1707g.G(hVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean A0(h hVar) {
        return AbstractC1707g.A(hVar);
    }

    @Override // o5.InterfaceC1702b
    public boolean B(q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        return dVar instanceof g;
    }

    @Override // M1.m
    public ByteBuffer B0(int i7) {
        return ((MediaCodec) this.f6045l).getOutputBuffer(i7);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ Q C0(InterfaceC0668b interfaceC0668b) {
        return AbstractC1707g.V(interfaceC0668b);
    }

    @Override // j5.InterfaceC1348c
    public List D(AbstractC1368w abstractC1368w, C0591w c0591w) {
        kotlin.jvm.internal.l.f("container", abstractC1368w);
        Iterable iterable = (List) c0591w.k(((C1397a) this.f6045l).f12037h);
        if (iterable == null) {
            iterable = y.f7779k;
        }
        ArrayList arrayList = new ArrayList(r.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(k1((C0577h) it.next(), abstractC1368w.a));
        }
        return arrayList;
    }

    @Override // Z5.p0
    public KSerializer D0(InterfaceC1425d interfaceC1425d) {
        Object obj = ((C0648q) this.f6046m).get(n6.m.F(interfaceC1425d));
        kotlin.jvm.internal.l.e("get(...)", obj);
        X x7 = (X) obj;
        Object c0642k = x7.a.get();
        if (c0642k == null) {
            synchronized (x7) {
                c0642k = x7.a.get();
                if (c0642k == null) {
                    c0642k = new C0642k((KSerializer) ((k) this.f6045l).invoke(interfaceC1425d));
                    x7.a = new SoftReference(c0642k);
                }
            }
        }
        return ((C0642k) c0642k).a;
    }

    @Override // o5.InterfaceC1702b
    public B E(q5.d dVar) {
        B bB0;
        kotlin.jvm.internal.l.f("<this>", dVar);
        AbstractC1580q abstractC1580qG = AbstractC1707g.g(dVar);
        if (abstractC1580qG != null && (bB0 = AbstractC1707g.b0(abstractC1580qG)) != null) {
            return bB0;
        }
        B bH = AbstractC1707g.h(dVar);
        kotlin.jvm.internal.l.c(bH);
        return bH;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ C1709i E0(q5.c cVar) {
        return AbstractC1707g.a0(cVar);
    }

    @Override // X.m
    public Object F(X.b bVar, Object obj) {
        return ((n) this.f6045l).invoke(bVar, obj);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean F0(h hVar) {
        return AbstractC1707g.H(hVar);
    }

    @Override // o5.InterfaceC1702b
    public a0 G(ArrayList arrayList) {
        B b4;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (a0) q.J0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z7 = false;
        boolean z8 = false;
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            z7 = z7 || AbstractC1566c.k(a0Var);
            if (a0Var instanceof B) {
                b4 = (B) a0Var;
            } else {
                if (!(a0Var instanceof AbstractC1580q)) {
                    throw new D6.r();
                }
                kotlin.jvm.internal.l.f("<this>", a0Var);
                b4 = ((AbstractC1580q) a0Var).f13407l;
                z8 = true;
            }
            arrayList2.add(b4);
        }
        if (z7) {
            return p5.l.c(p5.k.f14432H, arrayList.toString());
        }
        t tVar = t.a;
        if (!z8) {
            return tVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(r.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC1566c.F((a0) it2.next()));
        }
        return AbstractC1566c.f(tVar.b(arrayList2), tVar.b(arrayList3));
    }

    @Override // j5.InterfaceC1348c
    public ArrayList G0(U u5, T4.g gVar) {
        kotlin.jvm.internal.l.f("proto", u5);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        Iterable iterable = (List) u5.k(((C1397a) this.f6045l).f12040k);
        if (iterable == null) {
            iterable = y.f7779k;
        }
        ArrayList arrayList = new ArrayList(r.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(k1((C0577h) it.next(), gVar));
        }
        return arrayList;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean H(h hVar) {
        return AbstractC1707g.D(hVar);
    }

    @Override // o5.InterfaceC1702b
    public M H0(q5.d dVar) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        B bH = AbstractC1707g.h(dVar);
        if (bH == null) {
            bH = O0(dVar);
        }
        return AbstractC1707g.Z(bH);
    }

    @Override // M1.m
    public void I(int i7) {
        ((MediaCodec) this.f6045l).setVideoScalingMode(i7);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ void I0(q5.e eVar) {
        AbstractC1707g.O(eVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean J(h hVar) {
        return AbstractC1707g.J(hVar);
    }

    @Override // b6.InterfaceC0738m
    public int J0(char[] cArr, int i7, int i8) throws EOFException {
        int i9;
        int iD;
        Character ch = (Character) this.f6045l;
        if (ch != null) {
            cArr[i7] = ch.charValue();
            this.f6045l = null;
            i9 = 1;
        } else {
            i9 = 0;
        }
        while (i9 < i8) {
            S5.n nVar = (S5.n) this.f6046m;
            if (nVar.z()) {
                break;
            }
            if (nVar instanceof S5.a) {
                iD = p.d((S5.a) nVar);
            } else {
                nVar.Q(1L);
                byte bE = nVar.a().e(0L);
                if ((bE & 224) == 192) {
                    nVar.Q(2L);
                } else if ((bE & 240) == 224) {
                    nVar.Q(3L);
                } else if ((bE & 248) == 240) {
                    nVar.Q(4L);
                }
                iD = p.d(nVar.a());
            }
            if (iD <= 65535) {
                cArr[i7 + i9] = (char) iD;
                i9++;
            } else {
                char c2 = (char) ((iD >>> 10) + 55232);
                char c4 = (char) ((iD & 1023) + 56320);
                cArr[i7 + i9] = c2;
                int i10 = i9 + 1;
                if (i10 < i8) {
                    cArr[i10 + i7] = c4;
                    i9 += 2;
                } else {
                    this.f6045l = Character.valueOf(c4);
                    i9 = i10;
                }
            }
        }
        if (i9 > 0) {
            return i9;
        }
        return -1;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean K(u4.Q q6, h hVar) {
        return AbstractC1707g.y(q6, hVar);
    }

    @Override // M1.m
    public void K0(int i7, long j7) {
        ((MediaCodec) this.f6045l).releaseOutputBuffer(i7, j7);
    }

    @Override // j5.InterfaceC1346a
    public Object L(AbstractC1368w abstractC1368w, J j7, AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("proto", j7);
        return null;
    }

    @Override // M1.m
    public int L0() {
        return ((MediaCodec) this.f6045l).dequeueInputBuffer(0L);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ a0 M(q5.c cVar) {
        return AbstractC1707g.R(cVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ a0 M0(q5.f fVar, q5.f fVar2) {
        return AbstractC1707g.m(this, fVar, fVar2);
    }

    @Override // o5.InterfaceC1702b
    public boolean N(q5.c cVar) {
        return cVar instanceof C0667a;
    }

    @Override // o5.InterfaceC1702b
    public void N0(q5.d dVar) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        AbstractC1707g.g(dVar);
    }

    @Override // o5.InterfaceC1702b
    public boolean O(q5.e eVar) {
        kotlin.jvm.internal.l.f("<this>", eVar);
        return AbstractC1707g.J(H0(eVar)) && !AbstractC1707g.K(eVar);
    }

    @Override // o5.InterfaceC1702b
    public B O0(q5.d dVar) {
        B bQ;
        kotlin.jvm.internal.l.f("<this>", dVar);
        AbstractC1580q abstractC1580qG = AbstractC1707g.g(dVar);
        if (abstractC1580qG != null && (bQ = AbstractC1707g.Q(abstractC1580qG)) != null) {
            return bQ;
        }
        B bH = AbstractC1707g.h(dVar);
        kotlin.jvm.internal.l.c(bH);
        return bH;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B P(q5.e eVar) {
        return AbstractC1707g.c0(eVar, false);
    }

    @Override // o5.InterfaceC1702b
    public a0 P0(q5.d dVar) {
        return AbstractC1707g.S(dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ Q Q(q5.d dVar, int i7) {
        return AbstractC1707g.p(dVar, i7);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean Q0(q5.d dVar) {
        return AbstractC1707g.I(dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B R(q5.e eVar) {
        return AbstractC1707g.c0(eVar, true);
    }

    @Override // o5.InterfaceC1702b
    public boolean R0(q5.e eVar) {
        return AbstractC1707g.G(AbstractC1707g.Z(eVar));
    }

    @Override // j5.InterfaceC1346a
    public Object S(AbstractC1368w abstractC1368w, J j7, AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("proto", j7);
        C0574e c0574e = (C0574e) android.support.v4.media.session.b.w(j7, ((C1397a) this.f6045l).f12038i);
        if (c0574e == null) {
            return null;
        }
        return ((e) this.f6046m).r1(abstractC1586x, c0574e, abstractC1368w.a);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.d S0(q5.d dVar) {
        return AbstractC1707g.d0(this, dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B T(AbstractC1586x abstractC1586x) {
        return AbstractC1707g.h(abstractC1586x);
    }

    @Override // o5.InterfaceC1702b
    public boolean T0(q5.d dVar) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        return !kotlin.jvm.internal.l.a(AbstractC1707g.Z(O0(dVar)), AbstractC1707g.Z(E(dVar)));
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ j U(Q q6) {
        return AbstractC1707g.v(q6);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ int U0(q5.d dVar) {
        return AbstractC1707g.c(dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ a0 V(Q q6) {
        return AbstractC1707g.t(this, q6);
    }

    @Override // j5.InterfaceC1348c
    public List W(AbstractC1368w abstractC1368w, AbstractC0615l abstractC0615l, int i7) {
        kotlin.jvm.internal.l.f("proto", abstractC0615l);
        AbstractC0703b.w(i7, "kind");
        boolean z7 = abstractC0615l instanceof R4.B;
        C1397a c1397a = (C1397a) this.f6045l;
        if (z7) {
            c1397a.getClass();
        } else {
            if (!(abstractC0615l instanceof J)) {
                throw new IllegalStateException(("Unknown message: " + abstractC0615l).toString());
            }
            int iB = AbstractC1755i.b(i7);
            if (iB != 1 && iB != 2 && iB != 3) {
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "PROPERTY_SETTER" : "PROPERTY_GETTER" : "PROPERTY" : "FUNCTION").toString());
            }
            c1397a.getClass();
        }
        y yVar = y.f7779k;
        ArrayList arrayList = new ArrayList(r.p(yVar, 10));
        Iterator<E> it = yVar.iterator();
        while (it.hasNext()) {
            arrayList.add(k1((C0577h) it.next(), abstractC1368w.a));
        }
        return arrayList;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.b W0(q5.c cVar) {
        return AbstractC1707g.k(cVar);
    }

    @Override // o5.InterfaceC1702b
    public int X(q5.g gVar) {
        kotlin.jvm.internal.l.f("<this>", gVar);
        if (gVar instanceof q5.e) {
            return AbstractC1707g.c((q5.d) gVar);
        }
        if (gVar instanceof C1858a) {
            return ((C1858a) gVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + kotlin.jvm.internal.y.a.b(gVar.getClass())).toString());
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ Collection X0(h hVar) {
        return AbstractC1707g.Y(hVar);
    }

    @Override // j5.InterfaceC1348c
    public List Y(AbstractC1368w abstractC1368w, AbstractC0615l abstractC0615l, int i7, int i8, c0 c0Var) {
        kotlin.jvm.internal.l.f("callableProto", abstractC0615l);
        AbstractC0703b.w(i7, "kind");
        List listD0 = c0Var != null ? d0(abstractC1368w, abstractC0615l, i7, i8, c0Var) : null;
        return listD0 == null ? y.f7779k : listD0;
    }

    @Override // j5.InterfaceC1348c
    public List Y0(AbstractC1368w abstractC1368w, AbstractC0615l abstractC0615l, int i7) {
        List list;
        kotlin.jvm.internal.l.f("proto", abstractC0615l);
        AbstractC0703b.w(i7, "kind");
        boolean z7 = abstractC0615l instanceof C0583n;
        C1397a c1397a = (C1397a) this.f6045l;
        if (z7) {
            list = (List) ((C0583n) abstractC0615l).k(c1397a.f12031b);
        } else if (abstractC0615l instanceof R4.B) {
            list = (List) ((R4.B) abstractC0615l).k(c1397a.f12033d);
        } else {
            if (!(abstractC0615l instanceof J)) {
                throw new IllegalStateException(("Unknown message: " + abstractC0615l).toString());
            }
            int iB = AbstractC1755i.b(i7);
            if (iB == 1) {
                list = (List) ((J) abstractC0615l).k(c1397a.f12034e);
            } else if (iB == 2) {
                list = (List) ((J) abstractC0615l).k(c1397a.f12035f);
            } else {
                if (iB != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((J) abstractC0615l).k(c1397a.f12036g);
            }
        }
        if (list == null) {
            list = y.f7779k;
        }
        ArrayList arrayList = new ArrayList(r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k1((C0577h) it.next(), abstractC1368w.a));
        }
        return arrayList;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean Z(h hVar) {
        return AbstractC1707g.C(hVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean Z0(h hVar) {
        return AbstractC1707g.B(hVar);
    }

    @Override // M1.m
    public void a() {
        B2.l lVar = (B2.l) this.f6046m;
        MediaCodec mediaCodec = (MediaCodec) this.f6045l;
        try {
            int i7 = K.a;
            if (i7 >= 30 && i7 < 33) {
                mediaCodec.stop();
            }
            if (i7 >= 35 && lVar != null) {
                lVar.K(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (K.a >= 35 && lVar != null) {
                lVar.K(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // M1.m
    public MediaFormat a0() {
        return ((MediaCodec) this.f6045l).getOutputFormat();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w a1(List list) {
        i iVar;
        try {
            int size = list.size();
            int i7 = 0;
            H h7 = null;
            while (i7 < size) {
                try {
                    iVar = (i) list.get(i7);
                } catch (Exception e7) {
                    e = e7;
                    h = h7;
                }
                try {
                    iVar.a((D2.e) this.f6046m);
                    i7++;
                    h7 = iVar;
                } catch (Exception e8) {
                    e = e8;
                    h = iVar;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((G) ((D2.e) this.f6046m).f1419p).n());
                    sb2.append(", composition=");
                    sb2.append(((D2.e) this.f6046m).d());
                    sb2.append(", selection=");
                    D2.e eVar = (D2.e) this.f6046m;
                    sb2.append((Object) H.g(AbstractC1420H.c(eVar.f1415l, eVar.f1416m)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    q.x0(list, sb, "\n", null, null, new A3.t(19, h, this), 60);
                    String string = sb.toString();
                    kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
                    throw new RuntimeException(string, e);
                }
            }
            D2.e eVar2 = (D2.e) this.f6046m;
            eVar2.getClass();
            C0214f c0214f = new C0214f(((G) eVar2.f1419p).toString(), null, 6);
            D2.e eVar3 = (D2.e) this.f6046m;
            long jC = AbstractC1420H.c(eVar3.f1415l, eVar3.f1416m);
            h = H.f(((w) this.f6045l).f6896b) ? null : new H(jC);
            w wVar = new w(c0214f, h != null ? h.a : AbstractC1420H.c(H.d(jC), H.e(jC)), ((D2.e) this.f6046m).d());
            this.f6045l = wVar;
            return wVar;
        } catch (Exception e9) {
            e = e9;
        }
    }

    @Override // M1.m
    public void b(int i7, int i8, int i9, long j7) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f6045l).queueInputBuffer(i7, 0, i8, j7, i9);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ u4.Q b0(h hVar, int i7) {
        return AbstractC1707g.r(hVar, i7);
    }

    @Override // M1.m
    public void c(int i7, G1.b bVar, long j7, int i8) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f6045l).queueSecureInputBuffer(i7, 0, bVar.f2605i, j7, i8);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ void c0(q5.e eVar) {
        AbstractC1707g.P(eVar);
    }

    @Override // M1.l
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public M1.d V0(B0.b bVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((M1.p) bVar.f275k).a;
        M1.d dVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                M1.d dVar2 = new M1.d(mediaCodecCreateByCodecName, (HandlerThread) ((M1.c) this.f6045l).get(), new M1.g(mediaCodecCreateByCodecName, (HandlerThread) ((M1.c) this.f6046m).get()), (B2.l) bVar.f280p);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) bVar.f278n;
                    M1.d.d(dVar2, (MediaFormat) bVar.f276l, surface, (MediaCrypto) bVar.f279o, (surface == null && ((M1.p) bVar.f275k).f6468h && K.a >= 35) ? 8 : 0);
                    return dVar2;
                } catch (Exception e7) {
                    e = e7;
                    dVar = dVar2;
                    if (dVar != null) {
                        dVar.a();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // o5.InterfaceC1702b
    public AbstractC1880i d() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // j5.InterfaceC1348c
    public List d0(AbstractC1368w abstractC1368w, AbstractC0615l abstractC0615l, int i7, int i8, c0 c0Var) {
        kotlin.jvm.internal.l.f("callableProto", abstractC0615l);
        AbstractC0703b.w(i7, "kind");
        kotlin.jvm.internal.l.f("proto", c0Var);
        Iterable iterable = (List) c0Var.k(((C1397a) this.f6045l).f12039j);
        if (iterable == null) {
            iterable = y.f7779k;
        }
        ArrayList arrayList = new ArrayList(r.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(k1((C0577h) it.next(), abstractC1368w.a));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [O3.l] */
    public C2155c d1(C0577h c0577h, T4.g gVar) {
        kotlin.jvm.internal.l.f("proto", c0577h);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        InterfaceC2099e interfaceC2099eF = AbstractC2115v.f((InterfaceC2118y) this.f6045l, AbstractC0870c.R(gVar, c0577h.f8486m), (A2.b) this.f6046m);
        Map mapR0 = z.f7780k;
        if (c0577h.f8487n.size() != 0 && !p5.l.f(interfaceC2099eF)) {
            int i7 = Z4.e.a;
            if (Z4.e.m(interfaceC2099eF, EnumC2100f.f16315o)) {
                Collection collectionY = interfaceC2099eF.y();
                kotlin.jvm.internal.l.e("getConstructors(...)", collectionY);
                C2283j c2283j = (C2283j) q.L0(collectionY);
                if (c2283j != null) {
                    List listM0 = c2283j.m0();
                    kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
                    int I = F.I(r.p(listM0, 10));
                    if (I < 16) {
                        I = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(I);
                    for (Object obj : listM0) {
                        linkedHashMap.put(((C2272S) obj).getName(), obj);
                    }
                    List<C0575f> list = c0577h.f8487n;
                    kotlin.jvm.internal.l.e("getArgumentList(...)", list);
                    ArrayList arrayList = new ArrayList();
                    for (C0575f c0575f : list) {
                        kotlin.jvm.internal.l.c(c0575f);
                        C2272S c2272s = (C2272S) linkedHashMap.get(AbstractC0870c.U(gVar, c0575f.f8457m));
                        if (c2272s != null) {
                            W4.e eVarU = AbstractC0870c.U(gVar, c0575f.f8457m);
                            AbstractC1586x type = c2272s.getType();
                            kotlin.jvm.internal.l.e("getType(...)", type);
                            C0574e c0574e = c0575f.f8458n;
                            kotlin.jvm.internal.l.e("getValue(...)", c0574e);
                            b5.g gVarR1 = r1(type, c0574e, gVar);
                            lVar = e1(gVarR1, type, c0574e) ? gVarR1 : null;
                            if (lVar == null) {
                                String str = "Unexpected argument value: actual type " + c0574e.f8435m + " != expected type " + type;
                                kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
                                lVar = new b5.j(str);
                            }
                            lVar = new O3.l(eVarU, lVar);
                        }
                        if (lVar != null) {
                            arrayList.add(lVar);
                        }
                    }
                    mapR0 = E.r0(arrayList);
                }
            }
        }
        return new C2155c(interfaceC2099eF.g(), mapR0, u4.M.f16295i);
    }

    @Override // M1.m
    public void e(Bundle bundle) {
        ((MediaCodec) this.f6045l).setParameters(bundle);
    }

    @Override // o5.InterfaceC1702b
    public boolean e0(q5.e eVar) {
        kotlin.jvm.internal.l.f("<this>", eVar);
        B bH = AbstractC1707g.h(eVar);
        return (bH != null ? AbstractC1707g.e(this, o1(bH)) : null) != null;
    }

    public boolean e1(b5.g gVar, AbstractC1586x abstractC1586x, C0574e c0574e) {
        EnumC0573d enumC0573d = c0574e.f8435m;
        int i7 = enumC0573d == null ? -1 : AbstractC1347b.a[enumC0573d.ordinal()];
        if (i7 == 10) {
            InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
            InterfaceC2099e interfaceC2099e = interfaceC2102hF instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF : null;
            if (interfaceC2099e != null) {
                W4.e eVar = AbstractC1880i.f14937e;
                if (!AbstractC1880i.b(interfaceC2099e, AbstractC1886o.f14977Q)) {
                    return false;
                }
            }
            return true;
        }
        InterfaceC2118y interfaceC2118y = (InterfaceC2118y) this.f6045l;
        if (i7 != 13) {
            return kotlin.jvm.internal.l.a(gVar.a(interfaceC2118y), abstractC1586x);
        }
        if (gVar instanceof b5.b) {
            b5.b bVar = (b5.b) gVar;
            if (((List) bVar.a).size() == c0574e.f8443u.size()) {
                AbstractC1586x abstractC1586xG = interfaceC2118y.d().g(abstractC1586x);
                if (abstractC1586xG != null) {
                    Collection collection = (Collection) bVar.a;
                    kotlin.jvm.internal.l.f("<this>", collection);
                    Iterable gVar2 = new k4.g(0, collection.size() - 1, 1);
                    if (!(gVar2 instanceof Collection) || !((Collection) gVar2).isEmpty()) {
                        k4.f it = gVar2.iterator();
                        while (it.f12677m) {
                            int iA = it.a();
                            b5.g gVar3 = (b5.g) ((List) bVar.a).get(iA);
                            C0574e c0574e2 = (C0574e) c0574e.f8443u.get(iA);
                            kotlin.jvm.internal.l.e("getArrayElement(...)", c0574e2);
                            if (!e1(gVar3, abstractC1586xG, c0574e2)) {
                            }
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
    }

    @Override // b3.InterfaceC0717i
    public void f(int i7) {
        int i8;
        if (i7 >= 40) {
            ((C0715g) this.f6046m).n(-1);
            return;
        }
        if (10 > i7 || i7 >= 20) {
            return;
        }
        C0715g c0715g = (C0715g) this.f6046m;
        synchronized (((R1.i) c0715g.f4579g)) {
            i8 = c0715g.f4575c;
        }
        c0715g.n(i8 / 2);
    }

    @Override // o5.InterfaceC1702b
    public boolean f0(q5.e eVar) {
        kotlin.jvm.internal.l.f("<this>", eVar);
        return AbstractC1707g.B(AbstractC1707g.Z(eVar));
    }

    @Override // M1.m
    public void flush() {
        ((MediaCodec) this.f6045l).flush();
    }

    @Override // b3.InterfaceC0717i
    public C0711c g(C0710b c0710b) {
        C0714f c0714f = (C0714f) ((C0715g) this.f6046m).g(c0710b);
        if (c0714f != null) {
            return new C0711c(c0714f.a, c0714f.f10940b);
        }
        return null;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.c g0(B b4) {
        return AbstractC1707g.e(this, b4);
    }

    public void g1(String str, k kVar, String str2) {
        LinkedHashMap linkedHashMap = ((O4.q) this.f6046m).a;
        O4.p pVar = new O4.p(this, str, str2);
        kVar.invoke(pVar);
        ArrayList arrayList = pVar.f7586c;
        ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((O3.l) it.next()).f7528k);
        }
        String strD = (String) pVar.f7587d.f7528k;
        String str3 = pVar.a;
        kotlin.jvm.internal.l.f("ret", strD);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append('(');
        sb.append(q.y0(arrayList2, "", null, null, P4.p.f7812k, 30));
        sb.append(')');
        if (strD.length() > 1) {
            strD = A6.b.d(';', "L", strD);
        }
        sb.append(strD);
        String string = sb.toString();
        String str4 = (String) this.f6045l;
        kotlin.jvm.internal.l.f("internalName", str4);
        kotlin.jvm.internal.l.f("jvmDescriptor", string);
        String str5 = str4 + '.' + string;
        O4.t tVar = (O4.t) pVar.f7587d.f7529l;
        ArrayList arrayList3 = new ArrayList(r.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((O4.t) ((O3.l) it2.next()).f7529l);
        }
        linkedHashMap.put(str5, new O4.n(tVar, arrayList3, pVar.f7585b));
    }

    @Override // M1.m
    public int h(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f6045l).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ C1701a h0(q5.e eVar) {
        return AbstractC1707g.X(this, eVar);
    }

    public Object h1(InterfaceC1425d interfaceC1425d, ArrayList arrayList) {
        Object objR;
        Object objR2;
        Object objPutIfAbsent;
        switch (this.f6044k) {
            case 16:
                Object obj = ((C0648q) this.f6046m).get(n6.m.F(interfaceC1425d));
                kotlin.jvm.internal.l.e("get(...)", obj);
                X x7 = (X) obj;
                Object c0630d0 = x7.a.get();
                if (c0630d0 == null) {
                    synchronized (x7) {
                        c0630d0 = x7.a.get();
                        if (c0630d0 == null) {
                            c0630d0 = new C0630d0();
                            x7.a = new SoftReference(c0630d0);
                        }
                    }
                }
                C0630d0 c0630d02 = (C0630d0) c0630d0;
                ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new O((InterfaceC1444w) it.next()));
                }
                ConcurrentHashMap concurrentHashMap = c0630d02.a;
                Object obj2 = concurrentHashMap.get(arrayList2);
                if (obj2 == null) {
                    try {
                        objR = (KSerializer) ((n) this.f6045l).invoke(interfaceC1425d, arrayList);
                    } catch (Throwable th) {
                        objR = r.r(th);
                    }
                    o oVar = new o(objR);
                    Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, oVar);
                    obj2 = objPutIfAbsent2 == null ? oVar : objPutIfAbsent2;
                }
                return ((o) obj2).f7531k;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f6046m;
                Class clsF = n6.m.F(interfaceC1425d);
                Object c0630d03 = concurrentHashMap2.get(clsF);
                if (c0630d03 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(clsF, (c0630d03 = new C0630d0()))) != null) {
                    c0630d03 = objPutIfAbsent;
                }
                C0630d0 c0630d04 = (C0630d0) c0630d03;
                ArrayList arrayList3 = new ArrayList(r.p(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new O((InterfaceC1444w) it2.next()));
                }
                ConcurrentHashMap concurrentHashMap3 = c0630d04.a;
                Object obj3 = concurrentHashMap3.get(arrayList3);
                if (obj3 == null) {
                    try {
                        objR2 = (KSerializer) ((n) this.f6045l).invoke(interfaceC1425d, arrayList);
                    } catch (Throwable th2) {
                        objR2 = r.r(th2);
                    }
                    o oVar2 = new o(objR2);
                    Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, oVar2);
                    obj3 = objPutIfAbsent3 == null ? oVar2 : objPutIfAbsent3;
                }
                return ((o) obj3).f7531k;
        }
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B i(AbstractC1580q abstractC1580q) {
        return AbstractC1707g.b0(abstractC1580q);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean i0(q5.e eVar, q5.e eVar2) {
        return AbstractC1707g.z(eVar, eVar2);
    }

    public V1.n i1(Object... objArr) {
        Constructor constructorG;
        synchronized (((AtomicBoolean) this.f6046m)) {
            if (!((AtomicBoolean) this.f6046m).get()) {
                try {
                    constructorG = ((I1.e) this.f6045l).g();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f6046m).set(true);
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
            constructorG = null;
        }
        if (constructorG == null) {
            return null;
        }
        try {
            return (V1.n) constructorG.newInstance(objArr);
        } catch (Exception e8) {
            throw new IllegalStateException("Unexpected error creating extractor", e8);
        }
    }

    @Override // b3.InterfaceC0717i
    public void j(C0710b c0710b, Bitmap bitmap, Map map) {
        int i7;
        Object objRemove;
        int iV = AbstractC0871d.V(bitmap);
        C0715g c0715g = (C0715g) this.f6046m;
        synchronized (((R1.i) c0715g.f4579g)) {
            i7 = c0715g.f4574b;
        }
        if (iV <= i7) {
            ((C0715g) this.f6046m).k(c0710b, new C0714f(bitmap, map, iV));
            return;
        }
        C0715g c0715g2 = (C0715g) this.f6046m;
        c0715g2.getClass();
        synchronized (((R1.i) c0715g2.f4579g)) {
            O4.q qVar = (O4.q) c0715g2.f4578f;
            qVar.getClass();
            objRemove = qVar.a.remove(c0710b);
            if (objRemove != null) {
                c0715g2.f4575c -= c0715g2.l(c0710b, objRemove);
            }
        }
        if (objRemove != null) {
            c0715g2.c(c0710b, objRemove, null);
        }
        ((InterfaceC0718j) this.f6045l).j(c0710b, bitmap, map, iV);
    }

    @Override // j5.InterfaceC1348c
    public ArrayList j0(Z z7, T4.g gVar) {
        kotlin.jvm.internal.l.f("proto", z7);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        Iterable iterable = (List) z7.k(((C1397a) this.f6045l).f12041l);
        if (iterable == null) {
            iterable = y.f7779k;
        }
        ArrayList arrayList = new ArrayList(r.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(k1((C0577h) it.next(), gVar));
        }
        return arrayList;
    }

    public int j1(String str) {
        int iIntValue;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f6045l;
        kotlin.jvm.internal.l.f("<this>", concurrentHashMap);
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    int andIncrement = ((AtomicInteger) this.f6046m).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                    iIntValue = andIncrement;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean k(q5.c cVar) {
        return AbstractC1707g.M(cVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean k0(q5.e eVar) {
        return AbstractC1707g.E(eVar);
    }

    public C2155c k1(C0577h c0577h, T4.g gVar) {
        kotlin.jvm.internal.l.f("proto", c0577h);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        return ((e) this.f6046m).d1(c0577h, gVar);
    }

    @Override // o5.InterfaceC1702b
    public boolean l(h hVar, h hVar2) {
        kotlin.jvm.internal.l.f("c1", hVar);
        kotlin.jvm.internal.l.f("c2", hVar2);
        if (!(hVar instanceof M)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(hVar2 instanceof M)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (AbstractC1707g.b(hVar, hVar2)) {
            return true;
        }
        M m7 = (M) hVar;
        M m8 = (M) hVar2;
        if (((InterfaceC1703c) this.f6046m).a(m7, m8)) {
            return true;
        }
        HashMap map = (HashMap) this.f6045l;
        if (map == null) {
            return false;
        }
        M m9 = (M) map.get(m7);
        M m10 = (M) map.get(m8);
        if (m9 == null || !m9.equals(m8)) {
            return m10 != null && m10.equals(m7);
        }
        return true;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ j l0(u4.Q q6) {
        return AbstractC1707g.w(q6);
    }

    public L l1() {
        return new L(true, true, this, C1705e.a, C1706f.a);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B m(AbstractC1580q abstractC1580q) {
        return AbstractC1707g.Q(abstractC1580q);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B m0(AbstractC1580q abstractC1580q) {
        return AbstractC1707g.Q(abstractC1580q);
    }

    public void m1(C0939g c0939g) {
        int i7 = c0939g.f11682b;
        ExecutorC0107a executorC0107a = (ExecutorC0107a) this.f6046m;
        R1.i iVar = (R1.i) this.f6045l;
        if (i7 != 0) {
            executorC0107a.execute(new RunnableC0933a(iVar, i7));
        } else {
            executorC0107a.execute(new RunnableC0131z(2, iVar, c0939g.a));
        }
    }

    @Override // M1.m
    public void n(T1.h hVar, Handler handler) {
        ((MediaCodec) this.f6045l).setOnFrameRenderedListener(new M1.b(this, hVar, 1), handler);
    }

    @Override // M1.m
    public void n0() {
        ((MediaCodec) this.f6045l).detachOutputSurface();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d3.C0801m n1(d3.C0797i r18, e3.h r19) {
        /*
            r17 = this;
            r0 = r18
            r4 = r19
            P3.y r1 = r0.f11280f
            r1.getClass()
            android.graphics.Bitmap$Config r1 = r0.f11278d
            boolean r2 = f1.AbstractC0871d.h0(r1)
            if (r2 != 0) goto L14
            r2 = r17
            goto L31
        L14:
            boolean r2 = f1.AbstractC0871d.h0(r1)
            if (r2 != 0) goto L1d
        L1a:
            r2 = r17
            goto L24
        L1d:
            boolean r2 = r0.f11285k
            if (r2 != 0) goto L1a
            r2 = r17
            goto L2f
        L24:
            java.lang.Object r3 = r2.f6046m
            g3.g r3 = (g3.InterfaceC0948g) r3
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L31:
            e3.c r3 = r4.a
            e3.b r5 = e3.C0820b.a
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L48
            e3.c r3 = r4.f11356b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L44
            goto L48
        L44:
            e3.g r3 = r0.f11297w
        L46:
            r5 = r3
            goto L4b
        L48:
            e3.g r3 = e3.g.f11353l
            goto L46
        L4b:
            boolean r3 = r0.f11286l
            if (r3 == 0) goto L5b
            P3.y r3 = r0.f11280f
            r3.getClass()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r1 == r3) goto L5b
            r3 = 1
        L59:
            r7 = r3
            goto L5d
        L5b:
            r3 = 0
            goto L59
        L5d:
            d3.m r3 = new d3.m
            boolean r6 = g3.AbstractC0945d.a(r0)
            d3.p r11 = r0.f11283i
            d3.n r12 = r0.f11298x
            d3.b r14 = r0.f11289o
            d3.b r15 = r0.f11290p
            r2 = r1
            android.content.Context r1 = r0.a
            r8 = r3
            r3 = 0
            r9 = r8
            boolean r8 = r0.f11287m
            r10 = r9
            r9 = 0
            r13 = r10
            f6.r r10 = r0.f11282h
            d3.b r0 = r0.f11288n
            r16 = r13
            r13 = r0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r13 = r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.e.n1(d3.i, e3.h):d3.m");
    }

    @Override // M1.m
    public void o(int i7) {
        ((MediaCodec) this.f6045l).releaseOutputBuffer(i7, false);
    }

    @Override // M1.m
    public ByteBuffer o0(int i7) {
        return ((MediaCodec) this.f6045l).getInputBuffer(i7);
    }

    public q5.f o1(q5.e eVar) {
        B b4;
        C1575l c1575lF = AbstractC1707g.f(eVar);
        return (c1575lF == null || (b4 = c1575lF.f13402l) == null) ? (q5.f) eVar : b4;
    }

    @Override // j5.InterfaceC1348c
    public List p(AbstractC1368w abstractC1368w, J j7) {
        kotlin.jvm.internal.l.f("proto", j7);
        ((C1397a) this.f6045l).getClass();
        y yVar = y.f7779k;
        ArrayList arrayList = new ArrayList(r.p(yVar, 10));
        Iterator<E> it = yVar.iterator();
        while (it.hasNext()) {
            arrayList.add(k1((C0577h) it.next(), abstractC1368w.a));
        }
        return arrayList;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ AbstractC1580q p0(q5.d dVar) {
        return AbstractC1707g.g(dVar);
    }

    public void p1(Bundle bundle) {
        M2.a aVar = (M2.a) this.f6045l;
        if (!aVar.a) {
            aVar.d();
        }
        f fVar = (f) aVar.f6543d;
        if (fVar.f().b().compareTo(EnumC0689p.f10739n) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + fVar.f().b()).toString());
        }
        if (aVar.f6541b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleC = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleC = r.C("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        aVar.f6547h = bundleC;
        aVar.f6541b = true;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.g q(q5.e eVar) {
        return AbstractC1707g.d(eVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ Collection q0(q5.e eVar) {
        return AbstractC1707g.U(this, eVar);
    }

    public void q1(Bundle bundle) {
        M2.a aVar = (M2.a) this.f6045l;
        Bundle bundleH = AbstractC0870c.H((O3.l[]) Arrays.copyOf(new O3.l[0], 0));
        Bundle bundle2 = (Bundle) aVar.f6547h;
        if (bundle2 != null) {
            bundleH.putAll(bundle2);
        }
        synchronized (((A.e) aVar.f6545f)) {
            for (Map.Entry entry : ((LinkedHashMap) aVar.f6546g).entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((d) entry.getValue()).a();
                kotlin.jvm.internal.l.f("key", str);
                bundleH.putBundle(str, bundleA);
            }
        }
        if (bundleH.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleH);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean r(Q q6) {
        return AbstractC1707g.N(q6);
    }

    @Override // M1.m
    public void r0(Surface surface) {
        ((MediaCodec) this.f6045l).setOutputSurface(surface);
    }

    public b5.g r1(AbstractC1586x abstractC1586x, C0574e c0574e, T4.g gVar) {
        kotlin.jvm.internal.l.f("value", c0574e);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        boolean zBooleanValue = T4.e.f9081P.c(c0574e.f8445w).booleanValue();
        EnumC0573d enumC0573d = c0574e.f8435m;
        switch (enumC0573d == null ? -1 : AbstractC1347b.a[enumC0573d.ordinal()]) {
            case 1:
                byte b4 = (byte) c0574e.f8436n;
                return zBooleanValue ? new b5.y(b4) : new b5.d(b4);
            case 2:
                return new b5.e(Character.valueOf((char) c0574e.f8436n));
            case 3:
                short s7 = (short) c0574e.f8436n;
                return zBooleanValue ? new b5.y(s7) : new v(s7);
            case GzipHeaderFlags.EXTRA /* 4 */:
                int i7 = (int) c0574e.f8436n;
                return zBooleanValue ? new b5.y(i7) : new b5.k(i7);
            case 5:
                long j7 = c0574e.f8436n;
                return zBooleanValue ? new b5.y(j7) : new b5.t(j7);
            case 6:
                return new b5.c(c0574e.f8437o);
            case 7:
                return new b5.c(c0574e.f8438p);
            case 8:
                return new b5.c(Boolean.valueOf(c0574e.f8436n != 0));
            case 9:
                return new b5.w(gVar.a(c0574e.f8439q));
            case 10:
                return new s(AbstractC0870c.R(gVar, c0574e.f8440r), c0574e.f8444v);
            case 11:
                return new b5.i(AbstractC0870c.R(gVar, c0574e.f8440r), AbstractC0870c.U(gVar, c0574e.f8441s));
            case 12:
                C0577h c0577h = c0574e.f8442t;
                kotlin.jvm.internal.l.e("getAnnotation(...)", c0577h);
                return new C0719a((Object) d1(c0577h, gVar));
            case 13:
                List<C0574e> list = c0574e.f8443u;
                kotlin.jvm.internal.l.e("getArrayElementList(...)", list);
                ArrayList arrayList = new ArrayList(r.p(list, 10));
                for (C0574e c0574e2 : list) {
                    B bE = ((InterfaceC2118y) this.f6045l).d().e();
                    kotlin.jvm.internal.l.c(c0574e2);
                    arrayList.add(r1(bE, c0574e2, gVar));
                }
                return new x(arrayList, abstractC1586x);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + c0574e.f8435m + " (expected " + abstractC1586x + ')').toString());
        }
    }

    @Override // j5.InterfaceC1350e
    public C1349d s0(W4.b bVar) {
        kotlin.jvm.internal.l.f("classId", bVar);
        P4.e eVar = (P4.e) this.f6046m;
        eVar.c().f12415c.getClass();
        C2491c c2491cQ = z1.c.q((C2490b) this.f6045l, bVar, T4.f.f9107g);
        if (c2491cQ == null) {
            return null;
        }
        AbstractC0011d.a(c2491cQ.a).equals(bVar);
        return eVar.g(c2491cQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d3.C0801m s1(d3.C0801m r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f11301b
            d3.b r3 = r0.f11314o
            boolean r4 = f1.AbstractC0871d.h0(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.f6046m
            g3.g r4 = (g3.InterfaceC0948g) r4
            boolean r4 = r4.b()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r5
        L1d:
            r8 = r2
            goto L21
        L1f:
            r4 = 0
            goto L1d
        L21:
            d3.b r2 = r0.f11314o
            boolean r2 = r2.f11240k
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.f6045l
            g3.j r2 = (g3.ComponentCallbacks2C0951j) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L39
            boolean r6 = r2.f11720o     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            if (r6 != 0) goto L3c
            d3.b r3 = d3.EnumC0790b.f11238n
        L36:
            r21 = r3
            goto L3e
        L39:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r0
        L3c:
            r5 = r4
            goto L36
        L3e:
            if (r5 == 0) goto L6a
            android.content.Context r7 = r0.a
            android.graphics.ColorSpace r9 = r0.f11302c
            e3.h r10 = r0.f11303d
            e3.g r11 = r0.f11304e
            boolean r12 = r0.f11305f
            boolean r13 = r0.f11306g
            boolean r14 = r0.f11307h
            java.lang.String r15 = r0.f11308i
            f6.r r2 = r0.f11309j
            d3.p r3 = r0.f11310k
            d3.n r4 = r0.f11311l
            d3.b r5 = r0.f11312m
            d3.b r0 = r0.f11313n
            d3.m r6 = new d3.m
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.e.s1(d3.m):d3.m");
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ int t(h hVar) {
        return AbstractC1707g.T(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o5.InterfaceC1702b
    public Q t0(q5.g gVar, int i7) {
        kotlin.jvm.internal.l.f("<this>", gVar);
        if (gVar instanceof q5.f) {
            return AbstractC1707g.p((q5.d) gVar, i7);
        }
        if (gVar instanceof C1858a) {
            E e7 = ((C1858a) gVar).get(i7);
            kotlin.jvm.internal.l.e("get(...)", e7);
            return (Q) e7;
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + kotlin.jvm.internal.y.a.b(gVar.getClass())).toString());
    }

    public A2.b t1(W4.e eVar, String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        String strB = eVar.b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        return new A2.b(this, new P4.o(strB.concat(str)));
    }

    public String toString() {
        switch (this.f6044k) {
            case 25:
                return "Bounds{lower=" + ((C0782a) this.f6045l) + " upper=" + ((C0782a) this.f6046m) + "}";
            default:
                return super.toString();
        }
    }

    @Override // j5.InterfaceC1348c
    public List u(AbstractC1368w abstractC1368w, J j7) {
        kotlin.jvm.internal.l.f("proto", j7);
        ((C1397a) this.f6045l).getClass();
        y yVar = y.f7779k;
        ArrayList arrayList = new ArrayList(r.p(yVar, 10));
        Iterator<E> it = yVar.iterator();
        while (it.hasNext()) {
            arrayList.add(k1((C0577h) it.next(), abstractC1368w.a));
        }
        return arrayList;
    }

    @Override // o5.InterfaceC1702b
    public boolean u0(a0 a0Var) {
        kotlin.jvm.internal.l.f("<this>", a0Var);
        return AbstractC1707g.I(O0(a0Var)) != AbstractC1707g.I(E(a0Var));
    }

    public void u1(int i7, G g4) throws IOException {
        while (true) {
            Map.Entry entry = (Map.Entry) this.f6046m;
            if (entry == null || ((C0616m) entry.getKey()).f9900k >= i7) {
                return;
            }
            C0616m c0616m = (C0616m) ((Map.Entry) this.f6046m).getKey();
            Object value = ((Map.Entry) this.f6046m).getValue();
            C0612i c0612i = C0612i.f9894c;
            X4.Q q6 = c0616m.f9901l;
            boolean z7 = c0616m.f9902m;
            int i8 = c0616m.f9900k;
            if (z7) {
                for (Object obj : (List) value) {
                    if (q6 == X4.Q.f9859o) {
                        g4.M(i8, 3);
                        ((AbstractC0605b) obj).f(g4);
                        g4.M(i8, 4);
                    } else {
                        g4.M(i8, q6.f9864l);
                        C0612i.k(g4, q6, obj);
                    }
                }
            } else if (q6 == X4.Q.f9859o) {
                g4.M(i8, 3);
                ((AbstractC0605b) value).f(g4);
                g4.M(i8, 4);
            } else {
                g4.M(i8, q6.f9864l);
                C0612i.k(g4, q6, value);
            }
            Iterator it = (Iterator) this.f6045l;
            if (it.hasNext()) {
                this.f6046m = (Map.Entry) it.next();
            } else {
                this.f6046m = null;
            }
        }
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B v(q5.d dVar) {
        return AbstractC1707g.h(dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B v0(AbstractC1580q abstractC1580q) {
        return AbstractC1707g.b0(abstractC1580q);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B w(q5.e eVar) {
        q5.b bVar = q5.b.f14745k;
        return AbstractC1707g.j(eVar);
    }

    @Override // o5.InterfaceC1702b
    public boolean w0(q5.d dVar) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        B bH = AbstractC1707g.h(dVar);
        return (bH != null ? AbstractC1707g.f(bH) : null) != null;
    }

    @Override // o5.InterfaceC1702b
    public boolean x(q5.e eVar) {
        kotlin.jvm.internal.l.f("<this>", eVar);
        return AbstractC1707g.f(eVar) != null;
    }

    @Override // j5.InterfaceC1348c
    public ArrayList x0(C1366u c1366u) {
        kotlin.jvm.internal.l.f("container", c1366u);
        Iterable iterable = (List) c1366u.f12472d.k(((C1397a) this.f6045l).f12032c);
        if (iterable == null) {
            iterable = y.f7779k;
        }
        ArrayList arrayList = new ArrayList(r.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(k1((C0577h) it.next(), c1366u.a));
        }
        return arrayList;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ M y(q5.e eVar) {
        return AbstractC1707g.Z(eVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ n5.G y0(q5.d dVar) {
        return AbstractC1707g.i(dVar);
    }

    @Override // o5.InterfaceC1702b
    public q5.c z(q5.e eVar) {
        return AbstractC1707g.e(this, o1(eVar));
    }

    @Override // o5.InterfaceC1702b
    public Q z0(q5.e eVar, int i7) {
        if (i7 < 0 || i7 >= AbstractC1707g.c(eVar)) {
            return null;
        }
        return AbstractC1707g.p(eVar, i7);
    }

    public /* synthetic */ e(int i7, boolean z7) {
        this.f6044k = i7;
    }

    public e(InterfaceC2118y interfaceC2118y, A2.b bVar, C1397a c1397a) {
        this.f6044k = 26;
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        kotlin.jvm.internal.l.f("protocol", c1397a);
        this.f6045l = c1397a;
        this.f6046m = new e(interfaceC2118y, bVar);
    }

    public e(HashMap map, InterfaceC1703c interfaceC1703c) {
        this.f6044k = 14;
        kotlin.jvm.internal.l.f("equalityAxioms", interfaceC1703c);
        this.f6045l = map;
        this.f6046m = interfaceC1703c;
    }

    public e(S2.m mVar, ComponentCallbacks2C0951j componentCallbacks2C0951j) {
        Object c0020g;
        int i7 = 5;
        this.f6044k = 19;
        boolean z7 = false;
        this.f6045l = componentCallbacks2C0951j;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 26) {
            boolean z8 = AbstractC0942a.a;
        } else {
            if (!AbstractC0942a.a) {
                if (i8 != 26 && i8 != 27) {
                    c0020g = new C0020g(true, i7);
                } else {
                    c0020g = new C0950i();
                }
            }
            this.f6046m = c0020g;
        }
        c0020g = new C0020g(z7, i7);
        this.f6046m = c0020g;
    }

    public e(M2.a aVar) {
        this.f6044k = 0;
        this.f6045l = aVar;
        this.f6046m = new F.w(29, aVar);
    }

    public e(Object obj) {
        this.f6044k = 28;
        this.f6045l = obj;
        this.f6046m = Thread.currentThread();
    }

    public e(InterfaceC2118y interfaceC2118y, A2.b bVar) {
        this.f6044k = 27;
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        kotlin.jvm.internal.l.f("notFoundClasses", bVar);
        this.f6045l = interfaceC2118y;
        this.f6046m = bVar;
    }

    public e(S5.n nVar) {
        this.f6044k = 20;
        kotlin.jvm.internal.l.f("source", nVar);
        this.f6046m = nVar;
    }

    public e(k kVar) {
        this.f6044k = 15;
        this.f6045l = kVar;
        this.f6046m = new C0648q();
    }

    public e(int i7, InterfaceC0718j interfaceC0718j) {
        this.f6044k = 18;
        this.f6045l = interfaceC0718j;
        this.f6046m = new C0715g(i7, this);
    }

    public e(MediaCodec mediaCodec, B2.l lVar) {
        this.f6044k = 4;
        this.f6045l = mediaCodec;
        this.f6046m = lVar;
        if (K.a < 35 || lVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) lVar.f418n;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC0015b.h(((HashSet) lVar.f416l).add(mediaCodec));
        }
    }

    public e(B0.b bVar, HashMap map, HashMap map2) {
        this.f6044k = 7;
        this.f6045l = bVar;
        this.f6046m = map;
    }

    public e(n nVar, int i7) {
        this.f6044k = i7;
        switch (i7) {
            case 17:
                this.f6045l = nVar;
                this.f6046m = new ConcurrentHashMap();
                break;
            default:
                this.f6045l = nVar;
                this.f6046m = new C0648q();
                break;
        }
    }

    public e(int i7) {
        this.f6044k = i7;
        switch (i7) {
            case 23:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f6045l = byteArrayOutputStream;
                this.f6046m = new DataOutputStream(byteArrayOutputStream);
                break;
            case 29:
                this.f6045l = new ConcurrentHashMap();
                this.f6046m = new AtomicInteger(0);
                break;
            default:
                this.f6045l = new A.e(25);
                this.f6046m = new L0.b();
                break;
        }
    }

    public e(C0460s c0460s) {
        this.f6044k = 1;
        this.f6046m = c0460s;
        this.f6045l = new M.r(c0460s);
    }

    @Override // o5.InterfaceC1702b
    public void C(q5.e eVar, h hVar) {
    }

    public e(T1.c cVar) {
        this.f6044k = 9;
        this.f6046m = cVar;
    }

    public e(AbstractC0615l abstractC0615l) {
        this.f6044k = 13;
        C0612i c0612i = abstractC0615l.f9899k;
        c0612i.getClass();
        Iterator it = ((X4.I) c0612i.a.entrySet()).iterator();
        this.f6045l = it;
        if (it.hasNext()) {
            this.f6046m = (Map.Entry) it.next();
        }
    }

    public e(O4.q qVar, String str) {
        this.f6044k = 6;
        kotlin.jvm.internal.l.f("className", str);
        this.f6046m = qVar;
        this.f6045l = str;
    }

    public e(I1.e eVar) {
        this.f6044k = 10;
        this.f6045l = eVar;
        this.f6046m = new AtomicBoolean(false);
    }
}
