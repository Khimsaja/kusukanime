package n6;

import D.C0053g0;
import D.N0;
import D4.S;
import H0.B;
import H0.C;
import H0.D;
import H0.H;
import H0.s;
import H0.t;
import H5.C0278t;
import H5.J;
import H5.y0;
import I0.x;
import I0.z;
import L4.E;
import M0.q;
import M0.u;
import O.C0486d;
import P3.F;
import S0.p;
import Z5.I;
import a6.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.Layout;
import android.util.Log;
import f6.C0920r;
import h0.C0972Q;
import h0.C0975U;
import h0.C0998u;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import j0.AbstractC1299e;
import j5.InterfaceC1358m;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.y;
import kotlinx.serialization.json.JsonNull;
import l4.AbstractC1420H;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import n5.W;
import s0.C1963h;
import u4.InterfaceC2099e;
import v.c0;
import w0.r;
import x4.C2272S;
import x4.C2283j;
import z0.S0;
import z4.C2493e;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static A2.b f13432b;

    /* renamed from: c, reason: collision with root package name */
    public static C1538e f13433c;

    /* renamed from: d, reason: collision with root package name */
    public static C1538e f13434d;

    /* renamed from: e, reason: collision with root package name */
    public static C1538e f13435e;

    /* renamed from: f, reason: collision with root package name */
    public static C1538e f13436f;

    /* renamed from: g, reason: collision with root package name */
    public static C1538e f13437g;
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i7) {
        this.a = i7;
    }

    public static final float A(Layout layout, int i7, Paint paint) {
        float width;
        float width2;
        x xVar = z.a;
        if (layout.getEllipsisCount(i7) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i7) != -1 || layout.getWidth() >= layout.getLineRight(i7)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i7) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment != null ? K0.d.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final int B(H0.n nVar, long j7, S0 s02) {
        float f5 = s02 != null ? s02.f() : 0.0f;
        int iC = nVar.c(g0.c.e(j7));
        if (g0.c.e(j7) < nVar.d(iC) - f5 || g0.c.e(j7) > nVar.b(iC) + f5 || g0.c.d(j7) < (-f5) || g0.c.d(j7) > nVar.f3130d + f5) {
            return -1;
        }
        return iC;
    }

    public static final long C(C0053g0 c0053g0, g0.d dVar, int i7) {
        N0 n0D = c0053g0.d();
        H0.n nVar = n0D != null ? n0D.a.f3083b : null;
        r rVarC = c0053g0.c();
        return (nVar == null || rVarC == null) ? H.f3091b : nVar.f(dVar.h(rVarC.y(0L)), i7, D.f3073b);
    }

    public static final C1538e D() {
        C1538e c1538e = f13436f;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Settings", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(19.14f, 12.94f);
        s7.o(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        s7.o(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        s7.t(2.03f, -1.58f);
        s7.o(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        s7.t(-1.92f, -3.32f);
        s7.o(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        s7.t(-2.39f, 0.96f);
        s7.o(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        s7.s(14.4f, 2.81f);
        s7.o(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        s7.r(-3.84f);
        s7.o(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        s7.s(9.25f, 5.35f);
        s7.n(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        s7.s(5.24f, 5.33f);
        s7.o(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        s7.s(2.74f, 8.87f);
        s7.n(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        s7.t(2.03f, 1.58f);
        s7.n(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        s7.w(0.02f, 0.64f, 0.07f, 0.94f);
        s7.t(-2.03f, 1.58f);
        s7.o(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        s7.t(1.92f, 3.32f);
        s7.o(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        s7.t(2.39f, -0.96f);
        s7.o(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        s7.t(0.36f, 2.54f);
        s7.o(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        s7.r(3.84f);
        s7.o(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        s7.t(0.36f, -2.54f);
        s7.o(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        s7.t(2.39f, 0.96f);
        s7.o(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        s7.t(1.92f, -3.32f);
        s7.o(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        s7.s(19.14f, 12.94f);
        s7.m();
        s7.u(12.0f, 15.6f);
        s7.o(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        s7.w(1.62f, -3.6f, 3.6f, -3.6f);
        s7.w(3.6f, 1.62f, 3.6f, 3.6f);
        s7.v(13.98f, 15.6f, 12.0f, 15.6f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f13436f = c1538eB;
        return c1538eB;
    }

    public static final long E(double d4) {
        return T((float) d4, 4294967296L);
    }

    public static final long F(int i7) {
        return T(i7, 4294967296L);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z4.C2491c G(j5.AbstractC1368w r4, boolean r5, boolean r6, java.lang.Boolean r7, boolean r8, z4.C2490b r9, T4.f r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.d.G(j5.w, boolean, boolean, java.lang.Boolean, boolean, z4.b, T4.f):z4.c");
    }

    public static File H(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final int I(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    public static A2.b J() {
        A2.b bVar;
        A2.b bVar2 = f13432b;
        if (bVar2 != null) {
            return bVar2;
        }
        try {
            bVar = new A2.b(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]), 1);
        } catch (NoSuchMethodException unused) {
            Object obj = null;
            bVar = new A2.b(obj, obj, obj, obj, 1);
        }
        f13432b = bVar;
        return bVar;
    }

    public static boolean K(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean L(C1963h c1963h) {
        ?? r52 = c1963h.a;
        int size = r52.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((s0.r) r52.get(i7)).f15476i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean M(int i7) {
        int type = Character.getType(i7);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean N(long j7) {
        T0.n[] nVarArr = T0.m.f8847b;
        return (j7 & 1095216660480L) == 0;
    }

    public static final boolean O(int i7) {
        return Character.isWhitespace(i7) || i7 == 160;
    }

    public static final boolean P(int i7) {
        int type;
        return (!O(i7) || (type = Character.getType(i7)) == 14 || type == 13 || i7 == 10) ? false : true;
    }

    public static Boolean Q(Class cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f("clazz", cls);
        Method method = (Method) J().f110l;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, new Object[0]);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Boolean", objInvoke);
        return (Boolean) objInvoke;
    }

    public static MappedByteBuffer R(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final long T(float f5, long j7) {
        long jFloatToIntBits = j7 | (Float.floatToIntBits(f5) & 4294967295L);
        T0.n[] nVarArr = T0.m.f8847b;
        return jFloatToIntBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [U1.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList U(B1.B r30) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.d.U(B1.B):java.util.ArrayList");
    }

    public static final kotlinx.serialization.json.b V(String str, String str2, v vVar) {
        kotlin.jvm.internal.l.f("<this>", vVar);
        return vVar.b(str, a6.l.b(str2));
    }

    public static final void W(v vVar, String str, Boolean bool) {
        I i7 = a6.l.a;
        vVar.b(str, bool == null ? JsonNull.INSTANCE : new a6.r(bool, false, null));
    }

    public static final H0.I X(H0.I i7, T0.k kVar) {
        S0.a aVar;
        S0.m mVar;
        long j7;
        u uVar;
        int i8;
        int i9;
        B b4 = i7.a;
        S0.m mVar2 = C.f3072d;
        S0.m mVar3 = b4.a;
        if (mVar3.equals(S0.l.a)) {
            mVar3 = C.f3072d;
        }
        S0.m mVar4 = mVar3;
        long j8 = b4.f3055b;
        if (N(j8)) {
            j8 = C.a;
        }
        long j9 = j8;
        u uVar2 = b4.f3056c;
        if (uVar2 == null) {
            uVar2 = u.f6415o;
        }
        u uVar3 = uVar2;
        q qVar = b4.f3057d;
        q qVar2 = new q(qVar != null ? qVar.a : 0);
        M0.r rVar = b4.f3058e;
        M0.r rVar2 = new M0.r(rVar != null ? rVar.a : 1);
        M0.j jVar = b4.f3059f;
        if (jVar == null) {
            jVar = M0.j.f6399k;
        }
        M0.j jVar2 = jVar;
        String str = b4.f3060g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j10 = b4.f3061h;
        if (N(j10)) {
            j10 = C.f3070b;
        }
        S0.a aVar2 = b4.f3062i;
        S0.a aVar3 = new S0.a(aVar2 != null ? aVar2.a : 0.0f);
        S0.n nVar = b4.f3063j;
        if (nVar == null) {
            nVar = S0.n.f8718c;
        }
        S0.n nVar2 = nVar;
        O0.b bVar = b4.f3064k;
        if (bVar == null) {
            O0.b bVar2 = O0.b.f7249m;
            B2.l lVar = O0.c.a;
            lVar.getClass();
            i8 = 1;
            LocaleList localeList = LocaleList.getDefault();
            aVar = aVar3;
            synchronized (((A.e) lVar.f418n)) {
                mVar = mVar4;
                try {
                    O0.b bVar3 = (O0.b) lVar.f417m;
                    if (bVar3 == null || localeList != ((LocaleList) lVar.f416l)) {
                        int size = localeList.size();
                        j7 = j9;
                        ArrayList arrayList = new ArrayList(size);
                        int i10 = 0;
                        while (i10 < size) {
                            arrayList.add(new O0.a(localeList.get(i10)));
                            i10++;
                            size = size;
                            uVar3 = uVar3;
                        }
                        uVar = uVar3;
                        O0.b bVar4 = new O0.b(arrayList);
                        lVar.f416l = localeList;
                        lVar.f417m = bVar4;
                        bVar = bVar4;
                    } else {
                        uVar = uVar3;
                        bVar = bVar3;
                        j7 = j9;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            aVar = aVar3;
            mVar = mVar4;
            j7 = j9;
            uVar = uVar3;
            i8 = 1;
        }
        long j11 = b4.f3065l;
        if (j11 == 16) {
            j11 = C.f3071c;
        }
        S0.j jVar3 = b4.f3066m;
        if (jVar3 == null) {
            jVar3 = S0.j.f8715b;
        }
        C0972Q c0972q = b4.f3067n;
        if (c0972q == null) {
            c0972q = C0972Q.f11801d;
        }
        AbstractC1299e abstractC1299e = b4.f3069p;
        if (abstractC1299e == null) {
            abstractC1299e = j0.g.a;
        }
        S0.a aVar4 = aVar;
        O0.b bVar5 = bVar;
        B b7 = new B(mVar, j7, uVar, qVar2, rVar2, jVar2, str2, j10, aVar4, nVar2, bVar5, j11, jVar3, c0972q, b4.f3068o, abstractC1299e);
        int i11 = t.f3153b;
        s sVar = i7.f3094b;
        int i12 = sVar.a;
        int i13 = 5;
        if (i12 == Integer.MIN_VALUE) {
            i12 = 5;
        }
        int i14 = sVar.f3145b;
        if (i14 == 3) {
            int iOrdinal = kVar.ordinal();
            if (iOrdinal != 0) {
                i9 = i8;
                if (iOrdinal != i9) {
                    throw new D6.r();
                }
                i14 = i13;
            } else {
                i14 = 4;
                i9 = 1;
            }
        } else if (i14 == Integer.MIN_VALUE) {
            int iOrdinal2 = kVar.ordinal();
            if (iOrdinal2 != 0) {
                i9 = 1;
                if (iOrdinal2 != 1) {
                    throw new D6.r();
                }
                i13 = 2;
                i14 = i13;
            } else {
                i9 = 1;
                i14 = 1;
            }
        } else {
            i9 = 1;
        }
        long j12 = sVar.f3146c;
        if (N(j12)) {
            j12 = t.a;
        }
        S0.o oVar = sVar.f3147d;
        if (oVar == null) {
            oVar = S0.o.f8720c;
        }
        int i15 = sVar.f3150g;
        if (i15 == 0) {
            i15 = S0.e.f8707b;
        }
        int i16 = i15;
        int i17 = sVar.f3151h;
        int i18 = i17 == Integer.MIN_VALUE ? i9 : i17;
        p pVar = sVar.f3152i;
        if (pVar == null) {
            pVar = p.f8722c;
        }
        return new H0.I(b7, new s(i12, i14, j12, oVar, sVar.f3148e, sVar.f3149f, i16, i18, pVar), i7.f3095c);
    }

    public static LinkedHashSet Y(W4.e eVar, Collection collection, Collection collection2, InterfaceC2099e interfaceC2099e, InterfaceC1358m interfaceC1358m, Z4.k kVar, boolean z7) {
        if (eVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (interfaceC2099e == null) {
            a(15);
            throw null;
        }
        if (interfaceC1358m == null) {
            a(16);
            throw null;
        }
        if (kVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kVar.h(eVar, collection, collection2, interfaceC2099e, new I4.a(interfaceC1358m, linkedHashSet, z7));
        return linkedHashSet;
    }

    public static LinkedHashSet Z(W4.e eVar, AbstractCollection abstractCollection, Collection collection, InterfaceC2099e interfaceC2099e, InterfaceC1358m interfaceC1358m, Z4.k kVar) {
        if (eVar == null) {
            a(0);
            throw null;
        }
        if (interfaceC2099e == null) {
            a(3);
            throw null;
        }
        if (interfaceC1358m == null) {
            a(4);
            throw null;
        }
        if (kVar != null) {
            return Y(eVar, abstractCollection, collection, interfaceC2099e, interfaceC1358m, kVar, false);
        }
        a(5);
        throw null;
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 18 ? 3 : 2];
        switch (i7) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i7 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i7) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static LinkedHashSet a0(W4.e eVar, Collection collection, AbstractCollection abstractCollection, L4.i iVar, C2493e c2493e, Z4.k kVar) {
        if (eVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (iVar == null) {
            a(9);
            throw null;
        }
        if (c2493e == null) {
            a(10);
            throw null;
        }
        if (kVar != null) {
            return Y(eVar, collection, abstractCollection, iVar, c2493e, kVar, true);
        }
        a(11);
        throw null;
    }

    public static final W4.b b(String str) {
        W4.c cVar = W4.h.a;
        return new W4.b(W4.h.f9640h, W4.e.e(str));
    }

    public static final void b0(P.D d4, int i7, int i8) {
        int i9 = 1 << i7;
        int i10 = d4.f7649o;
        if ((i10 & i9) == 0) {
            d4.f7649o = i9 | i10;
            d4.f7645k[(d4.f7646l - d4.e0().a) + i7] = i8;
        } else {
            C0486d.U("Already pushed argument " + d4.e0().b(i7));
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(s0.C1953A r7, U3.a r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof H.C0201s
            if (r0 == 0) goto L13
            r0 = r8
            H.s r0 = (H.C0201s) r0
            int r1 = r0.f3008m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3008m = r1
            goto L18
        L13:
            H.s r0 = new H.s
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3007l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f3008m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            s0.A r7 = r0.f3006k
            P3.r.Y(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            P3.r.Y(r8)
        L34:
            s0.i r8 = s0.EnumC1964i.f15462l
            r0.f3006k = r7
            r0.f3008m = r3
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            s0.h r8 = (s0.C1963h) r8
            java.lang.Object r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            s0.r r6 = (s0.r) r6
            boolean r6 = s0.AbstractC1971p.a(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.d.c(s0.A, U3.a):java.lang.Object");
    }

    public static final void c0(P.D d4, int i7, Object obj) {
        int i8 = 1 << i7;
        int i9 = d4.f7650p;
        if ((i9 & i8) == 0) {
            d4.f7650p = i8 | i9;
            d4.f7647m[(d4.f7648n - d4.e0().f7642b) + i7] = obj;
        } else {
            C0486d.U("Already pushed argument " + d4.e0().c(i7));
            throw null;
        }
    }

    public static final W4.b d(String str) {
        W4.c cVar = W4.h.a;
        return new W4.b(W4.h.a, W4.e.e(str));
    }

    public static final F4.c d0(Collection collection, F4.d dVar) {
        Iterator it = collection.iterator();
        F4.c cVar = null;
        while (it.hasNext()) {
            F4.c cVar2 = (F4.c) it.next();
            if (kotlin.jvm.internal.l.a(cVar2.getType(), dVar)) {
                if (cVar != null) {
                    throw new IllegalStateException("Multiple extensions handle the same extension type: " + dVar);
                }
                cVar = cVar2;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No extensions handle the extension type: " + dVar);
    }

    public static final void e(int i7, List list) {
        int size = list.size();
        if (i7 < 0 || i7 >= size) {
            throw new IndexOutOfBoundsException("Index " + i7 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final Object e0(M5.p pVar, boolean z7, M5.p pVar2, e4.n nVar) {
        Object c0278t;
        Object objG;
        try {
            if (nVar == null) {
                c0278t = P3.r.c0(nVar, pVar2, pVar);
            } else {
                kotlin.jvm.internal.B.e(2, nVar);
                c0278t = nVar.invoke(pVar2, pVar);
            }
        } catch (J e7) {
            Throwable th = e7.f3811k;
            pVar.F(new C0278t(th, false));
            throw th;
        } catch (Throwable th2) {
            c0278t = new C0278t(th2, false);
        }
        T3.a aVar = T3.a.f9048k;
        if (c0278t == aVar || (objG = pVar.G(c0278t)) == H5.D.f3800e) {
            return aVar;
        }
        pVar.c0();
        if (!(objG instanceof C0278t)) {
            return H5.D.E(objG);
        }
        if (!z7) {
            Throwable th3 = ((C0278t) objG).a;
            if ((th3 instanceof y0) && ((y0) th3).f3891k == pVar) {
                if (c0278t instanceof C0278t) {
                    throw ((C0278t) c0278t).a;
                }
                return c0278t;
            }
        }
        throw ((C0278t) objG).a;
    }

    public static final void f(int i7, int i8, List list) {
        int size = list.size();
        if (i7 > i8) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i7 + ") is greater than toIndex (" + i8 + ").");
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(c0.a(i7, "fromIndex (", ") is less than 0."));
        }
        if (i8 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is more than than the list size (" + size + ')');
    }

    public static M4.a f0(W w7, boolean z7, E e7, int i7) {
        boolean z8 = (i7 & 1) != 0 ? false : z7;
        boolean z9 = (i7 & 2) == 0;
        if ((i7 & 4) != 0) {
            e7 = null;
        }
        return new M4.a(w7, z9, z8, e7 != null ? AbstractC1420H.K(e7) : null, 34);
    }

    public static final W4.b g(String str) {
        W4.c cVar = W4.h.a;
        return new W4.b(W4.h.f9635c, W4.e.e(str));
    }

    public static final long h(C0053g0 c0053g0, g0.d dVar, g0.d dVar2, int i7) {
        long jC = C(c0053g0, dVar, i7);
        if (H.b(jC)) {
            return H.f3091b;
        }
        long jC2 = C(c0053g0, dVar2, i7);
        if (H.b(jC2)) {
            return H.f3091b;
        }
        int i8 = (int) (jC >> 32);
        int i9 = (int) (jC2 & 4294967295L);
        return AbstractC1420H.c(Math.min(i8, i8), Math.max(i9, i9));
    }

    public static final Object[] i(Object[] objArr, int i7, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        P3.m.Z(0, i7, 6, objArr, objArr2);
        P3.m.W(i7 + 2, i7, objArr.length, objArr, objArr2);
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        return objArr2;
    }

    public static final void j(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int I = F.I(P3.r.p(setEntrySet, 10));
        if (I < 16) {
            I = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(I);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final boolean k(H0.F f5, int i7) {
        int iE = f5.e(i7);
        return i7 == f5.h(iE) || i7 == f5.d(iE, false) ? f5.i(i7) != f5.a(i7) : f5.a(i7) != f5.a(i7 - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(s0.C1953A r17, C2.C0034g r18, C2.H r19, s0.C1963h r20, U3.a r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.d.l(s0.A, C2.g, C2.H, s0.h, U3.a):java.lang.Object");
    }

    public static final W4.b m(W4.e eVar) {
        W4.c cVar = W4.h.a;
        W4.b bVar = W4.h.f9644l;
        return new W4.b(bVar.a, W4.e.e(eVar.c().concat(bVar.f().c())));
    }

    public static final W4.b n(String str) {
        W4.c cVar = W4.h.a;
        return new W4.b(W4.h.f9634b, W4.e.e(str));
    }

    public static final Object[] o(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        P3.m.Z(0, i7, 6, objArr, objArr2);
        P3.m.W(i7, i7 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] p(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        P3.m.Z(0, i7, 6, objArr, objArr2);
        P3.m.W(i7, i7 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r14 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(s0.C1953A r11, D.InterfaceC0071p0 r12, s0.C1963h r13, U3.a r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.d.q(s0.A, D.p0, s0.h, U3.a):java.lang.Object");
    }

    public static final W4.b r(W4.b bVar) {
        W4.c cVar = W4.h.a;
        return new W4.b(W4.h.a, W4.e.e("U".concat(bVar.f().c())));
    }

    public static void u(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static C0920r v(C0920r c0920r, C0920r c0920r2) {
        S s7 = new S(5, false);
        int size = c0920r.size();
        for (int i7 = 0; i7 < size; i7++) {
            String strH = c0920r.h(i7);
            String strM = c0920r.m(i7);
            if ((!"Warning".equalsIgnoreCase(strH) || !AbstractC2517v.T(strM, "1", false)) && ("Content-Length".equalsIgnoreCase(strH) || "Content-Encoding".equalsIgnoreCase(strH) || "Content-Type".equalsIgnoreCase(strH) || !K(strH) || c0920r2.a(strH) == null)) {
                s7.k(strH, strM);
            }
        }
        int size2 = c0920r2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            String strH2 = c0920r2.h(i8);
            if (!"Content-Length".equalsIgnoreCase(strH2) && !"Content-Encoding".equalsIgnoreCase(strH2) && !"Content-Type".equalsIgnoreCase(strH2) && K(strH2)) {
                s7.k(strH2, c0920r2.m(i8));
            }
        }
        return s7.l();
    }

    public static boolean w(File file, Resources resources, int i7) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i7);
            try {
                boolean zX = x(file, inputStreamOpenRawResource);
                u(inputStreamOpenRawResource);
                return zX;
            } catch (Throwable th) {
                th = th;
                u(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean x(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i7 = inputStream.read(bArr);
                if (i7 == -1) {
                    u(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i7);
            }
        } catch (IOException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            u(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            u(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static C2272S y(W4.e eVar, InterfaceC2099e interfaceC2099e) {
        if (eVar == null) {
            a(19);
            throw null;
        }
        if (interfaceC2099e == null) {
            a(20);
            throw null;
        }
        Collection collectionY = interfaceC2099e.y();
        if (collectionY.size() != 1) {
            return null;
        }
        for (C2272S c2272s : ((C2283j) collectionY.iterator().next()).m0()) {
            if (c2272s.getName().equals(eVar)) {
                return c2272s;
            }
        }
        return null;
    }

    public static final float z(Layout layout, int i7, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i7);
        x xVar = z.a;
        if (layout.getEllipsisCount(i7) <= 0 || layout.getParagraphDirection(i7) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment == null ? -1 : K0.d.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public abstract void S(int i7);

    public int hashCode() {
        switch (this.a) {
            case 26:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract String s();

    public abstract void t(int i7);

    public String toString() {
        switch (this.a) {
            case 24:
                return s();
            case 25:
            default:
                return super.toString();
            case 26:
                String strN = y.a.b(getClass()).n();
                kotlin.jvm.internal.l.c(strN);
                return strN;
        }
    }
}
