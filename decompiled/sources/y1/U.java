package y1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class U {
    public int a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f17974b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f17975c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f17976d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f17977e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f17978f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17979g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17980h = true;

    /* renamed from: i, reason: collision with root package name */
    public j3.X f17981i;

    /* renamed from: j, reason: collision with root package name */
    public j3.X f17982j;

    /* renamed from: k, reason: collision with root package name */
    public j3.X f17983k;

    /* renamed from: l, reason: collision with root package name */
    public int f17984l;

    /* renamed from: m, reason: collision with root package name */
    public int f17985m;

    /* renamed from: n, reason: collision with root package name */
    public j3.X f17986n;

    /* renamed from: o, reason: collision with root package name */
    public T f17987o;

    /* renamed from: p, reason: collision with root package name */
    public j3.X f17988p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17989q;

    /* renamed from: r, reason: collision with root package name */
    public int f17990r;

    /* renamed from: s, reason: collision with root package name */
    public HashMap f17991s;

    /* renamed from: t, reason: collision with root package name */
    public HashSet f17992t;

    public U() {
        j3.E e7 = j3.G.f12277l;
        j3.X x7 = j3.X.f12304o;
        this.f17981i = x7;
        this.f17982j = x7;
        this.f17983k = x7;
        this.f17984l = Integer.MAX_VALUE;
        this.f17985m = Integer.MAX_VALUE;
        this.f17986n = x7;
        this.f17987o = T.a;
        this.f17988p = x7;
        this.f17989q = true;
        this.f17990r = 0;
        this.f17991s = new HashMap();
        this.f17992t = new HashSet();
    }

    public void a(int i7) {
        Iterator it = this.f17991s.values().iterator();
        while (it.hasNext()) {
            if (((S) it.next()).a.f17970c == i7) {
                it.remove();
            }
        }
    }

    public final void b(V v5) {
        this.a = v5.a;
        this.f17974b = v5.f17993b;
        this.f17975c = v5.f17994c;
        this.f17976d = v5.f17995d;
        this.f17977e = v5.f17996e;
        this.f17978f = v5.f17997f;
        this.f17979g = v5.f17998g;
        this.f17980h = v5.f17999h;
        this.f17981i = v5.f18000i;
        this.f17982j = v5.f18001j;
        this.f17983k = v5.f18002k;
        this.f17984l = v5.f18003l;
        this.f17985m = v5.f18004m;
        this.f17986n = v5.f18005n;
        this.f17987o = v5.f18006o;
        this.f17988p = v5.f18007p;
        this.f17989q = v5.f18008q;
        this.f17990r = v5.f18009r;
        this.f17992t = new HashSet(v5.f18011t);
        this.f17991s = new HashMap(v5.f18010s);
    }

    public U c(String... strArr) {
        j3.D dR = j3.G.r();
        for (String str : strArr) {
            str.getClass();
            dR.a(B1.K.G(str));
        }
        this.f17988p = dR.f();
        this.f17989q = false;
        return this;
    }
}
