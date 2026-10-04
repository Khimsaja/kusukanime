package n0;

import D.C0042b;
import b1.AbstractC0703b;
import f.AbstractC0841b;
import h0.AbstractC0968M;
import h0.C0962G;
import h0.C0975U;
import h0.C0987j;
import h0.C0998u;
import j0.InterfaceC1298d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1535b extends AbstractC1556w {

    /* renamed from: b, reason: collision with root package name */
    public float[] f13129b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13130c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f13131d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f13132e = C0998u.f11834g;

    /* renamed from: f, reason: collision with root package name */
    public List f13133f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13134g;

    /* renamed from: h, reason: collision with root package name */
    public C0987j f13135h;

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.m f13136i;

    /* renamed from: j, reason: collision with root package name */
    public final C0042b f13137j;

    /* renamed from: k, reason: collision with root package name */
    public String f13138k;

    /* renamed from: l, reason: collision with root package name */
    public float f13139l;

    /* renamed from: m, reason: collision with root package name */
    public float f13140m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13141n;

    public C1535b() {
        int i7 = AbstractC1530A.a;
        this.f13133f = P3.y.f7779k;
        this.f13134g = true;
        this.f13137j = new C0042b(28, this);
        this.f13138k = "";
        this.f13139l = 1.0f;
        this.f13140m = 1.0f;
        this.f13141n = true;
    }

    @Override // n0.AbstractC1556w
    public final void a(InterfaceC1298d interfaceC1298d) {
        if (this.f13141n) {
            float[] fArrA = this.f13129b;
            if (fArrA == null) {
                fArrA = C0962G.a();
                this.f13129b = fArrA;
            } else {
                C0962G.d(fArrA);
            }
            C0962G.h(fArrA, 0.0f, 0.0f);
            C0962G.e(fArrA, 0.0f);
            C0962G.f(fArrA, this.f13139l, this.f13140m);
            C0962G.h(fArrA, -0.0f, -0.0f);
            this.f13141n = false;
        }
        if (this.f13134g) {
            if (!this.f13133f.isEmpty()) {
                C0987j c0987jH = this.f13135h;
                if (c0987jH == null) {
                    c0987jH = AbstractC0968M.h();
                    this.f13135h = c0987jH;
                }
                AbstractC0841b.q(this.f13133f, c0987jH);
            }
            this.f13134g = false;
        }
        B2.l lVarD = interfaceC1298d.D();
        long jA = lVarD.A();
        lVarD.t().l();
        try {
            X4.y yVar = (X4.y) lVarD.f416l;
            float[] fArr = this.f13129b;
            B2.l lVar = (B2.l) yVar.f9916l;
            if (fArr != null) {
                lVar.t().o(fArr);
            }
            C0987j c0987j = this.f13135h;
            if (!this.f13133f.isEmpty() && c0987j != null) {
                lVar.t().s(c0987j);
            }
            ArrayList arrayList = this.f13130c;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC1556w) arrayList.get(i7)).a(interfaceC1298d);
            }
        } finally {
            AbstractC0703b.y(lVarD, jA);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // n0.AbstractC1556w
    public final e4.k b() {
        return this.f13136i;
    }

    @Override // n0.AbstractC1556w
    public final void d(C0042b c0042b) {
        this.f13136i = c0042b;
    }

    public final void e(int i7, AbstractC1556w abstractC1556w) {
        ArrayList arrayList = this.f13130c;
        if (i7 < arrayList.size()) {
            arrayList.set(i7, abstractC1556w);
        } else {
            arrayList.add(abstractC1556w);
        }
        g(abstractC1556w);
        abstractC1556w.d(this.f13137j);
        c();
    }

    public final void f(long j7) {
        if (this.f13131d && j7 != 16) {
            long j8 = this.f13132e;
            if (j8 == 16) {
                this.f13132e = j7;
                return;
            }
            int i7 = AbstractC1530A.a;
            if (C0998u.h(j8) == C0998u.h(j7) && C0998u.g(j8) == C0998u.g(j7) && C0998u.e(j8) == C0998u.e(j7)) {
                return;
            }
            this.f13131d = false;
            this.f13132e = C0998u.f11834g;
        }
    }

    public final void g(AbstractC1556w abstractC1556w) {
        if (abstractC1556w instanceof C1540g) {
            C0975U c0975u = ((C1540g) abstractC1556w).f13167b;
            if (this.f13131d && c0975u != null) {
                f(c0975u.a);
                return;
            }
            return;
        }
        if (abstractC1556w instanceof C1535b) {
            C1535b c1535b = (C1535b) abstractC1556w;
            if (c1535b.f13131d && this.f13131d) {
                f(c1535b.f13132e);
            } else {
                this.f13131d = false;
                this.f13132e = C0998u.f11834g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f13138k);
        ArrayList arrayList = this.f13130c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC1556w abstractC1556w = (AbstractC1556w) arrayList.get(i7);
            sb.append("\t");
            sb.append(abstractC1556w.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
