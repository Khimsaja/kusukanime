package K2;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import io.ktor.http.ContentType;
import java.util.ArrayList;
import n.AbstractC1529a;

/* loaded from: classes.dex */
public class d0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f4574b;

    /* renamed from: c, reason: collision with root package name */
    public int f4575c;

    /* renamed from: d, reason: collision with root package name */
    public int f4576d;

    /* renamed from: e, reason: collision with root package name */
    public int f4577e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4578f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4579g;

    public d0(int i7) {
        this.a = 1;
        this.f4574b = i7;
        if (i7 <= 0) {
            AbstractC1529a.c("maxSize <= 0");
            throw null;
        }
        this.f4578f = new O4.q(2);
        this.f4579g = new R1.i(26);
    }

    public void a() {
        View view = (View) ((ArrayList) this.f4578f).get(r0.size() - 1);
        a0 a0Var = (a0) view.getLayoutParams();
        this.f4575c = ((StaggeredGridLayoutManager) this.f4579g).f10887q.b(view);
        a0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f4578f).clear();
        this.f4574b = Integer.MIN_VALUE;
        this.f4575c = Integer.MIN_VALUE;
        this.f4576d = 0;
    }

    public void c(Object obj, Object obj2, Object obj3) {
        kotlin.jvm.internal.l.f("key", obj);
        kotlin.jvm.internal.l.f("oldValue", obj2);
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.f4579g).f10892v ? f(r1.size() - 1, -1) : f(0, ((ArrayList) this.f4578f).size());
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.f4579g).f10892v ? f(0, ((ArrayList) this.f4578f).size()) : f(r1.size() - 1, -1);
    }

    public int f(int i7, int i8) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4579g;
        int iK = staggeredGridLayoutManager.f10887q.k();
        int iG = staggeredGridLayoutManager.f10887q.g();
        int i9 = i8 > i7 ? 1 : -1;
        while (i7 != i8) {
            View view = (View) ((ArrayList) this.f4578f).get(i7);
            int iE = staggeredGridLayoutManager.f10887q.e(view);
            int iB = staggeredGridLayoutManager.f10887q.b(view);
            boolean z7 = iE <= iG;
            boolean z8 = iB >= iK;
            if (z7 && z8 && (iE < iK || iB > iG)) {
                return H.C(view);
            }
            i7 += i9;
        }
        return -1;
    }

    public Object g(Object obj) {
        kotlin.jvm.internal.l.f("key", obj);
        synchronized (((R1.i) this.f4579g)) {
            O4.q qVar = (O4.q) this.f4578f;
            qVar.getClass();
            Object obj2 = qVar.a.get(obj);
            if (obj2 != null) {
                this.f4576d++;
                return obj2;
            }
            this.f4577e++;
            return null;
        }
    }

    public int h(int i7) {
        int i8 = this.f4575c;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f4578f).size() == 0) {
            return i7;
        }
        a();
        return this.f4575c;
    }

    public View i(int i7, int i8) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f4579g;
        ArrayList arrayList = (ArrayList) this.f4578f;
        View view = null;
        if (i8 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f10892v && H.C(view2) >= i7) || ((!staggeredGridLayoutManager.f10892v && H.C(view2) <= i7) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            View view3 = (View) arrayList.get(i9);
            if ((staggeredGridLayoutManager.f10892v && H.C(view3) <= i7) || ((!staggeredGridLayoutManager.f10892v && H.C(view3) >= i7) || !view3.hasFocusable())) {
                break;
            }
            i9++;
            view = view3;
        }
        return view;
    }

    public int j(int i7) {
        int i8 = this.f4574b;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f4578f).size() == 0) {
            return i7;
        }
        View view = (View) ((ArrayList) this.f4578f).get(0);
        a0 a0Var = (a0) view.getLayoutParams();
        this.f4574b = ((StaggeredGridLayoutManager) this.f4579g).f10887q.e(view);
        a0Var.getClass();
        return this.f4574b;
    }

    public void k(Object obj, Object obj2) {
        Object objPut;
        kotlin.jvm.internal.l.f("key", obj);
        synchronized (((R1.i) this.f4579g)) {
            this.f4575c += l(obj, obj2);
            O4.q qVar = (O4.q) this.f4578f;
            qVar.getClass();
            objPut = qVar.a.put(obj, obj2);
            if (objPut != null) {
                this.f4575c -= l(obj, objPut);
            }
        }
        if (objPut != null) {
            c(obj, objPut, obj2);
        }
        n(this.f4574b);
    }

    public int l(Object obj, Object obj2) {
        int iM = m(obj, obj2);
        if (iM >= 0) {
            return iM;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        throw new IllegalStateException(str);
    }

    public int m(Object obj, Object obj2) {
        kotlin.jvm.internal.l.f("key", obj);
        kotlin.jvm.internal.l.f("value", obj2);
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(int r6) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.f4579g
            R1.i r0 = (R1.i) r0
            monitor-enter(r0)
            int r1 = r5.f4575c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L1e
            java.lang.Object r1 = r5.f4578f     // Catch: java.lang.Throwable -> L1a
            O4.q r1 = (O4.q) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            int r1 = r5.f4575c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1e
            goto L1c
        L1a:
            r6 = move-exception
            goto L7f
        L1c:
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L77
            int r1 = r5.f4575c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r6) goto L75
            java.lang.Object r1 = r5.f4578f     // Catch: java.lang.Throwable -> L1a
            O4.q r1 = (O4.q) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L32
            goto L75
        L32:
            java.lang.Object r1 = r5.f4578f     // Catch: java.lang.Throwable -> L1a
            O4.q r1 = (O4.q) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "map.entries"
            kotlin.jvm.internal.l.e(r2, r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = P3.q.s0(r1)     // Catch: java.lang.Throwable -> L1a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L4d
            monitor-exit(r0)
            return
        L4d:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r5.f4578f     // Catch: java.lang.Throwable -> L1a
            O4.q r3 = (O4.q) r3     // Catch: java.lang.Throwable -> L1a
            r3.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "key"
            kotlin.jvm.internal.l.f(r4, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r3 = r3.a     // Catch: java.lang.Throwable -> L1a
            r3.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r3 = r5.f4575c     // Catch: java.lang.Throwable -> L1a
            int r4 = r5.l(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r3 = r3 - r4
            r5.f4575c = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r0 = 0
            r5.c(r2, r1, r0)
            goto L0
        L75:
            monitor-exit(r0)
            return
        L77:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L7f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.d0.n(int):void");
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                synchronized (((R1.i) this.f4579g)) {
                    try {
                        int i7 = this.f4576d;
                        int i8 = this.f4577e + i7;
                        str = "LruCache[maxSize=" + this.f4574b + ",hits=" + this.f4576d + ",misses=" + this.f4577e + ",hitRate=" + (i8 != 0 ? (i7 * 100) / i8 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public d0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i7) {
        this.a = 0;
        this.f4579g = staggeredGridLayoutManager;
        this.f4578f = new ArrayList();
        this.f4574b = Integer.MIN_VALUE;
        this.f4575c = Integer.MIN_VALUE;
        this.f4576d = 0;
        this.f4577e = i7;
    }
}
