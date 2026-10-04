package H4;

import H.N;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import u4.InterfaceC2099e;
import v4.InterfaceC2154b;

/* renamed from: H4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248b {

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f3718c;
    public final N a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3719b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC0247a enumC0247a : EnumC0247a.values()) {
            String str = enumC0247a.f3717k;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC0247a);
            }
        }
        f3718c = linkedHashMap;
    }

    public C0248b(N n7) {
        this.a = n7;
    }

    public static ArrayList a(Object obj, boolean z7) {
        InterfaceC2154b interfaceC2154b = (InterfaceC2154b) obj;
        kotlin.jvm.internal.l.f("<this>", interfaceC2154b);
        Map mapB = interfaceC2154b.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapB.entrySet()) {
            P3.v.e0(arrayList, (!z7 || kotlin.jvm.internal.l.a((W4.e) entry.getKey(), x.f3755b)) ? j((b5.g) entry.getValue()) : P3.y.f7779k);
        }
        return arrayList;
    }

    public static Object c(Object obj, W4.c cVar) {
        for (Object obj2 : e(obj)) {
            if (kotlin.jvm.internal.l.a(d(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static W4.c d(Object obj) {
        InterfaceC2154b interfaceC2154b = (InterfaceC2154b) obj;
        kotlin.jvm.internal.l.f("<this>", interfaceC2154b);
        return interfaceC2154b.a();
    }

    public static Iterable e(Object obj) {
        v4.h annotations;
        InterfaceC2154b interfaceC2154b = (InterfaceC2154b) obj;
        kotlin.jvm.internal.l.f("<this>", interfaceC2154b);
        InterfaceC2099e interfaceC2099eD = d5.e.d(interfaceC2154b);
        return (interfaceC2099eD == null || (annotations = interfaceC2099eD.getAnnotations()) == null) ? P3.y.f7779k : annotations;
    }

    public static boolean f(Object obj, W4.c cVar) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l.a(d(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List j(b5.g gVar) {
        if (!(gVar instanceof b5.b)) {
            return gVar instanceof b5.i ? P3.r.H(((b5.i) gVar).f10950c.c()) : P3.y.f7779k;
        }
        Iterable iterable = (Iterable) ((b5.b) gVar).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            P3.v.e0(arrayList, j((b5.g) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H4.t b(H4.t r13, v4.h r14) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.C0248b.b(H4.t, v4.h):H4.t");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r6.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        if (r6.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r6 = O4.h.f7563l;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O4.i g(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            W4.c r0 = d(r6)
            r1 = 0
            if (r0 != 0) goto L9
            goto L95
        L9:
            H.N r2 = r5.a
            java.lang.Object r2 = r2.f2902d
            A4.j r2 = (A4.j) r2
            java.lang.Object r2 = r2.invoke(r0)
            H4.B r2 = (H4.B) r2
            r2.getClass()
            H4.B r3 = H4.B.f3682l
            if (r2 != r3) goto L1d
            return r1
        L1d:
            java.util.Set r3 = H4.y.f3780k
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            O4.h r6 = O4.h.f7564m
            goto L87
        L29:
            java.util.Set r3 = H4.y.f3781l
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L34
            O4.h r6 = O4.h.f7563l
            goto L87
        L34:
            java.util.Set r3 = H4.y.f3782m
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L3f
            O4.h r6 = O4.h.f7562k
            goto L87
        L3f:
            W4.c r3 = H4.y.f3776g
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L95
            java.util.ArrayList r6 = a(r6, r4)
            java.lang.Object r6 = P3.q.s0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L85
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L79;
                case 74175084: goto L70;
                case 433141802: goto L64;
                case 1933739535: goto L5b;
                default: goto L5a;
            }
        L5a:
            goto L95
        L5b:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L95
            goto L85
        L64:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L6d
            goto L95
        L6d:
            O4.h r6 = O4.h.f7562k
            goto L87
        L70:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L82
            goto L95
        L79:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L82
            goto L95
        L82:
            O4.h r6 = O4.h.f7563l
            goto L87
        L85:
            O4.h r6 = O4.h.f7564m
        L87:
            O4.i r0 = new O4.i
            H4.B r1 = H4.B.f3683m
            if (r2 != r1) goto L8e
            goto L90
        L8e:
            if (r7 == 0) goto L91
        L90:
            r4 = 1
        L91:
            r0.<init>(r6, r4)
            return r0
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.C0248b.g(java.lang.Object, boolean):O4.i");
    }

    public final B h(Object obj) {
        String str;
        v vVar = (v) this.a.f2901c;
        B b4 = (B) vVar.f3752c.get(d(obj));
        if (b4 != null) {
            return b4;
        }
        Object objC = c(obj, y.f3785p);
        if (objC == null || (str = (String) P3.q.s0(a(objC, false))) == null) {
            return null;
        }
        B b7 = vVar.f3751b;
        if (b7 != null) {
            return b7;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return B.f3682l;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return B.f3684n;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return B.f3683m;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        kotlin.jvm.internal.l.f("annotation", obj);
        if (!((v) this.a.f2901c).f3753d) {
            if (P3.q.m0(y.f3779j, d(obj)) || f(obj, y.f3773d)) {
                return obj;
            }
            if (f(obj, y.f3774e)) {
                ConcurrentHashMap concurrentHashMap = this.f3719b;
                InterfaceC2099e interfaceC2099eD = d5.e.d((InterfaceC2154b) obj);
                kotlin.jvm.internal.l.c(interfaceC2099eD);
                Object obj2 = concurrentHashMap.get(interfaceC2099eD);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = e(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                    if (objI != null) {
                        break;
                    }
                }
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC2099eD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
