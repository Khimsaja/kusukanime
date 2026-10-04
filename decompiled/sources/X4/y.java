package X4;

import B1.AbstractC0015b;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import b1.AbstractC0703b;
import b3.C0710b;
import b3.C0711c;
import b3.InterfaceC0717i;
import b3.InterfaceC0718j;
import b6.C0735j;
import b6.InterfaceC0738m;
import d3.C0797i;
import d3.C0801m;
import d3.C0803o;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import g3.AbstractC0946e;
import h0.InterfaceC0995r;
import i1.C1055h;
import i1.C1057j;
import i1.T;
import i1.U;
import i1.V;
import io.ktor.client.utils.CIOKt;
import io.ktor.http.ContentType;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.GzipHeaderFlags;
import j1.C1303d;
import j1.C1304e;
import j1.C1305f;
import j5.C1349d;
import j5.InterfaceC1350e;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import k5.C1399c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m5.InterfaceC1525n;
import n5.AbstractC1586x;
import o.AbstractC1601M;
import o.C1597I;
import o4.AbstractC1654H;
import o4.C1656J;
import o4.C1658L;
import o4.C1660N;
import o4.C1662P;
import o4.C1664S;
import o4.C1675d0;
import o4.C1681g0;
import o4.j0;
import o4.s0;
import p.AbstractC1766r;
import p.C1717D;
import p.F0;
import p.InterfaceC1716C;
import p.InterfaceC1767s;
import r4.AbstractC1880i;
import u4.AbstractC2115v;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2088D;
import u4.InterfaceC2091G;
import u4.InterfaceC2094J;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import x4.AbstractC2261G;
import x4.AbstractC2299z;
import x4.C2263I;
import x4.C2283j;
import y1.C2384f;
import z5.C2496a;

