package l4;

import A4.C0008a;
import B1.AbstractC0015b;
import D4.S;
import H.C0197n;
import H.C0198o;
import H.C0200q;
import H.InterfaceC0194k;
import H.N;
import H4.AbstractC0252f;
import H5.J;
import R4.h0;
import Z5.k0;
import Z5.l0;
import a5.C0667a;
import a5.C0669c;
import a5.C0670d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Xml;
import b1.AbstractC0703b;
import c1.C0748b;
import c1.C0749c;
import c1.C0750d;
import c1.InterfaceC0747a;
import e5.C0833c;
import e5.EnumC0834d;
import f1.AbstractC0870c;
import g1.C0936d;
import h0.C0975U;
import h0.C0998u;
import io.ktor.http.ContentType;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m5.C1513b;
import m5.C1523l;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import n5.C1582t;
import n5.C1588z;
import n5.Q;
import n5.T;
import n5.b0;
import o4.AbstractC1668a;
import o4.v0;
import o4.z0;
import org.xmlpull.v1.XmlPullParserException;
import r4.AbstractC1880i;
import u4.InterfaceC2097c;
import z5.AbstractC2510o;
import z5.AbstractC2511p;
import z5.AbstractC2517v;

/* renamed from: l4.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1420H {
    public static C0008a a;

    /* renamed from: b, reason: collision with root package name */
    public static C1538e f12744b;

    /* renamed from: c, reason: collision with root package name */
    public static C1538e f12745c;

    /* renamed from: d, reason: collision with root package name */
    public static C1538e f12746d;

    /* renamed from: e, reason: collision with root package name */
    public static C1538e f12747e;

    /* renamed from: f, reason: collision with root package name */
    public static C1538e f12748f;

    /* renamed from: g, reason: collision with root package name */
    public static C1538e f12749g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f12750h;

    public AbstractC1420H() {
        new ConcurrentHashMap();
    }

    public static final C1538e B() {
        C1538e c1538e = f12745c;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Campaign", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(18.0f, 11.0f);
        s7.A(2.0f);
        s7.r(4.0f);
        s7.A(-2.0f);
        s7.r(-4.0f);
        s7.m();
        s7.u(16.0f, 17.61f);
        s7.o(0.96f, 0.71f, 2.21f, 1.65f, 3.2f, 2.39f);
        s7.o(0.4f, -0.53f, 0.8f, -1.07f, 1.2f, -1.6f);
        s7.o(-0.99f, -0.74f, -2.24f, -1.68f, -3.2f, -2.4f);
        s7.o(-0.4f, 0.54f, -0.8f, 1.08f, -1.2f, 1.61f);
        s7.m();
        s7.u(20.4f, 5.6f);
        s7.o(-0.4f, -0.53f, -0.8f, -1.07f, -1.2f, -1.6f);
        s7.o(-0.99f, 0.74f, -2.24f, 1.68f, -3.2f, 2.4f);
        s7.o(0.4f, 0.53f, 0.8f, 1.07f, 1.2f, 1.6f);
        s7.o(0.96f, -0.72f, 2.21f, -1.65f, 3.2f, -2.4f);
        s7.m();
        s7.u(4.0f, 9.0f);
        s7.o(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s7.A(2.0f);
        s7.o(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s7.r(1.0f);
        s7.A(4.0f);
        s7.r(2.0f);
        s7.A(-4.0f);
        s7.r(1.0f);
        s7.t(5.0f, 3.0f);
        s7.s(13.0f, 6.0f);
        s7.s(8.0f, 9.0f);
        s7.s(4.0f, 9.0f);
        s7.m();
        s7.u(15.5f, 12.0f);
        s7.o(0.0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f);
        s7.A(6.69f);
        s7.o(0.92f, -0.81f, 1.5f, -2.01f, 1.5f, -3.34f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f12745c = c1538eB;
        return c1538eB;
    }

    public static final C1538e C() {
        C1538e c1538e = f12744b;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("AutoMirrored.Filled.ExitToApp", true);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(10.09f, 15.59f);
        s7.s(11.5f, 17.0f);
        s7.t(5.0f, -5.0f);
        s7.t(-5.0f, -5.0f);
        s7.t(-1.41f, 1.41f);
        s7.s(12.67f, 11.0f);
        s7.q(3.0f);
        s7.A(2.0f);
        s7.r(9.67f);
        s7.t(-2.58f, 2.59f);
        s7.m();
        s7.u(19.0f, 3.0f);
        s7.q(5.0f);
        s7.o(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s7.A(4.0f);
        s7.r(2.0f);
        s7.z(5.0f);
        s7.r(14.0f);
        s7.A(14.0f);
        s7.q(5.0f);
        s7.A(-4.0f);
        s7.q(3.0f);
        s7.A(4.0f);
        s7.o(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        s7.r(14.0f);
        s7.o(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s7.z(5.0f);
        s7.o(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f12744b = c1538eB;
        return c1538eB;
    }

    public static final Type D(InterfaceC1444w interfaceC1444w) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1444w);
        if (interfaceC1444w instanceof AbstractC1668a) {
            z0 z0Var = ((v0) ((AbstractC1668a) interfaceC1444w)).f13768m;
            Type type = z0Var != null ? (Type) z0Var.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return p(interfaceC1444w, false);
    }

    public static final Type E(C1447z c1447z) {
        EnumC1413A enumC1413A = c1447z.a;
        if (enumC1413A == null) {
            return C1421I.f12751c;
        }
        InterfaceC1444w interfaceC1444w = c1447z.f12759b;
        kotlin.jvm.internal.l.c(interfaceC1444w);
        int iOrdinal = enumC1413A.ordinal();
        if (iOrdinal == 0) {
            return p(interfaceC1444w, true);
        }
        if (iOrdinal == 1) {
            return new C1421I(null, p(interfaceC1444w, true));
        }
        if (iOrdinal == 2) {
            return new C1421I(p(interfaceC1444w, true), null);
        }
        throw new D6.r();
    }

    public static boolean F(InterfaceC2097c interfaceC2097c) {
        kotlin.jvm.internal.l.f("callableMemberDescriptor", interfaceC2097c);
        if (!AbstractC0252f.f3732d.contains(interfaceC2097c.getName())) {
            return false;
        }
        if (P3.q.m0(AbstractC0252f.f3731c, d5.e.c(interfaceC2097c)) && interfaceC2097c.m0().isEmpty()) {
            return true;
        }
        if (!AbstractC1880i.z(interfaceC2097c)) {
            return false;
        }
        Collection collectionM = interfaceC2097c.m();
        kotlin.jvm.internal.l.e("getOverriddenDescriptors(...)", collectionM);
        Collection<InterfaceC2097c> collection = collectionM;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC2097c interfaceC2097c2 : collection) {
            kotlin.jvm.internal.l.c(interfaceC2097c2);
            if (F(interfaceC2097c2)) {
                return true;
            }
        }
        return false;
    }

    public static final int G(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    public static InterfaceC0747a H(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            L(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), Z0.a.a);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                L(xmlResourceParser);
            }
            List listI = I(resources, resourceId);
            return new C0750d(new C0936d(string, string2, string3, listI), string4 != null ? new C0936d(string, string2, string4, listI) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals(ContentType.Font.TYPE)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), Z0.a.f10246b);
                    int i7 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z7 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i8 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i9 = typedArrayObtainAttributes2.getInt(i8, 0);
                    int i10 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i10, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i10);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        L(xmlResourceParser);
                    }
                    arrayList.add(new C0749c(i7, i9, resourceId2, string7, string6, z7));
                } else {
                    L(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0748b((C0749c[]) arrayList.toArray(new C0749c[0]));
    }

    public static List I(Resources resources, int i7) throws Resources.NotFoundException {
        if (i7 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i8 = 0; i8 < typedArrayObtainTypedArray.length(); i8++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i7);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static S4.a J(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        k4.g gVar = new k4.g(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(P3.r.p(gVar, 10));
        k4.f fVarA = gVar.iterator();
        while (fVarA.f12677m) {
            fVarA.a();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrR0 = P3.q.R0(arrayList);
        return new S4.a(Arrays.copyOf(iArrR0, iArrR0.length));
    }

    public static Set K(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.l.e("singleton(...)", setSingleton);
        return setSingleton;
    }

    public static void L(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    public static A5.h M(int i7, V1.k kVar, B1.B b4) throws y1.E {
        A5.h hVarA = A5.h.a(kVar, b4);
        while (true) {
            int i8 = hVarA.f256k;
            if (i8 == i7) {
                return hVarA;
            }
            A6.b.n(i8, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j7 = hVarA.f257l;
            long j8 = 8 + j7;
            if (j7 % 2 != 0) {
                j8 = 9 + j7;
            }
            if (j8 > 2147483647L) {
                throw y1.E.b("Chunk is too large (~2GB+) to skip; id: " + i8);
            }
            kVar.f((int) j8);
            hVarA = A5.h.a(kVar, b4);
        }
    }

    public static final W4.c N(W4.c cVar, W4.c cVar2) {
        kotlin.jvm.internal.l.f("<this>", cVar);
        kotlin.jvm.internal.l.f("prefix", cVar2);
        boolean zEquals = cVar.equals(cVar2);
        W4.d dVar = cVar.a;
        W4.d dVar2 = cVar2.a;
        if (!zEquals && !dVar2.c()) {
            String str = dVar.a;
            String str2 = dVar2.a;
            if (!AbstractC2517v.T(str, str2, false) || str.charAt(str2.length()) != '.') {
                return cVar;
            }
        }
        if (dVar2.c()) {
            return cVar;
        }
        if (cVar.equals(cVar2)) {
            return W4.c.f9618c;
        }
        String strSubstring = dVar.a.substring(dVar2.a.length() + 1);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return new W4.c(strSubstring);
    }

    public static final long O(long j7) {
        return AbstractC0870c.F((int) (j7 >> 32), (int) (j7 & 4294967295L));
    }

    public static F.w P(E3.a aVar) {
        O5.d dVar = F3.a.a;
        kotlin.jvm.internal.l.f("dispatcher", dVar);
        return new F.w(15, aVar, dVar);
    }

    public static final Object Q(J5.v vVar, Object obj) {
        Object objMo2trySendJP2dKIU = vVar.mo2trySendJP2dKIU(obj);
        if (objMo2trySendJP2dKIU instanceof J5.l) {
            return ((J5.m) H5.D.B(S3.i.f8767k, new J5.o(vVar, obj, null))).a;
        }
        return O3.C.a;
    }

    public static T R(T t7) {
        if (!(t7 instanceof C1582t)) {
            return new C0670d(t7, 0);
        }
        C1582t c1582t = (C1582t) t7;
        Q[] qArr = c1582t.f13412c;
        u4.Q[] qArr2 = c1582t.f13411b;
        ArrayList arrayListW0 = P3.m.w0(qArr, qArr2);
        ArrayList arrayList = new ArrayList(P3.r.p(arrayListW0, 10));
        Iterator it = arrayListW0.iterator();
        while (it.hasNext()) {
            O3.l lVar = (O3.l) it.next();
            arrayList.add(r((Q) lVar.f7528k, (u4.Q) lVar.f7529l));
        }
        return new C1582t(qArr2, (Q[]) arrayList.toArray(new Q[0]), true);
    }

    public static final long a(int i7, int i8) {
        return (i8 & 4294967295L) | (i7 << 32);
    }

    public static final k0 b(String str) {
        X5.e eVar = X5.e.f9937p;
        if (AbstractC2510o.g0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((F5.k) l0.a.values()).iterator();
        while (((Q3.f) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((Q3.d) it).next();
            if (str.equals(kSerializer.getDescriptor().e())) {
                StringBuilder sbQ = AbstractC0703b.q("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbQ.append(kotlin.jvm.internal.y.a.b(kSerializer.getClass()).n());
                sbQ.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(AbstractC2511p.E(sbQ.toString()));
            }
        }
        return new k0(str, eVar);
    }

    public static final long c(int i7, int i8) {
        if (i7 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i7 + ", end: " + i8 + ']').toString());
        }
        if (i8 >= 0) {
            long j7 = (i8 & 4294967295L) | (i7 << 32);
            int i9 = H0.H.f3092c;
            return j7;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i7 + ", end: " + i8 + ']').toString());
    }

    public static final C0198o d(N n7, InterfaceC0194k interfaceC0194k) {
        boolean z7 = n7.f() == 1;
        B1.s sVar = (B1.s) n7.f2902d;
        return new C0198o(g(sVar, z7, true, interfaceC0194k), g(sVar, z7, false, interfaceC0194k), z7);
    }

    public static final String e(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        y5.h hVarS = y5.k.S(C1419G.f12743k, type);
        return ((Class) y5.k.T(hVarS)).getName() + AbstractC2517v.P(y5.k.O(hVarS), "[]");
    }

    public static final C0197n f(N n7, B1.s sVar, C0197n c0197n) {
        boolean z7 = n7.f2900b;
        int i7 = sVar.f359c;
        int i8 = sVar.f358b;
        int i9 = z7 ? i8 : i7;
        O3.j jVar = O3.j.f7526l;
        O3.i iVarB = z1.c.B(jVar, new H.r(sVar, i9));
        O3.i iVarB2 = z1.c.B(jVar, new C0200q(sVar, i9, z7 ? i7 : i8, n7, iVarB));
        if (1 != c0197n.f2990c) {
            return (C0197n) iVarB2.getValue();
        }
        int i10 = sVar.f360d;
        if (i9 == i10) {
            return c0197n;
        }
        H0.F f5 = (H0.F) sVar.f361e;
        if (((Number) iVarB.getValue()).intValue() != f5.e(i10)) {
            return (C0197n) iVarB2.getValue();
        }
        int i11 = c0197n.f2989b;
        long jK = f5.k(i11);
        if (i10 != -1) {
            if (i9 != i10) {
                if (!(z7 ^ (i8 >= i7 && i8 > i7))) {
                }
            }
            return sVar.b(i9);
        }
        int i12 = H0.H.f3092c;
        return (i11 == ((int) (jK >> 32)) || i11 == ((int) (4294967295L & jK))) ? (C0197n) iVarB2.getValue() : sVar.b(i9);
    }

    public static final C0197n g(B1.s sVar, boolean z7, boolean z8, InterfaceC0194k interfaceC0194k) {
        long j7;
        long jA = interfaceC0194k.a(sVar, z8 ? sVar.f358b : sVar.f359c);
        if (z7 ^ z8) {
            int i7 = H0.H.f3092c;
            j7 = jA >> 32;
        } else {
            int i8 = H0.H.f3092c;
            j7 = 4294967295L & jA;
        }
        return sVar.b((int) j7);
    }

    public static final Object h(Object obj, boolean z7) {
        EnumC0834d enumC0834d;
        kotlin.jvm.internal.l.f("possiblyPrimitiveType", obj);
        if (z7) {
            obj = (P4.k) obj;
            if ((obj instanceof P4.j) && (enumC0834d = ((P4.j) obj).f7803i) != null) {
                W4.c cVar = enumC0834d.f11375n;
                if (cVar == null) {
                    EnumC0834d.a(15);
                    throw null;
                }
                String strD = C0833c.b(cVar).d();
                kotlin.jvm.internal.l.e("getInternalName(...)", strD);
                return P4.f.e(strD);
            }
        }
        return obj;
    }

    public static final X5.g i(String str, SerialDescriptor[] serialDescriptorArr, e4.k kVar) {
        if (AbstractC2510o.g0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        X5.a aVar = new X5.a(str);
        kVar.invoke(aVar);
        return new X5.g(str, X5.j.f9951h, aVar.f9920c.size(), P3.m.u0(serialDescriptorArr), aVar);
    }

    public static final X5.g j(String str, n6.d dVar, SerialDescriptor[] serialDescriptorArr, e4.k kVar) {
        kotlin.jvm.internal.l.f("serialName", str);
        if (AbstractC2510o.g0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (dVar.equals(X5.j.f9951h)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        X5.a aVar = new X5.a(str);
        kVar.invoke(aVar);
        return new X5.g(str, dVar, aVar.f9920c.size(), P3.m.u0(serialDescriptorArr), aVar);
    }

    public static X5.g k(String str, n6.d dVar, SerialDescriptor[] serialDescriptorArr) {
        kotlin.jvm.internal.l.f("serialName", str);
        if (AbstractC2510o.g0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (dVar.equals(X5.j.f9951h)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        X5.a aVar = new X5.a(str);
        return new X5.g(str, dVar, aVar.f9920c.size(), P3.m.u0(serialDescriptorArr), aVar);
    }

    public static final void l(J5.u uVar, Throwable th) {
        CancellationException cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = H5.D.a("Channel was consumed, consumer had failed", th);
        }
        uVar.e(cancellationExceptionA);
    }

    public static final C0197n m(C0197n c0197n, B1.s sVar, int i7) {
        return new C0197n(((H0.F) sVar.f361e).a(i7), i7, c0197n.f2990c);
    }

    public static boolean n(V1.k kVar) {
        B1.B b4 = new B1.B(8);
        int i7 = A5.h.a(kVar, b4).f256k;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        kVar.h(b4.a, 0, 4, false);
        b4.F(0);
        int iG = b4.g();
        if (iG == 1463899717) {
            return true;
        }
        AbstractC0015b.m("WavHeaderReader", "Unsupported form type: " + iG);
        return false;
    }

    public static final long o(int i7, long j7) {
        int i8 = H0.H.f3092c;
        int i9 = (int) (j7 >> 32);
        int iK = e3.c.k(i9, 0, i7);
        int i10 = (int) (4294967295L & j7);
        int iK2 = e3.c.k(i10, 0, i7);
        return (iK == i9 && iK2 == i10) ? j7 : c(iK, iK2);
    }

    public static final Type p(InterfaceC1444w interfaceC1444w, boolean z7) {
        InterfaceC1426e interfaceC1426eC = interfaceC1444w.c();
        if (interfaceC1426eC instanceof InterfaceC1445x) {
            return new C1417E((InterfaceC1445x) interfaceC1426eC);
        }
        if (!(interfaceC1426eC instanceof InterfaceC1425d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + interfaceC1444w);
        }
        InterfaceC1425d interfaceC1425d = (InterfaceC1425d) interfaceC1426eC;
        Class clsG = z7 ? n6.m.G(interfaceC1425d) : n6.m.F(interfaceC1425d);
        List listA = interfaceC1444w.a();
        if (listA.isEmpty()) {
            return clsG;
        }
        if (!clsG.isArray()) {
            return x(clsG, listA);
        }
        if (clsG.getComponentType().isPrimitive()) {
            return clsG;
        }
        C1447z c1447z = (C1447z) P3.q.M0(listA);
        if (c1447z == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + interfaceC1444w);
        }
        EnumC1413A enumC1413A = c1447z.a;
        int i7 = enumC1413A == null ? -1 : AbstractC1418F.a[enumC1413A.ordinal()];
        if (i7 == -1 || i7 == 1) {
            return clsG;
        }
        if (i7 != 2 && i7 != 3) {
            throw new D6.r();
        }
        InterfaceC1444w interfaceC1444w2 = c1447z.f12759b;
        kotlin.jvm.internal.l.c(interfaceC1444w2);
        Type typeP = p(interfaceC1444w2, false);
        return typeP instanceof Class ? clsG : new C1422a(typeP);
    }

    public static T4.k q(h0 h0Var) {
        kotlin.jvm.internal.l.f("table", h0Var);
        if (h0Var.f8493l.size() == 0) {
            return T4.k.f9115b;
        }
        List list = h0Var.f8493l;
        kotlin.jvm.internal.l.e("getRequirementList(...)", list);
        return new T4.k(list);
    }

    public static final Q r(Q q6, u4.Q q7) {
        if (q7 == null || q6.a() == b0.f13390m) {
            return q6;
        }
        if (q7.R() != q6.a()) {
            C0669c c0669c = new C0669c(q6);
            n5.I.f13362l.getClass();
            return new n5.G(new C0667a(q6, c0669c, false, n5.I.f13363m));
        }
        if (!q6.c()) {
            return new n5.G(q6.b());
        }
        C1513b c1513b = C1523l.f12991e;
        kotlin.jvm.internal.l.e("NO_LOCKS", c1513b);
        return new n5.G(new C1588z(c1513b, new H4.u(5, q6)));
    }

    public static final C1416D x(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(P3.r.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(E((C1447z) it.next()));
            }
            return new C1416D(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(P3.r.p(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(E((C1447z) it2.next()));
            }
            return new C1416D(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C1416D c1416dX = x(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(P3.r.p(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(E((C1447z) it3.next()));
        }
        return new C1416D(cls, c1416dX, arrayList3);
    }

    public static final void y(Throwable th, S3.c cVar) throws Throwable {
        if (th instanceof J) {
            th = ((J) th).f3811k;
        }
        cVar.resumeWith(P3.r.r(th));
        throw th;
    }

    public static final V3.b z(Enum[] enumArr) {
        kotlin.jvm.internal.l.f("entries", enumArr);
        return new V3.b(enumArr);
    }

    public g1.i A(g1.i[] iVarArr) {
        g1.i iVar = null;
        int i7 = Integer.MAX_VALUE;
        for (g1.i iVar2 : iVarArr) {
            int iAbs = (iVar2.f11688d ? 1 : 0) + (Math.abs(iVar2.f11687c - 400) * 2);
            if (iVar == null || i7 > iAbs) {
                iVar = iVar2;
                i7 = iAbs;
            }
        }
        return iVar;
    }

    public abstract Typeface s(Context context, C0748b c0748b, Resources resources);

    public abstract Typeface t(Context context, g1.i[] iVarArr);

    public Typeface u(Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface v(Context context, InputStream inputStream) {
        File fileH = n6.d.H(context);
        if (fileH == null) {
            return null;
        }
        try {
            if (n6.d.x(fileH, inputStream)) {
                return Typeface.createFromFile(fileH.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileH.delete();
        }
    }

    public Typeface w(Context context, Resources resources, int i7, String str) {
        File fileH = n6.d.H(context);
        if (fileH == null) {
            return null;
        }
        try {
            if (n6.d.w(fileH, resources, i7)) {
                return Typeface.createFromFile(fileH.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileH.delete();
        }
    }
}
