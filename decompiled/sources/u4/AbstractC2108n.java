package u4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import x4.C2269O;
import x4.InterfaceC2268N;

/* renamed from: u4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2108n {
    public static final H4.o a;

    /* renamed from: b, reason: collision with root package name */
    public static final H4.o f16319b;

    /* renamed from: c, reason: collision with root package name */
    public static final H4.o f16320c;

    /* renamed from: d, reason: collision with root package name */
    public static final H4.o f16321d;

    /* renamed from: e, reason: collision with root package name */
    public static final H4.o f16322e;

    /* renamed from: f, reason: collision with root package name */
    public static final H4.o f16323f;

    /* renamed from: g, reason: collision with root package name */
    public static final H4.o f16324g;

    /* renamed from: h, reason: collision with root package name */
    public static final H4.o f16325h;

    /* renamed from: i, reason: collision with root package name */
    public static final H4.o f16326i;

    /* renamed from: j, reason: collision with root package name */
    public static final H4.o f16327j;

    /* renamed from: k, reason: collision with root package name */
    public static final N f16328k;

    /* renamed from: l, reason: collision with root package name */
    public static final N f16329l;

    /* renamed from: m, reason: collision with root package name */
    public static final N f16330m;

    /* renamed from: n, reason: collision with root package name */
    public static final t5.o f16331n;

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f16332o;

    static {
        Z z7 = Z.f16303c;
        H4.o oVar = new H4.o(z7, 3);
        a = oVar;
        a0 a0Var = a0.f16304c;
        H4.o oVar2 = new H4.o(a0Var, 4);
        f16319b = oVar2;
        b0 b0Var = b0.f16305c;
        H4.o oVar3 = new H4.o(b0Var, 5);
        f16320c = oVar3;
        W w7 = W.f16300c;
        H4.o oVar4 = new H4.o(w7, 6);
        f16321d = oVar4;
        c0 c0Var = c0.f16306c;
        H4.o oVar5 = new H4.o(c0Var, 7);
        f16322e = oVar5;
        Y y7 = Y.f16302c;
        H4.o oVar6 = new H4.o(y7, 8);
        f16323f = oVar6;
        V v5 = V.f16299c;
        H4.o oVar7 = new H4.o(v5, 9);
        f16324g = oVar7;
        X x7 = X.f16301c;
        H4.o oVar8 = new H4.o(x7, 10);
        f16325h = oVar8;
        d0 d0Var = d0.f16310c;
        H4.o oVar9 = new H4.o(d0Var, 11);
        f16326i = oVar9;
        Collections.unmodifiableSet(P3.m.v0(new H4.o[]{oVar, oVar2, oVar4, oVar6}));
        HashMap map = new HashMap(6);
        map.put(oVar2, 0);
        map.put(oVar, 0);
        map.put(oVar4, 1);
        map.put(oVar3, 1);
        map.put(oVar5, 2);
        Collections.unmodifiableMap(map);
        f16327j = oVar5;
        f16328k = new N(2);
        f16329l = new N(3);
        f16330m = new N(4);
        try {
            Iterator it = Arrays.asList(new t5.o[0]).iterator();
            f16331n = it.hasNext() ? (t5.o) it.next() : t5.o.a;
            HashMap map2 = new HashMap();
            f16332o = map2;
            map2.put(z7, oVar);
            map2.put(a0Var, oVar2);
            map2.put(b0Var, oVar3);
            map2.put(w7, oVar4);
            map2.put(c0Var, oVar5);
            map2.put(y7, oVar6);
            map2.put(v5, oVar7);
            map2.put(x7, oVar8);
            map2.put(d0Var, oVar9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.AbstractC2108n.a(int):void");
    }

    public static Integer b(H4.o oVar, H4.o oVar2) {
        if (oVar == null) {
            a(12);
            throw null;
        }
        if (oVar2 == null) {
            a(13);
            throw null;
        }
        f0 f0Var = oVar.a;
        f0 f0Var2 = oVar2.a;
        Integer numA = f0Var.a(f0Var2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = f0Var2.a(f0Var);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC2107m c(N n7, InterfaceC2097c interfaceC2097c, InterfaceC2105k interfaceC2105k) {
        InterfaceC2107m interfaceC2107mC;
        if (interfaceC2097c == null) {
            a(8);
            throw null;
        }
        if (interfaceC2105k == null) {
            a(9);
            throw null;
        }
        for (InterfaceC2107m interfaceC2107m = (InterfaceC2107m) interfaceC2097c.a(); interfaceC2107m != null && interfaceC2107m.getVisibility() != f16323f; interfaceC2107m = (InterfaceC2107m) Z4.e.i(interfaceC2107m, InterfaceC2107m.class, true)) {
            if (!interfaceC2107m.getVisibility().a(n7, interfaceC2107m, interfaceC2105k)) {
                return interfaceC2107m;
            }
        }
        if (!(interfaceC2097c instanceof InterfaceC2268N) || (interfaceC2107mC = c(n7, ((C2269O) ((InterfaceC2268N) interfaceC2097c)).f17404P, interfaceC2105k)) == null) {
            return null;
        }
        return interfaceC2107mC;
    }

    public static boolean d(InterfaceC2107m interfaceC2107m, InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k == null) {
            a(7);
            throw null;
        }
        N nF = Z4.e.f(interfaceC2105k);
        if (nF != N.f16296l) {
            return nF.equals(Z4.e.f(interfaceC2107m));
        }
        return false;
    }

    public static boolean e(H4.o oVar) {
        if (oVar != null) {
            return oVar == a || oVar == f16319b;
        }
        a(14);
        throw null;
    }

    public static H4.o f(f0 f0Var) {
        if (f0Var == null) {
            a(15);
            throw null;
        }
        H4.o oVar = (H4.o) f16332o.get(f0Var);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + f0Var);
    }
}