/* loaded from: classes.dex */
public class y implements InterfaceC0717i, InterfaceC0738m, b6.o, InterfaceC1350e, InterfaceC1525n, InterfaceC1767s, F0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9915k;

    /* renamed from: l, reason: collision with root package name */
    public Object f9916l;

    public /* synthetic */ y(int i7, Object obj) {
        this.f9915k = i7;
        this.f9916l = obj;
    }

    public static C0803o B(Y2.j jVar, C0797i c0797i, C0710b c0710b, C0711c c0711c) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c0797i.a.getResources(), c0711c.a);
        U2.e eVar = U2.e.f9204k;
        Map map = c0711c.f10938b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z7 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config config = AbstractC0946e.a;
        if (jVar != null && jVar.f10132g) {
            z7 = true;
        }
        return new C0803o(bitmapDrawable, c0797i, eVar, c0710b, str, zBooleanValue, z7);
    }

    public C0710b A(C0797i c0797i, Object obj, C0801m c0801m, S2.c cVar) {
        String strA;
        Map linkedHashMap;
        c0797i.getClass();
        List list = ((S2.m) this.f9916l).f8762g.f8729c;
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                strA = null;
                break;
            }
            O3.l lVar = (O3.l) list.get(i7);
            Z2.b bVar = (Z2.b) lVar.f7528k;
            if (((Class) lVar.f7529l).isAssignableFrom(obj.getClass())) {
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>", bVar);
                strA = bVar.a(obj, c0801m);
                if (strA != null) {
                    break;
                }
            }
            i7++;
        }
        if (strA == null) {
            return null;
        }
        Map map = c0797i.f11298x.f11316k;
        boolean zIsEmpty = map.isEmpty();
        P3.z zVar = P3.z.f7780k;
        if (zIsEmpty) {
            linkedHashMap = zVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        c0797i.f11280f.getClass();
        return linkedHashMap.isEmpty() ? new C0710b(zVar, strA) : new C0710b(P3.E.t0(linkedHashMap), strA);
    }

    public boolean C(int i7, int i8, Bundle bundle) {
        return false;
    }

    public InterfaceC2099e D(A4.p pVar) {
        kotlin.jvm.internal.l.f("javaClass", pVar);
        W4.c cVarC = pVar.c();
        if (cVarC != null) {
            N4.f[] fVarArr = N4.f.f6929k;
        }
        Class<?> declaringClass = pVar.a.getDeclaringClass();
        A4.p pVar2 = declaringClass != null ? new A4.p(declaringClass) : null;
        if (pVar2 != null) {
            InterfaceC2099e interfaceC2099eD = D(pVar2);
            g5.o oVarY = interfaceC2099eD != null ? interfaceC2099eD.Y() : null;
            InterfaceC2102h interfaceC2102hB = oVarY != null ? oVarY.b(pVar.e(), C4.c.f966r) : null;
            if (interfaceC2102hB instanceof InterfaceC2099e) {
                return (InterfaceC2099e) interfaceC2102hB;
            }
        } else if (cVarC != null) {
            L4.q qVar = (L4.q) P3.q.t0(P3.r.H(((K4.d) this.f9916l).c(cVarC.b())));
            if (qVar != null) {
                L4.v vVar = qVar.f6126t.f6063d;
                vVar.getClass();
                return vVar.v(pVar.e(), pVar);
            }
        }
        return null;
    }

    public void E(float f5, float f7, long j7) {
        InterfaceC0995r interfaceC0995rT = ((B2.l) this.f9916l).t();
        interfaceC0995rT.f(g0.c.d(j7), g0.c.e(j7));
        interfaceC0995rT.a(f5, f7);
        interfaceC0995rT.f(-g0.c.d(j7), -g0.c.e(j7));
    }

    public void F(int i7, long j7, long j8) throws y1.E {
        n2.d dVar = (n2.d) this.f9916l;
        AbstractC0015b.i(dVar.f13321e0);
        if (i7 == 160) {
            dVar.f13306T = false;
            dVar.f13307U = 0L;
            return;
        }
        if (i7 != 174) {
            if (i7 == 187) {
                dVar.f13296H = false;
                return;
            }
            if (i7 == 19899) {
                dVar.f13342z = -1;
                dVar.f13289A = -1L;
                return;
            }
            if (i7 == 20533) {
                dVar.g(i7);
                dVar.f13340x.f13265i = true;
                return;
            }
            if (i7 == 21968) {
                dVar.g(i7);
                dVar.f13340x.f13282z = true;
                return;
            }
            if (i7 == 408125543) {
                long j9 = dVar.f13335s;
                if (j9 != -1 && j9 != j7) {
                    throw y1.E.a(null, "Multiple Segment elements not supported");
                }
                dVar.f13335s = j7;
                dVar.f13334r = j8;
                return;
            }
            if (i7 == 475249515) {
                dVar.f13294F = new B1.r();
                dVar.f13295G = new B1.r();
                return;
            } else {
                if (i7 == 524531317 && !dVar.f13341y) {
                    if (dVar.f13318d && dVar.f13291C != -1) {
                        dVar.f13290B = true;
                        return;
                    } else {
                        dVar.f13321e0.k(new V1.s(dVar.f13338v));
                        dVar.f13341y = true;
                        return;
                    }
                }
                return;
            }
        }
        n2.c cVar = new n2.c();
        cVar.f13270n = -1;
        cVar.f13271o = -1;
        cVar.f13272p = -1;
        cVar.f13273q = -1;
        cVar.f13274r = -1;
        cVar.f13275s = 0;
        cVar.f13276t = -1;
        cVar.f13277u = 0.0f;
        cVar.f13278v = 0.0f;
        cVar.f13279w = 0.0f;
        cVar.f13280x = null;
        cVar.f13281y = -1;
        cVar.f13282z = false;
        cVar.f13233A = -1;
        cVar.f13234B = -1;
        cVar.f13235C = -1;
        cVar.f13236D = CIOKt.DEFAULT_HTTP_POOL_SIZE;
        cVar.f13237E = 200;
        cVar.f13238F = -1.0f;
        cVar.f13239G = -1.0f;
        cVar.f13240H = -1.0f;
        cVar.I = -1.0f;
        cVar.J = -1.0f;
        cVar.f13241K = -1.0f;
        cVar.f13242L = -1.0f;
        cVar.f13243M = -1.0f;
        cVar.f13244N = -1.0f;
        cVar.f13245O = -1.0f;
        cVar.f13247Q = 1;
        cVar.f13248R = -1;
        cVar.f13249S = 8000;
        cVar.f13250T = 0L;
        cVar.f13251U = 0L;
        cVar.f13254X = true;
        cVar.f13255Y = "eng";
        dVar.f13340x = cVar;
        cVar.a = dVar.f13339w;
    }

    public void G(float f5, float f7) {
        ((B2.l) this.f9916l).t().f(f5, f7);
    }

    public Object H(AbstractC2299z abstractC2299z, Object obj) throws IOException {
        C2283j c2283jB0;
        String str;
        switch (this.f9915k) {
            case 1:
                StringBuilder sb = (StringBuilder) obj;
                Y4.h hVar = (Y4.h) this.f9916l;
                hVar.getClass();
                boolean z7 = abstractC2299z.c() == EnumC2100f.f16314n;
                if (!hVar.o()) {
                    List listL0 = abstractC2299z.l0();
                    kotlin.jvm.internal.l.e("getContextReceivers(...)", listL0);
                    hVar.z(sb, listL0);
                    hVar.v(sb, abstractC2299z, null);
                    if (!z7) {
                        H4.o visibility = abstractC2299z.getVisibility();
                        kotlin.jvm.internal.l.e("getVisibility(...)", visibility);
                        hVar.d0(visibility, sb);
                    }
                    if ((abstractC2299z.c() != EnumC2100f.f16312l || abstractC2299z.e() != EnumC2117x.f16345o) && (!abstractC2299z.c().a() || abstractC2299z.e() != EnumC2117x.f16342l)) {
                        EnumC2117x enumC2117xE = abstractC2299z.e();
                        kotlin.jvm.internal.l.e("getModality(...)", enumC2117xE);
                        hVar.I(enumC2117xE, sb, Y4.h.s(abstractC2299z));
                    }
                    hVar.H(abstractC2299z, sb);
                    hVar.K(sb, hVar.n().contains(Y4.i.f10174r) && abstractC2299z.j(), "inner");
                    hVar.K(sb, hVar.n().contains(Y4.i.f10176t) && abstractC2299z.p0(), "data");
                    hVar.K(sb, hVar.n().contains(Y4.i.f10177u) && abstractC2299z.isInline(), "inline");
                    hVar.K(sb, hVar.n().contains(Y4.i.f10166A) && abstractC2299z.i(), "value");
                    hVar.K(sb, hVar.n().contains(Y4.i.f10182z) && abstractC2299z.E(), "fun");
                    if (abstractC2299z instanceof u4.P) {
                        str = "typealias";
                    } else if (abstractC2299z.x()) {
                        str = "companion object";
                    } else {
                        int iOrdinal = abstractC2299z.c().ordinal();
                        if (iOrdinal == 0) {
                            str = "class";
                        } else if (iOrdinal == 1) {
                            str = "interface";
                        } else if (iOrdinal == 2) {
                            str = "enum class";
                        } else if (iOrdinal == 3) {
                            str = "enum entry";
                        } else if (iOrdinal == 4) {
                            str = "annotation class";
                        } else {
                            if (iOrdinal != 5) {
                                throw new D6.r();
                            }
                            str = "object";
                        }
                    }
                    sb.append(hVar.F(str));
                }
                boolean zL = Z4.e.l(abstractC2299z);
                Y4.l lVar = hVar.a;
                if (zL) {
                    if (((Boolean) lVar.f10191G.getValue(lVar, Y4.l.f10184Y[31])).booleanValue()) {
                        if (hVar.o()) {
                            sb.append("companion object");
                        }
                        Y4.h.T(sb);
                        InterfaceC2105k interfaceC2105kK = abstractC2299z.k();
                        if (interfaceC2105kK != null) {
                            sb.append("of ");
                            W4.e name = interfaceC2105kK.getName();
                            kotlin.jvm.internal.l.e("getName(...)", name);
                            sb.append(hVar.L(name, false));
                        }
                    }
                    if (hVar.r() || !kotlin.jvm.internal.l.a(abstractC2299z.getName(), W4.g.f9627b)) {
                        if (!hVar.o()) {
                            Y4.h.T(sb);
                        }
                        W4.e name2 = abstractC2299z.getName();
                        kotlin.jvm.internal.l.e("getName(...)", name2);
                        sb.append(hVar.L(name2, true));
                    }
                } else {
                    if (!hVar.o()) {
                        Y4.h.T(sb);
                    }
                    hVar.M(abstractC2299z, sb, true);
                }
                if (!z7) {
                    List listN = abstractC2299z.n();
                    kotlin.jvm.internal.l.e("getDeclaredTypeParameters(...)", listN);
                    hVar.Z(sb, listN, false);
                    hVar.x(abstractC2299z, sb);
                    if (!abstractC2299z.c().a()) {
                        if (((Boolean) lVar.f10214i.getValue(lVar, Y4.l.f10184Y[7])).booleanValue() && (c2283jB0 = abstractC2299z.b0()) != null) {
                            sb.append(ServerSentEventKt.SPACE);
                            hVar.v(sb, c2283jB0, null);
                            C2283j c2283j = c2283jB0;
                            H4.o visibility2 = c2283j.getVisibility();
                            kotlin.jvm.internal.l.e("getVisibility(...)", visibility2);
                            hVar.d0(visibility2, sb);
                            sb.append(hVar.F("constructor"));
                            List listM0 = c2283j.m0();
                            kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
                            hVar.c0(sb, listM0, c2283jB0.K());
                        }
                    }
                    if (!((Boolean) lVar.f10229x.getValue(lVar, Y4.l.f10184Y[22])).booleanValue() && !AbstractC1880i.E(abstractC2299z.g())) {
                        Collection collectionG = abstractC2299z.v().g();
                        kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
                        if (!collectionG.isEmpty() && (collectionG.size() != 1 || !AbstractC1880i.x((AbstractC1586x) collectionG.iterator().next()))) {
                            Y4.h.T(sb);
                            sb.append(": ");
                            P3.q.x0(collectionG, sb, ", ", null, null, new Y4.g(hVar, 1), 60);
                        }
                    }
                    hVar.e0(sb, listN);
                }
                return O3.C.a;
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(x4.C2283j r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.y.I(x4.j, java.lang.Object):java.lang.Object");
    }

    public Object J(InterfaceC2112s interfaceC2112s, Object obj) {
        switch (this.f9915k) {
            case 1:
                K(interfaceC2112s, (StringBuilder) obj);
                return O3.C.a;
            default:
                return new C1656J((AbstractC1654H) this.f9916l, interfaceC2112s);
        }
    }

    @Override // b6.InterfaceC0738m
    public int J0(char[] cArr, int i7, int i8) {
        return ((C0735j) this.f9916l).a(cArr, i7, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(u4.InterfaceC2112s r11, java.lang.StringBuilder r12) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.y.K(u4.s, java.lang.StringBuilder):void");
    }

    public void L(InterfaceC2094J interfaceC2094J, StringBuilder sb, String str) {
        Y4.h hVar = (Y4.h) this.f9916l;
        Y4.l lVar = hVar.a;
        int iOrdinal = ((Y4.q) lVar.f10192H.getValue(lVar, Y4.l.f10184Y[32])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                K(interfaceC2094J, sb);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new D6.r();
                }
                return;
            }
        }
        hVar.H(interfaceC2094J, sb);
        sb.append(str.concat(" for "));
        u4.K kN0 = ((AbstractC2261G) interfaceC2094J).N0();
        kotlin.jvm.internal.l.e("getCorrespondingProperty(...)", kN0);
        Y4.h.l(hVar, kN0, sb);
    }

    public Object M(C2263I c2263i, Object obj) {
        int i7;
        switch (this.f9915k) {
            case 1:
                kotlin.jvm.internal.l.f("descriptor", c2263i);
                Y4.h.l((Y4.h) this.f9916l, c2263i, (StringBuilder) obj);
                return O3.C.a;
            default:
                kotlin.jvm.internal.l.f("descriptor", c2263i);
                List listM = c2263i.M();
                kotlin.jvm.internal.l.e("getContextReceiverParameters(...)", listM);
                if (listM.isEmpty()) {
                    i7 = (c2263i.f17379D != null ? 1 : 0) + (c2263i.f17380E != null ? 1 : 0);
                } else {
                    i7 = -1;
                }
                boolean z7 = c2263i.f17384p;
                AbstractC1654H abstractC1654H = (AbstractC1654H) this.f9916l;
                if (z7) {
                    if (i7 == -1) {
                        return new C1664S(abstractC1654H, c2263i);
                    }
                    if (i7 == 0) {
                        return new C1658L(abstractC1654H, c2263i);
                    }
                    if (i7 == 1) {
                        return new C1660N(abstractC1654H, c2263i);
                    }
                    if (i7 == 2) {
                        return new C1662P(abstractC1654H, c2263i);
                    }
                } else {
                    if (i7 == -1) {
                        return new s0(abstractC1654H, c2263i);
                    }
                    if (i7 == 0) {
                        return new C1675d0(abstractC1654H, c2263i);
                    }
                    if (i7 == 1) {
                        return new C1681g0(abstractC1654H, c2263i);
                    }
                    if (i7 == 2) {
                        return new j0(abstractC1654H, c2263i);
                    }
                }
                throw new H5.C("Unsupported property: " + c2263i);
        }
    }

    @Override // p.F0, p.D0
    public boolean a() {
        ((A2.b) this.f9916l).getClass();
        return false;
    }

    @Override // p.D0
    public long b(AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return ((A2.b) this.f9916l).b(abstractC1766r, abstractC1766r2, abstractC1766r3);
    }

    @Override // b6.o
    public void c(char c2) {
        S5.p.o((S5.a) this.f9916l, c2);
    }

    @Override // p.D0
    public AbstractC1766r d(AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return ((A2.b) this.f9916l).d(abstractC1766r, abstractC1766r2, abstractC1766r3);
    }

    @Override // p.D0
    public AbstractC1766r e(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return ((A2.b) this.f9916l).e(j7, abstractC1766r, abstractC1766r2, abstractC1766r3);
    }

    @Override // b3.InterfaceC0717i
    public C0711c g(C0710b c0710b) {
        return null;
    }

    @Override // p.InterfaceC1767s
    public InterfaceC1716C get(int i7) {
        switch (this.f9915k) {
            case 25:
                return (C1717D) this.f9916l;
            default:
                return (InterfaceC1716C) this.f9916l;
        }
    }

    @Override // b6.o
    public void h(long j7) {
        p(String.valueOf(j7));
    }

    @Override // p.D0
    public AbstractC1766r i(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return ((A2.b) this.f9916l).i(j7, abstractC1766r, abstractC1766r2, abstractC1766r3);
    }

    @Override // b3.InterfaceC0717i
    public void j(C0710b c0710b, Bitmap bitmap, Map map) {
        ((InterfaceC0718j) this.f9916l).j(c0710b, bitmap, map, AbstractC0871d.V(bitmap));
    }

    @Override // m5.InterfaceC1525n
    public void k() {
        ((ReentrantLock) this.f9916l).unlock();
    }

    @Override // m5.InterfaceC1525n
    public void l() {
        ((ReentrantLock) this.f9916l).lock();
    }

    @Override // b6.o
    public void n(String str) {
        kotlin.jvm.internal.l.f(ContentType.Text.TYPE, str);
        S5.a aVar = (S5.a) this.f9916l;
        S5.p.o(aVar, 34);
        int length = str.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            String[] strArr = b6.L.a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                S5.p.p(aVar, str, i7, i8);
                String str2 = strArr[cCharAt];
                kotlin.jvm.internal.l.c(str2);
                S5.p.p(aVar, str2, 0, str2.length());
                i7 = i8 + 1;
            }
        }
        S5.p.p(aVar, str, i7, str.length());
        S5.p.o(aVar, 34);
    }

    @Override // b6.o
    public void p(String str) {
        kotlin.jvm.internal.l.f(ContentType.Text.TYPE, str);
        S5.p.p((S5.a) this.f9916l, str, 0, str.length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(int i7, int i8, V1.k kVar) throws y1.E {
        int i9;
        int i10;
        int i11;
        long j7;
        int i12;
        int i13;
        int i14;
        int i15;
        n2.d dVar = (n2.d) this.f9916l;
        SparseArray sparseArray = dVar.f13316c;
        int i16 = 0;
        int i17 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (dVar.J != 2) {
                    return;
                }
                n2.c cVar = (n2.c) sparseArray.get(dVar.f13302P);
                if (dVar.f13305S != 4 || !"V_VP9".equals(cVar.f13259c)) {
                    kVar.f(i8);
                    return;
                }
                B1.B b4 = dVar.f13332p;
                b4.C(i8);
                kVar.a(b4.a, 0, i8, false);
                return;
            }
            if (i7 == 16877) {
                dVar.g(i7);
                n2.c cVar2 = dVar.f13340x;
                int i18 = cVar2.f13264h;
                if (i18 != 1685485123 && i18 != 1685480259) {
                    kVar.f(i8);
                    return;
                }
                byte[] bArr = new byte[i8];
                cVar2.f13246P = bArr;
                kVar.a(bArr, 0, i8, false);
                return;
            }
            if (i7 == 16981) {
                dVar.g(i7);
                byte[] bArr2 = new byte[i8];
                dVar.f13340x.f13266j = bArr2;
                kVar.a(bArr2, 0, i8, false);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr3 = new byte[i8];
                kVar.a(bArr3, 0, i8, false);
                dVar.g(i7);
                dVar.f13340x.f13267k = new V1.F(1, 0, 0, bArr3);
                return;
            }
            if (i7 == 21419) {
                B1.B b7 = dVar.f13327k;
                Arrays.fill(b7.a, (byte) 0);
                kVar.a(b7.a, 4 - i8, i8, false);
                b7.F(0);
                dVar.f13342z = (int) b7.v();
                return;
            }
            if (i7 == 25506) {
                dVar.g(i7);
                byte[] bArr4 = new byte[i8];
                dVar.f13340x.f13268l = bArr4;
                kVar.a(bArr4, 0, i8, false);
                return;
            }
            if (i7 != 30322) {
                throw y1.E.a(null, "Unexpected id: " + i7);
            }
            dVar.g(i7);
            byte[] bArr5 = new byte[i8];
            dVar.f13340x.f13280x = bArr5;
            kVar.a(bArr5, 0, i8, false);
            return;
        }
        int i19 = dVar.J;
        B1.B b8 = dVar.f13325i;
        if (i19 == 0) {
            n2.e eVar = dVar.f13314b;
            dVar.f13302P = (int) eVar.c(kVar, false, true, 8);
            dVar.f13303Q = eVar.f13345c;
            dVar.f13298L = -9223372036854775807L;
            dVar.J = 1;
            b8.C(0);
        }
        n2.c cVar3 = (n2.c) sparseArray.get(dVar.f13302P);
        if (cVar3 == null) {
            kVar.f(i8 - dVar.f13303Q);
            dVar.J = 0;
            return;
        }
        cVar3.f13256Z.getClass();
        if (dVar.J == 1) {
            dVar.k(kVar, 3);
            int i20 = (b8.a[2] & 6) >> 1;
            int i21 = 255;
            if (i20 == 0) {
                dVar.f13300N = 1;
                int[] iArr = dVar.f13301O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.f13301O = iArr;
                iArr[0] = (i8 - dVar.f13303Q) - 3;
            } else {
                dVar.k(kVar, 4);
                int i22 = (b8.a[3] & 255) + 1;
                dVar.f13300N = i22;
                int[] iArr2 = dVar.f13301O;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.f13301O = iArr2;
                if (i20 == 2) {
                    int i23 = (i8 - dVar.f13303Q) - 4;
                    int i24 = dVar.f13300N;
                    Arrays.fill(iArr2, 0, i24, i23 / i24);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw y1.E.a(null, "Unexpected lacing value: " + i20);
                        }
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 4;
                        while (true) {
                            int i28 = dVar.f13300N - i17;
                            if (i25 >= i28) {
                                i10 = i16;
                                i9 = i17;
                                dVar.f13301O[i28] = ((i8 - dVar.f13303Q) - i27) - i26;
                                break;
                            }
                            dVar.f13301O[i25] = i16;
                            int i29 = i27 + 1;
                            dVar.k(kVar, i29);
                            if (b8.a[i27] == 0) {
                                throw y1.E.a(null, "No valid varint length mask found");
                            }
                            int i30 = i17;
                            int i31 = i16;
                            while (true) {
                                if (i31 >= 8) {
                                    i11 = i16;
                                    j7 = 0;
                                    i12 = i29;
                                    break;
                                }
                                int i32 = i30 << (7 - i31);
                                i11 = i16;
                                if ((b8.a[i27] & i32) != 0) {
                                    i12 = i29 + i31;
                                    dVar.k(kVar, i12);
                                    j7 = b8.a[i27] & i21 & (~i32);
                                    while (i29 < i12) {
                                        j7 = (j7 << 8) | (b8.a[i29] & i21);
                                        i29++;
                                        i21 = 255;
                                    }
                                    if (i25 > 0) {
                                        j7 -= (1 << ((i31 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i31++;
                                    i16 = i11;
                                    i21 = 255;
                                }
                            }
                            if (j7 < -2147483648L || j7 > 2147483647L) {
                                break;
                            }
                            int i33 = (int) j7;
                            int[] iArr3 = dVar.f13301O;
                            if (i25 != 0) {
                                i33 += iArr3[i25 - 1];
                            }
                            iArr3[i25] = i33;
                            i26 += i33;
                            i25++;
                            i27 = i12;
                            i17 = i30;
                            i16 = i11;
                            i21 = 255;
                        }
                        throw y1.E.a(null, "EBML lacing sample size out of range.");
                    }
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 4;
                    while (true) {
                        i13 = dVar.f13300N - 1;
                        if (i34 >= i13) {
                            break;
                        }
                        dVar.f13301O[i34] = 0;
                        while (true) {
                            i14 = i36 + 1;
                            dVar.k(kVar, i14);
                            int i37 = b8.a[i36] & 255;
                            int[] iArr4 = dVar.f13301O;
                            i15 = iArr4[i34] + i37;
                            iArr4[i34] = i15;
                            if (i37 != 255) {
                                break;
                            } else {
                                i36 = i14;
                            }
                        }
                        i35 += i15;
                        i34++;
                        i36 = i14;
                    }
                    dVar.f13301O[i13] = ((i8 - dVar.f13303Q) - i36) - i35;
                }
            }
            i10 = 0;
            i9 = 1;
            byte[] bArr6 = b8.a;
            dVar.f13297K = dVar.m((bArr6[i9] & 255) | (bArr6[i10] << 8)) + dVar.f13293E;
            dVar.f13304R = (cVar3.f13261e == 2 || (i7 == 163 && (b8.a[2] & 128) == 128)) ? i9 : i10;
            dVar.J = 2;
            dVar.f13299M = i10;
        } else {
            i9 = 1;
        }
        if (i7 == 163) {
            while (true) {
                int i38 = dVar.f13299M;
                if (i38 >= dVar.f13300N) {
                    dVar.J = 0;
                    return;
                } else {
                    dVar.h(cVar3, dVar.f13297K + ((dVar.f13299M * cVar3.f13262f) / CIOKt.DEFAULT_HTTP_POOL_SIZE), dVar.f13304R, dVar.n(kVar, cVar3, dVar.f13301O[i38], false), 0);
                    dVar.f13299M++;
                }
            }
        } else {
            while (true) {
                int i39 = dVar.f13299M;
                if (i39 >= dVar.f13300N) {
                    return;
                }
                int[] iArr5 = dVar.f13301O;
                boolean z7 = i9;
                iArr5[i39] = dVar.n(kVar, cVar3, iArr5[i39], z7);
                dVar.f13299M += z7 ? 1 : 0;
            }
        }
    }

    public C1303d s(int i7) {
        return null;
    }

    @Override // j5.InterfaceC1350e
    public C1349d s0(W4.b bVar) {
        C1349d c1349dS0;
        kotlin.jvm.internal.l.f("classId", bVar);
        Iterator it = AbstractC2115v.i((InterfaceC2091G) this.f9916l, bVar.a).iterator();
        while (it.hasNext()) {
            InterfaceC2088D interfaceC2088D = (InterfaceC2088D) it.next();
            if ((interfaceC2088D instanceof C1399c) && (c1349dS0 = ((C1399c) interfaceC2088D).f12692s.s0(bVar)) != null) {
                return c1349dS0;
            }
        }
        return null;
    }

    public void t(AbstractC0608e abstractC0608e) {
        if (!abstractC0608e.p()) {
            if (!(abstractC0608e instanceof B)) {
                String strValueOf = String.valueOf(abstractC0608e.getClass());
                throw new IllegalArgumentException(AbstractC0703b.m(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            B b4 = (B) abstractC0608e;
            t(b4.f9833m);
            t(b4.f9834n);
            return;
        }
        int size = abstractC0608e.size();
        int[] iArr = B.f9831r;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i7 = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f9916l;
        if (stack.isEmpty() || ((AbstractC0608e) stack.peek()).size() >= i7) {
            stack.push(abstractC0608e);
            return;
        }
        int i8 = iArr[iBinarySearch];
        AbstractC0608e b7 = (AbstractC0608e) stack.pop();
        while (!stack.isEmpty() && ((AbstractC0608e) stack.peek()).size() < i8) {
            b7 = new B((AbstractC0608e) stack.pop(), b7);
        }
        B b8 = new B(b7, abstractC0608e);
        while (!stack.isEmpty()) {
            int[] iArr2 = B.f9831r;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, b8.f9832l);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC0608e) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                b8 = new B((AbstractC0608e) stack.pop(), b8);
            }
        }
        stack.push(b8);
    }

    public void u() {
        Socket socket;
        T1.l lVar = (T1.l) this.f9916l;
        Iterator it = ((ConcurrentLinkedQueue) lVar.f8931d).iterator();
        kotlin.jvm.internal.l.e("connections.iterator()", it);
        while (it.hasNext()) {
            j6.l lVar2 = (j6.l) it.next();
            kotlin.jvm.internal.l.e("connection", lVar2);
            synchronized (lVar2) {
                if (lVar2.f12542p.isEmpty()) {
                    it.remove();
                    lVar2.f12536j = true;
                    socket = lVar2.f12530d;
                    kotlin.jvm.internal.l.c(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                g6.b.d(socket);
            }
        }
        if (((ConcurrentLinkedQueue) lVar.f8931d).isEmpty()) {
            ((i6.c) lVar.f8929b).a();
        }
    }

    public C1303d v() {
        return null;
    }

    public Object w(SerialDescriptor serialDescriptor, b6.w wVar) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        Map map = (Map) ((ConcurrentHashMap) this.f9916l).get(serialDescriptor);
        Object obj = map != null ? map.get(wVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r7 != false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0116 A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b3.C0711c x(d3.C0797i r18, b3.C0710b r19, e3.h r20, e3.g r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.y.x(d3.i, b3.b, e3.h, e3.g):b3.c");
    }

    public void y(float f5, float f7, float f8, float f9) {
        B2.l lVar = (B2.l) this.f9916l;
        InterfaceC0995r interfaceC0995rT = lVar.t();
        long jF = AbstractC0870c.F(g0.f.d(lVar.A()) - (f8 + f5), g0.f.b(lVar.A()) - (f9 + f7));
        if (g0.f.d(jF) < 0.0f || g0.f.b(jF) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        lVar.P(jF);
        interfaceC0995rT.f(f5, f7);
    }

    public void z(int i7, long j7) throws y1.E {
        n2.d dVar = (n2.d) this.f9916l;
        dVar.getClass();
        if (i7 == 20529) {
            if (j7 == 0) {
                return;
            }
            throw y1.E.a(null, "ContentEncodingOrder " + j7 + " not supported");
        }
        if (i7 == 20530) {
            if (j7 == 1) {
                return;
            }
            throw y1.E.a(null, "ContentEncodingScope " + j7 + " not supported");
        }
        switch (i7) {
            case 131:
                dVar.g(i7);
                dVar.f13340x.f13261e = (int) j7;
                return;
            case 136:
                dVar.g(i7);
                dVar.f13340x.f13254X = j7 == 1;
                return;
            case 155:
                dVar.f13298L = dVar.m(j7);
                return;
            case 159:
                dVar.g(i7);
                dVar.f13340x.f13247Q = (int) j7;
                return;
            case 176:
                dVar.g(i7);
                dVar.f13340x.f13270n = (int) j7;
                return;
            case 179:
                dVar.c(i7);
                dVar.f13294F.a(dVar.m(j7));
                return;
            case 186:
                dVar.g(i7);
                dVar.f13340x.f13271o = (int) j7;
                return;
            case 215:
                dVar.g(i7);
                dVar.f13340x.f13260d = (int) j7;
                return;
            case 231:
                dVar.f13293E = dVar.m(j7);
                return;
            case 238:
                dVar.f13305S = (int) j7;
                return;
            case 241:
                if (dVar.f13296H) {
                    return;
                }
                dVar.c(i7);
                dVar.f13295G.a(j7);
                dVar.f13296H = true;
                return;
            case 251:
                dVar.f13306T = true;
                return;
            case 16871:
                dVar.g(i7);
                dVar.f13340x.f13264h = (int) j7;
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                throw y1.E.a(null, "ContentCompAlgo " + j7 + " not supported");
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    throw y1.E.a(null, "DocTypeReadVersion " + j7 + " not supported");
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                throw y1.E.a(null, "EBMLReadVersion " + j7 + " not supported");
            case 18401:
                if (j7 == 5) {
                    return;
                }
                throw y1.E.a(null, "ContentEncAlgo " + j7 + " not supported");
            case 18408:
                if (j7 == 1) {
                    return;
                }
                throw y1.E.a(null, "AESSettingsCipherMode " + j7 + " not supported");
            case 21420:
                dVar.f13289A = j7 + dVar.f13335s;
                return;
            case 21432:
                int i8 = (int) j7;
                dVar.g(i7);
                if (i8 == 0) {
                    dVar.f13340x.f13281y = 0;
                    return;
                }
                if (i8 == 1) {
                    dVar.f13340x.f13281y = 2;
                    return;
                } else if (i8 == 3) {
                    dVar.f13340x.f13281y = 1;
                    return;
                } else {
                    if (i8 != 15) {
                        return;
                    }
                    dVar.f13340x.f13281y = 3;
                    return;
                }
            case 21680:
                dVar.g(i7);
                dVar.f13340x.f13273q = (int) j7;
                return;
            case 21682:
                dVar.g(i7);
                dVar.f13340x.f13275s = (int) j7;
                return;
            case 21690:
                dVar.g(i7);
                dVar.f13340x.f13274r = (int) j7;
                return;
            case 21930:
                dVar.g(i7);
                dVar.f13340x.f13253W = j7 == 1;
                return;
            case 21938:
                dVar.g(i7);
                n2.c cVar = dVar.f13340x;
                cVar.f13282z = true;
                cVar.f13272p = (int) j7;
                return;
            case 21998:
                dVar.g(i7);
                dVar.f13340x.f13263g = (int) j7;
                return;
            case 22186:
                dVar.g(i7);
                dVar.f13340x.f13250T = j7;
                return;
            case 22203:
                dVar.g(i7);
                dVar.f13340x.f13251U = j7;
                return;
            case 25188:
                dVar.g(i7);
                dVar.f13340x.f13248R = (int) j7;
                return;
            case 30114:
                dVar.f13307U = j7;
                return;
            case 30321:
                dVar.g(i7);
                int i9 = (int) j7;
                if (i9 == 0) {
                    dVar.f13340x.f13276t = 0;
                    return;
                }
                if (i9 == 1) {
                    dVar.f13340x.f13276t = 1;
                    return;
                } else if (i9 == 2) {
                    dVar.f13340x.f13276t = 2;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    dVar.f13340x.f13276t = 3;
                    return;
                }
            case 2352003:
                dVar.g(i7);
                dVar.f13340x.f13262f = (int) j7;
                return;
            case 2807729:
                dVar.f13336t = j7;
                return;
            default:
                switch (i7) {
                    case 21945:
                        dVar.g(i7);
                        int i10 = (int) j7;
                        if (i10 == 1) {
                            dVar.f13340x.f13235C = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            dVar.f13340x.f13235C = 1;
                            return;
                        }
                    case 21946:
                        dVar.g(i7);
                        int iG = C2384f.g((int) j7);
                        if (iG != -1) {
                            dVar.f13340x.f13234B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.g(i7);
                        dVar.f13340x.f13282z = true;
                        int iF = C2384f.f((int) j7);
                        if (iF != -1) {
                            dVar.f13340x.f13233A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.g(i7);
                        dVar.f13340x.f13236D = (int) j7;
                        return;
                    case 21949:
                        dVar.g(i7);
                        dVar.f13340x.f13237E = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    public y(AbstractC1654H abstractC1654H) {
        this.f9915k = 23;
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        this.f9916l = abstractC1654H;
    }

    public y(T0.b bVar) {
        this.f9915k = 22;
        this.f9916l = new C1597I(AbstractC1601M.a, bVar);
    }

    public y(S2.m mVar, L2.e eVar) {
        this.f9915k = 3;
        this.f9916l = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[PHI: r11
      0x002a: PHI (r11v1 int) = (r11v0 int), (r11v4 int), (r11v5 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 24
            r0.f9915k = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            p.t[][] r4 = new p.C1768t[r2][]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L14:
            if (r6 >= r2) goto L73
            r9 = r22[r6]
            r10 = 2
            r11 = 3
            if (r9 == 0) goto L2a
            if (r9 == r3) goto L33
            if (r9 == r10) goto L31
            if (r9 == r11) goto L2c
            r11 = 4
            if (r9 == r11) goto L2a
            r11 = 5
            if (r9 == r11) goto L2a
            r12 = r8
            goto L35
        L2a:
            r12 = r11
            goto L35
        L2c:
            if (r7 != r3) goto L33
            goto L31
        L2f:
            r12 = r7
            goto L35
        L31:
            r7 = r10
            goto L2f
        L33:
            r7 = r3
            goto L2f
        L35:
            r8 = r24[r6]
            int r9 = r8.length
            int r9 = r9 / r10
            int r8 = r8.length
            int r8 = r8 % r10
            int r8 = r8 + r9
            p.t[] r9 = new p.C1768t[r8]
            r10 = r5
        L3f:
            if (r10 >= r8) goto L6d
            int r11 = r10 * 2
            r13 = r11
            p.t r11 = new p.t
            r14 = r13
            r13 = r1[r6]
            int r15 = r6 + 1
            r16 = r14
            r14 = r1[r15]
            r17 = r24[r6]
            r18 = r15
            r15 = r17[r16]
            int r19 = r16 + 1
            r17 = r17[r19]
            r18 = r24[r18]
            r16 = r18[r16]
            r18 = r18[r19]
            r20 = r17
            r17 = r16
            r16 = r20
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r9[r10] = r11
            int r10 = r10 + 1
            goto L3f
        L6d:
            r4[r6] = r9
            int r6 = r6 + 1
            r8 = r12
            goto L14
        L73:
            r0.f9916l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.y.<init>(int[], float[], float[][]):void");
    }

    public y(View view) {
        this.f9915k = 11;
        if (Build.VERSION.SDK_INT >= 30) {
            C1057j c1057j = new C1057j(view);
            c1057j.f11976b = view;
            this.f9916l = c1057j;
            return;
        }
        this.f9916l = new C1055h(view);
    }

    public y(Window window, View view) {
        this.f9915k = 12;
        y yVar = new y(view);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            this.f9916l = new V(window, yVar, 1);
            return;
        }
        if (i7 >= 30) {
            this.f9916l = new T(window, yVar, 1);
        } else if (i7 >= 26) {
            this.f9916l = new U(window, yVar, 0);
        } else {
            this.f9916l = new T(window, yVar, 0);
        }
    }

    @Override // b3.InterfaceC0717i
    public void f(int i7) {
    }

    public y(InputStream inputStream) {
        this.f9915k = 5;
        this.f9916l = new C0735j(inputStream, C2496a.f19036b);
    }

    public y(g6.a aVar) {
        this.f9915k = 14;
        this.f9916l = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }

    public y(int i7) {
        this.f9915k = i7;
        switch (i7) {
            case GzipHeaderFlags.EXTRA /* 4 */:
                this.f9916l = new ConcurrentHashMap(16);
                break;
            case 8:
                break;
            case 10:
                kotlin.jvm.internal.l.f("timeUnit", TimeUnit.MINUTES);
                this.f9916l = new T1.l(i6.d.f12053i);
                break;
            case 17:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f9916l = new C1305f(this);
                    break;
                } else {
                    this.f9916l = new C1304e(this);
                    break;
                }
            case 19:
                this.f9916l = new LinkedHashSet();
                break;
            default:
                this.f9916l = new Stack();
                break;
        }
    }

    public y(float f5, float f7, AbstractC1766r abstractC1766r) {
        Object yVar;
        this.f9915k = 27;
        if (abstractC1766r != null) {
            yVar = new D4.S(f5, f7, abstractC1766r);
        } else {
            yVar = new y(f5, f7);
        }
        this.f9916l = new A2.b(12, yVar);
    }

    public y(float f5, float f7) {
        this.f9915k = 25;
        this.f9916l = new C1717D(f5, f7, 0.01f);
    }

    public void q(int i7, C1303d c1303d, String str, Bundle bundle) {
    }
}
