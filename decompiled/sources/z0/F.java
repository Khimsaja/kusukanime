package z0;

import H0.C0214f;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import b1.AbstractC0703b;
import com.kusukanime.R;
import e5.AbstractC0832b;
import i1.C1049b;
import j1.C1303d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import k4.C1395d;
import m.AbstractC1488i;
import m.AbstractC1489j;
import m.C1478H;
import m.C1485f;
import m.C1494o;
import m.C1495p;
import m.C1496q;
import m.C1497r;
import y0.C2349D;

/* loaded from: classes.dex */
public final class F extends C1049b {

    /* renamed from: N, reason: collision with root package name */
    public static final C1495p f18588N;

    /* renamed from: A, reason: collision with root package name */
    public C1496q f18589A;

    /* renamed from: B, reason: collision with root package name */
    public final C1497r f18590B;

    /* renamed from: C, reason: collision with root package name */
    public final C1494o f18591C;

    /* renamed from: D, reason: collision with root package name */
    public final C1494o f18592D;

    /* renamed from: E, reason: collision with root package name */
    public final String f18593E;

    /* renamed from: F, reason: collision with root package name */
    public final String f18594F;

    /* renamed from: G, reason: collision with root package name */
    public final B2.l f18595G;

    /* renamed from: H, reason: collision with root package name */
    public final C1496q f18596H;
    public L0 I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final B1.w f18597K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f18598L;

    /* renamed from: M, reason: collision with root package name */
    public final E f18599M;

    /* renamed from: d, reason: collision with root package name */
    public final C2471u f18600d;

