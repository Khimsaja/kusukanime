package y1;

import j3.AbstractC1331q;
import j3.c0;

/* loaded from: classes.dex */
public class V {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17993b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17994c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17995d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17996e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17997f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17998g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17999h;

    /* renamed from: i, reason: collision with root package name */
    public final j3.X f18000i;

    /* renamed from: j, reason: collision with root package name */
    public final j3.X f18001j;

    /* renamed from: k, reason: collision with root package name */
    public final j3.X f18002k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18003l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18004m;

    /* renamed from: n, reason: collision with root package name */
    public final j3.X f18005n;

    /* renamed from: o, reason: collision with root package name */
    public final T f18006o;

    /* renamed from: p, reason: collision with root package name */
    public final j3.X f18007p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f18008q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18009r;

    /* renamed from: s, reason: collision with root package name */
    public final c0 f18010s;

    /* renamed from: t, reason: collision with root package name */
    public final j3.J f18011t;

    static {
        new V(new U());
        B1.K.B(1);
        B1.K.B(2);
        B1.K.B(3);
        B1.K.B(4);
        v.c0.d(5, 6, 7, 8, 9);
        v.c0.d(10, 11, 12, 13, 14);
        v.c0.d(15, 16, 17, 18, 19);
        v.c0.d(20, 21, 22, 23, 24);
        v.c0.d(25, 26, 27, 28, 29);
        v.c0.d(30, 31, 32, 33, 34);
    }

    public V(U u5) {
        this.a = u5.a;
        this.f17993b = u5.f17974b;
        this.f17994c = u5.f17975c;
        this.f17995d = u5.f17976d;
        this.f17996e = u5.f17977e;
        this.f17997f = u5.f17978f;
        this.f17998g = u5.f17979g;
        this.f17999h = u5.f17980h;
        this.f18000i = u5.f17981i;
        this.f18001j = u5.f17982j;
        this.f18002k = u5.f17983k;
        this.f18003l = u5.f17984l;
        this.f18004m = u5.f17985m;
        this.f18005n = u5.f17986n;
        this.f18006o = u5.f17987o;
        this.f18007p = u5.f17988p;
        this.f18008q = u5.f17989q;
        this.f18009r = u5.f17990r;
        this.f18010s = c0.a(u5.f17991s);
        this.f18011t = j3.J.s(u5.f17992t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V v5 = (V) obj;
        if (this.a != v5.a || this.f17993b != v5.f17993b || this.f17994c != v5.f17994c || this.f17995d != v5.f17995d || this.f17999h != v5.f17999h || this.f17996e != v5.f17996e || this.f17997f != v5.f17997f || this.f17998g != v5.f17998g || !this.f18000i.equals(v5.f18000i) || !this.f18001j.equals(v5.f18001j) || !this.f18002k.equals(v5.f18002k) || this.f18003l != v5.f18003l || this.f18004m != v5.f18004m || !this.f18005n.equals(v5.f18005n) || !this.f18006o.equals(v5.f18006o) || !this.f18007p.equals(v5.f18007p) || this.f18008q != v5.f18008q || this.f18009r != v5.f18009r) {
            return false;
        }
        c0 c0Var = this.f18010s;
        c0Var.getClass();
        return AbstractC1331q.d(v5.f18010s, c0Var) && this.f18011t.equals(v5.f18011t);
    }

    public int hashCode() {
        int iHashCode = (this.f18005n.hashCode() + ((((((this.f18002k.hashCode() + ((this.f18001j.hashCode() + ((this.f18000i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.f17993b) * 31) + this.f17994c) * 31) + this.f17995d) * 28629151) + (this.f17999h ? 1 : 0)) * 31) + this.f17996e) * 31) + this.f17997f) * 31) + (this.f17998g ? 1 : 0)) * 31)) * 31)) * 961)) * 961) + this.f18003l) * 31) + this.f18004m) * 31)) * 31;
        this.f18006o.getClass();
        return this.f18011t.hashCode() + ((this.f18010s.hashCode() + ((((((this.f18007p.hashCode() + ((iHashCode + 29791) * 31)) * 961) + (this.f18008q ? 1 : 0)) * 31) + this.f18009r) * 28629151)) * 31);
    }
}
