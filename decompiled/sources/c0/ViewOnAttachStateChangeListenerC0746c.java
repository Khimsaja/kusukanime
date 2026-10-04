package c0;

import B1.w;
import C0.d;
import C0.f;
import C0.k;
import F0.n;
import J5.e;
import P3.F;
import P3.q;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.InterfaceC0679f;
import androidx.lifecycle.InterfaceC0694v;
import f6.AbstractC0905c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.l;
import m.AbstractC1489j;
import m.C1485f;
import m.C1496q;
import m.C1497r;
import z0.C2471u;
import z0.L0;
import z0.O;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0746c implements InterfaceC0679f, View.OnAttachStateChangeListener {

    /* renamed from: A, reason: collision with root package name */
    public final w f11120A;

    /* renamed from: k, reason: collision with root package name */
    public final C2471u f11121k;

    /* renamed from: l, reason: collision with root package name */
    public final c.w f11122l;

    /* renamed from: m, reason: collision with root package name */
    public f f11123m;

    /* renamed from: n, reason: collision with root package name */
    public final C1496q f11124n = new C1496q();

    /* renamed from: o, reason: collision with root package name */
    public final C1497r f11125o = new C1497r();

    /* renamed from: p, reason: collision with root package name */
    public final long f11126p = 100;

    /* renamed from: q, reason: collision with root package name */
    public int f11127q = 1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11128r = true;

    /* renamed from: s, reason: collision with root package name */
    public final C1485f f11129s = new C1485f();

    /* renamed from: t, reason: collision with root package name */
    public final e f11130t = F.a(1, 6, null);

    /* renamed from: u, reason: collision with root package name */
    public final Handler f11131u = new Handler(Looper.getMainLooper());

    /* renamed from: v, reason: collision with root package name */
    public C1496q f11132v;

    /* renamed from: w, reason: collision with root package name */
    public long f11133w;

    /* renamed from: x, reason: collision with root package name */
    public final C1496q f11134x;

    /* renamed from: y, reason: collision with root package name */
    public L0 f11135y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11136z;

    public ViewOnAttachStateChangeListenerC0746c(C2471u c2471u, c.w wVar) {
        this.f11121k = c2471u;
        this.f11122l = wVar;
        C1496q c1496q = AbstractC1489j.a;
        l.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", c1496q);
        this.f11132v = c1496q;
        this.f11134x = new C1496q();
        n nVarA = c2471u.getSemanticsOwner().a();
        l.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", c1496q);
        this.f11135y = new L0(nVarA, c1496q);
        this.f11120A = new w(19, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:13:0x002a, B:25:0x004f, B:28:0x005c, B:30:0x0064, B:32:0x006d, B:33:0x0070, B:35:0x0074, B:36:0x007d, B:20:0x003d), top: B:48:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x008e -> B:25:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(U3.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof c0.C0745b
            if (r0 == 0) goto L13
            r0 = r9
            c0.b r0 = (c0.C0745b) r0
            int r1 = r0.f11119o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11119o = r1
            goto L18
        L13:
            c0.b r0 = new c0.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f11117m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f11119o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            J5.d r2 = r0.f11116l
            c0.c r5 = r0.f11115k
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4f
        L2e:
            r9 = move-exception
            goto L9d
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            J5.d r2 = r0.f11116l
            c0.c r5 = r0.f11115k
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L2e
            goto L5c
        L41:
            P3.r.Y(r9)
            J5.e r9 = r8.f11130t     // Catch: java.lang.Throwable -> L9b
            r9.getClass()     // Catch: java.lang.Throwable -> L9b
            J5.d r2 = new J5.d     // Catch: java.lang.Throwable -> L9b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L9b
            r5 = r8
        L4f:
            r0.f11115k = r5     // Catch: java.lang.Throwable -> L2e
            r0.f11116l = r2     // Catch: java.lang.Throwable -> L2e
            r0.f11119o = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r2.b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L5c
            goto L90
        L5c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L91
            r2.c()     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r5.d()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L70
            r5.e()     // Catch: java.lang.Throwable -> L2e
        L70:
            boolean r9 = r5.f11136z     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L7d
            r5.f11136z = r4     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r9 = r5.f11131u     // Catch: java.lang.Throwable -> L2e
            B1.w r6 = r5.f11120A     // Catch: java.lang.Throwable -> L2e
            r9.post(r6)     // Catch: java.lang.Throwable -> L2e
        L7d:
            m.f r9 = r5.f11129s     // Catch: java.lang.Throwable -> L2e
            r9.clear()     // Catch: java.lang.Throwable -> L2e
            long r6 = r5.f11126p     // Catch: java.lang.Throwable -> L2e
            r0.f11115k = r5     // Catch: java.lang.Throwable -> L2e
            r0.f11116l = r2     // Catch: java.lang.Throwable -> L2e
            r0.f11119o = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = H5.D.k(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4f
        L90:
            return r1
        L91:
            m.f r9 = r5.f11129s
            r9.clear()
            O3.C r9 = O3.C.a
            return r9
        L99:
            r5 = r8
            goto L9d
        L9b:
            r9 = move-exception
            goto L99
        L9d:
            m.f r0 = r5.f11129s
            r0.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.ViewOnAttachStateChangeListenerC0746c.a(U3.c):java.lang.Object");
    }

    public final C1496q c() {
        if (this.f11128r) {
            this.f11128r = false;
            this.f11132v = O.q(this.f11121k.getSemanticsOwner());
            this.f11133w = System.currentTimeMillis();
        }
        return this.f11132v;
    }

    public final boolean d() {
        return this.f11123m != null;
    }

    public final void e() {
        long j7;
        long j8;
        char c2;
        long j9;
        f fVar = this.f11123m;
        if (fVar != null && Build.VERSION.SDK_INT >= 29) {
            C1496q c1496q = this.f11124n;
            int i7 = c1496q.f12909e;
            Object obj = fVar.a;
            String str = "TREAT_AS_VIEW_TREE_APPEARED";
            long j10 = -9187201950435737472L;
            View view = fVar.f566b;
            if (i7 != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = c1496q.f12907c;
                j8 = 255;
                long[] jArr = c1496q.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    c2 = 7;
                    while (true) {
                        long j11 = jArr[i8];
                        if ((((~j11) << 7) & j11 & j10) != j10) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j11 & 255) < 128) {
                                    j9 = j10;
                                    arrayList.add((k) objArr[(i8 << 3) + i10]);
                                } else {
                                    j9 = j10;
                                }
                                j11 >>= 8;
                                i10++;
                                j10 = j9;
                            }
                            j7 = j10;
                            if (i9 != 8) {
                                break;
                            }
                        } else {
                            j7 = j10;
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                        j10 = j7;
                    }
                } else {
                    j7 = -9187201950435737472L;
                    c2 = 7;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList2.add(((k) arrayList.get(i11)).a);
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 34) {
                    C0.e.a(C0.b.g(obj), arrayList2);
                } else {
                    if (i12 >= 29) {
                        ViewStructure viewStructureB = d.b(C0.b.g(obj), view);
                        C0.c.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                        d.d(C0.b.g(obj), viewStructureB);
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            d.d(C0.b.g(obj), (ViewStructure) arrayList2.get(i13));
                        }
                        ViewStructure viewStructureB2 = d.b(C0.b.g(obj), view);
                        str = "TREAT_AS_VIEW_TREE_APPEARED";
                        C0.c.a(viewStructureB2).putBoolean(str, true);
                        d.d(C0.b.g(obj), viewStructureB2);
                    }
                    c1496q.a();
                }
                str = "TREAT_AS_VIEW_TREE_APPEARED";
                c1496q.a();
            } else {
                j7 = -9187201950435737472L;
                j8 = 255;
                c2 = 7;
            }
            C1497r c1497r = this.f11125o;
            if (c1497r.f12913d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = c1497r.f12911b;
                long[] jArr2 = c1497r.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr2[i14];
                        if ((((~j12) << c2) & j12 & j7) != j7) {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j12 & j8) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i14 << 3) + i16]));
                                }
                                j12 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length2) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i17)).intValue()));
                }
                long[] jArrT0 = q.T0(arrayList4);
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 34) {
                    ContentCaptureSession contentCaptureSessionG = C0.b.g(obj);
                    C0.a aVarT = z1.c.t(view);
                    Objects.requireNonNull(aVarT);
                    d.f(contentCaptureSessionG, B5.a.d(aVarT.a), jArrT0);
                } else if (i18 >= 29) {
                    ViewStructure viewStructureB3 = d.b(C0.b.g(obj), view);
                    C0.c.a(viewStructureB3).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    d.d(C0.b.g(obj), viewStructureB3);
                    ContentCaptureSession contentCaptureSessionG2 = C0.b.g(obj);
                    C0.a aVarT2 = z1.c.t(view);
                    Objects.requireNonNull(aVarT2);
                    d.f(contentCaptureSessionG2, B5.a.d(aVarT2.a), jArrT0);
                    ViewStructure viewStructureB4 = d.b(C0.b.g(obj), view);
                    C0.c.a(viewStructureB4).putBoolean(str, true);
                    d.d(C0.b.g(obj), viewStructureB4);
                }
                c1497r.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(F0.n r19, z0.L0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 4
            java.util.List r3 = F0.n.h(r1, r2)
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        Lf:
            if (r6 >= r4) goto L38
            java.lang.Object r7 = r3.get(r6)
            F0.n r7 = (F0.n) r7
            m.q r8 = r0.c()
            int r9 = r7.f2107g
            boolean r8 = r8.b(r9)
            if (r8 == 0) goto L33
            r8 = r20
            m.r r9 = r8.f18642b
            int r10 = r7.f2107g
            boolean r9 = r9.c(r10)
            if (r9 != 0) goto L35
            r0.i(r7)
            goto L35
        L33:
            r8 = r20
        L35:
            int r6 = r6 + 1
            goto Lf
        L38:
            m.q r3 = r0.f11134x
            int[] r4 = r3.f12906b
            long[] r6 = r3.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L94
            r8 = r5
        L44:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L8f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L5e:
            if (r13 >= r11) goto L8d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L89
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r4[r14]
            m.q r15 = r0.c()
            boolean r15 = r15.b(r14)
            if (r15 != 0) goto L89
            m.q r15 = r0.f11124n
            boolean r16 = r15.c(r14)
            if (r16 == 0) goto L84
            r15.g(r14)
            goto L89
        L84:
            m.r r15 = r0.f11125o
            r15.a(r14)
        L89:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L5e
        L8d:
            if (r11 != r12) goto L94
        L8f:
            if (r8 == r7) goto L94
            int r8 = r8 + 1
            goto L44
        L94:
            java.util.List r1 = F0.n.h(r1, r2)
            int r2 = r1.size()
        L9c:
            if (r5 >= r2) goto Lce
            java.lang.Object r4 = r1.get(r5)
            F0.n r4 = (F0.n) r4
            m.q r6 = r0.c()
            int r7 = r4.f2107g
            boolean r6 = r6.b(r7)
            if (r6 == 0) goto Lcb
            int r6 = r4.f2107g
            boolean r7 = r3.b(r6)
            if (r7 == 0) goto Lcb
            java.lang.Object r6 = r3.e(r6)
            if (r6 == 0) goto Lc4
            z0.L0 r6 = (z0.L0) r6
            r0.f(r4, r6)
            goto Lcb
        Lc4:
            java.lang.String r1 = "node not present in pruned tree before this change"
            f6.AbstractC0905c.D(r1)
            r1 = 0
            throw r1
        Lcb:
            int r5 = r5 + 1
            goto L9c
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.ViewOnAttachStateChangeListenerC0746c.f(F0.n, z0.L0):void");
    }

    public final void g(int i7, String str) {
        f fVar;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29 && (fVar = this.f11123m) != null) {
            AutofillId autofillIdA = fVar.a(i7);
            if (autofillIdA == null) {
                AbstractC0905c.D("Invalid content capture ID");
                throw null;
            }
            if (i8 >= 29) {
                d.e(C0.b.g(fVar.a), autofillIdA, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(F0.n r22, z0.L0 r23) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.ViewOnAttachStateChangeListenerC0746c.h(F0.n, z0.L0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0218, code lost:
    
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021a, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(F0.n r21) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.ViewOnAttachStateChangeListenerC0746c.i(F0.n):void");
    }

    public final void j(n nVar) {
        if (d()) {
            int i7 = nVar.f2107g;
            C1496q c1496q = this.f11124n;
            if (c1496q.c(i7)) {
                c1496q.g(i7);
            } else {
                this.f11125o.a(i7);
            }
            List listH = n.h(nVar, 4);
            int size = listH.size();
            for (int i8 = 0; i8 < size; i8++) {
                j((n) listH.get(i8));
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0679f
    public final void onStart(InterfaceC0694v interfaceC0694v) {
        this.f11123m = (f) this.f11122l.invoke();
        i(this.f11121k.getSemanticsOwner().a());
        e();
    }

    @Override // androidx.lifecycle.InterfaceC0679f
    public final void onStop(InterfaceC0694v interfaceC0694v) {
        j(this.f11121k.getSemanticsOwner().a());
        e();
        this.f11123m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f11131u.removeCallbacks(this.f11120A);
        this.f11123m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
