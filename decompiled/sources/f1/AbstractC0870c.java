package f1;

import A4.AbstractC0011d;
import O.C0502l;
import O.C0510p;
import O3.l;
import P3.m;
import P3.r;
import P3.v;
import P3.y;
import V5.j;
import Z5.C0640i0;
import a0.q;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.widget.EdgeEffect;
import b5.f;
import com.kusukanime.R;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import e5.EnumC0834d;
import f6.AbstractC0915m;
import f6.EnumC0888B;
import g5.o;
import i1.w;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import k4.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m1.AbstractC1508a;
import m1.AbstractC1509b;
import n1.C1560a;
import q.O;
import q.o0;
import r4.AbstractC1886o;
import r4.EnumC1882k;
import s.C1904b;
import s.EnumC1903a0;
import t4.C2053d;
import x.C2240n;
import y.C2302B;
import y.C2303C;
import y.C2327h;
import y.InterfaceC2339t;
import y5.i;
import z0.Q0;
import z4.AbstractC2492d;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0870c implements Decoder, Y5.a {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0357 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(a0.q r35, w.u r36, v.Z r37, boolean r38, s.C1928n r39, boolean r40, a0.g r41, v.InterfaceC2128g r42, a0.h r43, v.InterfaceC2126e r44, e4.k r45, O.C0510p r46, int r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.AbstractC0870c.E(a0.q, w.u, v.Z, boolean, s.n, boolean, a0.g, v.g, a0.h, v.e, e4.k, O.p, int, int, int):void");
    }

    public static final long F(float f5, float f7) {
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final Bundle H(l... lVarArr) {
        Bundle bundle = new Bundle(lVarArr.length);
        for (l lVar : lVarArr) {
            String str = (String) lVar.f7528k;
            Object obj = lVar.f7529l;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.l.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final List I(InterfaceC2339t interfaceC2339t, C2303C c2303c, C1904b c1904b) {
        g gVar;
        if (!c1904b.a.l() && c2303c.f17574k.isEmpty()) {
            return y.f7779k;
        }
        ArrayList arrayList = new ArrayList();
        Q.d dVar = c1904b.a;
        if (!dVar.l()) {
            gVar = g.f12679n;
        } else {
            if (dVar.k()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = dVar.f7827k;
            int i7 = ((C2327h) objArr[0]).a;
            int i8 = dVar.f7829m;
            if (i8 > 0) {
                int i9 = 0;
                do {
                    int i10 = ((C2327h) objArr[i9]).a;
                    if (i10 < i7) {
                        i7 = i10;
                    }
                    i9++;
                } while (i9 < i8);
            }
            if (i7 < 0) {
                throw new IllegalArgumentException("negative minIndex");
            }
            if (dVar.k()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = dVar.f7827k;
            int i11 = ((C2327h) objArr2[0]).f17623b;
            int i12 = dVar.f7829m;
            if (i12 > 0) {
                int i13 = 0;
                do {
                    int i14 = ((C2327h) objArr2[i13]).f17623b;
                    if (i14 > i11) {
                        i11 = i14;
                    }
                    i13++;
                } while (i13 < i12);
            }
            gVar = new g(i7, Math.min(i11, interfaceC2339t.b() - 1), 1);
        }
        int size = c2303c.f17574k.size();
        for (int i15 = 0; i15 < size; i15++) {
            C2302B c2302b = (C2302B) c2303c.get(i15);
            int iQ = AbstractC0915m.q(c2302b.f17570c.f(), c2302b.a, interfaceC2339t);
            int i16 = gVar.f12672k;
            if ((iQ > gVar.f12673l || i16 > iQ) && iQ >= 0 && iQ < interfaceC2339t.b()) {
                arrayList.add(Integer.valueOf(iQ));
            }
        }
        int i17 = gVar.f12672k;
        int i18 = gVar.f12673l;
        if (i17 <= i18) {
            while (true) {
                arrayList.add(Integer.valueOf(i17));
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        return arrayList;
    }

    public static final void J(View view) {
        kotlin.jvm.internal.l.f("<this>", view);
        i iVarC = AbstractC0915m.C(new w(view, null));
        while (iVarC.hasNext()) {
            ArrayList arrayList = V((View) iVarC.next()).a;
            for (int iY = r.y(arrayList); -1 < iY; iY--) {
                ((Q0) arrayList.get(iY)).a.e();
            }
        }
    }

    public static final String K(String str) {
        char cCharAt;
        kotlin.jvm.internal.l.f("<this>", str);
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [O3.i, java.lang.Object] */
    public static f L(Class cls) {
        int i7 = 0;
        while (cls.isArray()) {
            i7++;
            cls = cls.getComponentType();
            kotlin.jvm.internal.l.e("getComponentType(...)", cls);
        }
        if (!cls.isPrimitive()) {
            W4.b bVarA = AbstractC0011d.a(cls);
            String str = C2053d.a;
            W4.c cVarA = bVarA.a();
            kotlin.jvm.internal.l.f("fqName", cVarA);
            W4.b bVar = (W4.b) C2053d.f16044h.get(cVarA.a);
            if (bVar != null) {
                bVarA = bVar;
            }
            return new f(bVarA, i7);
        }
        if (cls.equals(Void.TYPE)) {
            W4.c cVarI = AbstractC1886o.f14992d.i();
            return new f(new W4.b(cVarI.b(), cVarI.a.g()), i7);
        }
        EnumC1882k enumC1882kD = EnumC0834d.b(cls.getName()).d();
        kotlin.jvm.internal.l.e("getPrimitiveType(...)", enumC1882kD);
        if (i7 > 0) {
            W4.c cVar = (W4.c) enumC1882kD.f14956n.getValue();
            kotlin.jvm.internal.l.f("topLevelFqName", cVar);
            return new f(new W4.b(cVar.b(), cVar.a.g()), i7 - 1);
        }
        W4.c cVar2 = (W4.c) enumC1882kD.f14955m.getValue();
        kotlin.jvm.internal.l.f("topLevelFqName", cVar2);
        return new f(new W4.b(cVar2.b(), cVar2.a.g()), i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] M(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            jArr[i7] = iArr[i7];
        }
        return jArr;
    }

    public static final HashSet O(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setG = ((o) it.next()).g();
            if (setG == null) {
                return null;
            }
            v.e0(hashSet, setG);
        }
        return hashSet;
    }

    public static EnumC0888B P(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return EnumC0888B.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return EnumC0888B.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC0888B.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return EnumC0888B.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC0888B.SPDY_3;
        }
        if (str.equals("quic")) {
            return EnumC0888B.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final long Q(long j7) {
        if (j7 != 9205357640488583168L) {
            return AbstractC0832b.e(Float.intBitsToFloat((int) (j7 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j7 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final W4.b R(T4.g gVar, int i7) {
        kotlin.jvm.internal.l.f("<this>", gVar);
        return android.support.v4.media.session.b.s(gVar.c(i7), gVar.b(i7));
    }

    public static float S(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1509b.a(edgeEffect);
        }
        return 0.0f;
    }

    public static Set T() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final W4.e U(T4.g gVar, int i7) {
        kotlin.jvm.internal.l.f("<this>", gVar);
        return W4.e.d(gVar.a(i7));
    }

    public static final C1560a V(View view) {
        C1560a c1560a = (C1560a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c1560a != null) {
            return c1560a;
        }
        C1560a c1560a2 = new C1560a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c1560a2);
        return c1560a2;
    }

    public static int X(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final boolean Y(int i7, String str) {
        char cCharAt = str.charAt(i7);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static final int Z(C2240n c2240n, EnumC1903a0 enumC1903a0) {
        return (int) (enumC1903a0 == EnumC1903a0.f15259k ? c2240n.f17251o & 4294967295L : c2240n.f17251o >> 32);
    }

    public static float a0(EdgeEffect edgeEffect, float f5, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1509b.b(edgeEffect, f5, f7);
        }
        AbstractC1508a.a(edgeEffect, f5, f7);
        return f5;
    }

    public static void b0(P4.l lVar, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        kotlin.jvm.internal.l.e("getDeclaredMethods(...)", declaredMethods);
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                kotlin.jvm.internal.l.c(objInvoke);
                W4.e eVarE = W4.e.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    lVar.g(eVarE, L((Class) objInvoke));
                } else if (AbstractC2492d.a.contains(enclosingClass)) {
                    lVar.k(eVarE, objInvoke);
                } else {
                    List list = AbstractC0011d.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        kotlin.jvm.internal.l.c(enclosingClass);
                        lVar.j(eVarE, AbstractC0011d.a(enclosingClass), W4.e.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        kotlin.jvm.internal.l.e("getInterfaces(...)", interfaces);
                        Class cls2 = (Class) m.r0(interfaces);
                        kotlin.jvm.internal.l.c(cls2);
                        P4.l lVarN = lVar.n(AbstractC0011d.a(cls2), eVarE);
                        if (lVarN != null) {
                            b0(lVarN, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        P4.m mVarL = lVar.l(eVarE);
                        if (mVarL != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                W4.b bVarA = AbstractC0011d.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Enum<*>", obj);
                                    mVarL.S(bVarA, W4.e.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.Class<*>", obj2);
                                    mVarL.q(L((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    P4.l lVarQ0 = mVarL.q0(AbstractC0011d.a(componentType));
                                    if (lVarQ0 != null) {
                                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Annotation", obj3);
                                        b0(lVarQ0, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    mVarL.j0(obj4);
                                }
                            }
                            mVarL.f();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        lVar.f();
    }

    public static final o0 c0(C0510p c0510p) {
        int i7 = 0;
        Object[] objArr = new Object[0];
        L2.e eVar = o0.f14597i;
        boolean zD = c0510p.d(0);
        Object objH = c0510p.H();
        if (zD || objH == C0502l.a) {
            objH = new O(i7, 2);
            c0510p.b0(objH);
        }
        return (o0) z1.c.F(objArr, eVar, (InterfaceC0821a) objH, c0510p, 0, 4);
    }

    public static final String h0(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        return string;
    }

    public static q i0(q qVar, o0 o0Var) {
        return a0.a.a(qVar, new androidx.compose.foundation.e(o0Var));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String A() {
        N();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float B() {
        N();
        throw null;
    }

    @Override // Y5.a
    public char C(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return k();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double D() {
        N();
        throw null;
    }

    public abstract String G();

    public void N() {
        throw new j(kotlin.jvm.internal.y.a.b(getClass()) + " can't retrieve untyped values");
    }

    public abstract void W();

    @Override // kotlinx.serialization.encoding.Decoder
    public Y5.a a(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return this;
    }

    public void b(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long d();

    @Override // Y5.a
    public boolean e(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return g();
    }

    public abstract void e0(boolean z7);

    public abstract void f0();

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean g() {
        N();
        throw null;
    }

    public abstract void g0();

    @Override // Y5.a
    public String h(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return A();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean i() {
        return true;
    }

    @Override // Y5.a
    public short j(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return z();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char k() {
        N();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int l(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("enumDescriptor", serialDescriptor);
        N();
        throw null;
    }

    @Override // Y5.a
    public long n(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return d();
    }

    @Override // Y5.a
    public float o(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return B();
    }

    @Override // Y5.a
    public Object p(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlin.jvm.internal.l.f("deserializer", kSerializer);
        if (kSerializer.getDescriptor().h() || i()) {
            return f(kSerializer);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder q(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return this;
    }

    public Object s(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        kotlin.jvm.internal.l.f("deserializer", kSerializer);
        return f(kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int t();

    @Override // Y5.a
    public int u(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return t();
    }

    @Override // Y5.a
    public Decoder v(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return q(c0640i0.j(i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte w();

    @Override // Y5.a
    public byte x(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return w();
    }

    @Override // Y5.a
    public double y(C0640i0 c0640i0, int i7) {
        kotlin.jvm.internal.l.f("descriptor", c0640i0);
        return D();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short z();

    public void d0(boolean z7) {
    }
}
