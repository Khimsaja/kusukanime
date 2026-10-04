package f1;

import C2.H;
import H4.o;
import O.C0502l;
import O.C0510p;
import P3.E;
import P3.F;
import P3.q;
import P3.r;
import P3.z;
import R4.i0;
import Z5.C0640i0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import b5.g;
import b5.k;
import b5.w;
import e1.AbstractC0817a;
import f6.AbstractC0905c;
import f6.AbstractC0915m;
import f6.EnumC0899M;
import g5.f;
import io.ktor.util.GzipHeaderFlags;
import j5.y;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import l4.InterfaceC1424c;
import l4.InterfaceC1425d;
import l4.InterfaceC1428g;
import l4.InterfaceC1429h;
import l4.InterfaceC1434m;
import l4.InterfaceC1438q;
import l4.InterfaceC1443v;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.Q;
import n5.Y;
import o4.AbstractC1694t;
import o4.F0;
import o4.l0;
import o4.q0;
import p4.InterfaceC1801g;
import q.AbstractC1841x;
import q.C1831m;
import q.b0;
import q.c0;
import q.d0;
import q.e0;
import q1.C1846b;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import r4.AbstractC1887p;
import s.EnumC1903a0;
import s.InterfaceC1946w0;
import s.X;
import s4.m;
import u4.AbstractC2108n;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import v1.AbstractC2148b;
import v4.C2159g;
import v4.InterfaceC2154b;
import v4.h;
import v4.i;
import v4.j;
import w6.C2224i;
import y.C2324e;
import y.C2326g;
import z.C;
import z0.AbstractC2455l0;