    /* renamed from: e, reason: collision with root package name */
    public int f18601e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final E f18602f = new E(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f18603g;

    /* renamed from: h, reason: collision with root package name */
    public long f18604h;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManagerAccessibilityStateChangeListenerC2473v f18605i;

    /* renamed from: j, reason: collision with root package name */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC2475w f18606j;

    /* renamed from: k, reason: collision with root package name */
    public List f18607k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f18608l;

    /* renamed from: m, reason: collision with root package name */
    public final C2431A f18609m;

    /* renamed from: n, reason: collision with root package name */
    public int f18610n;

    /* renamed from: o, reason: collision with root package name */
    public C1303d f18611o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18612p;

    /* renamed from: q, reason: collision with root package name */
    public final C1496q f18613q;

    /* renamed from: r, reason: collision with root package name */
    public final C1496q f18614r;

    /* renamed from: s, reason: collision with root package name */
    public final C1478H f18615s;

    /* renamed from: t, reason: collision with root package name */
    public final C1478H f18616t;

    /* renamed from: u, reason: collision with root package name */
    public int f18617u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f18618v;

    /* renamed from: w, reason: collision with root package name */
    public final C1485f f18619w;

    /* renamed from: x, reason: collision with root package name */
    public final J5.e f18620x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18621y;

    /* renamed from: z, reason: collision with root package name */
    public C f18622z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i7 = AbstractC1488i.a;
        C1495p c1495p = new C1495p(32);
        int i8 = c1495p.f12905b;
        if (i8 < 0) {
            StringBuilder sbP = AbstractC0703b.p(i8, "Index ", " must be in 0..");
            sbP.append(c1495p.f12905b);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        int i9 = i8 + 32;
        c1495p.b(i9);
        int[] iArr2 = c1495p.a;
        int i10 = c1495p.f12905b;
        if (i8 != i10) {
            P3.m.V(i9, i8, i10, iArr2, iArr2);
        }
        P3.m.Y(i8, 0, 12, iArr, iArr2);
        c1495p.f12905b += 32;
        f18588N = c1495p;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [z0.v] */
    /* JADX WARN: Type inference failed for: r2v5, types: [z0.w] */
    public F(C2471u c2471u) {
        this.f18600d = c2471u;
        Object systemService = c2471u.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager", systemService);
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f18603g = accessibilityManager;
        this.f18604h = 100L;
        this.f18605i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: z0.v
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z7) {
                F f5 = this.a;
                f5.f18607k = z7 ? f5.f18603g.getEnabledAccessibilityServiceList(-1) : P3.y.f7779k;
            }
        };
        this.f18606j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: z0.w
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z7) {
                F f5 = this.a;
                f5.f18607k = f5.f18603g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f18607k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f18608l = new Handler(Looper.getMainLooper());
        this.f18609m = new C2431A(this);
        this.f18610n = Integer.MIN_VALUE;
        this.f18613q = new C1496q();
        this.f18614r = new C1496q();
        this.f18615s = new C1478H(0);
        this.f18616t = new C1478H(0);
        this.f18617u = -1;
        this.f18619w = new C1485f();
        this.f18620x = P3.F.a(1, 6, null);
        this.f18621y = true;
        C1496q c1496q = AbstractC1489j.a;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", c1496q);
        this.f18589A = c1496q;
        this.f18590B = new C1497r();
        this.f18591C = new C1494o();
        this.f18592D = new C1494o();
        this.f18593E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f18594F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f18595G = new B2.l(18);
        this.f18596H = new C1496q();
        F0.n nVarA = c2471u.getSemanticsOwner().a();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", c1496q);
        this.I = new L0(nVarA, c1496q);
        c2471u.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2477x(0, this));
        this.f18597K = new B1.w(24, this);
        this.f18598L = new ArrayList();
        this.f18599M = new E(this, 1);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [e4.a, kotlin.jvm.internal.m] */
    public static final boolean A(F0.g gVar, float f5) {
        ?? r2 = gVar.a;
        if (f5 >= 0.0f || ((Number) r2.invoke()).floatValue() <= 0.0f) {
            return f5 > 0.0f && ((Number) r2.invoke()).floatValue() < ((Number) gVar.f2069b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v1, types: [e4.a, kotlin.jvm.internal.m] */
    public static final boolean B(F0.g gVar) {
        ?? r02 = gVar.a;
        if (((Number) r02.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        ((Number) gVar.f2069b.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [e4.a, kotlin.jvm.internal.m] */
    public static final boolean C(F0.g gVar) {
        ?? r02 = gVar.a;
        if (((Number) r02.invoke()).floatValue() < ((Number) gVar.f2069b.invoke()).floatValue()) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void H(F f5, int i7, int i8, Integer num, int i9) {
        if ((i9 & 4) != 0) {
            num = null;
        }
        f5.G(i7, i8, num, null);
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i7 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i7 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i7);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize", charSequenceSubSequence);
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static boolean u(F0.n nVar) {
        Object obj = nVar.f2104d.f2096k.get(F0.q.f2123B);
        if (obj == null) {
            obj = null;
        }
        G0.a aVar = (G0.a) obj;
        F0.t tVar = F0.q.f2146s;
        LinkedHashMap linkedHashMap = nVar.f2104d.f2096k;
        Object obj2 = linkedHashMap.get(tVar);
        if (obj2 == null) {
            obj2 = null;
        }
        F0.f fVar = (F0.f) obj2;
        boolean z7 = aVar != null;
        Object obj3 = linkedHashMap.get(F0.q.f2122A);
        if (((Boolean) (obj3 != null ? obj3 : null)) == null || (fVar != null && fVar.a == 4)) {
            return z7;
        }
        return true;
    }

    public static String w(F0.n nVar) {
        C0214f c0214f;
        if (nVar != null) {
            F0.t tVar = F0.q.a;
            F0.i iVar = nVar.f2104d;
            LinkedHashMap linkedHashMap = iVar.f2096k;
            if (linkedHashMap.containsKey(tVar)) {
                return android.support.v4.media.session.b.n((List) iVar.h(tVar), ",", null, 62);
            }
            F0.t tVar2 = F0.q.f2151x;
            if (linkedHashMap.containsKey(tVar2)) {
                Object obj = linkedHashMap.get(tVar2);
                if (obj == null) {
                    obj = null;
                }
                C0214f c0214f2 = (C0214f) obj;
                if (c0214f2 != null) {
                    return c0214f2.a;
                }
            } else {
                Object obj2 = linkedHashMap.get(F0.q.f2148u);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                if (list != null && (c0214f = (C0214f) P3.q.t0(list)) != null) {
                    return c0214f.a;
                }
            }
        }
        return null;
    }

    public final int D(int i7) {
        if (i7 == this.f18600d.getSemanticsOwner().a().f2107g) {
            return -1;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(F0.n r20, z0.L0 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = m.AbstractC1490k.a
            m.r r3 = new m.r
            r3.<init>()
            r4 = 4
            java.util.List r5 = F0.n.h(r1, r4)
            int r6 = r5.size()
            r7 = 0
            r8 = r7
        L18:
            y0.D r9 = r1.f2103c
            if (r8 >= r6) goto L42
            java.lang.Object r10 = r5.get(r8)
            F0.n r10 = (F0.n) r10
            m.q r11 = r0.t()
            int r12 = r10.f2107g
            boolean r11 = r11.b(r12)
            if (r11 == 0) goto L3f
            m.r r11 = r2.f18642b
            int r10 = r10.f2107g
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L3c
            r0.z(r9)
            return
        L3c:
            r3.a(r10)
        L3f:
            int r8 = r8 + 1
            goto L18
        L42:
            m.r r2 = r2.f18642b
            int[] r5 = r2.f12911b
            long[] r2 = r2.a
            int r6 = r2.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L8d
            r8 = r7
        L4e:
            r10 = r2[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L88
            int r12 = r8 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r7
        L68:
            if (r14 >= r12) goto L86
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L82
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L82
            r0.z(r9)
            return
        L82:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L68
        L86:
            if (r12 != r13) goto L8d
        L88:
            if (r8 == r6) goto L8d
            int r8 = r8 + 1
            goto L4e
        L8d:
            java.util.List r1 = F0.n.h(r1, r4)
            int r2 = r1.size()
        L95:
            if (r7 >= r2) goto Lbc
            java.lang.Object r3 = r1.get(r7)
            F0.n r3 = (F0.n) r3
            m.q r4 = r0.t()
            int r5 = r3.f2107g
            boolean r4 = r4.b(r5)
            if (r4 == 0) goto Lb9
            m.q r4 = r0.f18596H
            int r5 = r3.f2107g
            java.lang.Object r4 = r4.e(r5)
            kotlin.jvm.internal.l.c(r4)
            z0.L0 r4 = (z0.L0) r4
            r0.E(r3, r4)
        Lb9:
            int r7 = r7 + 1
            goto L95
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.F.E(F0.n, z0.L0):void");
    }

    public final boolean F(AccessibilityEvent accessibilityEvent) {
        if (!x()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f18612p = true;
        }
        try {
            return ((Boolean) this.f18602f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f18612p = false;
        }
    }

    public final boolean G(int i7, int i8, Integer num, List list) {
        if (i7 == Integer.MIN_VALUE || !x()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i7, i8);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(android.support.v4.media.session.b.n(list, ",", null, 62));
        }
        Trace.beginSection("sendEvent");
        try {
            return F(accessibilityEventO);
        } finally {
            Trace.endSection();
        }
    }

    public final void I(String str, int i7, int i8) {
        AccessibilityEvent accessibilityEventO = o(D(i7), 32);
        accessibilityEventO.setContentChangeTypes(i8);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        F(accessibilityEventO);
    }

    public final void J(int i7) {
        C c2 = this.f18622z;
        if (c2 != null) {
            F0.n nVar = c2.a;
            if (i7 != nVar.f2107g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c2.f18571f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(D(nVar.f2107g), 131072);
                accessibilityEventO.setFromIndex(c2.f18569d);
                accessibilityEventO.setToIndex(c2.f18570e);
                accessibilityEventO.setAction(c2.f18567b);
                accessibilityEventO.setMovementGranularity(c2.f18568c);
                accessibilityEventO.getText().add(w(nVar));
                F(accessibilityEventO);
            }
        }
        this.f18622z = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(m.C1496q r39) {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.F.K(m.q):void");
    }

    public final void L(C2349D c2349d, C1497r c1497r) {
        F0.i iVarO;
        if (c2349d.E() && !this.f18600d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c2349d)) {
            C2349D c2349d2 = null;
            if (!c2349d.f17660G.f(8)) {
                c2349d = c2349d.s();
                while (true) {
                    if (c2349d == null) {
                        c2349d = null;
                        break;
                    } else if (c2349d.f17660G.f(8)) {
                        break;
                    } else {
                        c2349d = c2349d.s();
                    }
                }
            }
            if (c2349d == null || (iVarO = c2349d.o()) == null) {
                return;
            }
            if (!iVarO.f2097l) {
                C2349D c2349dS = c2349d.s();
                while (true) {
                    if (c2349dS != null) {
                        F0.i iVarO2 = c2349dS.o();
                        if (iVarO2 != null && iVarO2.f2097l) {
                            c2349d2 = c2349dS;
                            break;
                        }
                        c2349dS = c2349dS.s();
                    } else {
                        break;
                    }
                }
                if (c2349d2 != null) {
                    c2349d = c2349d2;
                }
            }
            int i7 = c2349d.f17672l;
            if (c1497r.a(i7)) {
                H(this, D(i7), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v18, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v8, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [e4.a, kotlin.jvm.internal.m] */
    public final void M(C2349D c2349d) {
        if (c2349d.E() && !this.f18600d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c2349d)) {
            int i7 = c2349d.f17672l;
            F0.g gVar = (F0.g) this.f18613q.e(i7);
            F0.g gVar2 = (F0.g) this.f18614r.e(i7);
            if (gVar == null && gVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i7, 4096);
            if (gVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) gVar.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) gVar.f2069b.invoke()).floatValue());
            }
            if (gVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) gVar2.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) gVar2.f2069b.invoke()).floatValue());
            }
            F(accessibilityEventO);
        }
    }

    public final boolean N(F0.n nVar, int i7, int i8, boolean z7) {
        String strW;
        F0.i iVar = nVar.f2104d;
        F0.t tVar = F0.h.f2077h;
        if (iVar.f2096k.containsKey(tVar) && O.h(nVar)) {
            e4.o oVar = (e4.o) ((F0.a) nVar.f2104d.h(tVar)).f2062b;
            if (oVar != null) {
                return ((Boolean) oVar.invoke(Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z7))).booleanValue();
            }
        } else if ((i7 != i8 || i8 != this.f18617u) && (strW = w(nVar)) != null) {
            if (i7 < 0 || i7 != i8 || i8 > strW.length()) {
                i7 = -1;
            }
            this.f18617u = i7;
            boolean z8 = strW.length() > 0;
            int i9 = nVar.f2107g;
            F(p(D(i9), z8 ? Integer.valueOf(this.f18617u) : null, z8 ? Integer.valueOf(this.f18617u) : null, z8 ? Integer.valueOf(strW.length()) : null, strW));
            J(i9);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList O(boolean r19, java.util.ArrayList r20) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.F.O(boolean, java.util.ArrayList):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0147, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0151, code lost:
    
        if (((r7 & ((~r7) << 6)) & r22) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0153, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q() {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.F.Q():void");
    }

    @Override // i1.C1049b
    public final X4.y b(View view) {
        return this.f18609m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i7, C1303d c1303d, String str, Bundle bundle) {
        F0.n nVar;
        RectF rectF;
        M0 m02 = (M0) t().e(i7);
        if (m02 == null || (nVar = m02.a) == null) {
            return;
        }
        String strW = w(nVar);
        boolean zA = kotlin.jvm.internal.l.a(str, this.f18593E);
        AccessibilityNodeInfo accessibilityNodeInfo = c1303d.a;
        if (zA) {
            int iE = this.f18591C.e(i7);
            if (iE != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iE);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l.a(str, this.f18594F)) {
            int iE2 = this.f18592D.e(i7);
            if (iE2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iE2);
                return;
            }
            return;
        }
        F0.t tVar = F0.h.a;
        F0.i iVar = nVar.f2104d;
        LinkedHashMap linkedHashMap = iVar.f2096k;
        y0.Y y7 = null;
        if (!linkedHashMap.containsKey(tVar) || bundle == null || !kotlin.jvm.internal.l.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            F0.t tVar2 = F0.q.f2147t;
            if (!linkedHashMap.containsKey(tVar2) || bundle == null || !kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (kotlin.jvm.internal.l.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, nVar.f2107g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(tVar2);
                String str2 = (String) (obj == null ? null : obj);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i8 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i9 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i9 > 0 && i8 >= 0) {
            if (i8 < (strW != null ? strW.length() : Integer.MAX_VALUE)) {
                H0.F fS = O.s(iVar);
                if (fS == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i8 + i10;
                    if (i11 >= fS.a.a.a.length()) {
                        arrayList.add(y7);
                    } else {
                        g0.d dVarB = fS.b(i11);
                        y0.Y yC = nVar.c();
                        long jS = 0;
                        if (yC != null) {
                            if (!yC.P0().f10414w) {
                                yC = y7;
                            }
                            if (yC != null) {
                                jS = yC.S(0L);
                            }
                        }
                        g0.d dVarH = dVarB.h(jS);
                        g0.d dVarE = nVar.e();
                        g0.d dVarD = dVarH.f(dVarE) ? dVarH.d(dVarE) : y7;
                        if (dVarD != 0) {
                            long jE = AbstractC0832b.e(dVarD.a, dVarD.f11659b);
                            C2471u c2471u = this.f18600d;
                            long jO = c2471u.o(jE);
                            long jO2 = c2471u.o(AbstractC0832b.e(dVarD.f11660c, dVarD.f11661d));
                            rectF = new RectF(g0.c.d(jO), g0.c.e(jO), g0.c.d(jO2), g0.c.e(jO2));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i10++;
                    y7 = null;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect k(M0 m02) {
        Rect rect = m02.f18643b;
        long jE = AbstractC0832b.e(rect.left, rect.top);
        C2471u c2471u = this.f18600d;
        long jO = c2471u.o(jE);
        long jO2 = c2471u.o(AbstractC0832b.e(rect.right, rect.bottom));
        return new Rect((int) Math.floor(g0.c.d(jO)), (int) Math.floor(g0.c.e(jO)), (int) Math.ceil(g0.c.d(jO2)), (int) Math.ceil(g0.c.e(jO2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (H5.D.k(r7, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:25:0x0059, B:29:0x006c, B:31:0x0074, B:34:0x007f, B:36:0x0084, B:37:0x0093, B:39:0x009a, B:40:0x00a3, B:20:0x0042), top: B:51:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007d -> B:43:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00be -> B:43:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(U3.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.F.l(U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Type inference failed for: r1v20, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v4, types: [e4.a, kotlin.jvm.internal.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r21, long r22, boolean r24) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.F.m(int, long, boolean):boolean");
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (x()) {
                E(this.f18600d.getSemanticsOwner().a(), this.I);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                K(t());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i7, int i8) {
        M0 m02;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i8);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        C2471u c2471u = this.f18600d;
        accessibilityEventObtain.setPackageName(c2471u.getContext().getPackageName());
        accessibilityEventObtain.setSource(c2471u, i7);
        if (x() && (m02 = (M0) t().e(i7)) != null) {
            accessibilityEventObtain.setPassword(m02.a.f2104d.f2096k.containsKey(F0.q.f2124C));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent p(int i7, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i7, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final void q(F0.n nVar, ArrayList arrayList, C1496q c1496q) {
        boolean zM = O.m(nVar);
        Object obj = nVar.f2104d.f2096k.get(F0.q.f2139l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = nVar.f2107g;
        if ((zBooleanValue || y(nVar)) && t().c(i7)) {
            arrayList.add(nVar);
        }
        if (zBooleanValue) {
            c1496q.h(i7, O(zM, P3.q.U0(F0.n.h(nVar, 7))));
            return;
        }
        List listH = F0.n.h(nVar, 7);
        int size = listH.size();
        for (int i8 = 0; i8 < size; i8++) {
            q((F0.n) listH.get(i8), arrayList, c1496q);
        }
    }

    public final int r(F0.n nVar) {
        F0.i iVar = nVar.f2104d;
        if (!iVar.f2096k.containsKey(F0.q.a)) {
            F0.t tVar = F0.q.f2152y;
            F0.i iVar2 = nVar.f2104d;
            if (iVar2.f2096k.containsKey(tVar)) {
                return (int) (4294967295L & ((H0.H) iVar2.h(tVar)).a);
            }
        }
        return this.f18617u;
    }

    public final int s(F0.n nVar) {
        F0.i iVar = nVar.f2104d;
        if (!iVar.f2096k.containsKey(F0.q.a)) {
            F0.t tVar = F0.q.f2152y;
            F0.i iVar2 = nVar.f2104d;
            if (iVar2.f2096k.containsKey(tVar)) {
                return (int) (((H0.H) iVar2.h(tVar)).a >> 32);
            }
        }
        return this.f18617u;
    }

    public final C1496q t() {
        if (this.f18621y) {
            this.f18621y = false;
            this.f18589A = O.q(this.f18600d.getSemanticsOwner());
            if (x()) {
                C1494o c1494o = this.f18591C;
                c1494o.a();
                C1494o c1494o2 = this.f18592D;
                c1494o2.a();
                M0 m02 = (M0) t().e(-1);
                F0.n nVar = m02 != null ? m02.a : null;
                kotlin.jvm.internal.l.c(nVar);
                ArrayList arrayListO = O(O.m(nVar), P3.r.M(nVar));
                int iY = P3.r.y(arrayListO);
                int i7 = 1;
                if (1 <= iY) {
                    while (true) {
                        int i8 = ((F0.n) arrayListO.get(i7 - 1)).f2107g;
                        int i9 = ((F0.n) arrayListO.get(i7)).f2107g;
                        c1494o.g(i8, i9);
                        c1494o2.g(i9, i8);
                        if (i7 == iY) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return this.f18589A;
    }

    public final String v(F0.n nVar) throws Resources.NotFoundException {
        Object string = nVar.f2104d.f2096k.get(F0.q.f2129b);
        String string2 = null;
        if (string == null) {
            string = null;
        }
        F0.t tVar = F0.q.f2123B;
        F0.i iVar = nVar.f2104d;
        LinkedHashMap linkedHashMap = iVar.f2096k;
        Object obj = linkedHashMap.get(tVar);
        if (obj == null) {
            obj = null;
        }
        G0.a aVar = (G0.a) obj;
        Object obj2 = linkedHashMap.get(F0.q.f2146s);
        if (obj2 == null) {
            obj2 = null;
        }
        F0.f fVar = (F0.f) obj2;
        C2471u c2471u = this.f18600d;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && string == null) {
                        string = c2471u.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else if (fVar != null && fVar.a == 2 && string == null) {
                    string = c2471u.getContext().getResources().getString(R.string.state_off);
                }
            } else if (fVar != null && fVar.a == 2 && string == null) {
                string = c2471u.getContext().getResources().getString(R.string.state_on);
            }
        }
        Object obj3 = linkedHashMap.get(F0.q.f2122A);
        if (obj3 == null) {
            obj3 = null;
        }
        Boolean bool = (Boolean) obj3;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((fVar == null || fVar.a != 4) && string == null) {
                string = zBooleanValue ? c2471u.getContext().getResources().getString(R.string.selected) : c2471u.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj4 = linkedHashMap.get(F0.q.f2130c);
        if (obj4 == null) {
            obj4 = null;
        }
        F0.e eVar = (F0.e) obj4;
        if (eVar != null) {
            if (eVar != F0.e.f2067c) {
                if (string == null) {
                    C1395d c1395d = eVar.f2068b;
                    float f5 = c1395d.f12671b;
                    float f7 = c1395d.a;
                    float f8 = f5 - f7 == 0.0f ? 0.0f : (eVar.a - f7) / (f5 - f7);
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    string = c2471u.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(f8 == 0.0f ? 0 : f8 == 1.0f ? 100 : e3.c.k(Math.round(f8 * 100), 1, 99)));
                }
            } else if (string == null) {
                string = c2471u.getContext().getResources().getString(R.string.in_progress);
            }
        }
        F0.t tVar2 = F0.q.f2151x;
        if (linkedHashMap.containsKey(tVar2)) {
            F0.i iVarI = new F0.n(nVar.a, true, nVar.f2103c, iVar).i();
            F0.t tVar3 = F0.q.a;
            LinkedHashMap linkedHashMap2 = iVarI.f2096k;
            Object obj5 = linkedHashMap2.get(tVar3);
            if (obj5 == null) {
                obj5 = null;
            }
            Collection collection = (Collection) obj5;
            if (collection == null || collection.isEmpty()) {
                Object obj6 = linkedHashMap2.get(F0.q.f2148u);
                if (obj6 == null) {
                    obj6 = null;
                }
                Collection collection2 = (Collection) obj6;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj7 = linkedHashMap2.get(tVar2);
                    if (obj7 == null) {
                        obj7 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj7;
                    if (charSequence == null || charSequence.length() == 0) {
                        string2 = c2471u.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            string = string2;
        }
        return (String) string;
    }

    public final boolean x() {
        return this.f18603g.isEnabled() && !this.f18607k.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(F0.n r8) {
        /*
            r7 = this;
            F0.i r0 = r8.f2104d
            F0.t r1 = F0.q.a
            java.util.LinkedHashMap r0 = r0.f2096k
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 != 0) goto Le
            r0 = r1
        Le:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L19
            java.lang.Object r0 = P3.q.t0(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L1a
        L19:
            r0 = r1
        L1a:
            F0.i r2 = r8.f2104d
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L56
            F0.t r0 = F0.q.f2151x
            java.util.LinkedHashMap r5 = r2.f2096k
            java.lang.Object r0 = r5.get(r0)
            if (r0 != 0) goto L2b
            r0 = r1
        L2b:
            H0.f r0 = (H0.C0214f) r0
            F0.t r5 = F0.q.f2148u
            java.util.LinkedHashMap r6 = r2.f2096k
            java.lang.Object r5 = r6.get(r5)
            if (r5 != 0) goto L38
            r5 = r1
        L38:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L42
            java.lang.Object r1 = P3.q.t0(r5)
            H0.f r1 = (H0.C0214f) r1
        L42:
            if (r0 != 0) goto L45
            r0 = r1
        L45:
            if (r0 != 0) goto L56
            java.lang.String r0 = r7.v(r8)
            if (r0 != 0) goto L56
            boolean r0 = u(r8)
            if (r0 == 0) goto L54
            goto L56
        L54:
            r0 = r4
            goto L57
        L56:
            r0 = r3
        L57:
            boolean r1 = z0.O.x(r8)
            if (r1 == 0) goto L6a
            boolean r1 = r2.f2097l
            if (r1 != 0) goto L69
            boolean r8 = r8.m()
            if (r8 == 0) goto L6a
            if (r0 == 0) goto L6a
        L69:
            return r3
        L6a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.F.y(F0.n):boolean");
    }

    public final void z(C2349D c2349d) {
        if (this.f18619w.add(c2349d)) {
            this.f18620x.mo2trySendJP2dKIU(O3.C.a);
        }
    }
}
