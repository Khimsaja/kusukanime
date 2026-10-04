package X4;

import io.ktor.util.GzipHeaderFlags;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612i {

    /* renamed from: c, reason: collision with root package name */
    public static final C0612i f9894c = new C0612i(0);
    public final C a = new C(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f9895b;

    public C0612i() {
    }

    public static int c(Q q6, Object obj) throws UnsupportedEncodingException {
        switch (q6.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return B1.G.j(((Long) obj).longValue());
            case 3:
                return B1.G.j(((Long) obj).longValue());
            case GzipHeaderFlags.EXTRA /* 4 */:
                return B1.G.f(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return B1.G.i(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e7) {
                    throw new RuntimeException("UTF-8 not supported.", e7);
                }
            case 9:
                return ((AbstractC0605b) obj).c();
            case 10:
                return B1.G.h((AbstractC0605b) obj);
            case 11:
                if (obj instanceof AbstractC0608e) {
                    AbstractC0608e abstractC0608e = (AbstractC0608e) obj;
                    return abstractC0608e.size() + B1.G.i(abstractC0608e.size());
                }
                byte[] bArr = (byte[]) obj;
                return B1.G.i(bArr.length) + bArr.length;
            case 12:
                return B1.G.i(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC0619p ? B1.G.f(((InterfaceC0619p) obj).a()) : B1.G.f(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return B1.G.i((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return B1.G.j((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(C0616m c0616m, Object obj) {
        Q q6 = c0616m.f9901l;
        boolean z7 = c0616m.f9902m;
        int i7 = c0616m.f9900k;
        if (!z7) {
            int iK = B1.G.k(i7);
            if (q6 == Q.f9859o) {
                iK *= 2;
            }
            return c(q6, obj) + iK;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iK2 = B1.G.k(i7);
            if (q6 == Q.f9859o) {
                iK2 *= 2;
            }
            iC += c(q6, obj2) + iK2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        C0616m c0616m = (C0616m) entry.getKey();
        if (c0616m.f9901l.f9863k != S.MESSAGE) {
            return true;
        }
        if (!c0616m.f9902m) {
            Object value = entry.getValue();
            if (value instanceof AbstractC0605b) {
                return ((AbstractC0605b) value).a();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((AbstractC0605b) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(C0609f c0609f, Q q6) {
        switch (q6.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c0609f.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c0609f.i()));
            case 2:
                return Long.valueOf(c0609f.l());
            case 3:
                return Long.valueOf(c0609f.l());
            case GzipHeaderFlags.EXTRA /* 4 */:
                return Integer.valueOf(c0609f.k());
            case 5:
                return Long.valueOf(c0609f.j());
            case 6:
                return Integer.valueOf(c0609f.i());
            case 7:
                return Boolean.valueOf(c0609f.l() != 0);
            case 8:
                int iK = c0609f.k();
                int i7 = c0609f.f9884b;
                int i8 = c0609f.f9886d;
                if (iK > i7 - i8 || iK <= 0) {
                    return iK == 0 ? "" : new String(c0609f.h(iK), "UTF-8");
                }
                String str = new String(c0609f.a, i8, iK, "UTF-8");
                c0609f.f9886d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c0609f.e();
            case 12:
                return Integer.valueOf(c0609f.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c0609f.i());
            case 15:
                return Long.valueOf(c0609f.j());
            case 16:
                int iK2 = c0609f.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = c0609f.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(X4.Q r2, java.lang.Object r3) {
        /*
            r3.getClass()
            X4.S r2 = r2.f9863k
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L27;
                case 6: goto L1e;
                case 7: goto L12;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L38
        Lf:
            boolean r1 = r3 instanceof X4.AbstractC0605b
            goto L38
        L12:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof X4.InterfaceC0619p
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r1 = r0
            goto L38
        L1e:
            boolean r2 = r3 instanceof X4.AbstractC0608e
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1b
            goto L1c
        L27:
            boolean r1 = r3 instanceof java.lang.String
            goto L38
        L2a:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L38
        L2d:
            boolean r1 = r3 instanceof java.lang.Double
            goto L38
        L30:
            boolean r1 = r3 instanceof java.lang.Float
            goto L38
        L33:
            boolean r1 = r3 instanceof java.lang.Long
            goto L38
        L36:
            boolean r1 = r3 instanceof java.lang.Integer
        L38:
            if (r1 == 0) goto L3b
            return
        L3b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.C0612i.j(X4.Q, java.lang.Object):void");
    }

    public static void k(B1.G g4, Q q6, Object obj) {
        switch (q6.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                g4.getClass();
                g4.J(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                g4.getClass();
                g4.I(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                g4.L(((Long) obj).longValue());
                break;
            case 3:
                g4.L(((Long) obj).longValue());
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                g4.C(((Integer) obj).intValue());
                break;
            case 5:
                g4.J(((Long) obj).longValue());
                break;
            case 6:
                g4.I(((Integer) obj).intValue());
                break;
            case 7:
                g4.F(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                g4.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                g4.K(bytes.length);
                g4.H(bytes);
                break;
            case 9:
                g4.getClass();
                ((AbstractC0605b) obj).f(g4);
                break;
            case 10:
                g4.E((AbstractC0605b) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0608e)) {
                    byte[] bArr = (byte[]) obj;
                    g4.getClass();
                    g4.K(bArr.length);
                    g4.H(bArr);
                    break;
                } else {
                    AbstractC0608e abstractC0608e = (AbstractC0608e) obj;
                    g4.getClass();
                    g4.K(abstractC0608e.size());
                    g4.G(abstractC0608e);
                    break;
                }
            case 12:
                g4.K(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC0619p)) {
                    g4.C(((Integer) obj).intValue());
                    break;
                } else {
                    g4.C(((InterfaceC0619p) obj).a());
                    break;
                }
            case 14:
                g4.I(((Integer) obj).intValue());
                break;
            case 15:
                g4.J(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                g4.K((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                g4.L((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(C0616m c0616m, Object obj) {
        List arrayList;
        if (!c0616m.f9902m) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(c0616m.f9901l, obj);
        C c2 = this.a;
        Object obj2 = c2.get(c0616m);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c2.put(c0616m, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0612i clone() {
        C c2;
        C0612i c0612i = new C0612i();
        int i7 = 0;
        while (true) {
            c2 = this.a;
            if (i7 >= c2.f9840l.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2.f9840l.get(i7);
            c0612i.i((C0616m) entry.getKey(), entry.getValue());
            i7++;
        }
        for (Map.Entry entry2 : c2.c()) {
            c0612i.i((C0616m) entry2.getKey(), entry2.getValue());
        }
        return c0612i;
    }

    public final void f() {
        if (this.f9895b) {
            return;
        }
        C c2 = this.a;
        if (!c2.f9842n) {
            for (int i7 = 0; i7 < c2.f9840l.size(); i7++) {
                Map.Entry entry = (Map.Entry) c2.f9840l.get(i7);
                if (((C0616m) entry.getKey()).f9902m) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c2.c()) {
                if (((C0616m) entry2.getKey()).f9902m) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c2.f9842n) {
            c2.f9841m = c2.f9841m.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c2.f9841m);
            c2.f9842n = true;
        }
        this.f9895b = true;
    }

    public final void g(Map.Entry entry) {
        C0616m c0616m = (C0616m) entry.getKey();
        Object value = entry.getValue();
        boolean z7 = c0616m.f9902m;
        C c2 = this.a;
        if (z7) {
            Object arrayList = c2.get(c0616m);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c2.put(c0616m, arrayList);
            return;
        }
        if (c0616m.f9901l.f9863k != S.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c2.put(c0616m, value);
            return;
        }
        Object obj2 = c2.get(c0616m);
        if (obj2 != null) {
            c2.put(c0616m, ((AbstractC0605b) obj2).e().e((AbstractC0618o) ((AbstractC0605b) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c2.put(c0616m, value);
    }

    public final void i(C0616m c0616m, Object obj) {
        boolean z7 = c0616m.f9902m;
        Q q6 = c0616m.f9901l;
        if (!z7) {
            j(q6, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(q6, it.next());
            }
            obj = arrayList;
        }
        this.a.put(c0616m, obj);
    }

    public C0612i(int i7) {
        f();
    }
}