/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0871d implements Encoder, Y5.b {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Type inference failed for: r1v34, types: [O3.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p4.InterfaceC1801g G(o4.l0 r6, boolean r7) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.AbstractC0871d.G(o4.l0, boolean):p4.g");
    }

    public static List H(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new m3.b(0, iArr.length, iArr);
    }

    public static int I(long j7) {
        int i7 = (int) j7;
        if (((long) i7) == j7) {
            return i7;
        }
        throw new IllegalArgumentException(e3.c.B("Out of range: %s", Long.valueOf(j7)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p4.x J(o4.l0 r4, boolean r5, java.lang.reflect.Field r6) {
        /*
            o4.q0 r0 = r4.u()
            u4.K r0 = r0.p()
            u4.k r1 = r0.k()
            java.lang.String r2 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.l.e(r2, r1)
            boolean r2 = Z4.e.l(r1)
            r3 = 1
            if (r2 != 0) goto L19
            goto L3c
        L19:
            u4.k r1 = r1.k()
            u4.f r2 = u4.EnumC2100f.f16312l
            boolean r2 = Z4.e.m(r1, r2)
            if (r2 != 0) goto L2d
            u4.f r2 = u4.EnumC2100f.f16315o
            boolean r1 = Z4.e.m(r1, r2)
            if (r1 == 0) goto L46
        L2d:
            boolean r1 = r0 instanceof l5.C1465r
            if (r1 == 0) goto L3c
            l5.r r0 = (l5.C1465r) r0
            R4.J r0 = r0.f12822K
            boolean r0 = V4.g.d(r0)
            if (r0 == 0) goto L3c
            goto L46
        L3c:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L86
        L46:
            java.lang.String r0 = "field"
            if (r5 == 0) goto L64
            boolean r5 = r4.s()
            if (r5 == 0) goto L5a
            p4.j r5 = new p4.j
            java.lang.Object r4 = W(r4)
            r5.<init>(r6, r4)
            return r5
        L5a:
            p4.l r4 = new p4.l
            kotlin.jvm.internal.l.f(r0, r6)
            r5 = 0
            r4.<init>(r6, r3, r5)
            return r4
        L64:
            boolean r5 = r4.s()
            if (r5 == 0) goto L78
            p4.n r5 = new p4.n
            boolean r0 = K(r4)
            java.lang.Object r4 = W(r4)
            r5.<init>(r6, r0, r4)
            return r5
        L78:
            p4.p r5 = new p4.p
            boolean r4 = K(r4)
            kotlin.jvm.internal.l.f(r0, r6)
            r0 = 0
            r5.<init>(r6, r4, r3, r0)
            return r5
        L86:
            o4.q0 r0 = r4.u()
            u4.K r0 = r0.p()
            v4.h r0 = r0.getAnnotations()
            W4.c r1 = o4.F0.a
            boolean r0 = r0.d(r1)
            r1 = 0
            if (r0 == 0) goto Lcb
            if (r5 == 0) goto Lb0
            boolean r4 = r4.s()
            if (r4 == 0) goto La9
            p4.k r4 = new p4.k
            r4.<init>(r6, r1)
            return r4
        La9:
            p4.l r4 = new p4.l
            r5 = 1
            r4.<init>(r6, r3, r5)
            return r4
        Lb0:
            boolean r5 = r4.s()
            if (r5 == 0) goto Lc0
            p4.o r5 = new p4.o
            boolean r4 = K(r4)
            r5.<init>(r6, r4, r1)
            return r5
        Lc0:
            p4.p r5 = new p4.p
            boolean r4 = K(r4)
            r0 = 1
            r5.<init>(r6, r4, r3, r0)
            return r5
        Lcb:
            if (r5 == 0) goto Ld4
            p4.l r4 = new p4.l
            r5 = 2
            r4.<init>(r6, r1, r5)
            return r4
        Ld4:
            p4.p r5 = new p4.p
            boolean r4 = K(r4)
            r0 = 2
            r5.<init>(r6, r4, r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.AbstractC0871d.J(o4.l0, boolean, java.lang.reflect.Field):p4.x");
    }

    public static final boolean K(l0 l0Var) {
        return !Y.e(l0Var.u().p().getType());
    }

    public static final int L(AbstractC1586x abstractC1586x) {
        l.f("<this>", abstractC1586x);
        InterfaceC2154b interfaceC2154bL = abstractC1586x.getAnnotations().l(AbstractC1886o.f15009q);
        if (interfaceC2154bL == null) {
            return 0;
        }
        g gVar = (g) E.m0(AbstractC1887p.f15022e, interfaceC2154bL.b());
        l.d("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue", gVar);
        return ((Number) ((k) gVar).a).intValue();
    }

    public static Handler M(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0817a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e8) {
            e = e8;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e9) {
            e = e9;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final B N(AbstractC1880i abstractC1880i, h hVar, AbstractC1586x abstractC1586x, List list, ArrayList arrayList, AbstractC1586x abstractC1586x2, boolean z7) {
        InterfaceC2099e interfaceC2099eK;
        int i7 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC1586x != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC0905c.e((AbstractC1586x) it.next()));
        }
        arrayList2.addAll(arrayList3);
        w5.k.a(arrayList2, abstractC1586x != null ? AbstractC0905c.e(abstractC1586x) : null);
        Iterator it2 = arrayList.iterator();
        int i8 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            h iVar = C2159g.a;
            if (!zHasNext) {
                arrayList2.add(AbstractC0905c.e(abstractC1586x2));
                int size = list.size() + arrayList.size() + (abstractC1586x == null ? 0 : 1);
                if (z7) {
                    interfaceC2099eK = abstractC1880i.v(size);
                } else {
                    W4.e eVar = AbstractC1887p.a;
                    interfaceC2099eK = abstractC1880i.k("Function" + size);
                }
                if (abstractC1586x != null) {
                    W4.c cVar = AbstractC1886o.f15008p;
                    if (!hVar.d(cVar)) {
                        ArrayList arrayListF0 = q.F0(hVar, new j(abstractC1880i, cVar, z.f7780k));
                        hVar = arrayListF0.isEmpty() ? iVar : new i(i7, arrayListF0);
                    }
                }
                if (!list.isEmpty()) {
                    int size2 = list.size();
                    W4.c cVar2 = AbstractC1886o.f15009q;
                    if (!hVar.d(cVar2)) {
                        ArrayList arrayListF02 = q.F0(hVar, new j(abstractC1880i, cVar2, F.J(new O3.l(AbstractC1887p.f15022e, new k(size2)))));
                        if (!arrayListF02.isEmpty()) {
                            iVar = new i(i7, arrayListF02);
                        }
                        hVar = iVar;
                    }
                }
                return AbstractC1566c.t(AbstractC1566c.D(hVar), interfaceC2099eK, arrayList2);
            }
            Object next = it2.next();
            int i9 = i8 + 1;
            if (i8 < 0) {
                r.X();
                throw null;
            }
            arrayList2.add(AbstractC0905c.e((AbstractC1586x) next));
            i8 = i9;
        }
    }

    public static final o O(i0 i0Var) {
        switch (i0Var == null ? -1 : y.f12481b[i0Var.ordinal()]) {
            case 1:
                o oVar = AbstractC2108n.f16321d;
                l.e("INTERNAL", oVar);
                return oVar;
            case 2:
                o oVar2 = AbstractC2108n.a;
                l.e("PRIVATE", oVar2);
                return oVar2;
            case 3:
                o oVar3 = AbstractC2108n.f16319b;
                l.e("PRIVATE_TO_THIS", oVar3);
                return oVar3;
            case GzipHeaderFlags.EXTRA /* 4 */:
                o oVar4 = AbstractC2108n.f16320c;
                l.e("PROTECTED", oVar4);
                return oVar4;
            case 5:
                o oVar5 = AbstractC2108n.f16322e;
                l.e("PUBLIC", oVar5);
                return oVar5;
            case 6:
                o oVar6 = AbstractC2108n.f16323f;
                l.e("LOCAL", oVar6);
                return oVar6;
            default:
                o oVar7 = AbstractC2108n.a;
                l.e("PRIVATE", oVar7);
                return oVar7;
        }
    }

    public static final float P(C c2) {
        return c2.k().f18523e == EnumC1903a0.f15260l ? g0.c.d(c2.o()) : g0.c.e(c2.o());
    }

    public static boolean S(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i7 = 0; i7 < length; i7++) {
                if (str.charAt(i7) == str2.charAt(i7) || ((c2 = (char) ((r3 | ' ') - 97)) < 26 && c2 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final W4.e T(AbstractC1586x abstractC1586x) {
        String str;
        InterfaceC2154b interfaceC2154bL = abstractC1586x.getAnnotations().l(AbstractC1886o.f15010r);
        if (interfaceC2154bL != null) {
            Object objL0 = q.L0(interfaceC2154bL.b().values());
            w wVar = objL0 instanceof w ? (w) objL0 : null;
            if (wVar != null && (str = (String) wVar.a) != null) {
                if (!W4.e.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return W4.e.e(str);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC0899M U(String str) {
        l.f("javaName", str);
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC0899M.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC0899M.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC0899M.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC0899M.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC0899M.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final int V(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final Object W(l0 l0Var) {
        l.f("<this>", l0Var);
        q0 q0VarU = l0Var.u();
        return e3.c.o(q0VarU.f13740u, q0VarU.p());
    }

    public static final List Y(AbstractC1586x abstractC1586x) {
        l.f("<this>", abstractC1586x);
        g0(abstractC1586x);
        int iL = L(abstractC1586x);
        if (iL == 0) {
            return P3.y.f7779k;
        }
        List listSubList = abstractC1586x.q0().subList(0, iL);
        ArrayList arrayList = new ArrayList(r.p(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Q) it.next()).b());
        }
        return arrayList;
    }

    public static /* synthetic */ Collection Z(g5.q qVar, f fVar, int i7) {
        if ((i7 & 1) != 0) {
            fVar = f.f11736m;
        }
        g5.o.a.getClass();
        return qVar.e(fVar, g5.l.f11754l);
    }

    public static final s4.k a0(W4.d dVar) {
        if (!dVar.d() || dVar.c()) {
            return null;
        }
        m mVar = m.f15836b;
        W4.c cVarB = dVar.i().b();
        String strB = dVar.g().b();
        l.e("asString(...)", strB);
        mVar.getClass();
        s4.l lVarA = mVar.a(cVarB, strB);
        if (lVarA != null) {
            return lVarA.a;
        }
        return null;
    }

    public static final AbstractC1586x d0(AbstractC1586x abstractC1586x) {
        l.f("<this>", abstractC1586x);
        g0(abstractC1586x);
        if (abstractC1586x.getAnnotations().l(AbstractC1886o.f15008p) == null) {
            return null;
        }
        return ((Q) abstractC1586x.q0().get(L(abstractC1586x))).b();
    }

    public static final List e0(AbstractC1586x abstractC1586x) {
        l.f("<this>", abstractC1586x);
        g0(abstractC1586x);
        List listQ0 = abstractC1586x.q0();
        return listQ0.subList(((!g0(abstractC1586x) || abstractC1586x.getAnnotations().l(AbstractC1886o.f15008p) == null) ? 0 : 1) + L(abstractC1586x), listQ0.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean f0(q0 q0Var) {
        if (q0Var instanceof InterfaceC1434m) {
            Field fieldS = AbstractC0915m.s(q0Var);
            if (!(fieldS != null ? fieldS.isAccessible() : true)) {
                return false;
            }
            Method methodT = AbstractC0915m.t(q0Var.getGetter());
            if (!(methodT != null ? methodT.isAccessible() : true)) {
                return false;
            }
            Method methodT2 = AbstractC0915m.t(((InterfaceC1434m) q0Var).getSetter());
            if (!(methodT2 != null ? methodT2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldS2 = AbstractC0915m.s(q0Var);
            if (!(fieldS2 != null ? fieldS2.isAccessible() : true)) {
                return false;
            }
            Method methodT3 = AbstractC0915m.t(q0Var.getGetter());
            if (!(methodT3 != null ? methodT3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean g0(AbstractC1586x abstractC1586x) {
        l.f("<this>", abstractC1586x);
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        if (interfaceC2102hF == null) {
            return false;
        }
        s4.k kVarA0 = ((interfaceC2102hF instanceof InterfaceC2099e) && AbstractC1880i.I(interfaceC2102hF)) ? a0(d5.e.h(interfaceC2102hF)) : null;
        return l.a(kVarA0, s4.g.f15830c) || l.a(kVarA0, s4.j.f15833c);
    }

    public static final boolean h0(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static final boolean i0(C2224i c2224i) {
        C2224i c2224i2;
        int i7;
        l.f("<this>", c2224i);
        try {
            c2224i2 = new C2224i();
            long j7 = c2224i.f17156l;
            long j8 = 64;
            if (j7 <= 64) {
                j8 = j7;
            }
            c2224i.i(c2224i2, 0L, j8);
        } catch (EOFException unused) {
        }
        for (i7 = 0; i7 < 16; i7++) {
            if (c2224i2.z()) {
                return true;
            }
            int iB0 = c2224i2.b0();
            if (Character.isISOControl(iB0) && !Character.isWhitespace(iB0)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j0(C c2) {
        c2.k().getClass();
        P(c2);
        return P(c2) <= 0.0f;
    }

    public static final boolean k0(AbstractC1586x abstractC1586x) {
        l.f("<this>", abstractC1586x);
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        s4.k kVarA0 = null;
        if (interfaceC2102hF != null && (interfaceC2102hF instanceof InterfaceC2099e) && AbstractC1880i.I(interfaceC2102hF)) {
            kVarA0 = a0(d5.e.h(interfaceC2102hF));
        }
        return l.a(kVarA0, s4.j.f15833c);
    }

    public static final int l0(R4.C c2) {
        int i7 = c2 == null ? -1 : y.a[c2.ordinal()];
        if (i7 != 1) {
            int i8 = 2;
            if (i7 != 2) {
                i8 = 3;
                if (i7 != 3) {
                    i8 = 4;
                    if (i7 != 4) {
                    }
                }
            }
            return i8;
        }
        return 1;
    }

    public static C1846b m0(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j7;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i7 = byteBufferDuplicate.getShort() & 65535;
        if (i7 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                j7 = -1;
                break;
            }
            int i9 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j7 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i9) {
                break;
            }
            i8++;
        }
        if (j7 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j7 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j8 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i10 = 0; i10 < j8; i10++) {
                int i11 = byteBufferDuplicate.getInt();
                long j9 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i11 || 1701669481 == i11) {
                    byteBufferDuplicate.position((int) (j9 + j7));
                    C1846b c1846b = new C1846b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c1846b.f7975n = byteBufferDuplicate;
                    c1846b.f7972k = iPosition;
                    int i12 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c1846b.f7973l = i12;
                    c1846b.f7974m = ((ByteBuffer) c1846b.f7975n).getShort(i12);
                    return c1846b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static int n0(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static final a0.q o0(a0.q qVar, InterfaceC1946w0 interfaceC1946w0, EnumC1903a0 enumC1903a0, boolean z7, X x7, u.k kVar, z.m mVar, C0510p c0510p, int i7) {
        e0 e0Var;
        a0.q qVar2;
        InterfaceC1946w0 interfaceC1946w02;
        EnumC1903a0 enumC1903a02;
        X x8;
        u.k kVar2;
        boolean z8;
        boolean z9;
        if ((i7 & 64) != 0) {
            mVar = null;
        }
        z.m mVar2 = mVar;
        Context context = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
        c0 c0Var = (c0) c0510p.k(d0.a);
        if (c0Var != null) {
            c0510p.R(1586021609);
            boolean zF = c0510p.f(context) | c0510p.f(c0Var);
            Object objH = c0510p.H();
            if (zF || objH == C0502l.a) {
                objH = new C1831m(context, c0Var);
                c0510p.b0(objH);
            }
            e0Var = (C1831m) objH;
            c0510p.p(false);
        } else {
            c0510p.R(1586120933);
            c0510p.p(false);
            e0Var = b0.f14535m;
        }
        e0 e0Var2 = e0Var;
        EnumC1903a0 enumC1903a03 = EnumC1903a0.f15259k;
        a0.q qVarK = qVar.k(enumC1903a0 == enumC1903a03 ? AbstractC1841x.f14651c : AbstractC1841x.f14650b).k(e0Var2.e());
        if (((T0.k) c0510p.k(AbstractC2455l0.f18793l)) != T0.k.f8845l || enumC1903a0 == enumC1903a03) {
            qVar2 = qVarK;
            interfaceC1946w02 = interfaceC1946w0;
            enumC1903a02 = enumC1903a0;
            x8 = x7;
            kVar2 = kVar;
            z8 = true;
            z9 = z7;
        } else {
            qVar2 = qVarK;
            interfaceC1946w02 = interfaceC1946w0;
            z9 = z7;
            x8 = x7;
            kVar2 = kVar;
            z8 = false;
            enumC1903a02 = enumC1903a0;
        }
        return androidx.compose.foundation.gestures.a.b(qVar2, interfaceC1946w02, enumC1903a02, e0Var2, z9, z8, x8, kVar2, mVar2);
    }

    public static final void p0(InterfaceC1424c interfaceC1424c) throws SecurityException {
        InterfaceC1801g interfaceC1801gF;
        InterfaceC1801g interfaceC1801gH;
        if (interfaceC1424c instanceof InterfaceC1434m) {
            InterfaceC1443v interfaceC1443v = (InterfaceC1443v) interfaceC1424c;
            Field fieldS = AbstractC0915m.s(interfaceC1443v);
            if (fieldS != null) {
                fieldS.setAccessible(true);
            }
            Method methodT = AbstractC0915m.t(interfaceC1443v.getGetter());
            if (methodT != null) {
                methodT.setAccessible(true);
            }
            Method methodT2 = AbstractC0915m.t(((InterfaceC1434m) interfaceC1424c).getSetter());
            if (methodT2 != null) {
                methodT2.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC1424c instanceof InterfaceC1443v) {
            InterfaceC1443v interfaceC1443v2 = (InterfaceC1443v) interfaceC1424c;
            Field fieldS2 = AbstractC0915m.s(interfaceC1443v2);
            if (fieldS2 != null) {
                fieldS2.setAccessible(true);
            }
            Method methodT3 = AbstractC0915m.t(interfaceC1443v2.getGetter());
            if (methodT3 != null) {
                methodT3.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC1424c instanceof InterfaceC1438q) {
            Field fieldS3 = AbstractC0915m.s(((InterfaceC1438q) interfaceC1424c).d());
            if (fieldS3 != null) {
                fieldS3.setAccessible(true);
            }
            Method methodT4 = AbstractC0915m.t((InterfaceC1428g) interfaceC1424c);
            if (methodT4 != null) {
                methodT4.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC1424c instanceof InterfaceC1429h) {
            Field fieldS4 = AbstractC0915m.s(((InterfaceC1429h) interfaceC1424c).d());
            if (fieldS4 != null) {
                fieldS4.setAccessible(true);
            }
            Method methodT5 = AbstractC0915m.t((InterfaceC1428g) interfaceC1424c);
            if (methodT5 != null) {
                methodT5.setAccessible(true);
                return;
            }
            return;
        }
        if (!(interfaceC1424c instanceof InterfaceC1428g)) {
            throw new UnsupportedOperationException("Unknown callable: " + interfaceC1424c + " (" + interfaceC1424c.getClass() + ')');
        }
        InterfaceC1428g interfaceC1428g = (InterfaceC1428g) interfaceC1424c;
        Method methodT6 = AbstractC0915m.t(interfaceC1428g);
        if (methodT6 != null) {
            methodT6.setAccessible(true);
        }
        AbstractC1694t abstractC1694tA = F0.a(interfaceC1424c);
        Object objB = (abstractC1694tA == null || (interfaceC1801gH = abstractC1694tA.h()) == null) ? null : interfaceC1801gH.b();
        AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        AbstractC1694t abstractC1694tA2 = F0.a(interfaceC1428g);
        Object objB2 = (abstractC1694tA2 == null || (interfaceC1801gF = abstractC1694tA2.f()) == null) ? null : interfaceC1801gF.b();
        Constructor constructor = objB2 instanceof Constructor ? (Constructor) objB2 : null;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
    }

    public static int[] q0(Collection collection) {
        if (collection instanceof m3.b) {
            m3.b bVar = (m3.b) collection;
            return Arrays.copyOfRange(bVar.f12971k, bVar.f12972l, bVar.f12973m);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static String r0(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c2 = charArray[i7];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i7] = (char) (c2 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String s0(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c2 = charArray[i7];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i7] = (char) (c2 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static final Class t0(ClassLoader classLoader, String str) {
        l.f("fqName", str);
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer u0(java.lang.String r21) {
        /*
            r0 = r21
            r1 = 1
            r0.getClass()
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L10
        Ld:
            r0 = r3
            goto L85
        L10:
            r2 = 0
            char r4 = r0.charAt(r2)
            r5 = 45
            if (r4 != r5) goto L1a
            r2 = r1
        L1a:
            int r4 = r0.length()
            if (r2 != r4) goto L21
            goto Ld
        L21:
            int r4 = r2 + 1
            char r5 = r0.charAt(r2)
            r6 = -1
            r7 = 128(0x80, float:1.794E-43)
            if (r5 >= r7) goto L31
            byte[] r8 = m3.c.a
            r5 = r8[r5]
            goto L34
        L31:
            byte[] r5 = m3.c.a
            r5 = r6
        L34:
            if (r5 < 0) goto Ld
            r8 = 10
            if (r5 < r8) goto L3b
            goto Ld
        L3b:
            int r5 = -r5
            long r9 = (long) r5
            long r11 = (long) r8
            r13 = -9223372036854775808
            long r15 = r13 / r11
        L42:
            int r5 = r0.length()
            if (r4 >= r5) goto L72
            int r5 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 >= r7) goto L55
            byte[] r17 = m3.c.a
            r4 = r17[r4]
            goto L58
        L55:
            byte[] r4 = m3.c.a
            r4 = r6
        L58:
            if (r4 < 0) goto Ld
            if (r4 >= r8) goto Ld
            int r17 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r17 >= 0) goto L61
            goto Ld
        L61:
            long r9 = r9 * r11
            r18 = r2
            long r1 = (long) r4
            long r19 = r1 + r13
            int r4 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r4 >= 0) goto L6c
            goto Ld
        L6c:
            long r9 = r9 - r1
            r4 = r5
            r2 = r18
            r1 = 1
            goto L42
        L72:
            r18 = r2
            if (r18 == 0) goto L7b
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            goto L85
        L7b:
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 != 0) goto L80
            goto Ld
        L80:
            long r0 = -r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L85:
            if (r0 == 0) goto L9e
            long r1 = r0.longValue()
            int r4 = r0.intValue()
            long r4 = (long) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L95
            goto L9e
        L95:
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.AbstractC0871d.u0(java.lang.String):java.lang.Integer");
    }

    public static final O v0(InterfaceC1425d interfaceC1425d, W w7, AbstractC2148b abstractC2148b, C0510p c0510p) {
        U uO;
        if (w7 instanceof InterfaceC0684k) {
            V vE = w7.e();
            androidx.lifecycle.Q qC = ((InterfaceC0684k) w7).c();
            l.f("factory", qC);
            l.f("extras", abstractC2148b);
            uO = new U(vE, qC, abstractC2148b);
        } else {
            uO = R1.i.o(w7, null, 6);
        }
        l.f("modelClass", interfaceC1425d);
        String strK = interfaceC1425d.k();
        if (strK == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return ((A2.b) uO.a).w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK), interfaceC1425d);
    }

    @Override // Y5.b
    public void A(SerialDescriptor serialDescriptor, int i7, boolean z7) {
        l.f("descriptor", serialDescriptor);
        Q(serialDescriptor, i7);
        l(z7);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void C(String str) {
        l.f("value", str);
        R(str);
    }

    @Override // Y5.b
    public void D(C0640i0 c0640i0, int i7, short s7) {
        l.f("descriptor", c0640i0);
        Q(c0640i0, i7);
        h(s7);
    }

    @Override // Y5.b
    public void E(SerialDescriptor serialDescriptor, int i7, String str) {
        l.f("descriptor", serialDescriptor);
        l.f("value", str);
        Q(serialDescriptor, i7);
        C(str);
    }

    public void F(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        l.f("descriptor", serialDescriptor);
        l.f("serializer", kSerializer);
        Q(serialDescriptor, i7);
        super.B(kSerializer, obj);
    }

    public void Q(SerialDescriptor serialDescriptor, int i7) {
        l.f("descriptor", serialDescriptor);
    }

    public void R(Object obj) {
        l.f("value", obj);
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        sb.append(zVar.b(cls));
        sb.append(" is not supported by ");
        sb.append(zVar.b(getClass()));
        sb.append(" encoder");
        throw new V5.j(sb.toString());
    }

    public Object X(int i7) {
        C2326g c2326gG = b0().g(i7);
        return c2326gG.f17622c.getType().invoke(Integer.valueOf(i7 - c2326gG.a));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Y5.b a(SerialDescriptor serialDescriptor) {
        l.f("descriptor", serialDescriptor);
        return this;
    }

    public void b(SerialDescriptor serialDescriptor) {
        l.f("descriptor", serialDescriptor);
    }

    public abstract H b0();

    public Object c0(int i7) {
        Object objInvoke;
        C2326g c2326gG = b0().g(i7);
        int i8 = i7 - c2326gG.a;
        e4.k key = c2326gG.f17622c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i8))) == null) ? new C2324e(i7) : objInvoke;
    }

    @Override // Y5.b
    public void d(C0640i0 c0640i0, int i7, byte b4) {
        l.f("descriptor", c0640i0);
        Q(c0640i0, i7);
        k(b4);
    }

    @Override // Y5.b
    public void e(C0640i0 c0640i0, int i7, char c2) {
        l.f("descriptor", c0640i0);
        Q(c0640i0, i7);
        w(c2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void f() {
        throw new V5.j("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void g(double d4) {
        R(Double.valueOf(d4));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void h(short s7) {
        R(Short.valueOf(s7));
    }

    @Override // Y5.b
    public void j(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        l.f("descriptor", serialDescriptor);
        l.f("serializer", kSerializer);
        Q(serialDescriptor, i7);
        r(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void k(byte b4) {
        R(Byte.valueOf(b4));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void l(boolean z7) {
        R(Boolean.valueOf(z7));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void m(SerialDescriptor serialDescriptor, int i7) {
        l.f("enumDescriptor", serialDescriptor);
        R(Integer.valueOf(i7));
    }

    @Override // Y5.b
    public void n(C0640i0 c0640i0, int i7, double d4) {
        l.f("descriptor", c0640i0);
        Q(c0640i0, i7);
        g(d4);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(int i7) {
        R(Integer.valueOf(i7));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder p(SerialDescriptor serialDescriptor) {
        l.f("descriptor", serialDescriptor);
        return this;
    }

    @Override // Y5.b
    public void q(int i7, int i8, SerialDescriptor serialDescriptor) {
        l.f("descriptor", serialDescriptor);
        Q(serialDescriptor, i7);
        o(i8);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void s(float f5) {
        R(Float.valueOf(f5));
    }

    @Override // Y5.b
    public Encoder t(C0640i0 c0640i0, int i7) {
        l.f("descriptor", c0640i0);
        Q(c0640i0, i7);
        return p(c0640i0.j(i7));
    }

    @Override // Y5.b
    public void u(C0640i0 c0640i0, int i7, float f5) {
        l.f("descriptor", c0640i0);
        Q(c0640i0, i7);
        s(f5);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void v(long j7) {
        R(Long.valueOf(j7));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void w(char c2) {
        R(Character.valueOf(c2));
    }

    @Override // Y5.b
    public void x(SerialDescriptor serialDescriptor, int i7, long j7) {
        l.f("descriptor", serialDescriptor);
        Q(serialDescriptor, i7);
        v(j7);
    }

    public boolean z(SerialDescriptor serialDescriptor) {
        l.f("descriptor", serialDescriptor);
        return true;
    }
}
